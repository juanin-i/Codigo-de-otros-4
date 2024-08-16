package com.generation;

import java.util.Scanner; //Importar el scanner

public class Codigo4 {
	public static void main(String[]args) { //Creacion del metodo main, todo debe estar dentro de este metodo
	Scanner s = new Scanner(System.in); //añadidos los argumentos System.in para la entrada de usuario	
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //cambio en el mensaje , esta erroneo
   /* "Scanner s2 = new Scanner();" Esta parte del codigo esta de mas, no es necesario tener un nuevo scanner*/
    String j2 = s.nextLine();

    if(j1.equals(j2)) { //la comparacion de cadenas se hace con metodo equals y no con el operador
      System.out.println("Empate");
    }else{
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2.equals ("tijeras")) { //la comparacion de cadenas se hace con metodo equals y no con el operador
            g = 1;
          }
          break; // cada case debe tener un break menos el ultimo
        case "papel":
          if (j2.equals("piedra")) { //la comparacion de cadenas se hace con metodo equals y no con el operador
            g = 1;
          }// Faltaba llave que cierra el case
          break; // cada case debe tener un break menos el ultimo
        case "tijeras": //no estaba el caso tijeras
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default: // no estaba determinado la accion 
        	System.out.println("La opcion elegida no es valida!");
        	
        	return; //salir del metodo si la entrada no es valida
      }
      
      System.out.println("Gana el jugador " + g);
    }
    s.close(); //Cerrar el scanner para que no haya advertencias
    }
}