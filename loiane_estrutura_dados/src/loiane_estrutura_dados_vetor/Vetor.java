package loiane_estrutura_dados_vetor;

import java.util.Iterator;

public class Vetor {
	
	//aula 02
	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
	}
	
	//aula 03
	/*public void adiciona(String elemento) {
		for (int i = 0; i < this.elementos.length; i++) {
			//verificando se a posição está nula
			if(this.elementos[i] == null) {
				elementos[i] = null;
				break;
			}
		}
	}*/
	
	//código mais eficiente
	public void adiciona(String elemento) {
		//verificando se o tamanho é menor que a capacidade do vetor elementos
		
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
		}
		
		
	}

}
