package it.polito.tdp.libretto;

import java.time.*;
import java.util.*;

public class Libretto {
	
	private List<Voto> voti;

	public Libretto() {
		this.voti = new ArrayList<Voto>();
	}
	
	public void add(Voto v) {
		voti.add(v);
	}
	
	
}
