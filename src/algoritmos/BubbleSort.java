package algoritmos;

public class BubbleSort implements AlgoritmoOrdenacao {

	@Override
	public void sort(int[] vetor) {
		for (int varredura = 0; varredura < vetor.length - 1; varredura++) {
			boolean trocou = false;
			for (int i = 0; i < vetor.length - varredura - 1; i++) {
				if (vetor[i] > vetor[i + 1]) {
					Troca.troca(vetor, i, i + 1);
					trocou = true;
				}
			}
			if (trocou == false)
				return;
		}
	}

}
