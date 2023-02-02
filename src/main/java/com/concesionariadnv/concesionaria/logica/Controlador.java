
package com.concesionariadnv.concesionaria.logica;

import com.concesionariadnv.concesionaria.percistencia.ControladorPersistencia;
import java.util.List;


public class Controlador {
    
ControladorPersistencia controlPersis = new ControladorPersistencia();

    public void agregarAutomovil(String motor, String marca, String modelo, String color, String patente, String puertas) {
       Automovil auto = new Automovil();
       auto.setMotor(motor);
       auto.setMarca(marca);
       auto.setModelo(modelo);
       auto.setColor(color);
       auto.setPatente(patente);
       auto.setPuertas(puertas);
       
       controlPersis.agregarAutomovil(auto);
    }

    public List<Automovil> traerAutos() {
       return controlPersis.traerAutos();
    }

    public void borrarAuto(int idAuto) {
         controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
         return controlPersis.traerAuto(idAuto);
    }

    public void modificarAuto(Automovil auto, String marca, String color, String modelo, String patente, String puertas, String motor) {
        auto.setMarca(marca);
        auto.setColor(color);
        auto.setModelo(modelo);
        auto.setPatente(patente);
        auto.setPuertas(puertas);
        auto.setMotor(motor);
        
        controlPersis.modificarAuto(auto);
    }
    
}
