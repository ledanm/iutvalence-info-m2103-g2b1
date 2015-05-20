package fr.iutvalence.java.tp.memory;
import java.lang.Math; 
import java.util.Arrays;

/**
 * représente le plateau de jeu où sont posées les cartes
 * organisées sous la forme d'une grille de taille variable
 * @author litzenbr
 *
 */
public class Plateau
{
	/**
	 * nombre de colonnes par défaut de la grille de jeu
	 */
	public final static int NOMBRE_COLONNES_DEFAUT = 6;
	/**
	 * nombre de lignes par défaut de la grille de jeu
	 */
	public final static int NOMBRE_LIGNES_DEFAUT = 6;
	
	/**
	 * affiche les cartes sous la forme d'un tableau à deux dimensions 
	 */
	private Carte[][] cartes;
	/**
	 * La taille du Plateau est déterminé en fonction du nombre de paires du jeu
	 */
	public Plateau()  
	{
		/**
		 * Nombre de lignes du plateau contenant les cartes
		 */
		int nombreDeLignes = NOMBRE_LIGNES_DEFAUT;
		/**
		 * Nombre de colonnes du plateau contenant les cartes
		 */
		int nombreDeColonnes = NOMBRE_COLONNES_DEFAUT;
		/**
		 * permet la création du plateau de jeu en fonction du nombre de lignes et de colonnes 
		 */
		this.cartes = new Carte[nombreDeLignes][nombreDeColonnes];
	}
	
	/**
	 * Cette fonction liste les cases du plateau pour y afficher les cartes
	 */
	public String toString() 
	{	
		String toReturn="";
		for (int column=0;column<NOMBRE_COLONNES_DEFAUT;column++)
		{
			for (int lane=0;lane<NOMBRE_LIGNES_DEFAUT;lane++)
			{	
					toReturn+="[";
					toReturn+=cartes[column][lane].toString();
					toReturn+="]";
					
			}
			toReturn+="\n";
		}
		return toReturn;
	}
	
	/**
	 * méthode qui permet d'afficher les cartes (sous la forme de paires de numéros)
	 * du plateau de jeu
	 */
	public void remplirPlateau()
	{
		int chiffre=0;
		for (int column=0;column<Plateau.NOMBRE_COLONNES_DEFAUT;column++)
		{
			for (int lane=0;lane<Plateau.NOMBRE_LIGNES_DEFAUT;lane++)
			{					
				/**
				 * condition permettant de créer les paires de cartes. Elles sont posées 
				 * côte à côte. 
				 */
				if (lane%2==0)
					chiffre++;
					cartes[column][lane]=new Carte(chiffre);
					
			}
			
		}
		/**
		 * boucle permettant de mélanger les cartes via la fonction Random
		 */
		for (int boucle=0;boucle<200;boucle++)
		{
			int ligne1 = (int) (Math.random() * 6);
			int ligne2 = (int) (Math.random() * 6);
			int colonne1 = (int) (Math.random() * 6);
			int colonne2 = (int) (Math.random() * 6);
		
			Carte intermediaire;
		
			intermediaire= cartes[colonne1][ligne1];
			cartes[colonne1][ligne1]= cartes[colonne2][ligne2];
			cartes[colonne2][ligne2]=intermediaire;
		}
		
	}
	public Carte[][] getCartes() 
	{
		return cartes;
	}
	public void setCartes(Carte[][] cartes) 
	{
		this.cartes = cartes;
	}
}
		
		

