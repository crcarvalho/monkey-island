package br.com.monkey.main;

import br.com.monkey.bo.IslandBO;

public class MainSolution
{
	
	//@Description: Given a Jungle in the middle of an island of n*m dimensions. Each field in this jungle contains a
	//positive integer which is the amount of bananas that exist in that field. Initially the monkey is at first
	//column but can be at any row. The monkey can move only (right->,right up /,right down\) from a given
	//cell. Find out the maximum amount of bananas they can collect.
	//@params: mat (Matriz que possui o total de bananas em cada ilha)
	//		   m (total de linhas)
    //		   n (total de colunas)
    static int getAmountBananas(int mat[][], int m, int n)
    {
        
    	//Limite total de colunas
        int limitColumns = n-1;
        int limitRows = m-1;
        
        //Matriz auxiliar para soma dos resultados
        int matAux[][] = new int[m][n];
        
        //Preenche todas as posi??es com Zero para depois vir 
        //somando os valores da matriz e colocar em cada 
        //posi??o da matriz
        for(int i=0; i < matAux.length; i++) {
        	for( int j=0; j < matAux[0].length; j++ ) {
        		matAux[i][j] = 0;
        	}
        }
        //Varivael para contar quantas vezes o statement ? percorrido
        int totalVezes = 1;
        
        //Fiz uma itera??o reversa para preencher da ultima coluna para a primeira fazendo uma soma
        for (int col = limitColumns; col >= 0; col--)
        {
            for (int row = 0; row <= limitRows; row++)
            {
            	System.out.println("Passei por aqui " + totalVezes + " vezes.");
            	totalVezes++;
            	int next 	 = 0;
                int nextDown = 0;
                int nextUp   = 0;
                
                if( col != limitColumns ) {
                	next = matAux[row][col+1];
                }
                
                if( row != limitRows && col != limitColumns) {
                	nextDown = matAux[row+1][col+1];
                }
                
                if( row != 0 && col != limitColumns) {
                	nextUp = matAux[row-1][col+1];
                }
                
                /*System.out.println("Linha: "+row+" | Coluna: "+col);
                System.out.println("nextDown: "+nextDown);
                System.out.println("nextUp: "+nextUp);
                System.out.println("next: "+next);*/
                
                // Nessa opera??o ser? comparado o maior valor de cada uma das opera??es acima 
                int result1 = Math.max( next, nextDown);
                int resultFinal = Math.max( result1, nextUp);
                
                matAux[row][col] = mat[row][col] + resultFinal;
            }
        }
        
        //Faz um print da vers?o final da matriz j? com a somas de cada caminho
        IslandBO.showMatrix(matAux);
        
        int resposta = 0;
        //Percorre todos os valores da primeira coluna
        //Esse ser? o maior valor dentro do caminho permitido
        for (int i = 0; i <= limitRows-1; i++) {
            resposta = Math.max(resposta, matAux[i][0]);
        }
        
        return resposta;
    }
     
    //driver code
    public static void main(String arg[])
    {
        int mat[][]= { { 10, 33, 13, 15 },
        			   { 22, 21, 04, 01 },
        			   { 05, 00, 02, 03 },
        			   { 00, 06, 14, 02 }};
        
        int m = mat.length; 
        int n = mat[0].length;
        
        System.out.print("O total maximo de bananas ? de: " + getAmountBananas(mat, m, n));
    }

}