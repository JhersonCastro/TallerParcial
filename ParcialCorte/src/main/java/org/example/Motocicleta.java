
package org.example;
import lombok.*;


public @Data class Motocicleta extends Vehiculo {
    private @NonNull int cilindrada;

    public Motocicleta(int cilindrada, String marca, String modelo, String placa, int horaDeEntrada) {
        super(marca, modelo, placa, horaDeEntrada);
        this.cilindrada = cilindrada;
    }
}