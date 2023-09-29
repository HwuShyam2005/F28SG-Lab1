
public class Reverse {

	// Part 2
	//
	// TODO Where N is the length of array 'arr' the complexity is:
	//
	// O(?)
	public static void reverse(String[] arr){ 
		//CREATION OF NEW STACK 'STK' WITH LENGTH SAME AS THE 'ARR' ARRAY.
		Stack stk= new Stack(arr.length);
		
		// PUSHING OF EACH ELEMENT FROM THE 'ARR' ONTO THE STACK 'STK'
		for(int i=0; i<arr.length; i++) {
			stk.push(arr[i]);
		}
		
		//POP ELEMENTS FROM STACK 'STK' AND ASSIGNING THEM AGAIN TO 'ARR' ARRAY
		for(int i=0; i< arr.length; i++) {
			arr[i]= (String) stk.pop();
		}

	}

}
	

