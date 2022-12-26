package org.olmedo.ejemplo.set;

import org.olmedo.ejemplo.modelo.Alumno;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

      Set<Alumno> sa = new HashSet<>();  
      // List<Alumno> sa = new ArrayList<>();
      // List<Alumno> sa = new LinkedList();
      sa.add(new Alumno("Pato", 5));
      sa.add(new Alumno("Luci", 6));
      sa.add(new Alumno("Cata", 7));
      sa.add(new Alumno("Nicolas", 3));
      sa.add(new Alumno("Damian", 6));
      sa.add(new Alumno("Sandra", 2));
      sa.add(new Alumno("Sandra", 4));
      sa.add(new Alumno("Sandra", 3));
      sa.add(new Alumno("Sandra", 2));

      System.out.println(sa);

      /* System.out.println("Utilizando un for clasico");
      for (int i = 0; i < sa.size(); i++) {
        Alumno a = sa.get(i);
        System.out.println(a.getNombre());
      } */

      System.out.println("Iterando usando un forEach");
      for (Alumno a : sa) {
        System.out.println(a.getNombre());
        
      }

      System.out.println("Iterando usando while y iterator");
      Iterator<Alumno> it = sa.iterator(); // con esto ya podemos usar un while
      while (it.hasNext()) {
        Alumno a = it.next();
        System.out.println(a.getNombre());
      }

      System.out.println("Iterando usando Stream forEach");
      // sa.forEach(a -> System.out.println(a.getNombre()));
      sa.forEach(System.out::println); // esto es la misma manera de arriba pero mas simplificado ojo que no tiene el getNombre asi que cuando queremos algo en especifico no poner asi
    }
}
