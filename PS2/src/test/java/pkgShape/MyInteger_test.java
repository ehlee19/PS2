package pkgShape;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
		static MyInteger one = new MyInteger(2);
		static MyInteger two = new MyInteger(3);
		static MyInteger three = new MyInteger(47);
		static MyInteger four = new MyInteger(76);
		static MyInteger five = new MyInteger(1000);
		
		@Test
		public void TestisEven() {
			boolean expectedone = true;
			boolean actualone = one.isEven();
			assertEquals(expectedone, actualone);
			
			boolean expectedtwo = false;
			boolean actualtwo = two.isEven();
			assertEquals(expectedtwo, actualtwo);
			
			boolean expectedthree = false;
			boolean actualthree = three.isEven();
			assertEquals(expectedthree, actualthree);
			
			boolean expectedfour = true;
			boolean actualfour = four.isEven();
			assertEquals(expectedfour, actualfour);
			
			boolean expectedfive = true;
			boolean actualfive = five.isEven();
			assertEquals(expectedfive, actualfive);
			
			MyInteger Integer1 = new MyInteger(5);
			assertFalse(MyInteger.isEven(Integer1));
			
			MyInteger Integer2 = new MyInteger(8);
			assertTrue(MyInteger.isEven(Integer2));
		
}
	
	@BeforeClass
	public static void setUpBeforeClass1() throws Exception {
	}
		static MyInteger uno = new MyInteger(2);
		static MyInteger dos = new MyInteger(3);
		static MyInteger thres = new MyInteger(47);
		static MyInteger cuatro = new MyInteger(76);
		static MyInteger cinco = new MyInteger(1000);
		
		@Test
		public void TestisOdd() {
			boolean expecteduno = false;
			boolean actualuno = uno.isOdd();
			assertEquals(expecteduno, actualuno);
			
			boolean expecteddos = true;
			boolean actualdos = dos.isOdd();
			assertEquals(expecteddos, actualdos);
			
			boolean expectedthres = true;
			boolean actualthres = thres.isOdd();
			assertEquals(expectedthres, actualthres);
			
			boolean expectedcuatro = false;
			boolean actualcuatro = cuatro.isOdd();
			assertEquals(expectedcuatro, actualcuatro);
			
			boolean expectedcinco = false;
			boolean actualcinco = cinco.isOdd();
			assertEquals(expectedcinco, actualcinco);
			
			MyInteger Integer3 = new MyInteger(7);
			assertTrue(MyInteger.isOdd(Integer3));
			
			MyInteger Integer4 = new MyInteger(4);
			assertFalse(MyInteger.isOdd(Integer4));
		}

		@BeforeClass
	public static void setUpBeforeClass2() throws Exception {
		}
			static MyInteger first = new MyInteger(2);
			static MyInteger second = new MyInteger(3);
			static MyInteger third = new MyInteger(47);
			static MyInteger fourth = new MyInteger(76);
			static MyInteger fifth = new MyInteger(1000);
			
			@Test
		public void TestisPrime() {
				boolean expectedfirst = true;
				boolean actualfirst = first.isPrime();
				assertEquals(expectedfirst, actualfirst);
				
				boolean expectedsecond = true;
				boolean actualsecond = second.isPrime();
				assertEquals(expectedsecond, actualsecond);
				
				boolean expectedthird = true;
				boolean actualthird = third.isPrime();
				assertEquals(expectedthird, actualthird);
				
				boolean expectedfourth = false;
				boolean actualfourth = fourth.isPrime();
				assertEquals(expectedfourth, actualfourth);
				
				boolean expectedfifth = false;
				boolean actualfifth = fifth.isPrime();
				assertEquals(expectedfifth, actualfifth);
				
				MyInteger Integer5 = new MyInteger(41);
				assertTrue(MyInteger.isPrime(Integer5));
				
				MyInteger Integer6 = new MyInteger(51);
				assertFalse(MyInteger.isPrime(Integer6));
			}
	
			
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	


}
