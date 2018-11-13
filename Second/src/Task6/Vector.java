package Task6;

public class Vector {
	private int[] arr;

	public Vector(int... arr) {
		this.arr = arr;
	}

	public Vector(int n) {
		this.arr = new int[n];
	}

	public int[] getArr() {
		return this.arr;
	}

	public int getValue(int index) {
		return this.arr[index];
	}

	public int getCount() {
		return this.arr.length;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public void setValue(int index, int value) {
		this.arr[index] = value;
	}

	@Override
	public String toString() {
		String result = "";
		for (int tmpValue : arr) {
			result += String.valueOf(tmpValue) + " ";
		}
		return result;
	}

}
