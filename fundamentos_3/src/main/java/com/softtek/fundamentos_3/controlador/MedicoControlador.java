package com.softtek.fundamentos_3.controlador;

import com.softtek.fundamentos_3.modelo.Medico;
import com.softtek.fundamentos_3.servicio.ClaMedicoservicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/medicos")
public class MedicoControlador {
    @Autowired
    private ClaMedicoservicio p;
    @GetMapping
    public List<Medico> listar(Medico medico){
        return List.of(p.listar(medico));
    }
}
