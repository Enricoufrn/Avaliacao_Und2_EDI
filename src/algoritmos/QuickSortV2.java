package algoritmos;

import java.util.Random;

public class QuickSortV2 extends QuickSort{
	
	@Override
	/*protected int particiona(int[] vetor, int inicio, int fim){
		Random gerador = new Random();
	    int aux = inicio + gerador.nextInt(fim-inicio);
	    Troca.troca(vetor, fim, aux);
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
	protected int particiona(int[] vetor, int ini, int fim) {
		int pIndex = ini;
		Random gerador = new Random();
	    int aux = ini + gerador.nextInt(fim-ini);
	    Troca.troca(vetor, fim, aux);
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
}
