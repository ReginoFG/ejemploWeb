package edu.dws.ejemploWeb.web.controladores;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.ModelAndView;

import edu.dws.ejemploWeb.aplicacion.AplicacionConfiguracionContexto;
import edu.dws.ejemploWeb.web.WebConfiguracionContexto;

//En 'src/test/java'es donde alojaremos todos nuestros tests, 
//en una estructura de paquetes que será idéntica a la estructura 
//de paquetes existente en 'src/main/java'
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {AplicacionConfiguracionContexto.class, WebConfiguracionContexto.class})
@WebAppConfiguration
public class ControladorSegundaTest {
    @Autowired
    private ControladorSegunda controladorSegunda;

    @Test
    public void testHandleRequestView() {	
        ModelAndView modelAndView = controladorSegunda.gestionSolicitud();	
        //Vamos a asegurarnos de que la vista guardada en el modelAndView será la que queremos.
        //Se comparan los nombres.
        assertEquals("segunda.jsp", modelAndView.getViewName());
    }
}
