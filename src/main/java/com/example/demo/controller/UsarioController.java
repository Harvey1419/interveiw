package com.example.demo.controller;


import com.example.demo.Service.ServiceUsuario;
import com.example.demo.model.UsuarioModelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class UsarioController {

    @Autowired
    private ServiceUsuario serviceUsuario;

    @PostMapping("/user")
    @ResponseBody
    public String crearUsuario(@RequestBody UsuarioModelo usuario){
        serviceUsuario.createUsuario(usuario.nombre,usuario.apellido);
        return "Usuario creado";
    }

    @GetMapping("/user")
    public ArrayList<UsuarioModelo> usuarios(){
        return serviceUsuario.getUsuario();
    }

}
