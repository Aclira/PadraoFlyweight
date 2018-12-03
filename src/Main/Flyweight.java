
package Main;

import Flyweight.Shapefactory;
import Classe.Circulo;

public class Flyweight {
    public static final String colors[] = {"Vermelho", "Azul", "Verde", "Branco", "Preto"};
    public static void main(String[] args) {
        
        for(int i=0;i<20; i++){
            Circulo circle = (Circulo)Shapefactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.drawn();
        }
    }
    
    private static String getRandomColor(){
        return colors[(int)(Math.random()*colors.length)];
        
    }
    
    private static int getRandomX(){
        return (int)(Math.random()*100);
    }
    
    private static int getRandomY(){
        return (int)(Math.random()*100);
    }
}
