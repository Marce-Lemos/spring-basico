package com.marce_lemos.springbasico.Controller;

import com.marce_lemos.springbasico.Business.UsuarioService;
import com.marce_lemos.springbasico.Infrastructure.Entity.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> saveUser(@RequestBody Usuario usuario){
        return ResponseEntity.ok(usuarioService.saveUser(usuario));
    }

}
