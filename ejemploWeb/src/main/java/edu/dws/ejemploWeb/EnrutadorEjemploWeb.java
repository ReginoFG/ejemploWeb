package edu.dws.ejemploWeb;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import edu.dws.ejemploWeb.aplicacion.AplicacionConfiguracionContexto;
import edu.dws.ejemploWeb.web.WebConfiguracionContexto;
/**
 * Defino un DispatcherServlet cuya misión será controlar hacia dónde serán enrutadas 
 * todas las solicitudes
 * @author garfe
 *
 */
public class EnrutadorEjemploWeb extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { AplicacionConfiguracionContexto.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfiguracionContexto.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

}
