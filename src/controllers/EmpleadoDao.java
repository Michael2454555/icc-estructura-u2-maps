package controllers;

import models.Empleado;

public interface EmpleadoDao{
    
    public void add(Empleado emp);
    public void list();
    public void remove(int id);

    

}

