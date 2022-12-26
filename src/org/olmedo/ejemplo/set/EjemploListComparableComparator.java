package org.olmedo.ejemplo.set;

import org.olmedo.ejemplo.modelo.Alumno;

import java.util.*;

import static java.util.Comparator.comparing;

public class EjemploListComparableComparator {
    public static void main(String[] args) {

      List<Alumno> sa = new ArrayList();
      sa.add(new Alumno("Pato", 5));
      sa.add(new Alumno("Luci", 6));
      sa.add(new Alumno("Cata", 7));
      sa.add(new Alumno("Nicolas", 3));
      sa.add(new Alumno("Damian", 6));
      sa.add(new Alumno("Sandra", 2));
      sa.add(new Alumno("Sandra", 4));
      sa.add(new Alumno("Sandra", 3));
      sa.add(new Alumno("Sandra", 2));

      // Collections.sort(sa);
      // Collections.sort(sa, (a, b) -> b.getNota().compareTo(a.getNota()));
      //sa.sort((a, b) -> b.getNota().compareTo(a.getNota()));
      //sa.sort(Comparator.comparing((Alumno a) -> a.getNota()));
      // sa.sort(Comparator.comparing((Alumno a) -> a.getNota()).reversed()); //los ordena a la inversa
      sa.sort(comparing(Alumno::getNota).reversed());// lo mismo pero mas simplificado el codigo
      System.out.println(sa);


      System.out.println("Iterando usando Stream forEach");
      sa.forEach(System.out::println); 
    }
}
