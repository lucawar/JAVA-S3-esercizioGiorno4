package entities;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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

	@ManyToMany
	private Set<GaraDiAtletica> gareAtletica;

	public Persona(String nome, String cognome, String email, String dataNascita, TipoGenere genere) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.dataNascita = LocalDate.parse(dataNascita);
		this.genere = genere;

	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email + ", dataNascita="
				+ dataNascita + ", genere=" + genere + ", listaPartecipazioni=" + "]";
	}

}
