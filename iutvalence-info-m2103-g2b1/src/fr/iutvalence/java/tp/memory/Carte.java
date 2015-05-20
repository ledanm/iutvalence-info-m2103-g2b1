package fr.iutvalence.java.tp.memory;

/**
 * @author litzenbr
 * D�finition de la classe Carte
 * 
 */

public class Carte 
{
	/**
	 * carte retourn�e ou non
	 */
	private boolean estRetournee;
	/**
	 * num�ro de la paire � laquelle appartient la carte
	 */
	private int numeroDePaire;
	
	public Carte(int numero)
	{
		this.estRetournee=false;
		this.numeroDePaire=numero;
	}
	
	public int getNumeroDePaire() 
	{
		return numeroDePaire;
	}

	public void setNumeroDePaire(int numeroDePaire)
	{
		this.numeroDePaire = numeroDePaire;
	}

	@Override
	/**
	 * Cette fonction liste les ca pour d�terminer si elles sont retourn�es ou non
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
	
	public void retournerCarte()
	{
		this.estRetournee=true;
	}
}
