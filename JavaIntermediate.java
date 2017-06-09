class JavaIntermediate{

	public static void main(String[] args){
		//ternaryOp(0);
		//labeledBreak();
		//labeledContinue();
	}
/* //Continue syntax and labeled continue statement
	public static void labeledContinue(){
		int array1[] = {0,1,2,3,4,5,6,7,8,9};
		int array2[] = {0,1,2,3,4,5,6,7,8,9};
		
		for(int i : array1){
			if(i % 2 == 0){
				System.out.println("Skip the evens");
				continue;
			}
			System.out.println(i);
			System.out.println("It is Odd!");
		}

		outer:
		for(int i : array1){
			System.out.println(i);
			inner:
			for(int f : array2){
				if(f % 2 == 0){
					continue inner;
				}
				System.out.println(f);
			}
			
		}	
	}
*/

/* //Labeled Break
	public static void labeledBreak(){
		int array1[] = {0,1,2,3,4};
		int array2[] = {0,1,2,3,4};
		label:
			for(int i : array1){
				System.out.println("Let's go!");
				System.out.println(i);
				for(int f : array2){
					System.out.println(f);
					if(f >= 3){
						System.out.println("Life is over");
						break label;
					}
				}
			}
	}
*/

/* //Ternary Operator
	public static void ternaryOp(int i){
		String _phrase = "";
		_phrase = (i > 0) ? "Greater than zero" : (i == 0) ? "Equal to zero" : "Less than zero";
		System.out.println(_phrase);
	}
*/

}