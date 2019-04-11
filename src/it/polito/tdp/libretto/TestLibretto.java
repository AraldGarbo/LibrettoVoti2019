package it.polito.tdp.libretto;

import java.time.*;

public class TestLibretto {

	public static void main(String[] args) {
		
		Libretto libr = new Libretto();
		
		libr.add(new Voto(30,"Analisi 1", LocalDate.of(2017, 01, 25)));
		libr.add(new Voto(21,"Fisica 1", LocalDate.of(2017, 06, 25)));
		libr.add(new Voto(25,"Analisi 2", LocalDate.of(2018, 01, 28)));
		libr.add(new Voto(28,"Fisica 2", LocalDate.of(2018, 01, 29)));
		libr.add(new Voto(18,"Geometria ", LocalDate.of(2017, 01, 25)));
		libr.add(new Voto(20,"Ricerca Operativa", LocalDate.of(2018, 06, 24)));
		libr.add(new Voto(25,"Economia", LocalDate.of(2017, 01, 25)));
		libr.add(new Voto(24,"Complementi di Economia", LocalDate.of(2018, 12, 27)));
		libr.add(new Voto(25,"Logistica", LocalDate.of(2017, 9, 17)));
		libr.add(new Voto(27,"Programmazione a Oggetti", LocalDate.of(2019, 01, 21)));
		
		
	}

}
