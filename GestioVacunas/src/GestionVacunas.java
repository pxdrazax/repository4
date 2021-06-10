
import java.util.Scanner;
public class GestionVacunas {
	/**
	 * Método main, recoge los datos del paciente y de las vacunas según su tipo
	 * @param args
	 * @param nombrePaciente   = nombre del paciente
	 * @param dniPaciente      = dni del paciente
	 * @param tipoVacuna       = el tipo de la vacuna, 1 o 2
	 * @param nombreVacuna1    = nombre de la vacuna 1
	 * @param nombreVacuna2    = nombre de la vacuna 2
	 * @param fechaVacunacion1 = fecha de vacunación para la vacuna 2
	 * @param fechaVacunacion2 = fecha de vacunación para la vacuna 2
	 */
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombrePaciente,dniPaciente,numeroVacunacion="",vacunaUno="",vacunaDos="",diaUno="",diaDos="";

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el nombre del paciente:");
		nombrePaciente = teclado.next();
		System.out.println("Introduzca el dni del paciente:");
		dniPaciente = teclado.next();
		System.out.println("¿Vacuna 1 o 2?");
		numeroVacunacion = teclado.next();
		
		if(numeroVacunacion.equals("1")) {
			System.out.println("Introduzca la vacuna 1: ");
			vacunaUno = teclado.next();
			System.out.println("Introduzca el mes de vacunación de vacuna 1:");
			diaUno = teclado.next();
			
		}else if(numeroVacunacion.equals("2")) {
			
			System.out.println("Introduzca la vacuna 2: ");
			vacunaDos = teclado.next();
			System.out.println("Introduzca el mes de vacunación de vacuna 2:");
			diaDos = teclado.next();
			
		}else {
			System.out.println("Error");
		}
		
		/**
		 * Método que muestra los datos de los pacientes vacunados al menos una vez
		 * según el tipo de vacuna.
		 * 
		 * @param nombrePaciente = nombre del paciente
		 * @param nombreVacuna1  = nombre de la vacuna 1
		 * @param nombreVacuna2  = nombre de la vacuna 2
		 */
		
		System.out.println("VACUNACIÓN PACIENTE "+ nombrePaciente +"-"+ dniPaciente + "_________________");
		System.out.println("Vacuna 1 "+ vacunaUno +" Fecha:"+diaUno);
		System.out.println("Vacuna 2 "+ vacunaDos +" Fecha:"+diaDos);
		
		
		
		if(vacunaDos.equals("")) {
			if(vacunaUno.equals("Moderna")) {
				System.out.println("El paciente "+ nombrePaciente + " debe esperar 5 meses para la vacuna 2 ");
			}else if(vacunaUno.equals("Pfizer")) {
				System.out.println("El paciente "+ nombrePaciente + "debe esperar 4 meses para la vacuna 2 ");
			}else if(vacunaUno.equals("Janssen")) {
				System.out.println("El paciente está ya vacuando");
			}else {
				System.out.println("El paciente "+ nombrePaciente + " está ya vacunado ");
			}
		}		
	}/**
	 * Método que muestra los datos de la vacunación, según el tipo de vacuna y la
	 * fecha.
	 * 
	 * @param nombrePaciente   = nombre del paciente
	 * @param dniPaciente      = dni del paciente
	 * @param nombreVacuna1    = nombre de la vacuna 1
	 * @param nombreVacuna2    = nombre de la vacuna 2
	 * @param fechaVacunacion1 = fecha de vacunación para la vacuna 2
	 * @param fechaVacunacion2 = fecha de vacunación para la vacuna 2
	 */
	private static void datosVacunacion(String nombrePaciente, String dniPaciente, String nombreVacuna1,
			String nombreVacuna2, String fechaVacunacion1, String fechaVacunacion2) {
		System.out.println("VACUNACIÓN PACIENTE " + nombrePaciente + "-" + dniPaciente + "_________________");
		System.out.println("Vacuna 1 " + nombreVacuna1 + " Fecha:" + fechaVacunacion1);
		System.out.println("Vacuna 2 " + nombreVacuna2 + " Fecha:" + fechaVacunacion2);
	}
}


