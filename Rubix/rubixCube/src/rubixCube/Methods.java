package rubixCube;

import java.util.Arrays;

public class Methods {
	int[][] side1 = new int[3][3];
	int[][] side2 = new int[3][3];
	int[][] side3 = new int[3][3];
	int[][] side4 = new int[3][3];
	int[][] side5 = new int[3][3];
	int[][] side6 = new int[3][3];
	
	int[][] up;
	int[][] front;
	int[][] right;
	int[][] left;
	int[][] back;
	int[][] down;
	
	
	public Methods() {
		for (int[] row : side1) {
			Arrays.fill(row, 1);		
			}
		
		for (int[] row : side2) {
			Arrays.fill(row, 2);
		}
		
		for (int[] row : side3) {
			Arrays.fill(row, 3);
		}
		
		for (int[] row : side4) {
			Arrays.fill(row, 4);
		}
		
		for (int[] row : side5) {
			Arrays.fill(row, 5);
		}
		
		for (int[] row : side6) {
			Arrays.fill(row, 6);
		}
		up = side1;
		front = side2;
		right = side3;
		left = side5;
		back = side4;
		down = side6;
	}
	
	public void front() {
		int[][] front = new int[this.front.length][this.front[0].length];
		for (int i = 0; i < front.length; i++) {
		     front[i] = Arrays.copyOf(this.front[i], this.front[i].length);
		}
		
		int[][] right = new int[this.right.length][this.right[0].length];
		for (int i = 0; i < right.length; i++) {
		     right[i] = Arrays.copyOf(this.right[i], this.right[i].length);
		}
		
		int[][] left = new int[this.left.length][this.left[0].length];
		for (int i = 0; i < left.length; i++) {
		     left[i] = Arrays.copyOf(this.left[i], this.left[i].length);
		}
		
		int[][] up = new int[this.up.length][this.up[0].length];
		for (int i = 0; i < up.length; i++) {
		     up[i] = Arrays.copyOf(this.up[i], this.up[i].length);
		}
		
		int[][] down = new int[this.down.length][this.down[0].length];
		for (int i = 0; i < down.length; i++) {
		     down[i] = Arrays.copyOf(this.down[i], this.down[i].length);
		}

		this.front = clockwise(front);
		
		this.right[0][0] = up[2][0];
		this.right[1][0] = up[2][1];
		this.right[2][0] = up[2][2];
		
		this.down[0][0] = right[2][0];
		this.down[0][1] = right[1][0];
		this.down[0][2] = right[0][0];
		
		this.left[0][2] = down[0][0];
		this.left[1][2] = down[0][1];
		this.left[2][2] = down[0][2];
		
		this.up[2][0] = left[2][2];
		this.up[2][1] = left[1][2];
		this.up[2][2] = left[0][2];
		
	}
	public void frontR() {
		int[][] front = new int[this.front.length][this.front[0].length];
		for (int i = 0; i < front.length; i++) {
		     front[i] = Arrays.copyOf(this.front[i], this.front[i].length);
		}
		
		int[][] right = new int[this.right.length][this.right[0].length];
		for (int i = 0; i < right.length; i++) {
		     right[i] = Arrays.copyOf(this.right[i], this.right[i].length);
		}
		
		int[][] left = new int[this.left.length][this.left[0].length];
		for (int i = 0; i < left.length; i++) {
		     left[i] = Arrays.copyOf(this.left[i], this.left[i].length);
		}
		
		int[][] up = new int[this.up.length][this.up[0].length];
		for (int i = 0; i < up.length; i++) {
		     up[i] = Arrays.copyOf(this.up[i], this.up[i].length);
		}
		
		int[][] down = new int[this.down.length][this.down[0].length];
		for (int i = 0; i < down.length; i++) {
		     down[i] = Arrays.copyOf(this.down[i], this.down[i].length);
		}

		this.front = counterClockwise(front);
		
		this.up[2][0] = right[0][0];
		this.up[2][1] = right[1][0];
		this.up[2][2] = right[2][0];
		
		this.right[0][0] = down[0][2];
		this.right[1][0] = down[0][1];
		this.right[2][0] = down[0][0];
		
		this.down[0][0] = left[0][2];
		this.down[0][1] = left[1][1];
		this.down[0][2] = left[2][2];
		
		this.left[0][2] = up[2][2];
		this.left[1][2] = up[2][1];
		this.left[2][2] = up[2][0];
		
		
	}
	public static int[][] clockwise(int[][] side) {
		int[][] newSide = new int[3][3];
		
		newSide[0][0] = side[2][0];
		newSide[0][1] = side[1][0];
		newSide[0][2] = side[0][0];
		
		newSide[1][0] = side[2][1];
		newSide[1][1] = side[1][1];
		newSide[1][2] = side[0][1];
		
		newSide[2][0] = side[2][2];
		newSide[2][1] = side[1][2];
		newSide[2][2] = side[0][2];
		
		return newSide;
	}
	
	public static int[][] counterClockwise(int[][] side) {
		int[][] newSide = new int[3][3];
		
		newSide[0][0] = side[0][2];
		newSide[0][1] = side[1][2];
		newSide[0][2] = side[2][2];
		
		newSide[1][0] = side[0][1];
		newSide[1][1] = side[1][1];
		newSide[1][2] = side[2][1];
		
		newSide[2][0] = side[0][0];
		newSide[2][1] = side[1][0];
		newSide[2][2] = side[2][0];
		
		return newSide;
	}
	
	public String toString() {
		String string = "";
		
		string = string + "Side 1\n";
		for (int[] row : side1) {
			for (int color : row) {
				string = string + color;
			}
		}
		
		string = string + "\nSide 2\n";
		for (int[] row : side2) {
			for (int color : row) {
				string = string + color;
			}
		}
		
		string = string + "\nSide 3\n";
		for (int[] row : side3) {
			for (int color : row) {
				string = string + color;
			}
		}
		
		string = string + "\nSide 4\n";
		for (int[] row : side4) {
			for (int color : row) {
				string = string + color;
			}
		}
		
		string = string + "\nSide 5\n";
		for (int[] row : side5) {
			for (int color : row) {
				string = string + color;
			}
		}
		
		string = string + "\nSide 6\n";
		for (int[] row : side6) {
			for (int color : row) {
				string = string + color;
			}
		}
		return string;
	}

}
