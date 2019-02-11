import static org.junit.Assert.*;

import org.junit.Test;

public class Circulo_GMLTest {

	@Test
	public final void AreaTest1()
	{
		Circulo_GML cir = new Circulo_GML(7, null);
		double a = cir.area();
		assertEquals(153.9384, a, 0);
	}
	@Test
	public final void AreaTest2()
	{
		Circulo_GML cir = new Circulo_GML(0, null);
		double a = cir.area();
		assertEquals(0, a, 0);
	}
	@Test
	public final void AreaTest3()
	{
		Circulo_GML cir = new Circulo_GML(-3, null);
		double a = cir.area();
		assertEquals(28.2744, a, 0);
	}
	@Test
	public final void DiametroTest()
	{
		Circulo_GML cir = new Circulo_GML(5, null);
		double p = cir.perimetro();
		assertEquals(31.416, p, 0);
	}
}
