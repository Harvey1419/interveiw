package com.example.demo.controller;


import com.example.demo.Service.ServiceUsuario;
import com.example.demo.model.UsuarioModelo;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RestController
public class UsarioController {

    @Autowired
    private ServiceUsuario serviceUsuario;

    @PostMapping("/user")
    @ResponseBody
    public String crearUsuario(@RequestBody UsuarioModelo usuario) throws JSONException {
        serviceUsuario.createUsuario(usuario.nombre,usuario.apellido);
        //JSONObject obj = new JSONObject();
        //obj.put("nombre", usuario.nombre);
        return "Usuario creado";
    }

    @GetMapping("/user")
    @ResponseBody
    public ArrayList<UsuarioModelo> usuarios(){
        return serviceUsuario.getUsuario();
    }
    @GetMapping("/user/{name}")
    public UsuarioModelo usuario(@PathVariable String name){
        return serviceUsuario.getUserById(name);
    }
}
