# UD 6-1 Ficheros.

## Resultados de aprendizaje:

### Realiza operaciones de entrada y salida de información, utilizando procedimientos específicos del lenguaje y librerías de clases

Criterios de evaluación:  					 
 a.  Se ha utilizado la consola para realizar operaciones de entrada y salida de información.   				 
 b.    Se han aplicado formatos en la visualización de la información.   				 
 c.    Se han reconocido las posibilidades de entrada / salida del lenguaje y las librerías asociadas.   				 
 d.    Se han utilizado ficheros para almacenar y recuperar información.   				 
 e.    Se han creado programas que utilicen diversos métodos de acceso al contenido de los ficheros.


En esta ocasión nos han contactado desde la base aérea de Miramar en Estados Unidos. La base de miramar es famosa por alojar a los pilotos del programa TopGun.

Parece ser que los responsables de desarrollar el software interno de los F-18 Super Hornet Block III han cometido errores importantes y han tenido que contactar con desarrolladores y desarrolladoras de verdad, es decir, con nosotros.

El principal problema radica en que, una vez en vuelo, si el sistema se reinicia, se pierde toda la configuración del mismo y esto, cuando estás volando a velocidad MACH 2,2 parece bastante mala idea.

Desde la base aérea de Miramar se nos pide que desarrollemos un software que cumpla con los siguientes requisitos.



Nuestro programa debe modelar el estado de los siguientes elementos de un F18:
1. Nivel de combustible.
2. Estado de los flaps.
3. Estado del tren de aterrizaje.
4. Estado del sistema de eyección del piloto.
5. Asiento ocupado.
6. Nuestro programa tendrá que ejecutarse en una de las pantallas del F18, por lo que su menú tendrá que ser exactamente este:
- 1.- Inicializar F18
- 2.- Alternar estado de los flaps (Los flaps pueden estar en uno de los siguientes estados: Abajo o Arriba)
- 3.- Alternar estado del tren de aterrizaje (El tren de aterrizaje puede estar en uno de los siguientes estados: Abajo o Arriba)
- 4.- Armar sistema de eyección (El sistema de eyección debe estar desarmado cuando se inicializa el F18, una vez que se pulsa esta opción el sistema de eyección pasa a estar activo) 
- 5.- Eyectar piloto (Esta opción sólo funcionará si el sistema de eyección está armado)
- Q.- Salir.


### Clase base:

```
public class Plane {
	private float fuelLevel;
	private String pilotCallSign;
	private String squadNumber;

	private boolean flaps;
	private boolean landingGear;
	private boolean ejectionSystem;

	private boolean seatOccupation;

	public Plane(float fuelLevel, String pilotCallSign, String squadNumber) {
    	this.fuelLevel = fuelLevel;
    	this.pilotCallSign = pilotCallSign;
    	this.squadNumber = squadNumber;
   	 
    	// Completa el código para cumplir con los requisitos.
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
    
	public void setSeatOccupation(boolean pilotSeated) {
    	seatOccupation = pilotSeated;
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
            	'}';
	}
}

```