
public class Bubblesort {

	/**
	 * @param args
	 */
	
	static int[] ar=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		initialize(args);
		print_array();
		Bsort();
		print_array();
	}
	
	private static void Bsort(){
		
		int idx = 0;
		
		while (idx<ar.length-1){
			
			if (ar[idx]>ar[idx+1]){
				
				swap(idx,idx+1);
			}
			
			idx++;
		}
		
		if (!sorted()){
			Bsort();
		}
	}
	
	private static boolean sorted(){
		boolean sorted = true;
		
		int idx = 0;
		
		while (idx<ar.length-1){
			
			if (ar[idx]>ar[idx+1]){
				
				sorted = false;
				break;
			}
			
			idx++;
		}
		
		return sorted;
	}
	
	
	private static void swap(int left, int right){
		int temp = ar[left];
		ar[left] = ar[right];
		ar[right] = temp;
	}

	private static void print_array(){
		for(int i : ar){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	private static void initialize(String[] args){
	
		ar = new int[args.length-1];
		
		for(int i=0; i<args.length-1; i++){
			ar[i]=Integer.parseInt(args[i]);
		}
	}

}
