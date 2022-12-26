package org.olmedo.ejemplo.set;

import org.olmedo.ejemplo.modelo.Alumno;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class EjemploArrayList {
    public static void main(String[] args) {

      List<Alumno> al = new ArrayList();
      System.out.println(al + ", size = " + al.size());
      System.out.println("Esta vacia = " + al.isEmpty());
      al.add(new Alumno("Pato", 5));
      al.add(new Alumno("Luci", 6));
      al.add(new Alumno("Cata", 7));
      al.add(2, new Alumno("Nicolas", 3)); // con el add y el indice poder guardar en una posicion dada en especifico
      al.set(3, new Alumno("Damian", 6)); // lo que hace el set es que dada la posicion el elemento que esta en esa picion desaparece y lo remplaza por este, si aca tengo 5 elementos ahora voy a tener 4
      System.out.println(al + ", size = " + al.size());

      // al.remove(new Alumno("Pato", 5)); //eliminta el elemento pasandole mismo valores
      al.remove(2); // tambien borra atraves del indice que le pasemos
      System.out.println(al + ", size = " + al.size());

      boolean b = al.contains(new Alumno("Cata", 7));
      System.out.println("La lista contiene a Cata = " + b); // va a decir false porque cata esta eliminada de lista no existe
     
      Object a[] = al.toArray();
      for (int i = 0; i < a.length; i++) {
        System.out.println("Desde el arreglo = " + a[i]);
      }
    }
}
