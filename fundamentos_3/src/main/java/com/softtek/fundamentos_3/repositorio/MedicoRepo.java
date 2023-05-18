package com.softtek.fundamentos_3.repositorio;

import com.softtek.fundamentos_3.modelo.Medico;
import org.springframework.stereotype.Repository;

@Repository
public class MedicoRepo implements IMedicoRepo{

    public Medico[] listar(Medico medico){
        Medico[] medicos = {
                new Medico(1, "Manuel", "Paniagua", 27),
                new Medico(2, "Israel", "Jimenez", 45),
                new Medico(3, "Ismael", "Garcia", 30),
        };
        return medicos;
    }
}
