package BozoA;
import java.util.Random;

public class Dado {
    private final byte numeroFaces = 6;
    private byte valorDaFace;

    public void rolarDado() {
        Random random = new Random();
        this.valorDaFace = (byte) (random.nextInt( numeroFaces ) + 1);
    }

    public byte getValorDaFace(){
        return valorDaFace;
    }

    public byte getNumeroDaFace(){
        return numeroFaces;
    }
    public static void main(String[] args) {
        

    }
}