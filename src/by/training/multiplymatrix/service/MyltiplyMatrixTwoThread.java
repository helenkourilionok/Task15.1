package by.training.multiplymatrix.service;

import by.training.multiplymatrix.entity.SquareMatrix;

public class MyltiplyMatrixTwoThread implements Runnable{
	private SquareMatrix matrix1;
	private SquareMatrix matrix2;
	private SquareMatrix matrix3;
	private int startIndex;
	private int endIndex;
	
	public MyltiplyMatrixTwoThread(SquareMatrix matrix1,SquareMatrix matrix2,
			SquareMatrix matrix3,int startIndex,int endIndex) {
		this.startIndex = startIndex;
		this.endIndex = endIndex;
		this.matrix1 = matrix1;
		this.matrix2 = matrix2;
		this.matrix3 = matrix3;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int dimension = matrix1.getDimension();
		for (int i = startIndex; i < endIndex; i++) {
			for (int j = 0; j < dimension; j++) {
				synchronized(this){
					int summand = 0;
					for (int k = 0; k < dimension; k++) {
						summand += matrix1.getValue(i, k) * matrix2.getValue(k, j);
					}
					matrix3.setValue(summand, i, j);
				}	
			}
		}
	}
}
