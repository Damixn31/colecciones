package org.olmedo.ejemplo.list;

import org.olmedo.ejemplo.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;


public class EjemploLinkedList {
    public static void main(String[] args) {

      LinkedList<Alumno> enlazada = new LinkedList<>();
      System.out.println(enlazada + ", size = " + enlazada.size());
      System.out.println("Esta vacia = " + enlazada.isEmpty());
      enlazada.add(new Alumno("Pato", 5));
      enlazada.add(new Alumno("Luci", 6));
      enlazada.add(new Alumno("Cata", 7));
      enlazada.add(new Alumno("Nicolas", 3)); // con el add y el indice poder guardar en una posicion dada en especifico
      enlazada.add(new Alumno("Damian", 6)); // lo que hace el set es que dada la posicion el elemento que esta en esa picion desaparece y lo remplaza por este, si aca tengo 5 elementos ahora voy a tener 4
      System.out.println(enlazada + ", size = " + enlazada.size());

      System.out.println(enlazada + ", size = " + enlazada.size());

      enlazada.addFirst(new Alumno("Susana", 10));
      enlazada.addLast(new Alumno("Marco", 7));

      System.out.println(enlazada + ", size = " + enlazada.size());

      System.out.println("Primero = " + enlazada.getFirst());
      System.out.println("Ultimo = " + enlazada.getLast());
      System.out.println("Indice 2 = " + enlazada.get(2));

      //Alumno marco = enlazada.pollFirst(); // com esto lo elimino y lo extraigo lo puedo usar
      //Alumno marco = enlazada.pop(); // elimina y retorna el primer elemento de la lista es igual al removeFirst();
      enlazada.removeFirst();
      enlazada.removeLast();
      System.out.println(enlazada + ", size = " + enlazada.size());

      enlazada.remove(new Alumno("Cata", 7));
      System.out.println(enlazada + ", size = " + enlazada.size());

      Alumno a = new Alumno("Lucas", 5);
      enlazada.addLast(a);
      System.out.println("Indice de Lucas = " + enlazada.indexOf(a));

      enlazada.remove(2);
      System.out.println(enlazada + ", size = " + enlazada.size());
      System.out.println("Indice de Lucas = " + enlazada.indexOf(a));

      // para modificar
      enlazada.set(3, new Alumno("Lalo", 7));
      System.out.println(enlazada + ", size = " + enlazada.size());

      ListIterator<Alumno> li = enlazada.listIterator();
       while (li.hasNext()) {
        Alumno alumno = li.next();
        System.out.println(alumno);
       }

       System.out.println("------------------------- previous");
       while (li.hasPrevious()) {
        Alumno alumno = li.previous();
        System.out.println(alumno);
       }
     


    }
}
