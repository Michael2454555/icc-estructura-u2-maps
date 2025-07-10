import java.util.Arrays;

import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoDao;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Michael Yumbla"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();
        runEmpleadoExample();
        runEjerccios();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        // runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        // runEjerccios();
    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.runHashMap();
        mapa.runTreeMap();
        mapa.runLinkedHashMap();
        mapa.runHashMapObject();
        mapa.runTreeMapObj();
    }

    private static void runEmpleadoExample() {
         EmpleadoDao empDaoHash = new EmpleadoDAOHashMap();
        EmpleadoContoller empControllerHash = new EmpleadoContoller(empDaoHash);
        EmpleadoDao empDaoTree = new EmpleadoDAOHashMap();
        EmpleadoContoller empControllerTree = new EmpleadoContoller(empDaoTree);

        Empleado emp1 = new Empleado(4, "Pedro", "DEV");
        Empleado emp2 = new Empleado(2, "Pedro", "DEV");
        Empleado emp3 = new Empleado(5, "Juan", "DEV");
        Empleado emp4 = new Empleado(3, "Maria", "DEV");
        Empleado emp5 = new Empleado(1,"Juan","DEV");

        empControllerHash.agregarEmpleado(emp1);
        empControllerHash.agregarEmpleado(emp2);
        empControllerHash.agregarEmpleado(emp3);
        empControllerHash.agregarEmpleado(emp4);
        empControllerHash.agregarEmpleado(emp5);



        empControllerTree.agregarEmpleado(emp1);
        empControllerTree.agregarEmpleado(emp2);
        empControllerTree.agregarEmpleado(emp3);
        empControllerTree.agregarEmpleado(emp4);
        empControllerTree.agregarEmpleado(emp5);

        System.out.println("Empleados en HashMap:");
        empControllerHash.listarEmps();
        System.out.println("\nEliminando empleado con ID 2:");
        empControllerHash.removerEmps(2);
        empControllerHash.listarEmps();

        System.out.println("Empleados en TreeMap:");
        empControllerTree.listarEmps();
        System.out.println("\nEliminando empleado con Tree ID 2:");
        empControllerTree.removerEmps(2);
        empControllerTree.listarEmps();
    }

    private static void runEjerccios() {
        Ejercicios ejercicios = new Ejercicios();
        
        // Prueba de areAnagrams
        System.out.println("=== Prueba de anagramas ===");
        System.out.println("listen y silent: " + Ejercicios.areAnagrams("listen", "silent")); // true
        System.out.println("hello y bello: " + Ejercicios.areAnagrams("hello", "bello")); // false
        
        // Prueba de sumatoriaDeDos
        System.out.println("\n=== Prueba de sumatoriaDeDos ===");
        int[] nums = {9, 2, 3, 6};
        int[] resultado = ejercicios.sumatoriaDeDos(nums, 5);
        System.out.println("Indices para objetivo 5: " + 
                          (resultado != null ? Arrays.toString(resultado) : "null")); // [1, 2]
        
        // Prueba de contarCaracteres
        System.out.println("\n=== Prueba de contarCaracteres ===");
        ejercicios.contarCaracteres("hola mundo"); // {h=1, o=2, l=1, a=1,  =1, m=1, u=1, n=1, d=1}
        
        // Prueba de sonAnagramas
        System.out.println("\n=== Prueba de sonAnagramas ===");
        System.out.println("roma y amor: " + ejercicios.sonAnagramas("roma", "amor")); // true
        System.out.println("java y vaja: " + ejercicios.sonAnagramas("java", "vaja")); // true

    }
}
