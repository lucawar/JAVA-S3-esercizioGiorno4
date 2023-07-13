package entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import ENUM.TipoGenere;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "persona")
@Getter
@Setter
@NoArgsConstructor

public class Persona {

	@Id
	@GeneratedValue
	private long id;
	private String nome;
	private String cognome;
	private String email;
	private LocalDate dataNascita;
	@Enumerated(EnumType.STRING)
	private TipoGenere genere;

	public Persona(long id, String nome, String cognome, String email, LocalDate dataNascita, TipoGenere genere) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.dataNascita = dataNascita;
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email + ", dataNascita="
				+ dataNascita + ", genere=" + genere + ", listaPartecipazioni=" + "]";
	}

}
