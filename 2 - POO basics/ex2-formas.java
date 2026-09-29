import java.util.Scanner;

class Retangulo {
    private int comprimento = 1;
    private int largura = 1;

    public Retangulo() {
    }

    public int getComprimento() {
        return this.comprimento;
    }

    public void setComprimento(int comprimento) {
        if (comprimento > 0 && comprimento < 20) {
            this.comprimento = comprimento;
        }
    }

    public int getLargura() {
        return this.largura;
    }

    public void setLargura(int largura) {
        if (largura > 0 && largura < 20) {
            this.largura = largura;
        }
    }

    public int perimetro() {
        return 2 * (this.comprimento + this.largura);
    }

    public int area() {
        return this.comprimento * this.largura;
    }
}

public class Formas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo();

        int c1 = input.nextInt();
        int l1 = input.nextInt();
        r1.setComprimento(c1);
        r1.setLargura(l1);

        int c2 = input.nextInt();
        int l2 = input.nextInt();
        r2.setComprimento(c2);
        r2.setLargura(l2);

        System.out.printf("%d %d %d %d\n", r1.getComprimento(), r1.getLargura(), r1.perimetro(), r1.area());
        System.out.printf("%d %d %d %d\n", r2.getComprimento(), r2.getLargura(), r2.perimetro(), r2.area());

        input.close();
    }
}
