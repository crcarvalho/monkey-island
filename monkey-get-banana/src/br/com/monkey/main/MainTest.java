package br.com.monkey.main;

import br.com.monkey.bo.IslandBO;

public class MainTest {
	
	
	public static void other(String[] args) {
		int array[][] =  {{1, 3, 3},{2, 1, 4},{0, 6, 4}, {0, 6, 4}};
		//Print do desafio
		IslandBO.showMatrix(array);
	}
	
	//Teste posicional
	public static void main(String[] args) {
		int i = 1;
		int j = 0;
		System.out.println(String.valueOf(i)+String.valueOf(j));
		
		other(null);
		
		
		//Exemplo
		int array[][] =  {{1, 3, 3},{2, 1, 4},{0, 6, 4}};
		//{(1,0)->(2,1)->(2,2)}
		int total1 = IslandBO.getPosition(array, 1, 0) + IslandBO.getPosition(array, 2, 1) + IslandBO.getPosition(array, 2, 2);
		System.out.println(total1);
		
		//(2,0) -> (1,1) -> (1,2) -> (0,3) OR
		//(2,0) -> (3,1) -> (2,2) -> (2,3)
		int array2[][] =  { {1, 3, 1, 5},{2, 2, 4, 1},{5, 0, 2, 3},{0, 6, 1, 2}};
		int total2 = IslandBO.getPosition(array2, 2, 0) + IslandBO.getPosition(array2, 1, 1) + IslandBO.getPosition(array2, 1, 2) +IslandBO.getPosition(array2, 0, 3);
		System.out.println(total2);
		int total3 = IslandBO.getPosition(array2, 2, 0) + IslandBO.getPosition(array2, 3, 1) + IslandBO.getPosition(array2, 2, 2) +IslandBO.getPosition(array2, 2, 3);
		System.out.println(total3);
		
		int array3[][] =  {{10, 33, 13, 15},{22, 21, 04, 1},{5, 0, 2, 3},{0, 6, 14, 2}};
		int total4 = IslandBO.getPosition(array3, 1, 0) + IslandBO.getPosition(array3, 0, 1) + IslandBO.getPosition(array3, 0, 2) +IslandBO.getPosition(array3, 0, 3);
		System.out.println(total4);
		
	}

}
