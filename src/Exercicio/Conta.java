package Exercicio;

public abstract class Conta {
    protected double saldo;
    protected String dono;

    // depositar sacar transferir getsaldo

    public double getSaldo() {
        return saldo;
    }

    public abstract void depositar(double dinheiro);

    public abstract double sacar(double dinheiro);

    public abstract void transferir(double dinheiro, Conta dono);

}
