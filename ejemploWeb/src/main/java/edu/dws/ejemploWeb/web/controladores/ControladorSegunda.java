package edu.dws.ejemploWeb.web.controladores;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.dws.ejemploWeb.aplicacion.pojos.Alumno;

@Controller
public class ControladorSegunda {
    protected final Log logger = LogFactory.getLog(getClass());
    
    @RequestMapping(value="/segunda")
    public ModelAndView gestionSolicitud() {
        logger.info("Navegamos a la vista segunda");
        Map<String, Object> miModelo = new HashMap<String, Object>();
        String mensaje = "Todo ok";        
        miModelo.put("mensaje","Todo ok");
        //return new ModelAndView("segunda.jsp");
        return new ModelAndView("segunda", "miModelo", miModelo);
    } 

}
