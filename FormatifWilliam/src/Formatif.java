/*
* Author : williampho
* Date : 11-Dec-2020
*/// Programme pour additioner la somme des entiers presenté.
public class Formatif
	{

		public static void main(String[] args)
			{
///Commande "array" utiliser
				
				int[] array = {29, 28 , 38, 48, 83, 64, 49, 32, 97, 10};
				
				int somme = 0;
				
				for( int numero : array ) 
					
					///Ont trouve notre somme d'entiers pour crée "somme" par ajutant la somme de 0 initial + Numeros qui sont nos entiers///
					
					somme = somme+numero;
				
				///Notre Output finale de la some	
				
				System.out.println("Le Somme des entiers egale: ");
					System.out.println(somme);

			}

	}
