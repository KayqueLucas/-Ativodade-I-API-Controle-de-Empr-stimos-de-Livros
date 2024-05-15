package br.org.serratec.sistemaBiblioteca.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "aluno")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "alunoMatricula", scope = Aluno.class)
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "aluno_matricula")
	private Integer alunoMatricula;

	@Column(name = "nome")
	private String nome;

	@Column(name = "dat_anascimento")
	private String dataNascimento;

	@Column(name = "cpf ", unique = true)
	private String cpf;
	@Column(name = "logradouro ")
	private String logradouro;
	@Column(name = "numero_logradouro ")
	private String numeroLogradouro;
	@Column(name = "bairro ")
	private String bairro;
	@Column(name = "cidade ")
	private String cidade;

	
	 @OneToMany
	 @JoinColumn(name = "emprestimoId") 
	 private Emprestimo emprestimo;
	

}
