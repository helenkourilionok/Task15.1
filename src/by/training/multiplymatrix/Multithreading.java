package by.training.multiplymatrix;

import by.training.multiplymatrix.entity.SquareMatrix;
import by.training.multiplymatrix.service.MyltiplyMatrixExecutor;
import by.training.multiplymatrix.service.MyltiplyMatrixTwoThreadExecutor;
import by.training.multiplymatrix.service.SquareMatrixService;

public class Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int dimension = 3;
		SquareMatrix matrix1 = new SquareMatrix(dimension);
		SquareMatrix matrix2 = new SquareMatrix(dimension);
		SquareMatrix matrix3 = new SquareMatrix(dimension);
		SquareMatrix matrix4 = new SquareMatrix(dimension);
		
		SquareMatrixService.fillSquareMatrixFromRandom(matrix1);
		SquareMatrixService.fillSquareMatrixFromRandom(matrix2);
		
		SquareMatrixService.printSquareMatrix(matrix1);
		System.out.println();
		SquareMatrixService.printSquareMatrix(matrix2);
		System.out.println();
		/*Two thread*/
		MyltiplyMatrixTwoThreadExecutor exTwo = new MyltiplyMatrixTwoThreadExecutor(matrix1, matrix2, matrix3);
		exTwo.makeMulMatrix();
		SquareMatrixService.printSquareMatrix(matrix3);
		/*Two thread*/
		System.out.println();
		/*Unlimited count of thread*/
		MyltiplyMatrixExecutor ex = new MyltiplyMatrixExecutor(matrix1,matrix2,matrix4);
		ex.makeMulMatrix();
		SquareMatrixService.printSquareMatrix(matrix4);
		/*Unlimited count of thread*/
	}

}
