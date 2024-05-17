package soma_vetor;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		double soma, media;
		System.out.println("Quantos numeros você vai digitar: ");
		N = sc.nextInt();
		
		double[] vet = new double[N];
		
		for (int i = 0; i < N; i++) {
			System.out.println("Digite um número: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.println("VALORES = ");
		for (int i = 0; i < N; i++){
			System.out.println(String.format("%.1f ", vet[0]));
		}
		System.out.println();
		
		soma = 0;
		for(int i = 0; i < N; i++) {
			soma = soma + vet[i];
		}
		System.out.println("SOMA = " + String.format("%.2f", soma));
		
		media = soma / N;
		System.out.println("MEDIA = " + String.format("%.2f", media));
		
		sc.close();
	}

}
