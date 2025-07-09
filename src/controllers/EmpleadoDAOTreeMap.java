package controllers;

import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class EmpleadoDAOTreeMap implements EmpleadoDao{

    Map<Empleado, Empleado> empleadoTreeMap; 
    
    public EmpleadoDAOTreeMap() {
        this.empleadoTreeMap= new TreeMap<>();
    }

    @Override
    public void add(Empleado emp) {
        empleadoTreeMap.put(emp, emp);
    }

    @Override
    public void list() {
        for (Empleado emp : empleadoTreeMap.values()) {
            System.out.println(emp);
        }
    }

    @Override 
    public void remove(int id) {
        Empleado temp = new Empleado(id,null,null);
        empleadoTreeMap.remove(temp);
    }
    
}