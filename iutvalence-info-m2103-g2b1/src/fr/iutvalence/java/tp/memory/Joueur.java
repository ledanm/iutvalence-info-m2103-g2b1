package fr.iutvalence.java.tp.memory;
/**
 * @author litzenbr
 * Définition de la classe Joueur
 */
public class Joueur 
{
	/**
	 * numéro du joueur attribué au début de la partie 
	 */
	private int NumeroJoueur;
	/**
	 * nombre de paires trouvées par le joueur (= score)
	 */
	private int NombrePairesTrouvees;
	
	/**
	 * méthode qui permet de choisir une carte grace à une intersection de colonne et de ligne
	 * 
	 */
	public void retournerCarte(int colonne,int ligne,Plateau plateau)
	{ 
		plateau.getCartes()[colonne][ligne].retournerCarte();
	}
	
}
