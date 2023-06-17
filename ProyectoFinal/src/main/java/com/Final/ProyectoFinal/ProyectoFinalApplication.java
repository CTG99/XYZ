package com.Final.ProyectoFinal;

import java.io.IOException;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

import com.Final.ProyectoFinal.Frames.Buscador;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })// Para saltar la seguridad por defecto de Spring
public class ProyectoFinalApplication  {
	  public static void main(String[] args) {
	        new SpringApplicationBuilder(ProyectoFinalApplication.class)
	                .headless(false)
	                .web(WebApplicationType.NONE)
	                .run(args);
	    }
	  
	  
	   @Bean
	    public Buscador frame() throws IOException {
	        return new Buscador(true);
	    }
}



/*	public static void main(String[] args) {
       
        ConfigurableApplicationContext context = createApplicationContext(args);
        displayMainFrame(context);
    }

    private static ConfigurableApplicationContext createApplicationContext(String[] args) {
        return new SpringApplicationBuilder(ProyectoFinalApplication.class)
                .headless(false)
                .run(args);
    }

    private static  void displayMainFrame(ConfigurableApplicationContext context) {
        SwingUtilities.invokeLater(() -> {
            Buscador b = context.getBean(Buscador.class);
            b.setVisible(true);
        });
    }*/