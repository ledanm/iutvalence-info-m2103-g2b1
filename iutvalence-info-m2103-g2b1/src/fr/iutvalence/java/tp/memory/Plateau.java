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
	 * nombre de colonnes et de lignes par d�faut de la grille de jeu
	 */
	public final static int NOMBRE_COLONNES_DEFAUT = 6;
	public final static int NOMBRE_LIGNES_DEFAUT = 6;
	
	private Carte[][] grille;
	
	/**
	 * nombre de colonnes et de lignes de la grille d�termin�es par le nombre de paires choisies par le joueur
	 */
	private int NombreLigne;
	private int NombreColonne;
	
	/**
	 * Sa taille d�pend du nombre de paires choisies.
	 */
	public Plateau() 
	{
		this.grille = new Carte[NombreLigne][NombreColonne];
	}
}
