package by.training.multiplymatrix.entity;

import java.io.Serializable;
import java.util.Arrays;

public class SquareMatrix implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 8161055571653189223L;
	private int dimension;
	private int[][] matrix;
	
	public int getDimension(){
		return dimension;
	}
	
	public int[][] getMatrix(){
		return matrix;
	}
		
	public void setValue(int value,int row,int column){
		matrix[row][column] = value;
	}
	
	public int getValue(int row,int column){
		return matrix[row][column];
	}
	
	public SquareMatrix(int dimension){
		this.dimension = dimension;
		matrix = new int[dimension][dimension];
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dimension;
		result = prime * result + Arrays.deepHashCode(matrix);
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SquareMatrix other = (SquareMatrix) obj;
		if (dimension != other.dimension)
			return false;
		if (!Arrays.deepEquals(matrix, other.matrix))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "SquareMatrix [dimension=" + dimension + ", matrix=" + Arrays.toString(matrix) + "]";
	}
		
}
