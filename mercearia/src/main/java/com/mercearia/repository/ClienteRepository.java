package com.mercearia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mercearia.model.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
