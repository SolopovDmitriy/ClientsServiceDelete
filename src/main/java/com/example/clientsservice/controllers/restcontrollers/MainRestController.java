package com.example.clientsservice.controllers.restcontrollers;

import com.example.clientsservice.models.Client;
import com.example.clientsservice.services.data.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainRestController {

    @Autowired
    private ClientService clientService;

//    @PostMapping("/rest/clientForm")
//    public ResponseEntity<?> clientForm(@RequestBody Client client) {
//        System.out.println("hello");
//        System.err.println("user = " + client);
//        clientService.save(client);
//        List<Client> clients = clientService.findAll();
//        return new ResponseEntity<List<Client>>(clients, HttpStatus.OK);
//    }

    @PostMapping("/rest/clientForm")
    public ResponseEntity<List<Client>> clientForm(@RequestBody Client client) {//@RequestBody Client client-передали клиента из Js
        System.err.println("user = " + client);
        clientService.save(client);
        List<Client> clients = clientService.findAll();
        return new ResponseEntity<>(clients, HttpStatus.OK);//ответ от сервера назад Js
    }




}
