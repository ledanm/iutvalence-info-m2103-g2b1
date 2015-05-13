package fr.iutvalence.java.tp.memory;

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
	@Override
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
	
	public void remplirPlateau()
	{
		for (int column=0;column<Plateau.NOMBRE_COLONNES_DEFAUT;column++)
		{
			for (int lane=0;lane<Plateau.NOMBRE_LIGNES_DEFAUT;lane++)
			{					
				/**
				 * lister les cases du tableau en additionnant le numéro de ligne et de colonne,
				 * et tout les résultats paires ajouter 1 au numéro de la paire posé.
				 * Ensuite, mélanger les cartes en choisissant des positions aléatoires et les permutter.
				 */
				cartes[column][lane]=new Carte(5);
			}
		}
	}
}
		
		

