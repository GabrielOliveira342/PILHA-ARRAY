package model;
import java.util.ArrayList;
import java.util.Scanner;

public class PilhaArrayList<T>{
	
	//Atributo que armazena os elementos da pilha utilizando Array List
	private ArrayList<T> elementos;
	
	//Construtor inicializa a pilha com uma lista vazia
	public PilhaArrayList() {
		elementos = new ArrayList<>(); //Criando uma lista dinamica para armazenar os elementos da pilha 
	}
	
	//Método que verifica se a pilha está vazia
	public boolean estaVazia() {
		return elementos.isEmpty(); //Retorna true se a lista não contiver elementos
	}
	
	//Método para empilhar (adicionar) um elemento no topo da pilha
	public void empilhar (T item) {
		elementos.add(item); //Adiciona o item no final da lista (equivalente ao topo da pilha)
	}
	
	//Metodo para desempilhar (remover) um elemento do todo da pilha 
	public T desempilhar () {
		if (estaVazia()) {
			System.err.println("⚠️ Erro: A pilha esta vazia! Não há elementos para remover.");
			return null;
		}
		return elementos.remove(elementos.size() -1); //Remove e retorna o ultimo elemento da lista (topo da pilha)
	}
	
	//Metodo para visualizar o elemento do topo sem remove-lo
	public T topo() {
		if (estaVazia()) {
			System.err.println("⚠️ Erro: A pilha esta vazia! Não há elementos no topor.");
			return null;
		}
		return elementos.get(elementos.size() -1); //Remove e retorna o ultimo elemento da lista (topo da pilha)
	}
	
	//Metodo que retorna o tamanho da pilha 
	public int tamanho() {
		return elementos.size(); //Retorna a quantidade de elementos dentro da pilha 
	}
	
	//Metodo que exibe todos os elementos da pilha (de cima para baixo)
	public void exibirPilha() {
		if(estaVazia()) {
			System.out.println("A pilha está vazia!");
			return;
		}
		System.out.println("\n 📌Elementos da pilha (do topo para a  base):");
		for (int i = elementos.size() -1; i >= 0; i--) {
			System.out.println("| "+ elementos.get(i)+ " |");
		}
		System.out.println("=======");
	}
	
	//Metodo interativo para testar o funcionamento da pilha 
	public static void main(String[] args) {
		PilhaArrayList<String> pilha = new PilhaArrayList<>(); //Cria uma pilha de Strings 
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		
		do {
			//Menu Interativo
			System.out.println("\n====== MENU PILHA ======");
			System.out.println("1 - Empilhar Elemento");
			System.out.println("2 - Desempilhar Elemento");
			System.out.println("3 - Visualizar Topo");
			System.out.println("4 - Tamanho da Pilha");
			System.out.println("5 - Ver tamanho da Pilha");
			System.out.println("0 - Sair");
			System.out.println("Escolha uma opção:");
			
			if(!scanner.hasNextInt()) {
				System.out.println(" ⚠ Entrada invalida! Digite o numero. ");
				scanner.next(); //Descarta entrada invalida 
				continue;
			}
			//18/03/2025
			
		}

	}

}
