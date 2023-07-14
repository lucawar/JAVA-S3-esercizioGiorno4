package entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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

	@ManyToMany
	private Set<Persona> setAtleti;

	@ManyToOne
	private Persona vincitore;

	public GaraDiAtletica(String titolo, String dataEvento, String descrizione, TipoEvento tipoEvento,
			int numeroMassimo, Persona vincitore) {
		super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimo);
		this.vincitore = vincitore;
	}

	@Override
	public String toString() {
		return "GaraDiAtletica [setAtleti=" + setAtleti + ", vincitore=" + vincitore + "]";
	}

}
