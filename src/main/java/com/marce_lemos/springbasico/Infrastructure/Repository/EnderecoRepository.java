package com.marce_lemos.springbasico.Infrastructure.Repository;

import com.marce_lemos.springbasico.Infrastructure.Entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
