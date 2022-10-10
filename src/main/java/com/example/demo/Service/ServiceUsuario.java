package com.example.demo.Service;

import com.example.demo.model.UsuarioModelo;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Data
public class ServiceUsuario {

    ArrayList<UsuarioModelo> listaUsuarios = new ArrayList<UsuarioModelo>();

    public void createUsuario(String nombre, String apellido){
        UsuarioModelo usuario =  new UsuarioModelo() ;
        usuario.nombre = nombre;
        usuario.apellido = apellido;
        listaUsuarios.add(usuario);
    }

    public ArrayList<UsuarioModelo> getUsuario(){
        return listaUsuarios;
    }

}
