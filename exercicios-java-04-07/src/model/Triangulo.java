package model;

public class Triangulo {
    private Double lado1;
    private Double lado2;
    private Double lado3;

    public Boolean validarTriangulo(){
        if((lado1 + lado2) > lado3){
            return true;
        }
        if((lado1 + lado3) > lado2){
            return true;
        }
        if((lado2 + lado3) > lado1){
            return true;
        }
        return false;
    }
}
