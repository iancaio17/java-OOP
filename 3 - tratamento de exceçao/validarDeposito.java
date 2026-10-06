import java.util.Scanner;

class DepositoInvalidoException extends RuntimeException {
    public DepositoInvalidoException(String mensagem) {
        super(mensagem);
    }
}

class Conta {
    private int agencia;
    private int numero;
    private double saldo;
    private final double LIMITE_DEPOSITO = 10000.0;

    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0.0;
    }

    public void depositaPersonalizado(double valor) {
        if (valor <= 0) {
            throw new DepositoInvalidoException("Valor inválido para depósito");
        }
        if (valor > LIMITE_DEPOSITO) {
            throw new DepositoInvalidoException("Valor acima do limite permitido de 10000.00");
        }
        this.saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int agencia = entrada.nextInt();
        int numero = entrada.nextInt();
        double valor = entrada.nextDouble();

        Conta conta = new Conta(agencia, numero);
        boolean sucesso = false;

        try {
            conta.depositaPersonalizado(valor);
            System.out.println("Depósito realizado com sucesso.");
            sucesso = true;
        } catch (DepositoInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            if (sucesso) {
                System.out.printf("Valor %.2f depositado na conta. Novo saldo: %.2f%n", valor, conta.getSaldo());
            } else {
                System.out.printf("Valor %.2f incorreto. Saldo atual: %.2f%n", valor, conta.getSaldo());
            }
        }
    }
}
