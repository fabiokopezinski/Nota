package pucrs.s2b.exemplo03;

import static org.junit.Assert.*;

public class Medias {

	public static String nota(double a, double b) {

		double nota;
		nota = (a + b) / 2;
		if (nota >= 7.0) {
			return "Aprovado";
		} else if (nota >= 4.0) {
			return "Em exame";
		} else {
			return "Reprovado";
		}

	}

}
