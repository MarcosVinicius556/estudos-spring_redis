package com.dev.marcos.estudos_redis.repository;

import org.springframework.data.repository.CrudRepository;

import com.dev.marcos.estudos_redis.entity.ClienteRedis;

public interface ClienteRedisRepository extends CrudRepository<ClienteRedis, String> {
    
}
