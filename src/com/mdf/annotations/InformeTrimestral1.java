package com.mdf.annotations;

import org.springframework.stereotype.Component;

@Component("InformeTrimestral1")
public class InformeTrimestral1 implements ICreacionInforme {

	@Override
	public String getInformeFinaciero() {
		// TODO Auto-generated method stub
		return "Presentacion de informe financiero semestre 1";
	}

}
