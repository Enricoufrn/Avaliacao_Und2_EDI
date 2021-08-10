package algoritmos;

public class Troca {
	
	public static void troca(int[] vetor, int ia, int ib) {
		int aux = vetor[ia];
		vetor[ia] = vetor[ib];
		vetor[ib] = aux;
	}
}
