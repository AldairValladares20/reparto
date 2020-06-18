package com.redsocial.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.redsocial.entidad.Reparto;
import com.redsocial.repositorio.RepartoRepositorio;

@Service
public class RepartoServicioImpl implements RepartoService{
     
    @Autowired	
	private RepartoRepositorio repositorio;
	  

	@Override
	public void eliminaReparto(int id) {
		repositorio.deleteById(id);
		
	}

	@Override
	public Reparto insertaActualizaReparto(Reparto obj) {
		return repositorio.save(obj);
	
	}

	@Override
	public List<Reparto> listaReparto() {
		return repositorio.findAll();
	}

	@Override
	public List<Reparto> listaRepartoPorNombre(String filtro) {
		return repositorio.buscaPorNombre(filtro);
	}

	 
}
