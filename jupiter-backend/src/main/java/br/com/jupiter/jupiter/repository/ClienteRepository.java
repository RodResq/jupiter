package br.com.jupiter.jupiter.repository;

import br.com.jupiter.jupiter.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
