package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");
    }
    
    public void runHashMap() {
        
        Map<String, String> mapa =new HashMap<>();
        mapa.put("001", "Celular");
        mapa.put("002", "Laptop");
        mapa.put("003", "Celular");
        mapa.put("003", "Pc");

        System.out.println(mapa);
        System.out.println(mapa.keySet());

        for (String claveMapa : mapa.keySet()) {
            System.out.println(mapa.get(claveMapa));
            
        }
        System.out.println(mapa.get("001"));
        System.out.println(mapa.get("005"));
    }
    public void runTreeMap() {
        
        Map<Integer, String> items = new TreeMap<>();
        items.put(3,"carro");
        items.put(6,"bicicleta");
        items.put(1,"moto");
        System.out.println(items.values());
           

    }
    public void runLinkedHashMap() {
        Map<Integer, String> mapLink = new LinkedHashMap<>();
            mapLink.put(1,"Mateo");
            mapLink.put(2,"Juan");
            mapLink.put(3,"Pablo");
            mapLink.put(4,"Ariel");
            mapLink.put(5,"Gael");

            
            System.out.println(mapLink.values());
            
        
        
        
    }
    public void runHashMapObject() {
        Map<Empleado, Integer> empleados = new HashMap<>();
            empleados.put(new Empleado(1, "juan", "Dev"),1200);
            empleados.put(new Empleado(2, "juan", "Dev"),1500);
            empleados.put(new Empleado(3, "pedro", "Dev"),2000);
            empleados.put(new Empleado(1, "juan", "Dev"),2500);
            empleados.put(new Empleado(1, "diego", "Dev"),3000);


            System.out.println(empleados);
        
    }
    public void runTreeMapObj() {
         Map<Empleado, Integer> empleados = new TreeMap<>();
            empleados.put(new Empleado(1, "juan", "Dev"),1200);
            empleados.put(new Empleado(2, "juan", "Dev"),1500);
            empleados.put(new Empleado(3, "pedro", "Dev"),2000);
            empleados.put(new Empleado(1, "diego", "Dev"),1200);
            empleados.put(new Empleado(1, "juan", "Senior"),3000);
            System.out.println(empleados);


    }
}

