import factory.PlaneFactory;
import plane.Plane;
import utils.FileManager;
import utils.UserUi;

import java.io.*;
import java.util.Scanner;

import static utils.FileManager.createPlane;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput;
        boolean looper = true;
        Plane f18 = null ;

        System.out.println("Bienvenido al Sistema de Gestion del F-18 Super Hornet Block III");

        if (FileManager.isFile()){

            System.out.println("\nConfiguracion anterior encontrada\n");
            f18 = FileManager.getPlane();

            System.out.println("Estado del F18: \n");
            System.out.println(f18.toString());
        }

        while(looper){
            System.out.println("Porfavor elija una de las siguientes opciones: \n");
            UserUi.showMenu();
            System.out.print("-> ");

            userInput = sc.nextLine().toUpperCase();

            switch (userInput){
                case "1":
                    System.out.println("Introduzca el número de litros de combustible cargados: ");
                    System.out.print("# ");
                    float currentFuel = Float.parseFloat(sc.nextLine());

                    System.out.println(" Introduzca apodo del piloto: ");
                    System.out.print("# ");
                    String pilotCS = sc.nextLine();

                    System.out.println(" Introduzca número de escuadrón: ");
                    System.out.print("# ");
                    String squad = sc.nextLine();

                    f18 = PlaneFactory.createPlane(currentFuel, pilotCS, squad);

                    f18.printPlaneStatus();
                    break;

                case "2":
                    if (f18.flapStatus() == false){
                        System.out.println(" Los Flaps estan abajo, subiendo los Flaps");
                    }else{
                        System.out.println(" Los Flaps estan arriba, Bajando los Flaps");

                    }
                    f18.toggleFlaps();
                    f18.printPlaneStatus();
                    break;

                case "3":
                    if (f18.landingGearStatus() == false){
                        System.out.println(" El tren de aterrizaje esta abajo, subiendo El tren de aterrizaje");

                    }else{
                        System.out.println(" El tren de aterrizaje esta arriba, bajando El tren de aterrizaje");

                    }
                    f18.toggleLandingGear();
                    f18.printPlaneStatus();
                    break;

                case "4":
                    if (f18.ejectionSystemStatus() == false){
                        System.out.println(" El sistema de eyección está desactivado , activando El sistema de Eyección ");
                    }else{
                        System.out.println(" El sistema de eyección está activando , desactivando El sistema de Eyección ");
                    }
                    f18.toggleEjectionSystem();
                    f18.printPlaneStatus();
                    break;

                case "5":
                    f18.ejectPilot();
                    f18.printPlaneStatus();
                    break;

                case "Q":
                    System.out.println(" Guardando Configuracion del F18 ...... ");
                    FileManager.createPlane(f18);
                    System.out.println("Saliendo del programa Hasta Luego :)");
                    looper = false;
                    sc.close();
                    break;

                default:
                    System.out.println("Porfavor elija una de las opciones anteriores o salga pulsando la letra Q");
                    break;
            }

        }

    }


}
