package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	int arr[]=new int[0];
	public ArrayList() {
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==loc) {
			
			}
		}
		return null;
	}
	
	public void add(T val) {
		
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==loc) {
				
			}
		}
	}
	
	public boolean contains(T val) {
			
		return false;
	}
}