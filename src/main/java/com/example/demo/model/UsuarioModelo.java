package com.example.demo.model;

import lombok.Data;
import org.springframework.stereotype.Repository;

@Data
@Repository
public class UsuarioModelo {

    public String nombre;
    public String apellido;

}
