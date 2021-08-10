package algoritmos;

public class InsertionSort implements AlgoritmoOrdenacao {

	@Override
	public void sort(int[] vetor) {
		for (int i = 1; i < vetor.length; i++) {
			int valor = vetor[i];
			int j;
			for (j = i; j > 0 && vetor[j - 1] > valor; j--) {
				vetor[j] = vetor[j - 1];
			}
			vetor[j] = valor;
		}
	}

}
