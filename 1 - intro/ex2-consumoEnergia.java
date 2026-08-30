import java.util.Scanner;

class Consumo{

    private float consumo;
    private final double TAXA_BASICA = 5.00;

    public Consumo(float consumo){
        this.consumo = consumo;
    }

    public double calcularConsumo(){
        if(this.consumo <= 500){
            return this.consumo * 0.02;
        } else if(this.consumo <= 1000){
            return (500 * 0.10) + ((this.consumo - 500) * 0.05);
        } else {
            return (1000 * 0.35) + ((this.consumo - 1000) * 0.10);
        }
    }

    public double getTaxaBasica(){
        return this.TAXA_BASICA;
    }

    public double calcularTotal(){
        return calcularConsumo() + this.TAXA_BASICA;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float consumo = input.nextFloat();
        Consumo conta = new Consumo(consumo);

        double custoConsumo = conta.calcularConsumo();
        double taxa = conta.getTaxaBasica();
        double custoTotal = conta.calcularTotal();

        System.out.printf("%.2f %.2f %.2f\n", custoConsumo, taxa, custoTotal);
        input.close();
    }
}
