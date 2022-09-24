package com.mdf.annotations;

import org.springframework.stereotype.Component;

@Component("InformeTrimestral2")
public class InformeTrimestre2 implements ICreacionInforme {

	@Override
	public String getInformeFinaciero() {
		// TODO Auto-generated method stub
		return "Reporte de trimestre 2";
	}

}
