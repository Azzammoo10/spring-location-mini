package com.example.location.service.implementation;

import com.example.location.entity.Client;
import com.example.location.repository.ClientRepository;
import com.example.location.service.inter.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

   private final ClientRepository clientRepository;

    @Override
    public List<Client> getAllClients() throws Exception {
        if(clientRepository.findAll().isEmpty()){
            throw new Exception("No clients found");
        }
        return clientRepository.findAll();
    }

    @Override
    public Client getClientById(Long id) {
        if(clientRepository.findById(id).isEmpty()){
            throw new IllegalArgumentException("Client not found");
        }
        return clientRepository.findById(id).get();
    }

    @Override
    public Client addClient(Client client) {
        if(clientRepository.findById(client.getId()).isPresent()){
            throw new IllegalArgumentException("Client already exists");
        }
        return clientRepository.save(client);
    }

    @Override
    public Client updateClient(Long id, Client updatedClient) {
        Client existingClient = clientRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Client not found with id: " + id));

        if (updatedClient.getNom() != null && !updatedClient.getNom().isBlank()) {
            existingClient.setNom(updatedClient.getNom().trim());
        }

        if (updatedClient.getTelephone() != null && !updatedClient.getTelephone().isBlank()) {
            existingClient.setTelephone(updatedClient.getTelephone().trim());
        }

        if (updatedClient.getEmail() != null && !updatedClient.getEmail().isBlank()) {
            existingClient.setEmail(updatedClient.getEmail().trim());
        }

        return clientRepository.save(existingClient);
    }


    @Override
    public void deleteClient(Long id) {
        if(clientRepository.findById(id).isEmpty()){
            throw new IllegalArgumentException("Client not found");
        }
        clientRepository.deleteById(id);
    }
}
