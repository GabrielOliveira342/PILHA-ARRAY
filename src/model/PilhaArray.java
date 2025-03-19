package model;
	
public class PilhaArray {
	
	private Object[] pilha; //Vetor que armazena os elementos da pilha
	private int topo; //Indice do topo da pilha
	
	//Contrutor que define o tamanho da pilha
	public PilhaArray(int tamanho) { 
			pilha = new Object[tamanho];
			topo = -1; //Indice que a pilha estara vazia inicialmente
	}
	
	//Metodo para verificar se a pilha está vazia
	public boolean estaVazia() {
		return topo == -1;
	}
	
	//Metodo para verificar se a pilha esta cheia
	public boolean estaCheia() {
		return topo == pilha.length -1;
	}
	
	//Metodo para empilhar os elementos
	public void empilhar(Object elemento) {
		if (estaCheia()) {
			System.err.println("Erro: A pilha está cheia! Não é possivel adicionar mais elementos");
		} else {
			pilha[++topo] = elemento; //Incrementea e adiciona o elemento
			System.out.println("Elemento "+elemento+" empilhado com sucesso. ");
		}
	}
	
	//Metodo para desempilhar os elementos
	public Object desempilhar() {
		if (estaVazia()) {
			System.err.println("Erro: A pilha está vazia! Não há elementos para remover.");
			return null;
		} else {
			Object elementoRemovido = pilha[topo];
			pilha[topo--] = null; //Remove o elemento e decrementa o indice 
			System.out.println("Elemento "+elementoRemovido+" desempilhado com sucesso. ");
			return elementoRemovido;
		}
	}
	
	//Método para obter o elemento do topo sem remove-lo
	public Object topo(){
		if(estaVazia()) {
			System.err.println("Erro: A pilha está vazia! Não há topo");
		}
		return pilha[topo];
	}
	public static void main(String[] args) {
		//Criando um pilha do tamanho 5
		PilhaArray pilha = new PilhaArray(5);
		
		//Testando a empilhagem dos elementos
		pilha.empilhar(1);
		pilha.empilhar(2);
		pilha.empilhar(3);
		pilha.empilhar(4);
		pilha.empilhar(5);
		pilha.empilhar(6); //Deverá exibir a mensagem de erro (pilha cheia)
		
		
		//Testando a desempilhagem dos elementos
		pilha.desempilhar();
		pilha.desempilhar();
		pilha.desempilhar();
		pilha.desempilhar();
		pilha.desempilhar();
		pilha.desempilhar(); //Deverá exibir a mensagem de erro (pilha vazia)
	}

}
