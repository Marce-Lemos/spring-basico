package com.marce_lemos.springbasico.Infrastructure.Repository;

import com.marce_lemos.springbasico.Infrastructure.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    boolean existsByEmail(String email);
}
