package br.com.monkey.bo;


public class IslandBO {
	public static void showMatrix(int array[][]) {
		System.out.println("Linhas: "+ array.length);
		System.out.println("Colunas: "+ array[0].length);
		
		for (int i = 0; i < array.length; i++) {
        	System.out.print("Matriz Soma atraves dos caminhos[");
        	for (int j = 0; j < array[0].length; j++) {
                System.out.print(" " + array[i][j]);
            }
        	System.out.println(" ]");        	
        }
	}
	
	public static int getPosition(int array[][], int row, int col) {
		Object matrix = array;
		return ((int[][])matrix)[row][col];
	}
	
	/*public static int upRow(int lRow) {
		int row = lRow-1;
		if( row < 0 ) row = 0;
		
		return row;
	}
	
	public static int downRow(int array[][],int lCol) {
		int row = lCol+1;
		if( row > array.length ) row = array.length;
		
		return row;
	}
	
	
	public static int next(int array[][], int lCol){
		int col = lCol+1;
		if( col > array[0].length ) col = array[0].length; 
		return col;
	}*/
}
