package com.twitter.poruke;

/**
 * Ovo je klasa koja predstvalja Twitter poruku.
 * 
 * @author Jovana Stojadinovic
 * @version 1.0
 *
 */
public class TwitterPoruka {
	/**
	 * Ime korisnika
	 */
	private String korisnik;
	/**
	 * Tekst poruke
	 */
	private String poruka;

	/**
	 * Vraca vrednost atributa korisnik
	 * 
	 * @return ime korisnika
	 */
	public String getKorisnik() {
		return korisnik;
	}

	/**
	 * Postavlja novu vrednost atributa korisnik
	 * 
	 * @param korisnik
	 *            nova vrednost atributa korisnik
	 * @throws java.lang.RuntimeException
	 *             ako je uneta vrednost atributa korisnik
	 *             <ul>
	 *             <li>null
	 *             <li>prazan string
	 *             </ul>
	 */
	public void setKorisnik(String korisnik) {
		if (korisnik == null || korisnik == "")
			throw new RuntimeException("Ime korisnika mora biti uneto");
		this.korisnik = korisnik;
	}

	/**
	 * Vraca vrednost atributa poruka
	 * 
	 * @return poruka
	 */
	public String getPoruka() {
		return poruka;
	}

	/**
	 * Postavlja novu vrednost atributa poruka
	 * 
	 * @param poruka
	 *            nova vrednost atributa poruka
	 * @throws java.lang.RuntimeException
	 *             ako je uneta vrednost atributa poruka
	 *             <ul>
	 *             <li>null
	 *             <li>poruka duza od 140 znakova
	 *             </ul>
	 */
	public void setPoruka(String poruka) {
		if (poruka == null || poruka.length() > 140)
			throw new RuntimeException("Poruka mora biti uneta i mora imati najvise 140 znakova");
		this.poruka = poruka;
	}

	public String toString() {
		return "KORISNIK:" + korisnik + " PORUKA:" + poruka;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TwitterPoruka other = (TwitterPoruka) obj;
		if (korisnik == null) {
			if (other.korisnik != null)
				return false;
		} else if (!korisnik.equals(other.korisnik))
			return false;
		if (poruka == null) {
			if (other.poruka != null)
				return false;
		} else if (!poruka.equals(other.poruka))
			return false;
		return true;
	}
}