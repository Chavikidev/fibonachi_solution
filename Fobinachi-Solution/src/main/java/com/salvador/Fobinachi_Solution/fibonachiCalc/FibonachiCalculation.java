package com.salvador.Fobinachi_Solution.fibonachiCalc;

public final class FibonachiCalculation {

	//PRivate index value
	private int index=0;

	/**
	 * Constructor
	 */
	public FibonachiCalculation() {
		super();
	}

	/**
	 * Constructor with params
	 * @param index
	 */
	public FibonachiCalculation(int index) {
		super();
		this.index = index;
	}

	//Getters and setters
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	/**
	 * Function to calculate the fobinacci number
	 * from a given index value
	 * @param indexFib
	 * @return
	 */
	public static int generateFibonachiSeries(int indexFib) {
		//Declares initial values
		int beforeVal=0;
		int retIntFibonachi=0;
		try {

			/**
			 * Fobinachi loop
			 */
			for(int i=0;i<indexFib+1;i++) {
				if(i==0) {
					//Checks that all variables stay with a 0 value
					System.out.println("First i loop value (all vareiables to 0)");
				}else if(i==1) {
					//Sets before value to 0
					beforeVal=0;
					//Adds value to fibonachi return variable
					retIntFibonachi=retIntFibonachi+i;
				}else {
					//Sets the value of the fibonachi return value and adds the saved value
					retIntFibonachi=retIntFibonachi+beforeVal;
					//Sets the saved value to store the nex iteration value set
					beforeVal=retIntFibonachi-beforeVal;
				}
				//Logs the fibonachi response value
				System.out.println(Integer.toString(retIntFibonachi));
			}
			
		}catch(Exception e) {
			//Catchs the exception in case of an error
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		//Returns the fibonachi calculated value from the given index
		return retIntFibonachi;
	}
	
}
