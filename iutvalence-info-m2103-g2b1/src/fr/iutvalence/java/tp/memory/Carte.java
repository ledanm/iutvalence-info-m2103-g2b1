package fr.iutvalence.java.tp.memory;

/**
 * @author litzenbr
 * Définition de la classe Carte
 * 
 */

public class Carte 
{
	/**
	 * carte retournée ou non
	 */
	private boolean estRetournee;
	/**
	 * numéro de la paire à laquelle appartient la carte
	 */
	private int numeroDePaire;
	
	public Carte(int numero)
	{
		this.estRetournee=flase;
		this.numeroDePaire=numero;
	}
	
	@Override
	/**
	 * Cette fonction liste les ca pour déterminer si elles sont retournées ou non
	 */
	public String toString()
	{
		String toReturn="";
		if (estRetournee)
		{
			String numeroCarte = String.valueOf(numeroDePaire); 
			toReturn=numeroCarte;
		}
		else
		{
			toReturn="  ";
		}
		return toReturn;
	}
}
