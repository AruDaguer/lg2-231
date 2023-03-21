package EquacaoQuadratica;

public class Equacao {
    private double a;
    private double b;
    private double c;

    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }

    public void setA(double a) throws Exception{
        if (a == 0) throw new Exception("Coeficiente inválido! Não pode ser 0");
        this.a = a;
    }

    public void setB(double b){
        this.b = b;
    }

    public void setC(double c){
        this.c = c;
    }

    private double calculaDelta(){
        return b*b - 4 * a * c; 
    }

    public double[] calculoRaiz() throws Exception{
        double delta = this.calculaDelta();
        double[] raizes = new double[2];
        if (delta < 0)
            throw new Exception("Delta negativo. Não existem raizes reais");
        
        raizes[0] = (-b + Math.sqrt(delta)) / 2 * a;
        raizes[1] = (-b - Math.sqrt(delta)) / 2 * a;
        return raizes;


    }
}
