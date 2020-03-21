package et3.java;

public class TableauEntiers
{
	/**
	 * Cette m�thode permet de transformer un tableau de cha�nes de caract�res en tableau d'entiers
	 * 
	 * @param tabString Le tableau de cha�nes de caract�res � transformer
	 * @return Le tableau d'entiers cr�� � partir du tableau de cha�nes de caract�res
	 */
	public static int[] creerTableauEntiers ( String [] tabString )
	{
		//On cr�e un tableau d'entiers ayant la m�me taille que le tableau de cha�nes de caract�res
		int [] tabInt = new int [tabString.length];
		
		//On parcours le tableau de cha�nes de caract�res
		for(int indice = 0; indice < tabString.length; indice++)
		{
			//On tente d'�x�cuter le code ci-dessous
			try
			{
				//On parse l'�l�ment i du tableau de cha�nes de caract�re en entier
				//On associe cet entier � l'�l�ment i du tableau d'entiers
				tabInt[indice] = Integer.parseInt(tabString[indice]);
			}
			//Si le code du "try" renvoie une erreur "NumberFormatException", on execute le code ci-dessous
			catch(NumberFormatException exception)
			{
				//On informe l'utilisateur que tabString[indice] ne peut pas �tre transform� en entier
				System.out.println("La valeur " + tabString[indice] + " d'indice " 
						+ indice + " ne peut pas �tre transform�e en entier");
				System.out.println("Cette valeur sera donc remplac�e par 0 dans le tableau");
				
				//On donne la valeur 0 � l'indice i du tableau d'entier
				tabInt[indice] = 0;
			}
		}
		
		//On retourne le tableau d'entiers
		return tabInt;
	}
	
	/**
	 * Cette m�thode permet d'afficher le contenu d'un tableau d'entiers dans la console
	 * 
	 * @param tabInt Le tableau d'entiers � afficher
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
		
		//Avec la m�thode "toString()" de la classe "Arrays"
		sortie = "Avec la methode \"toString()\" de la classe \"Arrays\" : tabInt = ";
		sortie += java.util.Arrays.toString(tabInt);
		System.out.println(sortie);
	}
	
	/**
	 * Cette m�thode permet d'afficher le contenu d'un tableau d'entiers dans la console
	 * Elle est simplifi�e par rapport � la m�thode {@link TableauEntiers#afficherTableau(int[] tabInt)}
	 * 
	 * @param tabInt Le tableau d'entiers � afficher
	 */
	public static void afficherTableauPourTest(int[] tabInt)
	{
		String sortie = "tabInt = ";
		sortie += java.util.Arrays.toString(tabInt);
		System.out.println(sortie);
	}
	
	/**
	 * Cette m�thode permet d'obtenir le maximum d'un tableau d'entiers
	 * 
	 * @param tabInt Le tableau d'entiers
	 * @return Le maximum du tableau d'entiers
	 */
	public static int obtenirMaximum(int[] tabInt)
	{
		int maximum;
		
		//Si le tableau d'entiers poss�de au moins 1 �l�ment
		if(tabInt.length > 0)
		{
			//Au d�but, on d�finit le maximum comme �tant le premier �l�ment du tableau d'entiers
			maximum = tabInt[0];
			
			//On parcours le tableau d'entiers � partir du deuxi�me �l�ment
			for(int indice = 1; indice < tabInt.length; indice++)
			{
				//Si l'�l�ment du tableau d'entiers � la position indice est sup�rieur au maximum
				if(tabInt[indice] > maximum)
				{
					//L'�l�ment du tableau d'entiers � la position indice devient le nouveau maximum
					maximum = tabInt[indice];
				}
			}
		}
		//Si le tableau d'entiers ne poss�de aucun �l�ment
		else
		{
			//On informe l'utilisateur que le tableau d'entiers est vide
			System.out.println("Le tableau d'entiers est vide, la valeur du maximum est donc Integer.MIN_VALUE");
			
			//On d�finie notre maximum comme �tant 0
			maximum = Integer.MIN_VALUE;
		}
		
		//On retourne le maximum
		return maximum;	
	}
	
	/**
	 * Cette m�thode permet d'�changer la valeur du minimum d'un tableau d'entiers avec le maximum d'un autre
	 * 
	 * @param tabInt1 Le premier tableau d'entiers (minimum)
	 * @param tabInt2 Le deuxi�me tableau d'entiers (maximum)
	 * @return VRAI si l'�change a eu lieu et FAUX sinon
	 */
	public static boolean echangerMinTabInt1EtMaxTabInt2(int[] tabInt1, int[] tabInt2)
	{
		int indiceMinimumTabInt1;
		int indiceMaximumTabInt2;
		
		//Si les tableaux d'entiers poss�dent tous les deux au moins 1 �l�ment
		if(tabInt1.length > 0 && tabInt2.length > 0)
		{
			//Au d�but, on d�finit le minimum de tabInt1 comme �tant son premier �l�ment
			indiceMinimumTabInt1 = 0;
			
			//On parcours tabInt1 � partir du deuxi�me �l�ment
			for(int i1 = 1; i1 < tabInt1.length; i1++)
			{
				//Si l'�l�ment de tabInt1 � la position i1 est inf�rieur au minimum
				if(tabInt1[i1] < tabInt1[indiceMinimumTabInt1])
				{
					//L'�l�ment de tabInt1 � la position i1 devient le nouveau minimum
					tabInt1[indiceMinimumTabInt1] = tabInt1[i1];
					indiceMinimumTabInt1 = i1;
				}
			}
			
			//Au d�but, on d�finit le maximum de tabInt2 comme �tant son premier �l�ment
			indiceMaximumTabInt2 = 0;
			
			//On parcours tabInt2 � partir du deuxi�me �l�ment
			for(int i2 = 1; i2 < tabInt2.length; i2++)
			{
				//Si l'�l�ment de tabInt2 � la position i2 est sup�rieur au maximum
				if(tabInt2[i2] > tabInt2[indiceMaximumTabInt2])
				{
					//L'�l�ment de tabInt2 � la position i2 devient le nouveau maximum
					indiceMaximumTabInt2 = i2;
				}
			}
			
			//On �change les deux valeurs
			int temp = tabInt1[indiceMinimumTabInt1];
			tabInt1[indiceMinimumTabInt1] = tabInt2[indiceMaximumTabInt2];
			tabInt2[indiceMaximumTabInt2] = temp;
			
			//On retourne "vrai" car l'�change a bien eu lieu
			return true;
		}
		//Si au moins un des deux tableaux d'entiers ne poss�de aucun �l�ment
		else
		{
			//On retourne "faux" car l'�change n'a pas eu lieu
			return false;
		}
	}	
	
	/**
	 * Cette m�thode permet d'additionner plusieurs entiers
	 * 
	 * @param entiers Les entiers � additionner
	 * @return La somme des entiers
	 */
	public static int sommeEntiers (int... entiers)
	{
		int somme = 0;
		
		//On parcours les entiers pass�s en param�tre
		for (int entier : entiers)
		{
			//On ajoute chaque entier � la somme
			somme += entier ;
		}
		
		//On retourne la somme des entiers
		return somme ;
	}
	
	public static void main(String[] args) 
	{
		//On cr�e nos tableaux d'entiers
		int tabInt1 [] = {1, 2, 3, 4, 5};
		int tabInt2 [] = {6, 7, 8, 9, 1};
		
		//On affiche lest tableaux
		afficherTableauPourTest(tabInt1);
		afficherTableauPourTest(tabInt2);
		
		//On �change les valeurs (minimum tabInt1 <=> maximum tabInt2)
		System.out.println(echangerMinTabInt1EtMaxTabInt2(tabInt1, tabInt2));
		
		//On affiche lest tableaux
		afficherTableauPourTest(tabInt1);
		afficherTableauPourTest(tabInt2);
	}
}
