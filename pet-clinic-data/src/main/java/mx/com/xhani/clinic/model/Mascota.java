package mx.com.xhani.clinic.model;

import java.time.LocalDate;

public class Mascota {
	private TipoMascota tipoMascota;
	private Propietario propietario;
	private LocalDate birthDay;
	public TipoMascota getTipoMascota() {
		return tipoMascota;
	}
	public void setTipoMascota(TipoMascota tipoMascota) {
		this.tipoMascota = tipoMascota;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public LocalDate getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}
	
}
