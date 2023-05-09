package Exercicio;

public class ContaCorrente extends Conta {

    @Override
    public void depositar(double dinheiro) {
        super.saldo += dinheiro;
    }

    @Override
    public double sacar(double dinheiro) {
        super.saldo -= dinheiro; 
        return dinheiro;
    }

    @Override
    public void transferir(double dinheiro, Conta dono) {
        dono.depositar(dinheiro);
        super.saldo -= dinheiro;
    }
    
}
