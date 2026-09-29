import java.util.Scanner;

class Temperatura {
    private double temperatura;

    public Temperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void celsiusToFahrenheit() {
        this.temperatura = (this.temperatura * 9.0 / 5.0 + 32);
    }

    public void fahrenheitToCelsius() {
        this.temperatura = ((this.temperatura - 32) * 5.0 / 9.0);
    }

    public String toString() {
        return "temperatura: " + this.temperatura;
    }
}

public class Converte {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valorCelsius = input.nextDouble();

        Temperatura temp = new Temperatura(valorCelsius);

        temp.celsiusToFahrenheit();
        System.out.println(temp.toString() + " graus fahrenheit");

        temp.fahrenheitToCelsius();
        System.out.println(temp.toString() + " graus celsius");

        input.close();
    }
}
