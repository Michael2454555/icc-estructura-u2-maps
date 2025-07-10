package controllers;

import java.util.HashMap;
import java.util.Map;

public class Ejercicios {

    /**
     * Determina si dos cadenas de caracteres son anagramas.
     */
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        Map<Character, Integer> charCount = new HashMap<>();
        
        // Contar caracteres de la primera cadena
        for (char c : str1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Verificar caracteres de la segunda cadena
        for (char c : str2.toCharArray()) {
            int count = charCount.getOrDefault(c, 0);
            if (count == 0) {
                return false;
            }
            charCount.put(c, count - 1);
        }
        
        return true;
    }

    /*
     * Dado un array de números enteros y un objetivo, retorna los índices de dos
     * números para los que la suma de ambos sea igual al objetivo.
     */
    public int[] sumatoriaDeDos(int[] nums, int objetivo) {
        Map<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = objetivo - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        
        return null;
    }

    /**
     * Cuenta la frecuencia de cada caracter en la cadena recibida y
     * muestra el resultado por consola.
     */
    public void contarCaracteres(String texto) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        for (char c : texto.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        System.out.println(frequencyMap);
    }

    /**
     * Verifica si dos palabras son anagramas.
     */
    public boolean sonAnagramas(String palabra1, String palabra2) {
        return areAnagrams(palabra1, palabra2);
    }
}