package com.marce_lemos.springbasico.Business;

import com.marce_lemos.springbasico.Infrastructure.Entity.Usuario;
import com.marce_lemos.springbasico.Infrastructure.Exceptions.ConflictException;
import com.marce_lemos.springbasico.Infrastructure.Repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public Usuario saveUser(Usuario usuario){
       try {
           emailExist(usuario.getEmail());
           return usuarioRepository.save(usuario);
       } catch (ConflictException e){
            throw new ConflictException("Email: " + usuario.getEmail() + " já cadastrado!" + e.getCause());
       }
    }

    public void emailExist(String email){
        try {
            boolean existe = vrfEmail(email);
            if (existe) {
                throw new ConflictException("Email: " + email + " já cadastrado!");
            }
        } catch (ConflictException e){
            throw new ConflictException("Email já cadastrado!" + e.getCause());
        }
    }

    public boolean vrfEmail(String email){
        return usuarioRepository.existsByEmail(email);
    }

}
