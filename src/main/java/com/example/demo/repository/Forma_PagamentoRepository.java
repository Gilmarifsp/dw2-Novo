package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Forma_Pagamento;

@Repository
public interface Forma_PagamentoRepository extends JpaRepository<Forma_Pagamento, Long> {

}
