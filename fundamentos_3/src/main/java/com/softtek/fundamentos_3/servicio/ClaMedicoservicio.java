package com.softtek.fundamentos_3.servicio;

import com.softtek.fundamentos_3.modelo.Medico;
import com.softtek.fundamentos_3.repositorio.IMedicoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClaMedicoservicio implements IMedicoServicio{
    @Autowired
    IMedicoRepo medicoR;
    public Medico[] listar (Medico medico){
        return medicoR.listar(medico);
    }
}
