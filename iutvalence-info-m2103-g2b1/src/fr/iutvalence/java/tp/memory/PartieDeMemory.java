package fr.iutvalence.java.tp.memory;



/**
 * représente une partie du jeu memory
 * @author litzenbr
 *
 */
public class PartieDeMemory 
{
	/**
	 * nombre de paires par défaut pour jouer une partie de memory
	 */
	public final static int NB_DE_PAIRES_PAR_DEFAUT = 18;
	/**
	 * nombre de joueurs par défaut pour jouer une partie
	 */
	public final static int NB_JOUEURS_PAR_DEFAUT = 2;
	/**
	 * nombre de joueurs max
	 */
	public final static int NB_JOUEURS_MAX = 4;
	
	/**
	 * nombre de paires choisies par le joueur
	 */
	private final int NombreDePairesChoisies;
	/**
	 * correspond au plateau de jeu
	 */
	private Plateau plateau;
	/**
	 * joueur(s) listé(s) dans un tableau
	 */
	private Joueur[] joueurs;
	
	/**
	 * constucteur de la partie de memory
	 */
	public PartieDeMemory()
	{
		/**
		 * initialisation du Plateau
		 */
		this.plateau = new Plateau();
		/**
		 * initialisation du ou des joueurs
		 */
		this.joueurs = new Joueur[NB_JOUEURS_PAR_DEFAUT];
		/**
		 * affectation du nombre de paires de cartes par défaut au nombre de cartes mis en jeu
		 */
		this.NombreDePairesChoisies = NB_DE_PAIRES_PAR_DEFAUT;
	}

	
	/**
	 * lancement de la partie de memory
	 */
	public void jouer()
	{
		/**
		 * Mise en place des cartes sur le plateau
		 */
		
		
		/**
		 * Affichage du plateau à l'écran
		 */
		plateau.remplirPlateau();
		System.out.println(plateau);
		/**
		 * Affichage des scores des joueurs
		 */
		
		/**
		 * Affichage des tours de jeu des joueurs
		 */
		
		/**
		 * Lancement de la partie
		 */
		
		/**
		 * Obtention des positions des deux cartes choisies 
		 * Les cartes sont retournées
		 */
		
				
		/**
		 * Comparaison des cartes : 
		 * - si les cartes sont les mêmes, elles sont retirées du jeu et le joueur gagne 1 point
		 * - sinon les cartes sont retournés à leurs positions d'origine
		 */
	
		/**
		 * Changement de joueur
		 */
		
		/**
		 * Si il n'y a plus de cartes sur le plateau, les scores des joueurs sont comparés
		 * le joueur ayant le meilleur score est déclaré vainqueur
		 */
		
	}
}
