package com.dev.marcos.estudos_redis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.marcos.estudos_redis.entity.ClienteRedis;
import com.dev.marcos.estudos_redis.repository.ClienteRedisRepository;

@Service
public class ClienteRedisService {
    

    @Autowired
    private ClienteRedisRepository clienteRedisRepository;

    public ClienteRedis save(ClienteRedis clienteRedis) {
        return clienteRedisRepository.save(clienteRedis);
    }

    public List<ClienteRedis> findAll() {
        return (List<ClienteRedis>) clienteRedisRepository.findAll();
    }

}
