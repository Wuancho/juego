import java.util.Scanner;

public class batalla {
  public static void main(String[] args) {
    personajes jugador1 = null;
    personajes jugador2 = null;

    Scanner leer = new Scanner(System.in);
    int respu, opc;
    System.out.println("Bienvenido a The king of Fingther jugador 1");
    // System.out.println("jugador 1");
    Rugal.detalles();
    Jori.detalles();
    Jasiro.detalles();
    Chan.detalles();
    System.out.println("escoja peleador");
    System.out.println("1. Rugal");
    System.out.println("2. Jori");
    System.out.println("3. Jasiro");
    System.out.println("4. Chan");
    respu = leer.nextInt();
    if (respu == 1) {
      jugador1 = new Rugal();
    } else if (respu == 2) {

      jugador1 = new Jori();
    } else if (respu == 3) {

      jugador1 = new Jasiro();
    } else if (respu == 4) {

      jugador1 = new Chan();
    }
    if (respu == 1) {
      System.out.println("Jugador 1 Elejiste a Rugal");
    } else if (respu == 2) {
      System.out.println("Jugador 1 Elejiste a Jori");
    } else if (respu == 3) {
      System.out.println("Jugador 1 Elejiste a Jasiro");
    } else if (respu == 4) {
      System.out.println("Jugador 1 Elejiste a chan");
    } 
    


  
    System.out.println("Bienvenido a The King of Finther jugador 2");
    // System.out.println("2.seleccionar");
    Rugal.detalles();
    Jori.detalles();
    Jasiro.detalles();
    Chan.detalles();
    System.out.println("escoja peleador");
    System.out.println("1. Rugal");
    System.out.println("2. Jori");
    System.out.println("3. Jasiro");
    System.out.println("4. Chan");
    
    opc = leer.nextInt();
    switch (opc) {
      case 1:
        jugador2 = new Rugal();
        break;
      case 2:
        jugador2 = new Jori();
        break;
      case 3:
        jugador2 = new Jasiro();
        break;
      case 4:
        jugador2 = new Chan();
        break;
    }
    if (opc == 1) {
      System.out.println("Jugador 2 Elejiste a Rugal");
    } else if (opc == 2) {
      System.out.println("Jugador 2 Elejiste a Jori");
    } else if (opc == 3) {
      System.out.println("Jugador 2 Elejiste a Jasiro");
    } else if (opc == 4) {
      System.out.println("Jugador 2 Elejiste a chan");
    }
    limpiar();
    System.out.println("¡HORA DE PELEAR..!!!!!!!");
    System.out.println();

    do {
      ATAQUE(jugador1, jugador2);
      
    
    System.out.println("la fuerza del ataque del jugador1 es: " + jugador1.getFuerza());
    System.out.println("La salud del jugador1 es: " + jugador1.getSalud());
    System.out.println("el poder del jugador1 es:" + jugador1.getPoder());
    ATAQUE(jugador2, jugador1);
    System.out.println("La fuerza del del ataque del jugador2 es: " + jugador2.getFuerza());
    System.out.println("La salud del jugador2 es: " + jugador2.getSalud());
    System.out.println("el poder del jugador2 es:" + jugador2.getPoder());
    leer.nextLine();

  } while (jugador1.salud > 0 && jugador2.fuerza > 0);
    if (jugador2.getSalud() <= 0) {
      System.out.println("GAME MOVER");
      System.out.println("¡jugador 1 ganador!");
    } else if (jugador1.getSalud() <= 0) {
      System.out.println("¡jugandor 2 ganador!");
    }

  }
  static void limpiar(){
    System.out.println("\033[H\033[2J");
    System.out.flush();
  }

  // ATAQUE
  static void ATAQUE(personajes uno, personajes dos) {
    dos.setSalud(dos.getSalud() - uno.getFuerza() - uno.getPoder());
  }

}
