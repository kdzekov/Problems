
public class Quicksort {

	/**
	 * @param args
	 */
	
	private static int[] ar = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initialize(args);
		print_array();
		sort();
		print_array();
	}
	
	private static void sort(){
		
		int left = 0;
		int right = ar.length-1;
		
		int index_pivot = (ar.length-1)/2;
		
		int pivot = ar[index_pivot];
		
		Qsort(left,right,pivot);
		
		
	}
	
	private static void Qsort(int left, int right, int pivot){
		
		int leftindx = left;
		int rightindx = right;
		
		int p =0;
		
		if (left==right){
			return;
		}
		
		while (leftindx < rightindx){
		
			while(ar[leftindx] < pivot) 
			{ 
				leftindx++;
			}
		
			while(ar[rightindx] > pivot) 
			{
				rightindx--;
			}
		
			if (leftindx>=rightindx)
			{
				break;
				
			}else{
				swap(leftindx, rightindx);
			}
			
		}

		
		if (left < leftindx){
			p = estimatepivot(left,leftindx-1);
			Qsort(left,leftindx-1, p);
		}
		
		if (rightindx < right){
			p = estimatepivot(rightindx+1,right);
			Qsort(rightindx+1,right, p);
		}
		
	}
	
	private static int estimatepivot(int left, int right){
		
		int index_pivot = (left+right)/2;
		int pivot = ar[index_pivot];
	
		return pivot;	
	}
	
	private static void swap(int left, int right){
		int temp = ar[left];
		ar[left] = ar[right];
		ar[right] = temp;
	}
	
	private static void initialize(String[] args){
		
		
		ar = new int[args.length-1];
		
		for(int i=0; i<args.length-1; i++){
			ar[i]=Integer.parseInt(args[i]);
		}
		
	}
	
	private static void print_array(){
		for(int i : ar){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	

}
