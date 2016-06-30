package by.training.multiplymatrix.service;

import by.training.multiplymatrix.entity.SquareMatrix;

public class MyltiplyMatrixTwoThreadExecutor {
	private SquareMatrix matrix1;
	private SquareMatrix matrix2;
	private SquareMatrix matrix3;
	
	public MyltiplyMatrixTwoThreadExecutor(SquareMatrix matrix1,SquareMatrix matrix2,SquareMatrix matrix3){
		this.matrix1 = matrix1;
		this.matrix2 = matrix2;
		this.matrix3 = matrix3;
	}
	
	public void makeMulMatrix(){
		int dimension = matrix1.getDimension();
		Thread[] threads = new Thread[2];
		int border = dimension/threads.length;
		threads[0] = new Thread(new MyltiplyMatrixTwoThread(matrix1, matrix2, matrix3,0, border));
		threads[1] = new Thread(new MyltiplyMatrixTwoThread(matrix1, matrix2, matrix3,border,dimension));
		threads[0].start();
		threads[1].start();
		try {
			threads[0].join();
			threads[1].join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
