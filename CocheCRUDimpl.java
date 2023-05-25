package com.examples.poo.interfaces;

import java.util.List;

public class CocheCRUDimpl implements CocheCRUD{

    /**
     *
     * @param coches es un tipo de argumento variable.
     * @throws CocheException revisa si en la lista ya se encuentra el objeto creado.
     *
     */
     /*
     *  Esta funcion guarda un numero de coches variable, despues se itera sobre este, y
     *  con ayuda de un if se revisa si alguno de los coches ingresados ya existe en el ArrayList,
     *  si existe lanza la excepcion CocheException y si no lo guarda en la lista.
     */

    @Override
    public void save(Coche ...coches) throws CocheException {
        for(Coche coche : coches) {
            if (cars.contains(coche)) {
                throw new CocheException(coche.marca);
            }
            cars.add(coche);
        }
    }

    
    @Override
    public List<Coche> findAll() {
        return cars;
    }

    @Override
    public void delete(Coche coche) {
        cars.remove(coche);
    }
}
