package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoDAOHashMap implements EmpleadoDao {

    Map<Empleado, Empleado> empleadoHash;

    public EmpleadoDAOHashMap() {
        this.empleadoHash = new HashMap<>();
    }

    @Override
    public void add(Empleado emp) {
        empleadoHash.put(emp, emp);
    }

    @Override
    public void list() {
        for (Empleado emp : empleadoHash.values()) {
            System.out.println(emp);
        }
    }

    @Override
    public void remove(int id) {
        Empleado temp = new Empleado(id,null,null);
        empleadoHash.remove(temp);
    }

}