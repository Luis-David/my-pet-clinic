package mx.com.xhani.clinic.services;

import java.util.Set;

import mx.com.xhani.clinic.model.Propietario;

public interface PropietarioService {
	Propietario obtenerPorApellido(String apellido);
	Propietario obtenerPorId(Long id);
	Propietario guardar(Propietario p);
	Set<Propietario> obtenerTodos();
}
