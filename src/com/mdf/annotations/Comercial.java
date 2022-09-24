package com.mdf.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Comercial")
public class Comercial implements IEmpleado {

	@Autowired
	@Qualifier("InformeTrimestral2")
	private ICreacionInforme nuevoInforme;
	
//	@Autowired
//	public Comercial(ICreacionInforme nuevoInforme) {
//		super();
//		this.nuevoInforme = nuevoInforme;
//	}

//	@Autowired
//	public void setNuevoInforme(ICreacionInforme nuevoInforme) {
//		this.nuevoInforme = nuevoInforme;
//	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, Vender, Vender";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return this.nuevoInforme.getInformeFinaciero();
	}

}
