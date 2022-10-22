package loja;

import java.util.ArrayList;
import java.util.List;

public class Plataforma {

	private int id;
	private String plataforma;

	List<Jogo> listaJogos = new ArrayList<Jogo>();

	public Plataforma(int id, String plataforma) {
		super();
		this.id = id;
		this.plataforma = plataforma;
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

	public List<Jogo> getListaJogos() {
		return listaJogos;
	}

	public void setListaJogos(List<Jogo> listaJogos) {
		this.listaJogos = listaJogos;
	}

}
