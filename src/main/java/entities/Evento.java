package entities;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import ENUM.TipoEvento;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "eventi")
@Getter
@Setter
@NoArgsConstructor

public class Evento {

	@Id
	@GeneratedValue
	private UUID id;
	private String titolo;
	private LocalDate dataEvento;
	private String descrizione;
	private int numeroMassimo;

	@Enumerated(EnumType.STRING)
	private TipoEvento tipoEvento;

	public Evento(String titolo, String dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimo) {

		this.titolo = titolo;
		this.dataEvento = LocalDate.parse(dataEvento);
		this.descrizione = descrizione;
		this.tipoEvento = tipoEvento;
		this.numeroMassimo = numeroMassimo;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", titolo=" + titolo + ", dataEvento=" + dataEvento + ", descrizione=" + descrizione
				+ ", tipoEvento=" + tipoEvento + ", numeroMassimo=" + numeroMassimo + "]";
	}
}