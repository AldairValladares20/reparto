package com.redsocial.controlador;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.redsocial.entidad.Reparto;
import com.redsocial.servicio.RepartoService;



@Controller
public class RepartoControlador {
	@Autowired
	private RepartoService servicio;
	
	@RequestMapping("/verReparto")
	public String verPagina(Model m) {
		List<Reparto> list = servicio.listaReparto();
		m.addAttribute("REPARTO", list);
		return "crudReparto";
	}
	
	@RequestMapping("/listaReparto")
	public String lista(@RequestParam Map<String,String> params, Model m) {
		List<Reparto> list = servicio.listaRepartoPorNombre(params.get("filtro")+"%");
		m.addAttribute("REPARTO", list);
		return "crudReparto";
	}
	
	@RequestMapping("/registraActualizaReparto")
	public String metodoRegistra(Reparto obj, Model m) {
		servicio.insertaActualizaReparto(obj);
		List<Reparto> list = servicio.listaReparto();
		m.addAttribute("REPARTO", list);
		return "crudReparto";
	}
		
	@RequestMapping("/eliminaReparto")
	public String metodoElimina(@RequestParam Map<String,String> params, Model m) {
		servicio.eliminaReparto(Integer.parseInt(params.get("id")));
		List<Reparto> list = servicio.listaReparto();
		m.addAttribute("REPARTO", list);
		return "crudReparto";
	}
}
