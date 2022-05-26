package model;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Spot {
	
	private String id;
	private String usernameUtente;
	private String nome;
	private String indirizzo;
	private File[] immagini;
	private int presenzeSegnalate;
	private List<Attivit�> attivit�;
	private Map<String, Double> affluenza;
	private List<Recensione> recensioni;
	
	public Spot() {
		
	}

	public Spot(String id, String usernameUtente, String nome, String indirizzo, File[] immagini,
			List<Attivit�> attivit�, Map<String, Double> affluenza, List<Recensione> recensioni) {
		super();
		this.id = id;
		this.usernameUtente = usernameUtente;
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.immagini = immagini;
		this.presenzeSegnalate = 0;
		this.attivit� = attivit�;
		this.affluenza = affluenza;
		this.recensioni = recensioni;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsernameUtente() {
		return usernameUtente;
	}

	public void setUsernameUtente(String usernameUtente) {
		this.usernameUtente = usernameUtente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public File[] getImmagini() {
		return immagini;
	}

	public void setImmagini(File[] immagini) {
		this.immagini = immagini;
	}

	public int getPresenzeSegnalate() {
		return presenzeSegnalate;
	}

	public void setPresenzeSegnalate(int presenzeSegnalate) {
		this.presenzeSegnalate = presenzeSegnalate;
	}

	public List<Attivit�> getAttivit�() {
		return attivit�;
	}

	public void setAttivit�(List<Attivit�> attivit�) {
		this.attivit� = attivit�;
	}

	public Map<String, Double> getAffluenza() {
		return affluenza;
	}

	public void setAffluenza(Map<String, Double> affluenza) {
		this.affluenza = affluenza;
	}

	public List<Recensione> getRecensioni() {
		return recensioni;
	}

	public void setRecensioni(List<Recensione> recensioni) {
		this.recensioni = recensioni;
	}
	
	
	
	
}
