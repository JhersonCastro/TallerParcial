package org.example;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

public @Data class Vehiculo {
    private @NonNull String marca, modelo, placa;
    private @NonNull int horaEntrada;
    private @Getter @Setter int horaSalida = -1, dineroGenerado;

    public void uptDineroGenerado() {
        if (horaSalida > horaEntrada)
            dineroGenerado = (horaSalida - horaEntrada) * 15000;
        else
            dineroGenerado = ((24 - horaEntrada) + horaSalida) * 15000;
    }
}