package br.com.caelum.eats.distancia;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurante	{
	@Id	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private	Long	id;
	private	String	cep;
	private	Boolean	aprovado;
	private	Long	tipoDeCozinhaId;
}
