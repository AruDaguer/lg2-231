package BozoA;

public class Jogador {
    public byte[] jojar(){
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();

        dado1.rolarDado();
        dado2.rolarDado();
        byte[] dados = {dado1.getValorDaFace(), dado2.getValorDaFace()};
        return dados;


    }
    
}
