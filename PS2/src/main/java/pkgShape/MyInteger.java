package pkgShape;

public class MyInteger {
	
	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.setiValue(iValue);
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	public boolean isEven() {
		if(iValue % 2 == 0) 
		
			return true;
		else 
			return false;
		
		
	}
	public boolean isOdd() {
		if(iValue % 2 == 1)
			return true;
		else
			return false;
		
	}
	public boolean isPrime() {
		for(int x = 2; x < iValue; x++) {
			if(iValue % x == 0)
				return false;
		}
		return true;
	}
		
	public static boolean isEven(int iValue) {
		if(iValue % 2 == 0) 
			
			return true;
		else 
			return false;
	}
	
	public static boolean isOdd(int iValue) {
		if(iValue % 2 == 1)
			return true;
		else
			return false;
		
	}
	public static boolean isPrime(int iValue) {
		for(int x = 2; x < iValue; x++) {
			if(iValue % x == 0)
				return false;
		}
		return true;
		
		
	}

	public static boolean isEven(MyInteger iValue) {
		return MyInteger.isEven(iValue.getiValue());
		
	}
	public static boolean isOdd(MyInteger iValue) {
		return MyInteger.isOdd(iValue.getiValue());
	}
	public static boolean isPrime(MyInteger iValue) {
		return MyInteger.isPrime(iValue.getiValue());
	}
	public boolean equals(int iValue) {
		return getiValue() == iValue;
	}
	public boolean equals(MyInteger iValue) {
		return equals(iValue.getiValue());
	}
	
}

	
	