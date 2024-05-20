package com.dev.marcos.estudos_redis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.marcos.estudos_redis.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
