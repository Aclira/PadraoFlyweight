package Classe;

public class Circulo implements Shape {
    private String cor;
    private int x, y, radianos;
    
    public Circulo(String cor){
        this.cor = cor;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radianos = radius;
    }
    

    @Override
    public void drawn() {
        System.out.println("Circulo: [Cor : " + cor + ", X : " + x + ", Y : "+ y);
    }
}
