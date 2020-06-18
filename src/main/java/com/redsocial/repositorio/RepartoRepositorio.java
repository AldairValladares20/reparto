package com.redsocial.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.redsocial.entidad.Reparto;

public interface RepartoRepositorio extends JpaRepository<Reparto, Integer>{
	@Query("Select x from Reparto x where x.codrepartidor like :var_codrepartidor")
	public abstract List<Reparto> buscaPorNombre(@Param("var_codrepartidor") String filtro);
}
