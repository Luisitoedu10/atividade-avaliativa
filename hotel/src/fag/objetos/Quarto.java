package fag.objetos;

public class Quarto {
	private Integer numeroQuarto;
	private Integer tipoQuarto;
	private Double precoQuarto;
	private Boolean disponibilidade;
	public Quarto(Integer numeroQuarto, Integer tipoQuarto, Double precoQuarto, Boolean disponibilidade) {
		super();
		this.numeroQuarto = numeroQuarto;
		this.tipoQuarto = tipoQuarto;
		this.precoQuarto = precoQuarto;
		this.disponibilidade = disponibilidade;
	}
	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}
	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}
	public Integer getTipoQuarto() {
		return tipoQuarto;
	}
	public void setTipoQuarto(Integer tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}
	public Double getPrecoQuarto() {
		return precoQuarto;
	}
	public void setPrecoQuarto(Double precoQuarto) {
		this.precoQuarto = precoQuarto;
	}
	public Boolean isDisponivel() {
		return disponibilidade;
	}
	public void setDisponivel(Boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	@Override
	public String toString() {
		return "Quarto [numeroQuarto=" + numeroQuarto + ", tipoQuarto=" + tipoQuarto + ", precoQuarto=" + precoQuarto
				+ ", disponibilidade=" + disponibilidade + "]";
	}
	
	
}
