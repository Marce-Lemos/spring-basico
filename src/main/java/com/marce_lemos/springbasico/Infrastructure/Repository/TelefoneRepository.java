package com.marce_lemos.springbasico.Infrastructure.Repository;

import com.marce_lemos.springbasico.Infrastructure.Entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
