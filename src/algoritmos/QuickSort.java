package algoritmos;

public class QuickSort implements AlgoritmoOrdenacao {

	@Override
	public void sort(int[] vetor) {
		quickSort(vetor, 0, vetor.length - 1);
	}

	protected void quickSort(int[] vetor, int ini, int fim) {
		if (fim > ini) {
			int indexPivo = particiona(vetor, ini, fim);
			quickSort(vetor, ini, indexPivo - 1);
			quickSort(vetor, indexPivo + 1, fim); // indexPivo já está no seu local
		}
	}

	protected int particiona(int[] vetor, int ini, int fim) {
		int pIndex = ini;
		int pivo = vetor[fim];
		for (int i = ini; i < fim; i++) {
			if (vetor[i] <= pivo) {
				Troca.troca(vetor, i, pIndex);
				pIndex++;
			}
		}
		Troca.troca(vetor, pIndex, fim);
		return pIndex;
	}

	/*protected int particiona(int[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];
		int i = inicio + 1, f = fim;
		while (i <= f) {
			if (vetor[i] <= pivo)
				i++;
			else if (pivo < vetor[f])
				f--;
			else {
				Troca.troca(vetor,i,f);
				i++;
				f--;
			}
		}
		vetor[inicio] = vetor[f];
		vetor[f] = pivo;
		return f;
	}*/
}
