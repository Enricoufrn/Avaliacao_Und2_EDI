package util;

import algoritmos.AlgoritmoOrdenacao;

public class ExecutaOrdenacao {
	
	public static void execute(AlgoritmoOrdenacao algoritmo, int[] vetor,long[] dados, int nRep) {
		int[] vetorAux;
		long tempoInicial,tempoFinal;
		for(int i = 0; i< nRep; i++) {
			vetorAux = vetor.clone();
			tempoInicial = System.currentTimeMillis();
			algoritmo.sort(vetorAux);
			tempoFinal = System.currentTimeMillis();
			dados[i] = tempoFinal - tempoInicial;
		}
	}
	
}
