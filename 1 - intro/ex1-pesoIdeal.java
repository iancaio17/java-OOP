import java.util.Scanner;

class Pessoa {


    private float altura;
    private char sexo;

    public Pessoa(float altura, char sexo) {
        this.altura = altura;
        this.sexo = sexo;
    }

    public boolean validarDados() {
        return this.altura > 0 && (this.sexo == 'm' || this.sexo == 'f');
    }

    public double calcularPesoIdeal() {
        if (this.sexo == 'm') {
            return (72.7 * this.altura) - 58;
        } else {
            return (62.1 * this.altura) - 44.7;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float altura = input.nextFloat();
        String sexoStr = input.next();
        char sexo = sexoStr.charAt(0);

        Pessoa paciente = new Pessoa(altura, sexo);

        if (!paciente.validarDados()) {
            System.out.println("Entrada inválida!");
        } else {
            double peso = paciente.calcularPesoIdeal();
            System.out.printf("%.1f kg\n", peso);
        }

        input.close();
    }
}
