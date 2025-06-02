
import java.util.Locale;
import java.util.Scanner;


public class CalculoIMC {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);


        System.out.println("Qual o seu nome ?");
        String nome = scanner.nextLine();

        
        System.out.println("Qual o seu peso em Kg ? (Use ponto Ex: 70.5)");
        Double peso = scanner.nextDouble();


        System.out.println("Qual a sua altura ? (Use ponto Ex: 1.75)");
        Double altura = scanner.nextDouble();


        Double IMC = peso / (altura * altura);
        Double pesoMinimo = 18.5 * (altura * altura);
        Double pesoMaximo = 24.9 * (altura * altura);



        System.out.printf ("%s, seu IMC é: %.2f\n", nome, IMC);

        if (IMC < 18.5) {
            System.out.println("Você está abaixo do peso.");
        }    else if (IMC < 25) {
            System.out.println("Você está no peso ideal !");
        }    else if (IMC < 30) {
            System.out.println("Você está com sobrepeso.");
        }    else if (IMC < 35) {
            System.out.println("Obesidade Grau I");
        }    else if (IMC < 40) {
            System.out.println("Obesidade Grau II");
        }    else  {
            System.out.println("Obesidade Grau III");
        }

            System.out.printf("Seu peso ideal está entre %.2f Kg e %.2f Kg. \n", pesoMinimo, pesoMaximo);

            scanner.close ();
        

        }

    }

