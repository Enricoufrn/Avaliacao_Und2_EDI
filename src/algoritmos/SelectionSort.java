package algoritmos;

public class SelectionSort implements AlgoritmoOrdenacao {

	@Override
	public void sort(int[] vetor) {
		for (int i = 0; i < vetor.length - 1; i++) {
			int iMenor = i;
			for (int j = iMenor + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[iMenor]) {
					iMenor = j;
				}
			}
			Troca.troca(vetor, i, iMenor);
		}
	}

}
