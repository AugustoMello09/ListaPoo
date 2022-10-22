package loja;

import java.time.LocalDate;

public class Jogo {

	private int id;
	private String plataforma;
	private String nomeJogo;
	private String descricao;
	private int precoJogo;
	private LocalDate dataDePublicacao;

	public Jogo(int id, String plataforma, String nomeJogo, String descricao, int precoJogo,
			LocalDate dataDePublicacao) {
		super();
		this.id = id;
		this.plataforma = plataforma;
		this.nomeJogo = nomeJogo;
		this.descricao = descricao;
		this.precoJogo = precoJogo;
		this.dataDePublicacao = dataDePublicacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getNomeJogo() {
		return nomeJogo;
	}

	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPrecoJogo() {
		return precoJogo;
	}

	public void setPrecoJogo(int precoJogo) {
		this.precoJogo = precoJogo;
	}

	public LocalDate getDataDePublicacao() {
		return dataDePublicacao;
	}
	
	public void setDataDePublicacao(LocalDate dataDePublicacao) {
		this.dataDePublicacao = dataDePublicacao;
	}
	
	@Override
	public String toString() {
		return "Id = " + id + ", Plataforma = " + plataforma + ", Nome do jogo = " + nomeJogo + ", Descrição = "
				+ descricao + ", Preço do jogo = " + statusJogo() + "/" + " Data de publicação: " + dataDePublicacao;
	}

	public boolean statusPreco() {
		return precoJogo == 0;
	}

	public String statusJogo() {
		return this.statusPreco()? " Jogo grátis " : " R$ " + getPrecoJogo();

	}


}
