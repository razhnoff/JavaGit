package Task6;

public class VectorMethods {
	public static Vector addition(Vector v1, Vector v2) {
		Vector result = null;
		if (v1.getCount() == v2.getCount()) {
			int size = v1.getCount();
			int tmpValue;
			result = new Vector(size);
			for (int i = 0; i < size; i++) {
				tmpValue = v1.getValue(i) + v2.getValue(i);
				result.setValue(i, tmpValue);
			}
		}
		return result;
	}

	public static Vector increment(Vector v1) {
		Vector result = v1;
		int[] arr = v1.getArr();
		for (int i = 0; i < arr.length; i++) {
			arr[i]++;
		}
		result.setArr(arr);
		return result;
	}

	public static Vector decrement(Vector v1) {
		Vector result = v1;
		int[] arr = v1.getArr();
		for (int i = 0; i < arr.length; i++) {
			arr[i]--;
		}
		result.setArr(arr);
		return result;
	}

	public static Vector subtract(Vector v1, Vector v2) {
		Vector result = null;
		if (v1.getCount() == v2.getCount()) {
			int size = v1.getCount();
			int tmpValue;
			result = new Vector(size);
			for (int i = 0; i < size; i++) {
				tmpValue = v1.getValue(i) - v2.getValue(i);
				result.setValue(i, tmpValue);
			}
		}
		return result;
	}

	public static Vector multiplication(Vector v1, Vector v2) {
		Vector result = null;
		if (v1.getCount() == v2.getCount()) {
			int size = v1.getCount();
			int tmpValue;
			result = new Vector(size);
			for (int i = 0; i < size; i++) {
				tmpValue = v1.getValue(i) * v2.getValue(i);
				result.setValue(i, tmpValue);
			}
		}
		return result;
	}

	public static int dotProduct(Vector v1, Vector v2) {
		Vector tmpArr = multiplication(v1, v2);
		int result = 0, size = tmpArr.getCount();
		for (int i = 0; i < size; i++) {
			result += tmpArr.getValue(i);
		}
		return result;
	}

	public static int length(Vector v1) {
		return dotProduct(v1, v1);
	}

	public static double angle(Vector v1, Vector v2) {
		double tmpValue;
		tmpValue = dotProduct(v1, v2) / Math.sqrt(length(v1) * length(v2));
		tmpValue = (Math.acos(tmpValue));
		return Math.toDegrees(tmpValue); 
	}
}
