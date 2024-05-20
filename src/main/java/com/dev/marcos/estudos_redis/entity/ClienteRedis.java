package com.dev.marcos.estudos_redis.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Aqui criamos uma classe que terá os mesmo atributos que uma classe de entidade do banco de dados
 * porém esta será para o redis entender as informações e dados que deverá buscar
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@RedisHash("Cliente") //Com esta anotação definimos que esta é uma entidade do REDIS
public class ClienteRedis implements Serializable {

    @Id //Id da entidade (deve ser desta importação --> org.springframework.data.annotation.Id)
    @Indexed //Para melhorar a performance
    private String cpf;
    private String nome;
    private String email;
    
}
