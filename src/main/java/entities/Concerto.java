package entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import ENUM.TipoConcerto;
import ENUM.TipoEvento;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Concerti")
@Getter
@Setter
@NoArgsConstructor

public class Concerto extends Evento {

	private TipoConcerto genere;
	private boolean inStreaming;

	public Concerto(String titolo, String dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimo,
			TipoConcerto genere, boolean inStreaming) {
		super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimo);
		this.genere = genere;
		this.inStreaming = inStreaming;
	}

	@Override
	public String toString() {
		return "Concerto [genere=" + genere + ", inStreaming=" + inStreaming + "]";
	}

}
