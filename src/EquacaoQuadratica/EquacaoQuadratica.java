package EquacaoQuadratica;

public class EquacaoQuadratica {
    public static void main(String[] args) throws Exception {
        
    Equacao eq1 = new Equacao();
    Equacao eq2 = new Equacao();

    eq1.setA(6);
    eq1.setB(5);
    eq1.setC(-3);

    eq2.setA(-8);
    eq2.setB(5);
    eq2.setC(-3);

    System.out.println("Equação 1: ");
    System.out.println(eq1.getA() + "x²" + eq1.getB() + "x" + eq1.getC());
    System.out.println("Equação 2: ");
    System.out.println(eq2.getA() + "x²" + eq2.getB() + "x" + eq2.getC());

    double[] raizesEq1 = new double[2];
    double[] raizesEq2 = new double[2];

    raizesEq1 = eq1.calculoRaiz();
    raizesEq2 = eq2.calculoRaiz();

    System.out.println("Equação 1: S1 = " + raizesEq1[0] + "S2 =" + raizesEq1[1]);
    System.out.println("Equação 2: S1 = " + raizesEq2[0] + "S2 =" + raizesEq2[1]);


    }
}
