package by.training.multiplymatrix.service;

import by.training.multiplymatrix.entity.SquareMatrix;

public class MyltiplyMatrix implements Runnable{
	private SquareMatrix matrix1;
	private SquareMatrix matrix2;
	private SquareMatrix matrix3;
	private int row;
	private int column;
	
	public MyltiplyMatrix(SquareMatrix matrix1,SquareMatrix matrix2,SquareMatrix matrix3,int row,int column) {
		this.row = row;
		this.column = column;
		this.matrix1 = matrix1;
		this.matrix2 = matrix2;
		this.matrix3 = matrix3;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			int sum = 0;
			for(int i = 0;i<matrix1.getDimension();i++){
				sum += matrix1.getValue(row, i)*matrix2.getValue(i, column);
			}
			matrix3.setValue(sum, row, column);
		}
	}
}
