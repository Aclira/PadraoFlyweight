package Flyweight;

import Classe.Shape;
import Classe.Circulo;
import java.util.HashMap;

public class Shapefactory {
    private static final HashMap<String, Shape > circleMap = new HashMap();
    
    public static Shape getCircle(String color){
        Circulo circulo = (Circulo)circleMap.get(color);
    
        if(circulo == null){
            circulo = new Circulo(color);
            circleMap.put(color, circulo);   
            System.out.println("\nCRIANDO CIRCULO : " + color);
        }
        return circulo;
    }
}
