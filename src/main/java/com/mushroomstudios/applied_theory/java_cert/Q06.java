package com.mushroomstudios.applied_theory.java_cert;

public class Q06 {
	 private  int passportNo; //line 2

	public int getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}
	 
}


 class Q6_ {
	 public int passportNo; //line 2
	 public static void main(String args []) {
		 Q06 test = new Q06();
		
		 //test.passportNo = 2;
		 System.out.print(test.getPassportNo());
	 }
}
