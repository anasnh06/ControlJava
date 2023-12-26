package exercice2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ville[] ville = new Ville[4];
		
		
		ville[0] = new Ville("Eljadida", 200);
		ville[1] = new Ville("Casablanca", 400);
		ville[2] = new Capitale("Maroc","Rabat", 300);
		ville[3] = new Capitale("Italie", "Roma", 500);
		
		for(Ville v: ville) {
			System.out.println(v);
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");
		
		Arrays.sort(ville);
		
		for(Ville v: ville) {
			System.out.println(v);
		}
		
		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");
		
		ville = Arrays.copyOf(ville, ville.length+1);
		ville[ville.length-1] = new Ville("Sidibouzid", 330);
		
		for(Ville v: ville) {
			System.out.println(v);
		}
		
		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");
		
		ville = Arrays.copyOfRange(ville, 1, ville.length);
		
		for(Ville v: ville) {
			System.out.println(v);
		}
		
		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");
		
		Ville[] ville2 = Arrays.copyOf(ville, ville.length);
		
		for(Ville v: ville2) {
			System.out.println(v);
		}
		
		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");
		
		List<Ville> l = new ArrayList<>(Arrays.asList(ville));
		Collections.reverse(l);
		
		ville = l.toArray(new Ville[l.size()]);
		for(Ville v: ville) {
			System.out.println(v);
		}
		
		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");
		
		
	}

}
