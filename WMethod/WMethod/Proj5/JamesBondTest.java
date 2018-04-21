package Proj5;

import org.junit.*;
import static org.junit.Assert.*;

public class JamesBondTest {
	JamesBond james = new JamesBond();
	@Test 
	public void testCase1(){
		assertFalse(james.bondRegex("(()"));
	}
	@Test 
	public void testCase2(){
		assertTrue(james.bondRegex("((007)"));
	}
	@Test 
	public void testCase3(){
		assertFalse(james.bondRegex("((07)"));
	}
	@Test 
	public void testCase4(){
		assertFalse(james.bondRegex("((7)"));
	}
	@Test 
	public void testCase5(){
		assertFalse(james.bondRegex("()"));
	}
	@Test 
	public void testCase6(){
		assertFalse(james.bondRegex("())"));
	}
	@Test 
	public void testCase7(){
		assertTrue(james.bondRegex("()007)"));
	}
	@Test 
	public void testCase8(){
		assertFalse(james.bondRegex("()07)"));
	}
	@Test 
	public void testCase9(){
		assertFalse(james.bondRegex("()7)"));
	}
	@Test 
	public void testCase10(){
		assertFalse(james.bondRegex("(0()"));
	}
	@Test 
	public void testCase11(){
		assertTrue(james.bondRegex("(0(007)"));
	}
	@Test 
	public void testCase12(){
		assertFalse(james.bondRegex("(0(07)"));
	}
	@Test 
	public void testCase13(){
		assertFalse(james.bondRegex("(0(7)"));
	}
	@Test 
	public void testCase14(){
		assertFalse(james.bondRegex("(0)"));
	}
	@Test 
	public void testCase15(){
		assertFalse(james.bondRegex("(0))"));
	}
	@Test 
	public void testCase16(){
		assertTrue(james.bondRegex("(0)007)"));
	}
	@Test 
	public void testCase17(){
		assertFalse(james.bondRegex("(0)07)"));
	}
	@Test 
	public void testCase18(){
		assertFalse(james.bondRegex("(0)7)"));
	}
	@Test 
	public void testCase19(){
		assertFalse(james.bondRegex("(00()"));
	}
	@Test 
	public void testCase20(){
		assertTrue(james.bondRegex("(00(007)"));
	}
	@Test 
	public void testCase21(){
		assertFalse(james.bondRegex("(00(07)"));
	}
	@Test 
	public void testCase22(){
		assertFalse(james.bondRegex("(00(7)"));
	}
	@Test 
	public void testCase23(){
		assertFalse(james.bondRegex("(00)"));
	}
	@Test 
	public void testCase24(){
		assertFalse(james.bondRegex("(00))"));
	}
	@Test 
	public void testCase25(){
		assertTrue(james.bondRegex("(00)007)"));
	}
	@Test 
	public void testCase26(){
		assertFalse(james.bondRegex("(00)07)"));
	}
	@Test 
	public void testCase27(){
		assertFalse(james.bondRegex("(00)7)"));
	}
	@Test 
	public void testCase28(){
		assertFalse(james.bondRegex("(000)"));
	}
	@Test 
	public void testCase29(){
		assertTrue(james.bondRegex("(000007)"));
	}
	@Test 
	public void testCase30(){
		assertTrue(james.bondRegex("(00007)"));
	}
	@Test 
	public void testCase31(){
		assertTrue(james.bondRegex("(0007)"));
	}
	@Test 
	public void testCase32(){
		assertTrue(james.bondRegex("(007()"));
	}
	@Test 
	public void testCase33(){
		assertTrue(james.bondRegex("(007(007)"));
	}
	@Test 
	public void testCase34(){
		assertTrue(james.bondRegex("(007(07)"));
	}
	@Test 
	public void testCase35(){
		assertTrue(james.bondRegex("(007(7)"));
	}
	@Test 
	public void testCase36(){
		assertTrue(james.bondRegex("(007)"));
	}
	@Test 
	public void testCase37(){
		assertTrue(james.bondRegex("(007)()"));
	}
	@Test 
	public void testCase38(){
		assertTrue(james.bondRegex("(007)(007)"));
	}
	@Test 
	public void testCase39(){
		assertTrue(james.bondRegex("(007)(07)"));
	}
	@Test 
	public void testCase40(){
		assertTrue(james.bondRegex("(007)(7)"));
	}
	@Test 
	public void testCase41(){
		assertTrue(james.bondRegex("(007))"));
	}
	@Test 
	public void testCase42(){
		assertTrue(james.bondRegex("(007)))"));
	}
	@Test 
	public void testCase43(){
		assertTrue(james.bondRegex("(007))007)"));
	}
	@Test 
	public void testCase44(){
		assertTrue(james.bondRegex("(007))07)"));
	}
	@Test 
	public void testCase45(){
		assertTrue(james.bondRegex("(007))7)"));
	}
	@Test 
	public void testCase46(){
		assertTrue(james.bondRegex("(007)0)"));
	}
	@Test 
	public void testCase47(){
		assertTrue(james.bondRegex("(007)0007)"));
	}
	@Test 
	public void testCase48(){
		assertTrue(james.bondRegex("(007)007)"));
	}
	@Test 
	public void testCase49(){
		assertTrue(james.bondRegex("(007)07)"));
	}
	@Test 
	public void testCase50(){
		assertTrue(james.bondRegex("(007)7)"));
	}
	@Test 
	public void testCase51(){
		assertTrue(james.bondRegex("(007)7007)"));
	}
	@Test 
	public void testCase52(){
		assertTrue(james.bondRegex("(007)707)"));
	}
	@Test 
	public void testCase53(){
		assertTrue(james.bondRegex("(007)77)"));
	}
	@Test 
	public void testCase54(){
		assertTrue(james.bondRegex("(007)1)"));
	}
	@Test 
	public void testCase55(){
		assertTrue(james.bondRegex("(007)1007)"));
	}
	@Test 
	public void testCase56(){
		assertTrue(james.bondRegex("(007)107)"));
	}
	@Test 
	public void testCase57(){
		assertTrue(james.bondRegex("(007)17)"));
	}
	@Test 
	public void testCase58(){
		assertTrue(james.bondRegex("(0070)"));
	}
	@Test 
	public void testCase59(){
		assertTrue(james.bondRegex("(0070007)"));
	}
	@Test 
	public void testCase60(){
		assertTrue(james.bondRegex("(007007)"));
	}
	@Test 
	public void testCase61(){
		assertTrue(james.bondRegex("(00707)"));
	}
	@Test 
	public void testCase62(){
		assertTrue(james.bondRegex("(0077)"));
	}
	@Test 
	public void testCase63(){
		assertTrue(james.bondRegex("(0077007)"));
	}
	@Test 
	public void testCase64(){
		assertTrue(james.bondRegex("(007707)"));
	}
	@Test 
	public void testCase65(){
		assertTrue(james.bondRegex("(00777)"));
	}
	@Test 
	public void testCase66(){
		assertTrue(james.bondRegex("(0071)"));
	}
	@Test 
	public void testCase67(){
		assertTrue(james.bondRegex("(0071007)"));
	}
	@Test 
	public void testCase68(){
		assertTrue(james.bondRegex("(007107)"));
	}
	@Test 
	public void testCase69(){
		assertTrue(james.bondRegex("(00717)"));
	}
	@Test 
	public void testCase70(){
		assertFalse(james.bondRegex("(001)"));
	}
	@Test 
	public void testCase71(){
		assertTrue(james.bondRegex("(001007)"));
	}
	@Test 
	public void testCase72(){
		assertFalse(james.bondRegex("(00107)"));
	}
	@Test 
	public void testCase73(){
		assertFalse(james.bondRegex("(0017)"));
	}
	@Test 
	public void testCase74(){
		assertFalse(james.bondRegex("(07)"));
	}
	@Test 
	public void testCase75(){
		assertTrue(james.bondRegex("(07007)"));
	}
	@Test 
	public void testCase76(){
		assertFalse(james.bondRegex("(0707)"));
	}
	@Test 
	public void testCase77(){
		assertFalse(james.bondRegex("(077)"));
	}
	@Test 
	public void testCase78(){
		assertFalse(james.bondRegex("(01)"));
	}
	@Test 
	public void testCase79(){
		assertTrue(james.bondRegex("(01007)"));
	}
	@Test 
	public void testCase80(){
		assertFalse(james.bondRegex("(0107)"));
	}
	@Test 
	public void testCase81(){
		assertFalse(james.bondRegex("(017)"));
	}
	@Test 
	public void testCase82(){
		assertFalse(james.bondRegex("(7)"));
	}
	@Test 
	public void testCase83(){
		assertTrue(james.bondRegex("(7007)"));
	}
	@Test 
	public void testCase84(){
		assertFalse(james.bondRegex("(707)"));
	}
	@Test 
	public void testCase85(){
		assertFalse(james.bondRegex("(77)"));
	}
	@Test 
	public void testCase86(){
		assertFalse(james.bondRegex("(1)"));
	}
	@Test 
	public void testCase87(){
		assertTrue(james.bondRegex("(1007)"));
	}
	@Test 
	public void testCase88(){
		assertFalse(james.bondRegex("(107)"));
	}
	@Test 
	public void testCase89(){
		assertFalse(james.bondRegex("(17)"));
	}
	@Test 
	public void testCase90(){
		assertFalse(james.bondRegex(")"));
	}
	@Test 
	public void testCase91(){
		assertFalse(james.bondRegex("))"));
	}
	@Test 
	public void testCase92(){
		assertFalse(james.bondRegex(")007)"));
	}
	@Test 
	public void testCase93(){
		assertFalse(james.bondRegex(")07)"));
	}
	@Test 
	public void testCase94(){
		assertFalse(james.bondRegex(")7)"));
	}
	@Test 
	public void testCase95(){
		assertFalse(james.bondRegex("0)"));
	}
	@Test 
	public void testCase96(){
		assertFalse(james.bondRegex("0007)"));
	}
	@Test 
	public void testCase97(){
		assertFalse(james.bondRegex("007)"));
	}
	@Test 
	public void testCase98(){
		assertFalse(james.bondRegex("07)"));
	}
	@Test 
	public void testCase99(){
		assertFalse(james.bondRegex("7)"));
	}
	@Test 
	public void testCase100(){
		assertFalse(james.bondRegex("7007)"));
	}
	@Test 
	public void testCase101(){
		assertFalse(james.bondRegex("707)"));
	}
	@Test 
	public void testCase102(){
		assertFalse(james.bondRegex("77)"));
	}
	@Test 
	public void testCase103(){
		assertFalse(james.bondRegex("1)"));
	}
	@Test 
	public void testCase104(){
		assertFalse(james.bondRegex("1007)"));
	}
	@Test 
	public void testCase105(){
		assertFalse(james.bondRegex("107)"));
	}
	@Test 
	public void testCase106(){
		assertFalse(james.bondRegex("17)"));
	}
}
