package algoritmos;

public class MergeSort implements AlgoritmoOrdenacao {

	@Override
	public void sort(int[] vetor) {
		if (vetor.length > 1) {
			// primeiro quebramos o vetor em 2 vetores menores
			int meio = vetor.length / 2;

			int tamV1 = meio;
			int[] v1 = new int[tamV1];
			for (int i = 0; i < meio; i++) {
				v1[i] = vetor[i];
			}

			int tamV2 = vetor.length - meio;
			int[] v2 = new int[tamV2];
			for (int i = meio; i < vetor.length; i++) {
				v2[i - meio] = vetor[i];
			}

			this.sort(v1);
			this.sort(v2);
			merge(vetor, v1, v2);
		}
	}

	private void merge(int[] vetor, int[] vetorE, int[] vetorD) {
		int indexV = 0;
		int indexE = 0;
		int indexD = 0;
		while (indexE < vetorE.length && indexD < vetorD.length) {
			if (vetorE[indexE] <= vetorD[indexD]) {
				vetor[indexV] = vetorE[indexE];
				indexE++;
			} else {
				vetor[indexV] = vetorD[indexD];
				indexD++;
			}
			indexV++;
		}
		// ainda poderíamos ter elementos no vetor E que não foram copiados para V
		while (indexE < vetorE.length) {
			vetor[indexV] = vetorE[indexE];
			indexE++;
			indexV++;
		}
		// ainda poderíamos ter elementos no vetor D que não foram copiados para V
		while (indexD < vetorD.length) {
			vetor[indexV] = vetorD[indexD];
			indexD++;
			indexV++;
		}
	}

}
