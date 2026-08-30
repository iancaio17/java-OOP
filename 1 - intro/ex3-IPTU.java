import java.util.Scanner;

class Imovel {
    private int tipoLoteamento;
    private int area;

    public Imovel(int tipoLoteamento, int area) {
        this.tipoLoteamento = tipoLoteamento;
        this.area = area;
    }

    public boolean validarEntrada() {
        return (this.tipoLoteamento == 1 || this.tipoLoteamento == 2) && (this.area > 0);
    }

    public double calcularIPTU() {
        if (this.tipoLoteamento == 1) {
            if (this.area < 200) {
                return this.area * 1.0;
            } else {
                return this.area * 1.2;
            }
        } else {
            if (this.area < 200) {
                return this.area * 1.1;
            } else {
                return this.area * 1.3;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tipoLoteamento = input.nextInt();
        int area = input.nextInt();

        Imovel imovel = new Imovel(tipoLoteamento, area);

        if (!imovel.validarEntrada()) {
            System.out.println("Entrada inválida!");
        } else {
            double iptu = imovel.calcularIPTU();
            System.out.printf("%.2f\n", iptu);
        }

        input.close();
    }
}
