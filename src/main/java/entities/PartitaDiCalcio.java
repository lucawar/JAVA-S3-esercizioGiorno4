package entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import ENUM.TipoEvento;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Partite calcio")
@Getter
@Setter
@NoArgsConstructor

public class PartitaDiCalcio extends Evento {

	private String squadraDiCasa;
	private String squadraOspite;
	private String squadraVincente;
	private int numeroGolSquadraDiCasa;
	private int numeroGolSquadraOspite;

	public PartitaDiCalcio(String titolo, String dataEvento, String descrizione, TipoEvento tipoEvento,
			int numeroMassimo, String squadraDiCasa, String squadraOspite, String squadraVincente,
			int numeroGolSquadraDiCasa, int numeroGolSquadraOspite) {
		super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimo);
		this.squadraDiCasa = squadraDiCasa;
		this.squadraOspite = squadraOspite;
		this.squadraVincente = squadraVincente;
		this.numeroGolSquadraDiCasa = numeroGolSquadraDiCasa;
		this.numeroGolSquadraOspite = numeroGolSquadraOspite;
	}

	@Override
	public String toString() {
		return "PartitaDiCalcio [squadraDiCasa=" + squadraDiCasa + ", squadraOspite=" + squadraOspite
				+ ", squadraVincente=" + squadraVincente + ", numeroGolSquadraDiCasa=" + numeroGolSquadraDiCasa
				+ ", numeroGolSquadraOspite=" + numeroGolSquadraOspite + "]";
	}

}
