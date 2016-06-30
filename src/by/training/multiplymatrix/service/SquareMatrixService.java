package by.training.multiplymatrix.service;

import java.util.Random;

import by.training.multiplymatrix.entity.SquareMatrix;



public class SquareMatrixService {
	public static void fillSquareMatrixFromRandom(SquareMatrix squareMatrix){
		Random r = new Random();
		int[][] matrix = squareMatrix.getMatrix();
		for(int i = 0;i<matrix.length;i++){
			for(int j = 0;j<matrix[0].length;j++){
				matrix[i][j] =  r.nextInt(50);
			}
		}
	}
	public static void printSquareMatrix(SquareMatrix squareMatrix){
		int[][] matrix = squareMatrix.getMatrix();
		for(int i = 0;i<matrix.length;i++){
			for(int j = 0;j<matrix.length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
