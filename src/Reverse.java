
public class Reverse {

	// Part 2
	//
	// TODO Where N is the length of array 'arr' the complexity is:
	//
	// O(?)
	public static void reverse(String[] arr){ 
		Stack st= new Stack(arr.length);
		for(int i=0; i<arr.length; i++) {
			st.push(arr[i]);
		}
		for(int i=0; i< arr.length; i++) {
			arr[i]= (String) st.pop();
		}

	}

}
	

