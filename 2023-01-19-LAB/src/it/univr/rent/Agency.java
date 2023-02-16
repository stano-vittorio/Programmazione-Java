package it.univr.rent;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

// Ci sono 5 TODO

public class Agency {
	
	private final String name;
	private final SortedSet<Model> fleet = new TreeSet<>();
	private final Map<Model, Integer> rents = new HashMap<>();

	/**
	 * Crea un'agenzia di noleggio col nome indicato,
	 * che fornisce in noleggio i modelli indicati.
	 * 
	 * @param fleet i modelli noleggiabili con l'agenzia
	 * @throws IllegalArgumentException se fleet e' vuoto
	 */
	public Agency(String name, Model... fleet) {
		// TODO
		if(fleet == null) {
			throw new IllegalArgumentException("fleet non può essere vuoto");
		}
		
		this.name = name;
		for(Model model: fleet) {
			this.fleet.add(model);
		}
	}

	/**
	 * Restituisce l'insieme dei modelli noleggiabili con questa agenzia
	 * e con la patente indicata.
	 * 
	 * @param license la patente
	 */
	public Set<Model> modelsAvailableForLicense(License license) {
		// TODO
		Set<Model> result = new HashSet<>();
		
		for(Model model: fleet) {
			if(model.canBeDrivenWith(license)) {
				result.add(model);
			}
		}
		return result;
	}

	/**
	 * Pende nota che qualcuno ha noleggiato con questa agenzia un dato modello,
	 * per una certa quantita' di giorni, usando la patente indicata.
	 * 
	 * @param model il modello noleggiato
	 * @param license la patente
	 * @param days il numero di giorni di noleggio
	 * @throws IllegalLicenseException se il modello non si puo' guidare
	 *                                 con la patente indicata
	 * @throws ModelNotAvailableException se il modello non e' fra quelli
	 *                                    noleggiabili con questa agenzia
	 */
	public void rent(Model model, License license, int days) {
		// TODO
		if(!model.canBeDrivenWith(license)) {
			throw new IllegalLicenseException();
		}
		if(!fleet.contains(model)) {
			throw new ModelNotAvailableException();
		}
		
		Integer old = rents.get(model);
		if(old == null) {
			old = 0;
		}
		rents.put(model, days + old);
	}

	/**
	 * Restituisce il modello che e' stato noleggiato in totale per piu' giorni
	 * con questa agenzia.
	 */
	public Model mostRented() {
		//TODO
		Model result = null;
		
		for(Model model: rents.keySet()) {
			if(result == null || rents.get(model) > rents.get(result)) {
				result = model;
			}
		}
		return result;
	}

	/**
	 * Restituisce una stringa con in prima riga il nome dell'agenzia e,
	 * sotto di essa, la lista dei modelli noleggiabili con questa agenzia,
	 * ordinati secondo l'ordinamento fra i modelli.
	 */
	@Override
	public String toString() {
		// TODO
		String result = "Agency " + name + ". Available models:\n-------------------------------\n";
		
		for(Model model: fleet) {
			result += model.getName() + "\t--> " + model.pricePerDay() + "\t euros per day\n";
		}
		return result;
	}
}