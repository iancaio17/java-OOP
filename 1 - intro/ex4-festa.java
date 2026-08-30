import java.util.Scanner;

class Festa {
    private int qtdHomens;
    private int qtdMulheres;

    private final double PRECO_HOMEM = 12.50;
    private final double PRECO_MULHER = 7.40;

    public Festa() {
        this.qtdHomens = 0;
        this.qtdMulheres = 0;
    }

    public void registrarEntrada(char tipo) {
        if (tipo == 'h') {
            this.qtdHomens++;
        } else if (tipo == 'm') {
            this.qtdMulheres++;
        }
    }

    public int getQtdHomens() {
        return this.qtdHomens;
    }

    public int getQtdMulheres() {
        return this.qtdMulheres;
    }

    public double getArrecadacaoHomens() {
        return this.qtdHomens * this.PRECO_HOMEM;
    }

    public double getArrecadacaoMulheres() {
        return this.qtdMulheres * this.PRECO_MULHER;
    }

    public double getArrecadacaoTotal() {
        return getArrecadacaoHomens() + getArrecadacaoMulheres();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Festa festa = new Festa();

        while (input.hasNext()) {
            char entrada = input.next().charAt(0);

            if (entrada == 'q') {
                break;
            }

            festa.registrarEntrada(entrada);
        }

        System.out.printf("%d %d\n", festa.getQtdHomens(), festa.getQtdMulheres());

        System.out.printf("%.2f %.2f %.2f\n",
                festa.getArrecadacaoHomens(),
                festa.getArrecadacaoMulheres(),
                festa.getArrecadacaoTotal());

        input.close();
    }
}
