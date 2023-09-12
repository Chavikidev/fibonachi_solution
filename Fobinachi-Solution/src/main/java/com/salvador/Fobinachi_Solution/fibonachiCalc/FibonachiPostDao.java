package com.salvador.Fobinachi_Solution.fibonachiCalc;

//Json parse bean dao
public class FibonachiPostDao {

	//Declared index to search the fobinachi
	private Integer indexParam;


	//Getters and setters
    public Integer getIndexParam() {
		return indexParam;
	}


	public void setIndexParam(Integer indexParam) {
		this.indexParam = indexParam;
	}

	//Overrides the toString method for a customized to string return value
	@Override
    public String toString() {
        return "indexParam =" + indexParam;
    }
}