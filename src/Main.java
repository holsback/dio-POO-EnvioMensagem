import java.util.Scanner;

public class Main {

    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;
        EnvioMarketing envioMarketing;
        while (true) {
            System.out.println("Escolha o meio que será enviado a mensagem!");
            System.out.println("1 - Enviar mensagem por SMS");
            System.out.println("2 - Enviar mensagem por E-mail");
            System.out.println("3 - Enviar mensagem pelas Redes Sociais");
            System.out.println("4 - Enviar mensagem por Whatsapp");
            System.out.println("5 - Sair do programa");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                envioMarketing = createSms();
            } else if (opcao == 2) {
                envioMarketing = createEmail();
            } else if (opcao == 3) {
                envioMarketing = createRedesSociais();
            } else if (opcao == 4) {
                envioMarketing = createWhatsapp();
            } else if (opcao == 5) {
                break;
            } else {
                System.out.println("Opção Inválida!");
            }
        }
    }

    private static EnvioMarketing createSms() {
        System.out.println("Qual será a mensagem enviada por sms?");
        String mensagem = sc.nextLine();
        return new SMS(mensagem);
    }

    private static EnvioMarketing createEmail() {
        System.out.println("Qual será a mensagem enviada por E-mail?");
        String mensagem = sc.nextLine();
        return new Email(mensagem);
    }

    private static EnvioMarketing createRedesSociais() {
        System.out.println("Qual será a mensagem enviada pelas Redes Sociais?");
        String mensagem = sc.nextLine();
        return new RedesSociais(mensagem);
    }

    private static EnvioMarketing createWhatsapp() {
        System.out.println("Qual será a mensagem enviada por Whatsapp?");
        String mensagem = sc.nextLine();
        return new Whatsapp(mensagem);
    }
}
