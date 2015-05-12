package fr.iutvalence.java.tp.memory;

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
		private int nombreDeLignes = NOMBRE_LIGNES_DEFAUT;
		/**
		 * Nombre de colonnes du plateau contenant les cartes
		 */
		private int nombreDeColonnes = NOMBRE_COLONNES_DEFAUT;
		/**
		 * permet la création du plateau de jeu en fonction du nombre de lignes et de colonnes 
		 */
		this.cartes = new Carte[nombreDeLignes][nombreDeColonnes];
	}
}
