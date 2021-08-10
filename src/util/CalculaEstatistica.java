package util;

import java.util.Arrays;

public class CalculaEstatistica {
	public static double media(long[] dados) {
		return ((double) Arrays.stream(dados).sum() / dados.length);
	}

	public static double mediana(long[] dados) {
		double aux;
		int tam = dados.length;
		if (dados.length % 2 == 0) {
			aux = ((double)(dados[(tam/2)-1]+dados[tam/2])/2);
		} else {
			aux = dados[(tam/2)];
		}
		return aux;
	}

	public static double desvioPadrao(double media, long[] dados) {
		double[] aux = new double[dados.length];
		for (int i = 0; i < aux.length; i++) {
			aux[i] = (double) (media - dados[i]);
		}
		double variancia = (Arrays.stream(aux).map(d -> d = Math.pow(d, 2)).sum()) / aux.length;
		return Math.sqrt(variancia);
	}
}
