package org.olmedo.ejemplo.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMapGenerico {
  public static void main(String[] args){

    Map<String, Object> persona = new HashMap();
    // si pasamos el mismo clave valor repetido nos va a tomar el ultimo que allamos puesto
    System.out.println("Contiene elementos?: " + !persona.isEmpty());
    persona.put(null, "1234"); //acepta null pero uno solo no podemos tener null repetidos
    persona.put("nombre", "Damian");
    persona.put("apellido", "Olmedo");
    persona.put("apellidoPaterno", "Olmedo");
    persona.put("email", "damin.ol@email.com");
    persona.put("edad", 32);

    Map<String, String> direccion = new HashMap<>();
    direccion.put("pais", "USA");
    direccion.put("estado", "California");
    direccion.put("ciudad", "Santa Barbara");
    direccion.put("calle", "One Street");
    direccion.put("numero", "120");

    // aca se lo asignamos esta estructura dentro de otra
    persona.put("direccion", direccion);

    System.out.println("persona = " + persona); 
    
    //para obtener un valor se hace de esta manera
    String nombre = (String) persona.get("nombre");
    System.out.println("nombre = " + nombre);
    String apellido = (String) persona.get("apellido");
    System.out.println("apellido = " + apellido);

    Map<String, String> direccionPersona = (Map<String, String>)persona.get("direccion");
    String pais = direccionPersona.get("pais");
    String ciudad = direccionPersona.get("ciudad");
    String barrio = direccionPersona.getOrDefault("barrio", "La Playa");
    System.out.println("El pais de " + nombre + " es: " + pais);
    System.out.println("La ciudad de " + nombre + " es: " + ciudad);
    System.out.println("El barrio de " + nombre + " es: " + barrio);
    
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
    Collection<Object> valores = persona.values(); // no es ordenable
    for(Object v: valores){
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
    for(Map.Entry<String, Object> par: persona.entrySet()){
       Object valor = par.getValue();
       if(valor instanceof Map){ // es importante usar el instanceof
        String name = (String) persona.get("nombre");
        Map<String, String> direccionMap = (Map<String, String>) valor;
        for(Map.Entry<String, String> parDir: direccionMap.entrySet()) {
          System.out.println(parDir.getKey() + " => " + parDir.getValue());
        }
     } else {
      System.out.println(par.getKey() + " => " + valor);
      }
    }


    System.out.println("======================================== ketSet");
    // otra forma de iterar
    for(String llave: persona.keySet()){
      Object valor = persona.get(llave);
      if(valor instanceof Map){ // es importante usar el instanceof
        String name = (String) persona.get("nombre");
        Map<String, String> direccionMap = (Map<String, String>) valor;
        System.out.println("El pais de " + name + ": " + direccion.get("pais"));
        System.out.println("El estado de " + name + ": " + direccionMap.get("estado"));
        System.out.println("La ciudad de " + name + ": " + direccionMap.get("ciudad"));
      } else {
        System.out.println(llave = " => " + valor);
      }
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
