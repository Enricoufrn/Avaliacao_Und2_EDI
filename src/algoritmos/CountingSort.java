package algoritmos;

import java.util.Arrays;

public class CountingSort implements AlgoritmoOrdenacao {

	@Override
	public void sort(int[] vetor) {
		// TODO Auto-generated method stub
		int[] c = contaElementos(vetor, Arrays.stream(vetor).max().getAsInt());

		int[] vetorOrd = new int[vetor.length];
		for (int i = vetor.length - 1; i >= 0; i--) {
			int atual = vetor[i];
			if (atual <= 0) {
				vetorOrd[c[0] - 1] = atual;
			} else {
				vetorOrd[c[atual] - 1] = atual;
			}
			c[atual] -= 1;
		}

		vetor = vetorOrd;
	}

	private int[] contaElementos(int[] vetor, int k) {
		int[] c = new int[k + 1];
		for (int i : vetor) {
			if (i <= 0) {
				c[0] += 1;
			} else {
				c[i] += 1;
			}
		}
		for (int i = 1; i < c.length; i++) {
			c[i] += c[i - 1];
		}
		return c;
	}
}
