package entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

import ENUM.TipoEvento;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Gare atletica")
@Getter
@Setter
@NoArgsConstructor

public class GaraDiAtletica extends Evento {

	private Set<Persona> setAtleti;
	private Persona vincitore;

	public GaraDiAtletica(String titolo, String dataEvento, String descrizione, TipoEvento tipoEvento,
			int numeroMassimo, Set<Persona> setAtleti, Persona vincitore) {
		super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimo);
		this.setAtleti = setAtleti;
		this.vincitore = vincitore;
	}

	@Override
	public String toString() {
		return "GaraDiAtletica [setAtleti=" + setAtleti + ", vincitore=" + vincitore + "]";
	}

}
