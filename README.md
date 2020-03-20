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
> 	 * Cette méthode permet de transmormer un tableau de chaînes de caractères en tableau d'entiers
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
> 						+ indice + " ne peut pas être transformée en entier.");
> 				System.out.println("Cette valeur sera donc remplacée par 0 dans le tableau.");
> 				
> 				//On donne la valeur 0 à l'indice i du tableau d'entier
> 				tabInt[indice] = 0;
> 			}
> 		}
> 		
> 		//On renvoie le tableau d'entiers
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
> - il est possible de rendre visible certains éléments uniquement pour les classes d'un même package

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

```Java
Test
```

2#3. Ajoutez une méthode de classe affichant le contenu d’un tableau d’entiers passé en paramètres.

- 2#3.1 méthode ajoutée

```Java
Test
```

- 2#3.2 Que se passe-t-il au niveau de la machine virtuelle en cas de dépassement de lecture des éléments d’un tableau, par exemple dans la méthode précédente ? Pourquoi ceci n’a-t-il pas mené à une erreur de compilation ?

```Java
Test
```

2#4. Ajoutez une méthode à la classe retournant la valeur maximale des valeurs d’un tableau d’entiers passé en paramètre. Pensez à une valeur adaptée dans le cas d'un tableau vide.

- 2#4.1 méthode ajoutée

```Java
Test
```

- 2#4.2 test de la méthode ajoutée

```Java
Test
```

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
