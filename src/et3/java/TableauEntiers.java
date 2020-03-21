package et3.java;

public class TableauEntiers
{
	/**
	 * Cette méthode permet de transformer un tableau de chaînes de caractères en tableau d'entiers
	 * 
	 * @param tabString Le tableau de chaînes de caractères à transformer
	 * @return Le tableau d'entiers créé à partir du tableau de chaînes de caractères
	 */
	public static int[] creerTableauEntiers ( String [] tabString )
	{
		//On crée un tableau d'entiers ayant la même taille que le tableau de chaînes de caractères
		int [] tabInt = new int [tabString.length];
		
		//On parcours le tableau de chaînes de caractères
		for(int indice = 0; indice < tabString.length; indice++)
		{
			//On tente d'éxécuter le code ci-dessous
			try
			{
				//On parse l'élément i du tableau de chaînes de caractère en entier
				//On associe cet entier à l'élément i du tableau d'entiers
				tabInt[indice] = Integer.parseInt(tabString[indice]);
			}
			//Si le code du "try" renvoie une erreur "NumberFormatException", on execute le code ci-dessous
			catch(NumberFormatException exception)
			{
				//On informe l'utilisateur que tabString[indice] ne peut pas être transformé en entier
				System.out.println("La valeur " + tabString[indice] + " d'indice " 
						+ indice + " ne peut pas être transformée en entier");
				System.out.println("Cette valeur sera donc remplacée par 0 dans le tableau");
				
				//On donne la valeur 0 à l'indice i du tableau d'entier
				tabInt[indice] = 0;
			}
		}
		
		//On retourne le tableau d'entiers
		return tabInt;
	}
	
	/**
	 * Cette méthode permet d'afficher le contenu d'un tableau d'entiers dans la console
	 * 
	 * @param tabInt Le tableau d'entiers à afficher
	 */
	public static void afficherTableau(int[] tabInt)
	{
		//Avec l'instruction "for"
		String sortie = "Avec l'instruction \"for\" : tabInt = ";
		for(int indice = 0; indice < tabInt.length; indice++)
		{
			sortie += tabInt[indice] + " ";
		}
		System.out.println(sortie);
		
		//Avec l'instruction "for each"
		sortie = "Avec l'instruction \"for each\" : tabInt = ";
		for(int entier:tabInt)
		{
			sortie += entier + " ";
		}
		System.out.println(sortie);
		
		//Avec la méthode "toString()" de la classe "Arrays"
		sortie = "Avec la methode \"toString()\" de la classe \"Arrays\" : tabInt = ";
		sortie += java.util.Arrays.toString(tabInt);
		System.out.println(sortie);
	}
	
	/**
	 * Cette méthode permet d'afficher le contenu d'un tableau d'entiers dans la console
	 * Elle est simplifiée par rapport à la méthode {@link TableauEntiers#afficherTableau(int[] tabInt)}
	 * 
	 * @param tabInt Le tableau d'entiers à afficher
	 */
	public static void afficherTableauPourTest(int[] tabInt)
	{
		String sortie = "tabInt = ";
		sortie += java.util.Arrays.toString(tabInt);
		System.out.println(sortie);
	}
	
	/**
	 * Cette méthode permet d'obtenir le maximum d'un tableau d'entiers
	 * 
	 * @param tabInt Le tableau d'entiers
	 * @return Le maximum du tableau d'entiers
	 */
	public static int obtenirMaximum(int[] tabInt)
	{
		int maximum;
		
		//Si le tableau d'entiers possède au moins 1 élément
		if(tabInt.length > 0)
		{
			//Au début, on définit le maximum comme étant le premier élément du tableau d'entiers
			maximum = tabInt[0];
			
			//On parcours le tableau d'entiers à partir du deuxième élément
			for(int indice = 1; indice < tabInt.length; indice++)
			{
				//Si l'élément du tableau d'entiers à la position indice est supérieur au maximum
				if(tabInt[indice] > maximum)
				{
					//L'élément du tableau d'entiers à la position indice devient le nouveau maximum
					maximum = tabInt[indice];
				}
			}
		}
		//Si le tableau d'entiers ne possède aucun élément
		else
		{
			//On informe l'utilisateur que le tableau d'entiers est vide
			System.out.println("Le tableau d'entiers est vide, la valeur du maximum est donc Integer.MIN_VALUE");
			
			//On définie notre maximum comme étant 0
			maximum = Integer.MIN_VALUE;
		}
		
		//On retourne le maximum
		return maximum;	
	}
	
	/**
	 * Cette méthode permet d'échanger la valeur du minimum d'un tableau d'entiers avec le maximum d'un autre
	 * 
	 * @param tabInt1 Le premier tableau d'entiers (minimum)
	 * @param tabInt2 Le deuxième tableau d'entiers (maximum)
	 * @return VRAI si l'échange a eu lieu et FAUX sinon
	 */
	public static boolean echangerMinTabInt1EtMaxTabInt2(int[] tabInt1, int[] tabInt2)
	{
		int indiceMinimumTabInt1;
		int indiceMaximumTabInt2;
		
		//Si les tableaux d'entiers possèdent tous les deux au moins 1 élément
		if(tabInt1.length > 0 && tabInt2.length > 0)
		{
			//Au début, on définit le minimum de tabInt1 comme étant son premier élément
			indiceMinimumTabInt1 = 0;
			
			//On parcours tabInt1 à partir du deuxième élément
			for(int i1 = 1; i1 < tabInt1.length; i1++)
			{
				//Si l'élément de tabInt1 à la position i1 est inférieur au minimum
				if(tabInt1[i1] < tabInt1[indiceMinimumTabInt1])
				{
					//L'élément de tabInt1 à la position i1 devient le nouveau minimum
					tabInt1[indiceMinimumTabInt1] = tabInt1[i1];
					indiceMinimumTabInt1 = i1;
				}
			}
			
			//Au début, on définit le maximum de tabInt2 comme étant son premier élément
			indiceMaximumTabInt2 = 0;
			
			//On parcours tabInt2 à partir du deuxième élément
			for(int i2 = 1; i2 < tabInt2.length; i2++)
			{
				//Si l'élément de tabInt2 à la position i2 est supérieur au maximum
				if(tabInt2[i2] > tabInt2[indiceMaximumTabInt2])
				{
					//L'élément de tabInt2 à la position i2 devient le nouveau maximum
					indiceMaximumTabInt2 = i2;
				}
			}
			
			//On échange les deux valeurs
			int temp = tabInt1[indiceMinimumTabInt1];
			tabInt1[indiceMinimumTabInt1] = tabInt2[indiceMaximumTabInt2];
			tabInt2[indiceMaximumTabInt2] = temp;
			
			//On retourne "vrai" car l'échange a bien eu lieu
			return true;
		}
		//Si au moins un des deux tableaux d'entiers ne possède aucun élément
		else
		{
			//On retourne "faux" car l'échange n'a pas eu lieu
			return false;
		}
	}	
	
	/**
	 * Cette méthode permet d'additionner plusieurs entiers
	 * 
	 * @param entiers Les entiers à additionner
	 * @return La somme des entiers
	 */
	public static int sommeEntiers (int... entiers)
	{
		int somme = 0;
		
		//On parcours les entiers passés en paramètre
		for (int entier : entiers)
		{
			//On ajoute chaque entier à la somme
			somme += entier ;
		}
		
		//On retourne la somme des entiers
		return somme ;
	}
	
	public static void main(String[] args) 
	{
		//On crée nos tableaux d'entiers
		int tabInt1 [] = {1, 2, 3, 4, 5};
		int tabInt2 [] = {6, 7, 8, 9, 1};
		
		//On affiche lest tableaux
		afficherTableauPourTest(tabInt1);
		afficherTableauPourTest(tabInt2);
		
		//On échange les valeurs (minimum tabInt1 <=> maximum tabInt2)
		System.out.println(echangerMinTabInt1EtMaxTabInt2(tabInt1, tabInt2));
		
		//On affiche lest tableaux
		afficherTableauPourTest(tabInt1);
		afficherTableauPourTest(tabInt2);
	}
}
