package test;
public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;
    
    int cantidadAsientos(){
        cantidadCreados=asientos.length;
        int i = 0;
        while (asientos.length > 0) {
        	if (asientos[i]==null) {
        		cantidadCreados--;
        		i++;
        	}
        }   
        return cantidadCreados;
    }
    String verificarIntegridad(){
    	int j=0;
    	while(asientos.length>0) {
    		if ((this.asientos[j].registro==this.motor.registro) && (this.asientos[j].registro==this.registro) && (this.motor.registro==this.registro)){
    			j++;
                return "Auto original";
            }else {
            	j++;
            	return "Las piezas no son originales";
            }
    	}
    }
}