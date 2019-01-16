package mx.com.xhani.clinic.services;

import java.util.Set;

import mx.com.xhani.clinic.model.Propietario;
import mx.com.xhani.clinic.model.Veterinario;

public interface VeterinarioService {
	Veterinario obtenerPorId(Long id);
	Veterinario guardar(Propietario p);
	Set<Veterinario> obtenerTodos();
}
