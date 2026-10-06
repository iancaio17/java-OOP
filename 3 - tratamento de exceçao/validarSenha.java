import java.util.Scanner;

class ValidarSenha {
    public void verificarMaiusculas(String senha) {
        boolean temMaiuscula = false;
        for (int i = 0; i < senha.length(); i++) {
            if (Character.isUpperCase(senha.charAt(i))) {
                temMaiuscula = true;
                break;
            }
        }
        if (!temMaiuscula) {
            throw new IllegalArgumentException("Erro: a senha deve conter pelo menos uma letra maiúscula");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ValidarSenha validador = new ValidarSenha();
        boolean senhaValida = false;

        while (!senhaValida) {
            try {
                String senha = entrada.nextLine();
                validador.verificarMaiusculas(senha);
                System.out.println("Senha válida");
                senhaValida = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
