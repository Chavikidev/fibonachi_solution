package com.salvador.Fobinachi_Solution.fibonachiCalc;

public final class FibonachiCalculation {

	private static int _index=0;

	/**
	 * 
	 */
	public FibonachiCalculation() {
		super();
	}

	/**
	 * @param index
	 */
	public FibonachiCalculation(int index) {
		super();
		this._index = index;
	}

	public int getIndex() {
		return _index;
	}

	public void setIndex(int index) {
		this._index = index;
	}
	
	public static int generateFibonachiSeries(int indexFib) {
		int beforeVal=0;
		_index=indexFib;
		int retIntFibonachi=0;
		try {

			for(int i=0;i<indexFib+1;i++) {
				if(i==0) {
					
				}else if(i==1) {
					beforeVal=0;
					retIntFibonachi=retIntFibonachi+i;
				}else {
					retIntFibonachi=retIntFibonachi+beforeVal;
					beforeVal=retIntFibonachi-beforeVal;
				}

				
				System.out.println(Integer.toString(retIntFibonachi));
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return retIntFibonachi;
	}
	
}
