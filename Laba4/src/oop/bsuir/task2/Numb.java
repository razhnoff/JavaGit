package oop.bsuir.task2;

public class Numb implements Comparable<Numb> {

	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Numb(int count) {
		this.count = count;
	}

	@Override
	public int compareTo(Numb o) {
		return o.count - this.count;
	}

	@Override
	public String toString() {
		return "Number [count=" + count + "]";
	}

}
