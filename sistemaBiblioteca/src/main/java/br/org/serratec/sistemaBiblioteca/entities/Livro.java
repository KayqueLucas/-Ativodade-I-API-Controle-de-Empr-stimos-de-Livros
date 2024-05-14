package br.org.serratec.sistemaBiblioteca.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "livro")
public class Livro {
	//Preciso colocar o livro_Id? Aonde?
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer livroId;
	
	//Atributos - o que é int4?
	@Column(name = "nome_livro")
	private String nomeLivro;
	@Column(name = "nome_autor")
	private String nomeAutor;
	@Column(name = "data_lancamento")
	private Date dataLancamento ;
	@Column(name = "codigo_isbn")
	private Integer codigoIsbn;
	
	//Relaçoes
	@OneToMany(mappedBy = "emprestimo_id")
	private List<Emprestimo> emprestimos;
	
	@ManyToOne
	@JoinColumn(name = "editora_id")
	private Editora editora;
	
	//Getters e Setters
	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public Integer getLivroId() {
		return livroId;
	}

	public void setLivroId(Integer livroId) {
		this.livroId = livroId;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Integer getCodigoIsbn() {
		return codigoIsbn;
	}

	public void setCodigoIsbn(Integer codigoIsbn) {
		this.codigoIsbn = codigoIsbn;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}

	
	
	

}
