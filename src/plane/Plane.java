package plane;

import java.io.Serializable;

public class Plane implements Serializable {
    private float fuelLevel;
    private String pilotCallSign;
    private String squadNumber;

    private boolean flaps;
    private boolean landingGear;
    private boolean ejectionSystem;

    private boolean seatOccupation;

    private String asciiRepresentation;

    public Plane(float fuelLevel, String pilotCallSign, String squadNumber) {
        this.fuelLevel = fuelLevel;
        this.pilotCallSign = pilotCallSign;
        this.squadNumber = squadNumber;
        this.flaps = true;
        this.landingGear = false;
        this.ejectionSystem = false;
        this.seatOccupation = true;
        this.asciiRepresentation = "                               ._                             \n" +
                "                              |* ;                            \n" +
                "            `*-.              |\"\":                            \n" +
                "             \\  \\             |\"\"                             \n" +
                "              .  \\            |   :                           \n" +
                "              `   \\           |                               \n" +
                "               \\   \\          |    ;               +.         \n" +
                "                .   \\         |                   *._`-.      \n" +
                "                `    \\        |     :          .-*'  `. `.    \n" +
                "                _\\    \\.__..--**--...L_   _.-*'      .'`*'    \n" +
                "               /  `*-._\\   -.       .-*\"*+._       .'         \n" +
                "              :        ``*-._*.     \\      _J.   .'           \n" +
                "          .-*'`*-.       ;     `.    \\    /   `.'             \n" +
                "      .-*'  _.-*'.     .-'       `-.  `-.:   _.'`-.           \n" +
                "   +*' _.-*'      `..-'             `*-. `**'      `-.        \n" +
                "    `*'          .-'      ._            `*-._         `.      \n" +
                "             .-'         `.`-.____..+-**\"\"'         .*\"`.    \n" +
                "         ._.-'          _.-*'':$$$;._$              /     `.  \n" +
                "      .-'  `.      _.-*' `*-.__T$P   `\"**--..__    :        `.\n" +
                ".'..-'       \\_.-*'                            `\"**--..___.-*'\n" +
                "`. `.    _.-*'                                                \n" +
                "  `. `:*'                                                     \n" +
                "    `. `.                                                     \n" +
                "      `*";
    }

    public void toggleFlaps() {
        flaps = !flaps;
    }

    public void toggleLandingGear() {
        landingGear = !landingGear;
    }

    public void ejectionSystem() {
        ejectionSystem = !ejectionSystem;
    }

    public void ejectPilot(boolean pilotSeated) {
        if (this.ejectionSystem == false){
            System.out.println(" El sistema de eyeccion no está activado ");
        }else if (this.seatOccupation == false){
            System.out.println(" No hay piloto en el avión");
        }else {
            System.out.println(" Eyectado al Piloto ");
            this.seatOccupation = false;
        }

    }

    @Override
    public String toString() {
        return "Plane{" +
                "fuelLevel=" + fuelLevel +
                ", pilotCallSign='" + pilotCallSign + '\'' +
                ", squadNumber='" + squadNumber + '\'' +
                ", flaps=" + flaps +
                ", landingGear=" + landingGear +
                ", ejectionSystem=" + ejectionSystem +
                ", seatOccupation=" + seatOccupation +
                ", representation = " + this.asciiRepresentation +
                '}';
    }
}

