package com.exam.figuras_geometricas.Controller;

import com.exam.figuras_geometricas.entity.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/figure")
public class FigureController {

    @PostMapping("/calcular")
    public ResponseEntity<FigureResponse> area(@RequestBody FigureRequest figure){
        double area=0;
        double perimetro=0;

        switch (figure.getTipo().toLowerCase()){
            case "circulo":
                Circulo circulo = new Circulo(figure.getRadio());
                area = circulo.calcularArea();
                perimetro = circulo.calcularPerimetro();
                break;

            case "rectangulo":
                Rectangulo rectangulo = new Rectangulo(figure.getBase(), figure.getAltura());
                area = rectangulo.calcularArea();
                perimetro = rectangulo.calcularPerimetro();
                break;

            case "triangulo":
                Triangulo triangulo = new Triangulo(figure.getLados(), figure.getBase(), figure.getAltura());
                area = triangulo.calcularArea();
                perimetro = triangulo.calcularPerimetro();
                break;
            default:
                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        }

        return ResponseEntity.ok(new FigureResponse(area, perimetro));
    }
}
