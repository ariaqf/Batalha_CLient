package personagem;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Personagem implements Serializable {
	@JsonProperty("tipo")
	private int tipo;
	@JsonProperty("pdv")
	private int pdv;
	@JsonProperty("forca")
	private int forca;
	@JsonProperty("defesa")
	private int defesa;
	@JsonProperty("agilidade")
	private int agilidade;
	@JsonProperty("numDados")
	private int numDados;
	@JsonProperty("ladoDado")
	private int ladoDado;
	@JsonProperty("nome")
	private String nome;

	public Personagem() {
		
	}
	
	public Personagem(int tipo, int pdv, int forca, int defesa, int agilidade, int numDados, int ladoDado,
			String nome) {
		super();
		this.tipo = tipo;
		this.pdv = pdv;
		this.forca = forca;
		this.defesa = defesa;
		this.agilidade = agilidade;
		this.numDados = numDados;
		this.ladoDado = ladoDado;
		this.nome = nome;
	}

	public int getPdv() {
		return pdv;
	}

	public void setPdv(int pdv) {
		this.pdv = pdv;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public int getAgilidade() {
		return agilidade;
	}

	public void setAgilidade(int agilidade) {
		this.agilidade = agilidade;
	}

	public int getNumDados() {
		return numDados;
	}

	public void setNumDados(int numDados) {
		this.numDados = numDados;
	}

	public int getLadoDado() {
		return ladoDado;
	}

	public void setLadoDado(int ladoDado) {
		this.ladoDado = ladoDado;
	}
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
