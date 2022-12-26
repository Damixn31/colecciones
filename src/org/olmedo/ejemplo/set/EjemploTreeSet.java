package org.olmedo.ejemplo.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {
       // son elementos unicos no acepta elementos duplicados 
      Set<String> ts = new TreeSet<>((a, b) -> b.compareTo(a)); // lo ordena de modo ascendente 
      ts.add("uno");
      ts.add("dos");
      ts.add("tres");
      ts.add("tres");
      ts.add("cuatro");
      ts.add("cinco");

      System.out.println(ts);

      Set<Integer> num = new TreeSet<>(Comparator.reverseOrder()); // esta es otra forma de ordenar de manera inversa
                                                                   
      num.add(4);
      num.add(5);
      num.add(3);
      num.add(1);
      num.add(9);

      System.out.println(num);
    }
}
