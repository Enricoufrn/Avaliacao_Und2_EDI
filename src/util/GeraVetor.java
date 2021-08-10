package util;

import java.util.Random;

public class GeraVetor {

	public int[] geraVetorOrd(int tam, boolean crescent, int mult) {
		int[] vetor = new int[tam];
		if (crescent) {
			for (int i = 0; i < tam; i++) {
				vetor[i] = mult * (i + 1);
			}
		} else {
			for (int i = tam; i > 0; i--) {
				vetor[tam - i] = i * mult;
			}
		}
		return vetor;
	}

	public int[] geraVetorDesord(int tam) {
		Random gerador = new Random();
		
		int[] vetor = new int[tam];
		for (int i = 0; i < tam; i++) {
			vetor[i] = gerador.nextInt(tam);
		}
		return vetor;
	}
}
