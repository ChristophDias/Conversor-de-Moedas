import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        Converte converte = new Converte();

        String menu = """
                *********************************************************
                              Conversor de Moeda
                *********************************************************
                Digite a opção:
                
                1 - Dolar Americano USD para >>> Real BRL
                2 - Real BRL para >>> Dolar Americano USD
                3 - Dolar Americano USD para  >>> Peso Argentino ARS
                4 - Peso Argentinho ARS para >>> Dolar Americano USD
                5 - Real BRL para >>> Peso Argentino USR
                6 - Peso Argentino para >>> Real BRL
                7 - Sair
                
                *********************************************************
                """;


        while (opcao != 7) {
            try {
                System.out.println(menu);
                opcao = scanner.nextInt();
                double valor;

                if(opcao == 1) {
                    System.out.println("Digite o valor");
                    valor = scanner.nextDouble();
                    Conversao conversao = converte.converteMoeda("USD", "BRL", valor);
                    System.out.println("O valor de: " + valor + " USD convertido para real é: " + conversao + " BRL");
                } else if (opcao == 2) {
                    System.out.println("Digite o valor");
                    valor = scanner.nextDouble();
                    Conversao conversao = converte.converteMoeda("BRL", "USD", valor);
                    System.out.println("O valor de: " + valor + " BRL convertido para dolar é: " + conversao + " USD");
                } else if (opcao == 3) {
                    System.out.println("Digite o valor");
                    valor = scanner.nextDouble();
                    Conversao conversao = converte.converteMoeda("USD", "ARS", valor);
                    System.out.println("O valor de: " + valor + " USD convertido para Peso Argentino é: " + conversao + " ARS");
                } else if (opcao == 4) {
                    System.out.println("Digite o valor");
                    valor = scanner.nextDouble();
                    Conversao conversao = converte.converteMoeda("ARS", "USD", valor);
                    System.out.println("O valor de: " + valor + " ARS convertido para dolar é: " + conversao + " USD");
                } else if (opcao == 5) {
                    System.out.println("Digite o valor");
                    valor = scanner.nextDouble();
                    Conversao conversao = converte.converteMoeda("BRL", "ARS", valor);
                    System.out.println("O valor de: " + valor + " BRL convertido para Peso Argentino é: " + conversao + " ARS");
                } else if (opcao == 6) {
                    System.out.println("Digite o valor");
                    valor = scanner.nextDouble();
                    Conversao conversao = converte.converteMoeda("ARS", "BRL", valor);
                    System.out.println("O valor de: " + valor + " ARS convertido para real é: " + conversao + " BRL");
                } else if (opcao != 7) {
                    System.out.println("Opção invalida");
                } else System.out.println("Finalizando a Aplicação");

            } catch (Exception e) {
                System.out.println("Não converter, cheque se vc digitou o valor certo");
                System.out.println("Finalizando a Aplicação");
                break;
            }

        }
    }
}
