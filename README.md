Programmation Java @ Et3
Polytech Paris-Saclay | 2019-20

# TP2 

Vous allez développer une classe utilitaire en Java permettant de réaliser divers traitements sur des tableaux d’entiers.

2#1. Créez une classe au nom approprié dans un package pertinent. Ajoutez une méthode statique à votre classe permettant de créer un tableau d’entiers (int[]) à partir d’un tableau de chaı̂nes de caractères (String[]).

- 2#1.1 code de la classe

> ```Java
> package et3.java;
> 
> public class TableauEntiers
> {
> 	/**
> 	 * Cette méthode permet de transformer un tableau de chaînes de caractères en tableau d'entiers
> 	 * 
> 	 * @param tabString Le tableau de chaînes de caractères à transformer
> 	 * @return Le tableau d'entiers créé à partir du tableau de chaînes de caractères
> 	 */
> 	public static int[] creerTableauEntiers ( String [] tabString )
> 	{
> 		//On crée un tableau d'entiers ayant la même taille que le tableau de chaînes de caractères
> 		int [] tabInt = new int [tabString.length];
> 		
> 		//On parcours le tableau de chaînes de caractères
> 		for(int indice = 0; indice < tabString.length; indice++)
> 		{
> 			//On tente d'éxécuter le code ci-dessous
> 			try
> 			{
> 				//On parse l'élément i du tableau de chaînes de caractère en entier
> 				//On associe cet entier à l'élément i du tableau d'entiers
> 				tabInt[indice] = Integer.parseInt(tabString[indice]);
> 			}
> 			//Si le code du "try" renvoie une erreur "NumberFormatException", on execute le code ci-dessous
> 			catch(NumberFormatException exception)
> 			{
> 				//On informe l'utilisateur que tabString[indice] ne peut pas être transformé en entier
> 				System.out.println("La valeur " + tabString[indice] + " d'indice " 
> 						+ indice + " ne peut pas être transformée en entier");
> 				System.out.println("Cette valeur sera donc remplacée par 0 dans le tableau");
> 				
> 				//On donne la valeur 0 à l'indice i du tableau d'entier
> 				tabInt[indice] = 0;
> 			}
> 		}
> 		
> 		//On retourne le tableau d'entiers
> 		return tabInt;
> 	}
>   
> 	public static void main(String[] args) 
> 	{
> 		
> 	}
> }
> ```

- 2#1.2 Pourquoi est-il utile d'associer notre classe à un package ?

> Il est utile d'associer notre classe à un package pour deux raisons principales :
> - cela permet de mieux organiser notre code en regroupant les classes par thème;
> - il est possible de rendre visible certains éléments uniquement pour les classes d'un même package.

- 2#1.3 Comment la méthode de conversion doit-elle se comporter en cas de problème de conversion, i.e. si une des chaı̂nes du tableau ne peut pas être convertie en entier à l’exécution ?

> Dans notre cas, il est souhaitable d'associer une valeur à chaque indice du tableau d'entiers. Nous allons donc associer la valeur 0 à l'éléement du tableau d'entiers concerné pour éviter les futures erreurs. Dans un soucis de transparence, il est cependant important d'en notifier l'utilisateur.
> 
> ```Java
> //On informe l'utilisateur que tabString[indice] ne peut pas être transformé en entier
> System.out.println("La valeur " + tabString[indice] + " d'indice " 
> 	+ indice + " ne peut pas être transformée en entier.");
> System.out.println("Cette valeur sera donc remplacée par 0 dans le tableau.");
> 				
> //On donne la valeur 0 à l'indice i du tableau d'entier
> tabInt[indice] = 0;
> ```

2#2. Ajoutez une méthode main à cette classe pour tester la méthode précédente en lui transmettant le tableau de paramètres lu depuis la ligne de commandes.

- 2#2.1 méthode main

> ```Java
> public static void main(String[] args) 
> {
> 	//On crée notre tableau d'entiers à partir de notre tableau de chaînes de caractères
> 	int[] tabInt = creerTableauEntiers(args);
> 	
> 	//On affiche les éléments du tableau d'entiers
> 	String sortie = "tabInt : ";
> 	for(int entier:tabInt)
> 	{
> 		sortie += entier + " ";
> 	}
> 	System.out.println(sortie);
> }
> ```
> 
> Pour tester le programme en ligne de commande, on utilise la commande [java](https://docs.oracle.com/javase/7/docs/technotes/tools/windows/java.html). Dans notre cas, on obtient :
>
> ```c++
> ...\TP#2\bin>java et3/java/TableauEntiers "15" "6" "4"
> tabInt : 15 6 4
> ```

2#3. Ajoutez une méthode de classe affichant le contenu d’un tableau d’entiers passé en paramètres.

- 2#3.1 méthode ajoutée

> ```Java
> /**
>  * Cette méthode permet d'afficher le contenu d'un tableau d'entiers dans la console
>  * 
>  * @param tabInt Le tableau d'entiers à afficher
>  */
> public static void afficherTableau(int[] tabInt)
> {
> 	//Avec l'instruction "for"
> 	String sortie = "Avec l'instruction \"for\" : tabInt = ";
> 	for(int indice = 0; indice < tabInt.length; indice++)
> 	{
> 		sortie += tabInt[indice] + " ";
> 	}
> 	System.out.println(sortie);
> 	
> 	//Avec l'instruction "for each"
> 	sortie = "Avec l'instruction \"for each\" : tabInt = ";
> 	for(int entier:tabInt)
> 	{
> 		sortie += entier + " ";
> 	}
> 	System.out.println(sortie);
> 	
> 	//Avec la méthode "toString()" de la classe "Arrays"
> 	sortie = "Avec la methode \"toString()\" de la classe \"Arrays\" : tabInt = ";
> 	sortie += java.util.Arrays.toString(tabInt);
> 	System.out.println(sortie);
> }
> ```
> 
> Dans le cas ou on utilise la méthode [toString()](https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html#toString(int[])) de la classe Arrays, on a à faire à une surcharge (cette méthode est définie pour plusieurs types de tableaux : int[], boolean[], String[], ...)

- 2#3.2 Que se passe-t-il au niveau de la machine virtuelle en cas de dépassement de lecture des éléments d’un tableau, par exemple dans la méthode précédente ? Pourquoi ceci n’a-t-il pas mené à une erreur de compilation ?

> Si on modifie la partie concernant l'instruction `for` de la méthode précédente (e.g. on remplace le `<` par un `<=`), cela nous donne :
> 
> ```Java
> //Avec l'instruction "for"
> String sortie = "Avec l'instruction \"for\" : tabInt = ";
> for(int indice = 0; indice <= tabInt.length; indice++)
> {
> 	sortie += tabInt[indice] + " ";
> }
> System.out.println(sortie);
> ```
> 
> Lorsqu'on fait tourner le code, une erreur est soulevée :
> 
> ```Java
> Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
> 	at et3.java.TableauEntiers.afficherTableau(TableauEntiers.java:71)
> 	at et3.java.TableauEntiers.main(TableauEntiers.java:95)
> ```
> 
> L'erreur obtenue est une exception de type [ArrayIndexOutOfBoundsException](https://docs.oracle.com/javase/7/docs/api/java/lang/ArrayIndexOutOfBoundsException.html). On peut remarquer que c'est une [RuntimeException](https://docs.oracle.com/javase/7/docs/api/java/lang/RuntimeException.html), ce qui veut dire qu'elle n'apparaîtra pas lors de la compilation de notre programme mais uniquement lors de son éxécution.

2#4. Ajoutez une méthode à la classe retournant la valeur maximale des valeurs d’un tableau d’entiers passé en paramètre. Pensez à une valeur adaptée dans le cas d'un tableau vide.

- 2#4.1 méthode ajoutée

> ```Java
> /**
>  * Cette méthode permet d'obtenir le maximum d'un tableau d'entiers
>  * 
>  * @param tabInt Le tableau d'entiers
>  * @return Le maximum du tableau d'entiers
>  */
> public static int obtenirMaximum(int[] tabInt)
> {
> 	int maximum;
> 	
> 	//Si le tableau d'entiers possède au moins 1 élément
> 	if(tabInt.length > 0)
> 	{
> 		//Au début, on définit le maximum comme étant le premier élément du tableau d'entiers
> 		maximum = tabInt[0];
> 		
> 		//On parcours le tableau d'entiers à partir du deuxième élément
> 		for(int indice = 1; indice < tabInt.length; indice++)
> 		{
> 			//Si l'élément du tableau d'entiers à la position indice est supérieur au maximum
> 			if(tabInt[indice] > maximum)
> 			{
> 				//L'élément du tableau d'entiers à la position indice devient le nouveau maximum
> 				maximum = tabInt[indice];
> 			}
> 		}
> 	}
> 	else
> 	{
> 		//On informe l'utilisateur que le tableau d'entiers est vide
> 		System.out.println("Le tableau d'entiers est vide, la valeur du maximum est donc 0");
> 		
> 		//On définie notre maximum comme étant 0
> 		maximum = 0;
> 	}
> 	//On retourne le maximum
> 	return maximum;	
> }
> ```

- 2#4.2 test de la méthode ajoutée

> On transforme la méthode `main()` pour tester la méthode `obtenirMaximum()` :
> ```Java
> public static void main(String[] args) 
> {
> 	//On crée notre tableau d'entiers à partir de notre tableau de chaînes de caractères
> 	int[] tabInt = creerTableauEntiers(args);
> 	
> 	//On affiche le maximum du tableau d'entiers
> 	System.out.println(obtenirMaximum(tabInt));
> }
> ```
> 
> On obtient le resultat suivant lorsqu'on éxécute le code avec un exemple de tableau rempli :
> ```
> ...\TP\TP#2\bin>java et3/java/TableauEntiers "15" "6" "4"
> 15
> ```
> 
> On obtient le resultat suivant lorsqu'on éxécute le code avec un exemple de tableau vide :
> ```
> ...\TP\TP#2\bin>java et3/java/TableauEntiers
> Le tableau d'entiers est vide, la valeur du maximum est donc 0
> 0
> ```

2#5. On souhaite ajouter une méthode de classe qui permettrait d’échanger la valeur minimale d’un premier tableau d’entiers transmis en paramètre avec la valeur maximale d’un second tableau d’entiers.

- 2#5.1 méthode ajoutée si cela est possible

```Java
Test
```

- 2#5.2 test de la méthode ajoutée

```Java
Test
```

2#6. On souhaite maintenant ajouter une méthode de classe qui retourne la somme des entiers transmis en acceptant un nombre quelconque d’entiers directement en paramètres de la méthode.

- 2#6.1 méthode ajoutée si cela est possible

```Java
Test
```

- 2#6.2 test de la méthode ajoutée

```Java
Test
```

2#7. Créez un fichier JAR ne contenant que le code compilé de votre classe, et utilisez-le dans la méthode main d’une nouvelle classe d'un autre package de votre choix. Créez automatiquement la documentation Javadoc de votre classe.

- 2#7.1 nouvelle classe ajoutée

```Java
Test
```

- 2#7.2 Quelles sont les étapes pour la création de la Javadoc et de l'archive JAR ?

```Java
Test
```

| Transmettre par courrier électronique ||
| :---: | :--- | 
|to|eugenie.brasier@inria.fr|
|title|[Polytech > Et3] TP2_NOM_Prenom|
|attached|TP2_NOM_Prenom.pdf|
