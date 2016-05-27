package com.famsa.bpm.rembolsos.controller;

import org.directwebremoting.annotations.RemoteProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.famsa.bpm.rembolsos.model.Rembolso;
import com.famsa.bpm.rembolsos.repository.RembolsoRepository;

@Controller
@RemoteProxy
public class RembolsosController {
	
	public Rembolso buscarRembolso(){
		Rembolso rembolso = new Rembolso();
		rembolso.setNombre("Hola" + System.currentTimeMillis());
		return rembolso;
	}
}
