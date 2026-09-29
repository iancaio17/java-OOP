import java.util.Scanner;

class Circulo {
    private int x, y, raio;
    public static final double PI = 3.14159;

    public Circulo(int x, int y, int raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public double circunferencia() {
        return 2 * PI * raio;
    }
}

public class TestaCirculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Circulo[] vetor1 = new Circulo[3];
        for (int i = 0; i < 3; i++) {
            vetor1[i] = new Circulo(input.nextInt(), input.nextInt(), input.nextInt());
        }

        Circulo[] vetor2;
        vetor2 = vetor1;

        Circulo[] vetor3 = new Circulo[3];
        for (int i = 0; i < 3; i++) {
            vetor3[i] = new Circulo(vetor1[i].getX(), vetor1[i].getY(), vetor1[i].getRaio());
        }

        for (int i = 0; i < 3; i++) {
            int novoRaio = input.nextInt();
            vetor1[i].setRaio(novoRaio);
        }

        System.out.println("vetor1:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d %d %d\n", vetor1[i].getX(), vetor1[i].getY(), vetor1[i].getRaio());
        }

        System.out.println("vetor2:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d %d %d\n", vetor2[i].getX(), vetor2[i].getY(), vetor2[i].getRaio());
        }

        System.out.println("vetor3:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d %d %d\n", vetor3[i].getX(), vetor3[i].getY(), vetor3[i].getRaio());
        }

        input.close();
    }
}
