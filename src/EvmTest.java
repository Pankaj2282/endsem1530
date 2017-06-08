import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EvmTest {

	Evm a,b;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetConstinuency() {
		a=new Evm(1,"siolim");
		assertEquals("siolim",a.getConstinuency());
		
		b=new Evm(2,"ponda");
		assertEquals("ponda",b.getConstinuency());
	}


}
