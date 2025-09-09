import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("Seu Índice de Massa Corporal (IMC) é: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Categoria: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Categoria: Peso normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Categoria: Sobrepeso");
        } else {
            System.out.println("Categoria: Obesidade");
        }

        scanner.close();
    }
	
}