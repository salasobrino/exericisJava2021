package Bank;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Accounts {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String ruta = "/exercicis/src/Bank/Users";
		
		//Scanner scanner = new Scanner(System.in);
		
		// Creo ArrayList
		
		ArrayList<Account>account=new ArrayList<Account>();
		
		// Instanciamos el fichero donde estan los datos
		File fichero = new File(ruta);
		Scanner s = null;
		
			// Leemos el contenido del fichero
			System.out.println("... Leemos el contenido del fichero ...");
			s = new Scanner(fichero);
			
			
			// Obtengo los datos de los users del fichero
			while (s.hasNextLine()){
				String linea = s.nextLine();	// Obtengo una linea del fichero (un partido de fútbol)
				String [] cortarString = linea.split(" ");		// Obtengo los datos del partido de futbol
				System.out.println(cortarString);
				
				//Account n1 = new Account();	// Creo un objeto de la clase "PartidoFutbol"
				//n1.setOwner(cortarString[0]);
				//n1.setBalance(Double.parseDouble(cortarString[1]));
				// Pongo los atributos al objeto "partido"
				
				// Añadimos el objeto "partido" al ArrayList
				//account.add(n1);
				
			}

		

		System.out.println("... Guardados "+account.size()+" partidos de fútbol  ...");
		
	}
	
			
	public static void transfer (double a, Account out, Account ing) {
		
		  ing.deposit(a); 
		  
		  out.withdrawal(a);
		  
		  System.out.println(out); 
		  System.out.println(ing);
				
		
	}
	
	public static void personalCredit () {
		
	}
	
	public static void yourMethod (Account name) {
		System.out.println(name.toString() + "\n");
	}
	


}
