package com.dev.marcos.estudos_redis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dev.marcos.estudos_redis.entity.ClienteRedis;
import com.dev.marcos.estudos_redis.service.ClienteRedisService;

@RestController
@RequestMapping("/redis/cliente")
public class ClienteRedisController {
    
    @Autowired
    private ClienteRedisService clienteRedisService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteRedis save(@RequestBody ClienteRedis clienteRedis) {
        return clienteRedisService.save(clienteRedis)   ;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ClienteRedis> findAll() {
        return clienteRedisService.findAll();
    }

}
