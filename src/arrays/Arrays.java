package arrays;
public class Arrays {

	private int arr[];
	private int count=0;
	private int length;

	public Arrays(int length) {
		super();
		this.arr = new int[length];
		this.length = length;

	}

	public void insert(int number) {


		if(count >= arr.length) {
			increaselength();
		}
		arr[count++] =number;
	}

	public int[] increaselength() {

		int arr2[] = new int[arr.length * 2];
		for(int i =0;i<arr.length;i++) {
			arr2[i] =arr[i];
		}

		arr = arr2;
		return arr;
	}



	public int remove(int index) {

		if(count>index) {

			for(int i = index;i<arr.length-1;i++) {

				arr[i] = arr[i+1];
			}
			count--;
			return index;
		}else {

			System.out.println("Sorry index does not exist in the Array");
			return -99;
		}

	}

	public void printArray(){
		System.out.println(java.util.Arrays.toString(arr));
	}

	public int indexof(int number) {

		for(int i=0;i<arr.length;i++) {

			if(arr[i] == number) {
				return i;
			}
		}

		return -99;

	}

	public int max(){
		int max =arr[0];
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}


		}
		return max;

	}

	public int min() {
		int min = arr[0];

		for(int i =0;i<arr.length;i++) {

			if(min>arr[i]) {

				min = arr[i];
			}
		}
		return min;
	}


	public int[] intersect(int arri[]) {
		int arr3[] = new int[arr.length];
		int next =-1;
		for(int i =0;i<arri.length;i++) {

			for(int j=0;j<arr.length;j++) {

				if(arr[j] == arri[i]) {
					arr3[++next] = arri[i];
				}
			}

		}

		int shrinked_arr[]= new int[next+1];

		for(int i=0;i<shrinked_arr.length;i++) {
			shrinked_arr[i] = arr3[i];	
		}

		return shrinked_arr;
	}


	public int[] reverse() {


		int j = arr.length-1;
		int rarr[] = new int[arr.length];
		int k =0;
		for(int i=(count-1);i>=0;i--) {
			System.out.println(arr[i]);
			rarr[k++] = arr[i];

		}
		arr = rarr;

		return arr;
	}

	public void insert(int index,int numb) {
		if(count>=arr.length) {
			increaselength();
		}

		if(index > count && index<0) {

			System.out.println("Sorry index is not in the array");

		}else {		
			for(int i = count-1;i>=index;i--) {
				arr[i+1] = arr[i];

			}
			arr[index] = numb;
			count++;

		}
	}

}

