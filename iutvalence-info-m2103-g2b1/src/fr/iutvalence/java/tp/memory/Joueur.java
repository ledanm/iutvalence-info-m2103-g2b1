package fr.iutvalence.java.tp.memory;
/**
 * @author litzenbr
 * D�finition de la classe Joueur
 */
public class Joueur 
{
	/**
	 * num�ro du joueur attribu� au d�but de la partie 
	 */
	private int NumeroJoueur;
	/**
	 * nombre de paires trouv�es par le joueur (= score)
	 */
	private int NombrePairesTrouvees;
	
	/**
	 * m�thode qui permet de choisir une carte grace � une intersection de colonne et de ligne
	 * 
	 */
	public void retournerCarte(int colonne,int ligne,Plateau plateau)
	{ 
		plateau.getCartes()[colonne][ligne].retournerCarte();
	}
	
}
