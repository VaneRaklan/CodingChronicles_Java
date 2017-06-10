class Constructor{
	Constructor(){
		this(1, 2);
		System.out.println("You have initialized the Constructor Class");
	}
	
	Constructor(int xParam){
		System.out.println("This is the second constructor!");
		System.out.println("---------------");
		System.out.println("You passed in: " + xParam);
	}
	
	Constructor(int xParam, int yParam){
		System.out.println("Your two numbers are " + xParam + " and " + yParam);
	}

}