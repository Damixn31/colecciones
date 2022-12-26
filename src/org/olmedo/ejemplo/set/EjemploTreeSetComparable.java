package org.olmedo.ejemplo.set;

import org.olmedo.ejemplo.modelo.Alumno;

import java.util.Set;
import java.util.TreeSet;
import static java.util.Comparator.comparing;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {

      // Set<Alumno> sa = new TreeSet<>((a, b) -> b.getNombre().compareTo(a.getNombre()));
      Set<Alumno> sa = new TreeSet<>(comparing(Alumno::getNota).reversed());
      sa.add(new Alumno("Pato", 5));
      sa.add(new Alumno("Luci", 6));
      sa.add(new Alumno("Cata", 7));
      sa.add(new Alumno("Nicolas", 3));
      sa.add(new Alumno("Damian", 6));
      sa.add(new Alumno("Sandra", 2));
      sa.add(new Alumno("Sandra", 2));

      System.out.println(sa);
        
    }
}
