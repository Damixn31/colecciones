package org.olmedo.ejemplo.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class EjemploTreeMap {
  public static void main(String[] args){

    // Map<String, Object> persona = new TreeMap<>((a, b) -> b.compareTo(a));
    // esta es otra forma 
    // Map<String, Object> persona = new TreeMap<>(Comparator.reverseOrder());
    // compara del mas corto al mas largo con el Comparator.comparing();
    Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed()); // el reversed de forma inv    ertida del mas largo al mas corto
    // no pueden existir elementos null
    persona.put("nombre", "Damian");
    persona.put("apellido", "Olmedo");
    persona.put("apellidoPaterno", "Olmedo");
    persona.put("email", "damin.ol@email.com");
    persona.put("edad", 32);

    Map<String, String> direccion = new TreeMap<>();
    direccion.put("pais", "USA");
    direccion.put("estado", "California");
    direccion.put("ciudad", "Santa Barbara");
    direccion.put("calle", "One Street");
    direccion.put("numero", "120");

    // aca se lo asignamos esta estructura dentro de otra
    persona.put("direccion", direccion);
    System.out.println("persona = " + persona);

 }
}
