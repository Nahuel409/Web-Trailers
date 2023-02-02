
package com.concesionariadnv.concesionaria.percistencia;

import com.concesionariadnv.concesionaria.logica.Automovil;
import com.concesionariadnv.concesionaria.percistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladorPersistencia {

    AutomovilJpaController autojpa = new AutomovilJpaController();
    
public void agregarAutomovil(Automovil auto) {
        autojpa.create(auto);
    }

    public List<Automovil> traerAutos() {
       return autojpa.findAutomovilEntities();
    }

    public void borrarAuto(int idAuto) {
        try {
            autojpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAuto(int idAuto) {
         return autojpa.findAutomovil(idAuto);
    }

    public void modificarAuto(Automovil auto) {
        try {
            autojpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
