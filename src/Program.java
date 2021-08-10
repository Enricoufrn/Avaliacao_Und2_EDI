import java.util.Arrays;

import algoritmos.BubbleSort;
import algoritmos.CountingSort;
import algoritmos.InsertionSort;
import algoritmos.MergeSort;
import algoritmos.QuickSort;
import algoritmos.QuickSortV2;
import algoritmos.SelectionSort;
import util.CalculaEstatistica;
import util.ExecutaOrdenacao;
import util.GeraVetor;

public class Program {

	public static void main(String[] args) {

		final int nRep = 30;

		int tam1 = 10;
		int tam2 = (int) Math.pow(tam1, 3);
		int tam3 = (int) Math.pow(tam1, 5);

		GeraVetor gerador = new GeraVetor();

		int[] vetorOrdTam1 = gerador.geraVetorOrd(tam1, true, 1);
		int[] vetorOrdDecrescentTam1 = gerador.geraVetorOrd(tam1, false, 1);
		int[] vetorDesordTam1 = gerador.geraVetorDesord(tam1);

		int[] vetorOrdTam2 = gerador.geraVetorOrd(tam2, true, 1);
		int[] vetorOrdDecrescentTam2 = gerador.geraVetorOrd(tam2, false, 1);
		int[] vetorDesordTam2 = gerador.geraVetorDesord(tam2);

		int[] vetorOrdTam3 = gerador.geraVetorOrd(tam3, true, 1);
		int[] vetorOrdDecrescentTam3 = gerador.geraVetorOrd(tam3, false, 1);
		int[] vetorDesordTam3 = gerador.geraVetorDesord(tam3);

		// array com os dados q serão coletados dos tempos de execução de cada ordenação
		long[] dados = new long[nRep];

		// Testes de ordenação com os algoritmos com complexidade de tempo de O(n²)
		System.out.println("------------------- SelectionSort --------------------");
		System.out.println("---------- Vetor de tamanho = " + tam1 + " --------");
		System.out.println("--- Vetor ordenado ---");
		ExecutaOrdenacao.execute(new SelectionSort(), vetorOrdTam1, dados, nRep);
		imprimiEstatisticas(dados);
		System.out.println("--- Vetor ordenado de forma decrescente ---");
		ExecutaOrdenacao.execute(new SelectionSort(), vetorOrdDecrescentTam1, dados, nRep);
		imprimiEstatisticas(dados);
		System.out.println("--- Vetor desordenado ---");
		ExecutaOrdenacao.execute(new SelectionSort(), vetorDesordTam1, dados, nRep);
		imprimiEstatisticas(dados);
		System.out.println("---------- Vetor de tamanho = " + tam2 + " --------");
		System.out.println("--- Vetor ordenado ---");
		ExecutaOrdenacao.execute(new SelectionSort(), vetorOrdTam2, dados, nRep);
		imprimiEstatisticas(dados);
		ExecutaOrdenacao.execute(new SelectionSort(), vetorOrdDecrescentTam2, dados, nRep);
		System.out.println("--- Vetor ordenado de forma decrescente---");
		imprimiEstatisticas(dados);
		ExecutaOrdenacao.execute(new SelectionSort(), vetorDesordTam2, dados, nRep);
		System.out.println("--- Vetor desordenado ---");
		imprimiEstatisticas(dados);
		System.out.println("---------- Vetor de tamanho = " + tam3 + " --------");
		ExecutaOrdenacao.execute(new SelectionSort(), vetorOrdTam3, dados, nRep);
		System.out.println("--- Vetor ordenado ---");
		imprimiEstatisticas(dados);
		ExecutaOrdenacao.execute(new SelectionSort(), vetorOrdDecrescentTam3, dados, nRep);
		System.out.println("--- Vetor ordenado de forma decrescente---");
		imprimiEstatisticas(dados);
		ExecutaOrdenacao.execute(new SelectionSort(), vetorDesordTam3, dados, nRep);
		System.out.println("--- Vetor desordenado ---");
		imprimiEstatisticas(dados);
	}

	public static void imprimiEstatisticas(long[] dados) {
		System.out.println("Media = " + String.format("%.2f", CalculaEstatistica.media(dados)) + " ms"
						+ "\nMediana = "+ CalculaEstatistica.mediana(dados) + " ms"
						+ "\nDesvio padrão = "+ String.format("%.2f", CalculaEstatistica.desvioPadrao(CalculaEstatistica.media(dados), dados))+ " ms");
	}
}
