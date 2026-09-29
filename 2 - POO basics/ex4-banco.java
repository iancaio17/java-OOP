import java.util.Scanner;

class Conta {
    private int numConta;
    private int senha;
    private String nome;
    private double saldo;

    public Conta(int numConta, int senha, String nome, double saldo) {
        this.numConta = numConta;
        this.senha = senha;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSaldo(int senha) {
        if (this.senha == senha) {
            return this.saldo;
        }
        return -1;
    }

    public boolean sacar(double valor, int senha) {
        if (this.senha == senha && valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean depositar(double valor, int senha) {
        if (this.senha == senha && valor > 0) {
            this.saldo += valor;
            return true;
        }
        return false;
    }

    public boolean tranferencia(Conta conta2, double valor, int senha) {
        if (this.senha == senha && valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            conta2.saldo += valor;
            return true;
        }
        return false;
    }
}

public class Banco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Conta conta1 = new Conta(input.nextInt(), input.nextInt(), input.next(), input.nextDouble());
        Conta conta2 = new Conta(input.nextInt(), input.nextInt(), input.next(), input.nextDouble());

        int opcao = input.nextInt();

        while (opcao != 5) {
            if (opcao == 1) {
                int senha = input.nextInt();
                double saldo = conta1.getSaldo(senha);
                if (saldo != -1) {
                    System.out.printf("%.2f\n", saldo);
                } else {
                    System.out.println("senha incorreta");
                }
            } else if (opcao == 2) {
                double valor = input.nextDouble();
                int senha = input.nextInt();
                if (conta1.sacar(valor, senha)) {
                    System.out.println("saque realizado");
                } else {
                    System.out.println("saque não realizado");
                }
            } else if (opcao == 3) {
                double valor = input.nextDouble();
                int senha = input.nextInt();
                if (conta1.depositar(valor, senha)) {
                    System.out.println("depósito realizado");
                } else {
                    System.out.println("depósito não realizado");
                }
            } else if (opcao == 4) {
                String nomeDestino = input.next();
                if (nomeDestino.equals(conta2.getNome())) {
                    double valor = input.nextDouble();
                    int senha = input.nextInt();
                    if (conta1.tranferencia(conta2, valor, senha)) {
                        System.out.println("transferência realizada");
                    } else {
                        System.out.println("transferência não realizada");
                    }
                } else {
                    System.out.println("nenhum usuário encontrado");
                }
            }

            opcao = input.nextInt();
        }

        input.close();
    }
}
