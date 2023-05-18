package com.softtek.fundamentos_3.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Medico {
    public int idmedico;
    public String dni;
    public String nombre;
    public int edad;
}
