package com.curso.v0;

public class FindInMatrix2 {
	
	private static int[] getValue(int[][] list, int searchValue) {
		int[] coordenadas = new int[2];
		
		int positionX = -1;
		int positionY = -1;
		
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][j] == searchValue) {
					positionX = i;
					positionY = j;
					System.out.println("Lo encontre: "+i+","+j);
					coordenadas[0] = i;
					coordenadas[1] = j;
					return coordenadas;
				}
			}
		}
		coordenadas[0] = positionX;
		coordenadas[1] = positionY;
		
		return coordenadas;
		
	}

	public static void main(String[] args) {

		int[][] list = { { 1, 13 }, { 5, 2 }, { 2, 2 } };

		int searchValue = 2; 
		
		int[] resultado = getValue(list,searchValue);
		
		int positionX = resultado[0];
		int positionY = resultado[1];

		if (positionX == -1 || positionY == -1) {
			System.out.println("Value " + searchValue + " not found");
		} else {
			System.out.println("Value " + searchValue + " found at: " + "(" + positionX + "," + positionY + ")");
		}

	}

}
