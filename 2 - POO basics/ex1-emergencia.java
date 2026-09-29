import java.util.Scanner;

class Emergencia {
    public String nomeChamador;
    public String telefoneChamada;
    public String localEmergencia;
    public String dataHora;
    public String tipoEmergencia;
    public String tipoResposta;
    public String status;
    public boolean chamadaMovel;
    public String coordenadaGPS;

    public void mostrarEmergencias() {
        System.out.printf("Nome do Chamador: %s\n", this.nomeChamador);
        System.out.printf("Telefone: %s\n", this.telefoneChamada);
        System.out.printf("Local da Emergência: %s\n", this.localEmergencia);
        System.out.printf("Data/Hora do Relato: %s\n", this.dataHora);
        System.out.printf("Natureza da Emergência: %s\n", this.tipoEmergencia);
        System.out.printf("Tipo de Resposta: %s\n", this.tipoResposta);
        System.out.printf("Status da Resposta: %s\n", this.status);
        if (chamadaMovel) {
            System.out.print("Chamada via celular: Sim\n");
            System.out.printf("Coordenadas GPS: %s\n", this.coordenadaGPS);
        } else {
            System.out.println("Chamada via celular: Não");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = Integer.parseInt(input.nextLine());
        int contador = 1;

        while (contador <= total) {
            System.out.printf("Emergência #%d\n\n", contador);
            System.out.print("--- Informações da Emergência ---\n\n");

            Emergencia chamado = new Emergencia();

            chamado.nomeChamador = input.nextLine();
            chamado.telefoneChamada = input.nextLine();
            chamado.localEmergencia = input.nextLine();
            chamado.dataHora = input.nextLine();
            chamado.tipoEmergencia = input.nextLine();
            chamado.tipoResposta = input.nextLine();
            chamado.status = input.nextLine();

            String movel = input.nextLine();
            if (movel.equalsIgnoreCase("Sim")) {
                chamado.chamadaMovel = true;
                chamado.coordenadaGPS = input.nextLine();
            } else {
                chamado.chamadaMovel = false;
            }

            chamado.mostrarEmergencias();
            contador++;
            System.out.print("\n");
        }

        input.close();
    }
}
