package org.olmedo.ejemplo.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {

      // el set es un arreglo pero en cualquier orden ordena los string
      Set<String> hs = new HashSet<>();
      System.out.println(hs.add("uno"));
      System.out.println(hs.add("dos"));
      System.out.println(hs.add("tres"));
      System.out.println(hs.add("cuatro"));
      System.out.println(hs.add("cinco"));
      System.out.println(hs);

      // ahora si quiero agregar otro repetido no lo agrega si ya esta con el mismo elemento
      boolean b = hs.add("tres");
      System.out.println("Permite elemento duplicados: " + b);
      System.out.println(hs);
        
    }
}
