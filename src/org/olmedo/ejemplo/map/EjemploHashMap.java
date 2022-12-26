package org.olmedo.ejemplo.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.Set;

public class EjemploHashMap {
  public static void main(String[] args){

    Map<String, String> persona = new HashMap();
    // si pasamos el mismo clave valor repetido nos va a tomar el ultimo que allamos puesto
    System.out.println("Contiene elementos?: " + !persona.isEmpty());
    persona.put(null, "1234"); //acepta null pero uno solo no podemos tener null repetidos
    persona.put("nombre", "Damian");
    persona.put("apellido", "Olmedo");
    persona.put("apellidoPaterno", "Olmedo");
    persona.put("email", "damin.ol@email.com");
    persona.put("edad", "32");

    System.out.println("persona = " + persona); 
    
    //para obtener un valor se hace de esta manera
    String nombre = persona.get("nombre");
    System.out.println("nombre = " + nombre);
    String apellido = persona.get("apellido");
    System.out.println("apellido = " + apellido);
    
    // String valorApellido = persona.remove("apellidoPaterno");
    boolean b = persona.remove("apellidoPaterno", "Olmedo");
    System.out.println("eliminado = " + b);
    // System.out.println("eliminado = " + valorApellido);
    System.out.println("persona = " + persona);

    boolean b2 = persona.containsKey("apellidoPaterno");
    System.out.println("b2 = " + b2);

    b2 = persona.containsValue("Olmedo");
    System.out.println("b2 = " + b2);

    System.out.println("===================================== values");
    Collection<String> valores = persona.values(); // no es ordenable
    for(String v: valores){
      System.out.println("valor " + v);
    }

    System.out.println("====================================== keySet");
    Set<String> llaves = persona.keySet(); //no es ordenable
    for(String l: llaves){
      System.out.println("llave = " + l);
    }
    
    // Entry es una clase Inner que esta dentro de Map(embebida)
    // de esta manera podemos iterar con pares y valores usando entrySet()
    System.out.println("======================================= entrySet");
    for(Map.Entry<String, String> par: persona.entrySet()){
      System.out.println(par.getKey() + " => " + par.getValue());
    }


    System.out.println("======================================== ketSet");
    // otra forma de iterar
    for(String llave: persona.keySet()){
      String valor = persona.get(llave);
      System.out.println(llave = " => " + valor);
    }


    System.out.println("======================================== java 8 forEach");
    persona.forEach((llave, valor) -> {
      System.out.println(llave + " => " + valor);
    });

    System.out.println("======================================== size");
    System.out.println("total: " + persona.size());
    System.out.println("Contiene elementos?: " + !persona.isEmpty());

    System.out.println("======================================== replace");
    //para remplazar un valor
    // persona.replace("nombre", "Nicolas");
    boolean b3 = persona.replace("nombre", "Damian", "Nicolas"); // primero le paso el antiguo valor y segundo el nuevo valor    que qiero poner
    System.out.println("b3 = " + b3);
    // System.out.println("Persona = " + persona);
  }
}
