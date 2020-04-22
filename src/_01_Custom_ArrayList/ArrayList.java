package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
	private T[] num;

	public ArrayList() {
		num = (T[]) new Object[0];
	}

	public T get(int loc) throws IndexOutOfBoundsException {

		return num[loc];
	}

	public void add(T val) {
		T[] num1=(T[]) new Object[num.length+1];
		num1[num1.length-1]=val;
		for (int i = 0; i < num.length; i++) {
			num1[i]=num[i];
		}
		num=num1;
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[]num2= (T[]) new Object[num.length+1];
		for (int i = 0; i < num2.length; i++) {
			if (i<loc) {
				num2[i]=num[i];
			}
			else if (i>loc) {
				num2[i]=num[i-1];
			}
			else {
				num2[i]=val;
			}
		}
		num=num2;
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		num[loc]=val;
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		T[]num3=(T[]) new Object[num.length-1];
		for (int i = 0; i < num.length; i++) {
			if (i<loc) {
				num3[i]=num[i];
			}
			else if (i>loc) {
				num3[i-1]=num[i];
			}
			else {
				continue;
			}
		}
		num=num3;    
		}
	public int size() {
		return num.length;
		
	}
	

	public boolean contains(T val) {
		for (int i = 0; i < num.length; i++) {
			if (num[i]==val) {
				return true;
			}
		}
		return false;
	}
}