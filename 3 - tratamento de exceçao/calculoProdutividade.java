import java.util.Scanner;

class Funcionario {
    private String nomeFuncionario;
    private int qtdeProducao;
    private int horasTrabalhadas;

    public Funcionario(String nomeFuncionario, int qtdeProducao, int horasTrabalhadas) {
        this.nomeFuncionario = nomeFuncionario;
        this.qtdeProducao = qtdeProducao;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int calcularProdutividade() {
        return this.qtdeProducao / this.horasTrabalhadas;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            String nome = entrada.nextLine();
            int producao = entrada.nextInt();
            int horas = entrada.nextInt();

            Funcionario funcionario = new Funcionario(nome, producao, horas);
            int produtividade = funcionario.calcularProdutividade();

            System.out.println("Produtividade: " + produtividade + " peças por hora");
            
        } catch (ArithmeticException e) {
            System.out.println("Erro: horas trabalhadas não podem ser zero.");
        } catch (Exception e) {
            System.out.println("Erro inesperado");
        }
    }
}
