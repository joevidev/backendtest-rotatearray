package com.backendtest.demo.presenters;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendtest.demo.models.ArrayModel;
import com.backendtest.demo.models.RotateArrayModels;


/**
 * RotateArrayPresenters
 */

@RestController
@RequestMapping()

public class RotateArrayPresenters {

    @GetMapping()
    public String Message(){
        return "Para calcular la rotacion de un array en sentido anti-horario 90º,ir a endpoint: /rotate";
    }

    @PostMapping("/rotate")
    public String calculatedRotateArrayCounter (@RequestBody ArrayModel modelArray){
        Map<String, Object> response = new HashMap<>();

        try {
            return Arrays.deepToString(RotateArrayModels.rotateArray(modelArray.getArray()));
        } catch (Exception e) {
            response.put("Mensaje", "Error al realizar la rotacion, por favor verifique los datos");
            response.put("Error", e.getCause().getMessage());
            return "Sin rotacion" + response;
        }
        
    }
}
