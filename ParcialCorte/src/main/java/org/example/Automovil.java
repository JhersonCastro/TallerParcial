package org.example;

import lombok.Data;
import lombok.NonNull;
import org.example.Vehiculo;

@Data
public class Automovil extends Vehiculo {
    private int numeroPuertas;

    public Automovil(int numeroPuertas, String marca, String modelo, String placa, int horaEntrada) {
        super(marca, modelo, placa, horaEntrada);
        this.numeroPuertas = numeroPuertas;
    }
}
