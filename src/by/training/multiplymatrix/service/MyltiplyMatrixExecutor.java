package by.training.multiplymatrix.service;

import by.training.multiplymatrix.entity.SquareMatrix;

public class MyltiplyMatrixExecutor {
	private SquareMatrix matrix1;
	private SquareMatrix matrix2;
	private SquareMatrix matrix3;
	
	public MyltiplyMatrixExecutor(SquareMatrix matrix1,SquareMatrix matrix2,SquareMatrix matrix3) {
		this.matrix1 = matrix1;
		this.matrix2 = matrix2;
		this.matrix3 = matrix3;
	}
	
	public void makeMulMatrix(){
		int dimension = matrix1.getDimension();
		Thread[] threads = new Thread[dimension*dimension];
		for(int i = 0;i<dimension;i++){
			for(int j = 0;j<dimension;j++){
				threads[i*dimension+j] = new Thread(new MyltiplyMatrix(matrix1, matrix2, matrix3, i, j));
				threads[i*dimension+j].start();
			}
		}
		for (Thread thread:threads){
              try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
	}
}
