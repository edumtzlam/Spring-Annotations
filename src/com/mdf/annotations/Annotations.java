package com.mdf.annotations;

//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Annotations {

	public static void main(String[] args) {
		
		// El siguiente codigo ya no requiere el archivo application.context.xml
		AnnotationConfigApplicationContext objCtx = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		IEmpleado iEduardo = objCtx.getBean("Comercial",IEmpleado.class);

		System.out.println(iEduardo.getTareas());
		System.out.println(iEduardo.getInforme());

		objCtx.close();
		
		// El siguiente codigo requiere el archivo application.context.xml
//		ClassPathXmlApplicationContext objCtx = new ClassPathXmlApplicationContext("application.context.xml");
//		
//		IEmpleado iComercial = objCtx.getBean("Comercial",IEmpleado.class);
//		
//		System.out.println(iComercial.getTareas());
//		System.out.println(iComercial.getInforme());
//		
//		objCtx.close();
	}

}
