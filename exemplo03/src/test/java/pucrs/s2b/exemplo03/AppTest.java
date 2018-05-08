package pucrs.s2b.exemplo03;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;
import org.junit.runner.RunWith;

import org.junit.Test;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class AppTest {
	double a, b;

	@Test
	@Parameters({ "5,5" })
	public void TestFiveandFiveGivesExam(double a, double b) throws Exception {
		String expected = "Em exame";
		assertEquals(expected, Medias.nota(a, b));
	}

	@Test
	@Parameters({ "7,7" })
	public void TestSevenandSevenGivesExam(double a, double b) throws Exception {
		String expected = "Aprovado";
		assertEquals(expected, Medias.nota(a, b));
	}

	@Test
	@Parameters({ "3,3" })
	public void TestTreeandTreeGivesExam(double a, double b) throws Exception {
		String expected = "Reprovado";
		assertEquals(expected, Medias.nota(a, b));
	}
	@Test
	@Parameters({ "3.99,3.99" })
	public void TestTree99andTree99GivesExam(double a, double b) throws Exception {
		String expected = "Reprovado";
		assertEquals(expected, Medias.nota(a, b));
	}
	@Test
	@Parameters({ "3.999,4.001" })
	public void TestTree99andFour01GivesExam(double a, double b) throws Exception {
		String expected = "Em Exame";
		assertEquals(expected, Medias.nota(a, b));
	}
}
