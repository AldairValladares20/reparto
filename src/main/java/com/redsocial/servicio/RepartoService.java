package com.redsocial.servicio;

import java.util.List;


import com.redsocial.entidad.Reparto;

public interface RepartoService {

	public abstract void eliminaReparto(int id) ;
	public abstract Reparto insertaActualizaReparto(Reparto  obj) ;
	public abstract List<Reparto> listaReparto() ;
	public abstract List<Reparto> listaRepartoPorNombre(String filtro) ;
}
