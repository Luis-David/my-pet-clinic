package mx.com.xhani.clinic.services;

import java.util.Set;

import mx.com.xhani.clinic.model.Mascota;
import mx.com.xhani.clinic.model.Propietario;

public interface MascotaService {
	Mascota obtenerPorId(Long id);
	Mascota guardar(Propietario p);
	Set<Mascota> obtenerTodos();
}
