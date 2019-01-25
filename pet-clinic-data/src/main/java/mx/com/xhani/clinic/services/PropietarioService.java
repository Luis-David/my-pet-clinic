package mx.com.xhani.clinic.services;

import mx.com.xhani.clinic.model.Propietario;

public interface PropietarioService extends CrudService<Propietario,Long>{
	Propietario obtenerPorApellido(String apellido);
}
