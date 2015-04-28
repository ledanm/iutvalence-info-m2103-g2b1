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
	 * nombre de colonnes et de lignes par défaut de la grille de jeu
	 */
	public final static int NOMBRE_COLONNES_DEFAUT = 6;
	public final static int NOMBRE_LIGNES_DEFAUT = 6;
	
	private Carte[][] grille;
	
	/**
	 * nombre de colonnes et de lignes de la grille déterminées par le nombre de paires choisies par le joueur
	 */
	private int NombreLigne;
	private int NombreColonne;
	
	/**
	 * Sa taille dépend du nombre de paires choisies.
	 */
	public Plateau() 
	{
		this.grille = new Carte[NombreLigne][NombreColonne];
	}
}
