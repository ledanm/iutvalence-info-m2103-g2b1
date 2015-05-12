package fr.iutvalence.java.tp.memory;

/**
 * repr�sente le plateau de jeu o� sont pos�es les cartes
 * organis�es sous la forme d'une grille de taille variable
 * @author litzenbr
 *
 */
public class Plateau
{
	/**
	 * nombre de colonnes par d�faut de la grille de jeu
	 */
	public final static int NOMBRE_COLONNES_DEFAUT = 6;
	/**
	 * nombre de lignes par d�faut de la grille de jeu
	 */
	public final static int NOMBRE_LIGNES_DEFAUT = 6;
	
	/**
	 * affiche les cartes sous la forme d'un tableau � deux dimensions 
	 */
	private Carte[][] cartes;
	/**
	 * La taille du Plateau est d�termin� en fonction du nombre de paires du jeu
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
		 * permet la cr�ation du plateau de jeu en fonction du nombre de lignes et de colonnes 
		 */
		this.cartes = new Carte[nombreDeLignes][nombreDeColonnes];
	}
}
