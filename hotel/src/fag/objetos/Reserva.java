package fag.objetos;

public class Reserva {
	private String nomeHospede;
	private Integer diasReserva;
	private String dataCheckin;
	private String dataCheckout;
	private Integer tipoDeQuarto;
	
	public Reserva(String nomeHospede, Integer diasReserva, String dataCheckin, String dataCheckout, Integer tipoDeQuarto) {
		super();
		this.nomeHospede = nomeHospede;
		this.diasReserva = diasReserva;
		this.dataCheckin = dataCheckin;
		this.dataCheckout = dataCheckout;
		this.tipoDeQuarto = tipoDeQuarto;
	}
	public String getNomeHospede() {
		return nomeHospede;
	}
	public void setNomeHospede(String nomeHospede) {
		this.nomeHospede = nomeHospede;
	}
	public String getDataCheckin() {
		return dataCheckin;
	}
	public void setDataCheckin(String dataCheckin) {
		this.dataCheckin = dataCheckin;
	}
	public String getDataCheckout() {
		return dataCheckout;
	}
	public void setDataCheckout(String dataCheckout) {
		this.dataCheckout = dataCheckout;
	}
	public Integer getTipoDeQuarto() {
		return tipoDeQuarto;
	}
	public void setTipoDeQuarto(Integer tipoDeQuarto) {
		this.tipoDeQuarto = tipoDeQuarto;
	}
	public Integer getDiasReserva() {
		return diasReserva;
	}
	public void setDiasReserva(Integer diasReserva) {
		this.diasReserva = diasReserva;
	}
	@Override
	public String toString() {
		return "Reserva [nomeHospede=" + nomeHospede + ", diasReserva=" + diasReserva + ", dataCheckin=" + dataCheckin
				+ ", dataCheckout=" + dataCheckout + ", tipoDeQuarto=" + tipoDeQuarto + "]";
	}
	
	
	
	
}
