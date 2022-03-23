package test;
public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    int cantidadAsientos() {
        int contador = 0;
        for (Asiento indice: this.asientos){
            if (indice != null){
                contador++;
            }
        }
        return contador;
    }

    String verificarIntegridad() {

        if (this.motor.registro != this.registro) {
            return "Las piezas no son originales";
        }

        for (Asiento indice:this.asientos){
            if(indice != null && (indice.registro != this.registro)){
                return "Las piezas no son originales";
            }
        }
        return "Auto original";
    }


}