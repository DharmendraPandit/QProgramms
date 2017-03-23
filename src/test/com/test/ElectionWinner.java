package test.com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ElectionWinner {

	public static void main(String[] args) {

		String[] candidateNames = { "joe", "mon","mon","mon", "joe", "mon", "rach", "rach", "rach", "phoe", "phoe", "phoe" };
		
		/*
		 * Arrays.stream(candidateNames).collect(Collectors.groupingBy(s -> s))
		 * .forEach((k, v) -> System.out.println(k+" "+v.size()));
		 */
		System.out.println("Winner: "+ getWinner(candidateNames));
	}
	
	static String getWinner(String[] candidateNames){
		List<String> asList = Arrays.asList(candidateNames);
		Set<String> mySet = new HashSet<String>(asList);
		Candidate candidate = null;
		List<Candidate> candidateList = new ArrayList<Candidate>();
		for (String s : mySet) {
			//System.out.println(s + " " + Collections.frequency(asList, s));
			candidate = new Candidate(s, Collections.frequency(asList, s));
			candidateList.add(candidate);
		}
		Collections.sort(candidateList, new CandidateSorting());
		//System.out.println();
		/*for(Candidate can : candidateList){
			System.out.println(can.getName()+" : "+ can.getVote());
		}*/
		//System.out.println();
		//System.out.println("Winner: "+ (candidateList.get(candidateList.size() - 1)).getName());
		return candidateList.get(candidateList.size() - 1).getName();
	}
}

class CandidateSorting implements Comparator<Candidate>{

	@Override
	public int compare(Candidate candidate1, Candidate candidate2) {
		
		int val = (candidate1.getVote() < candidate2.getVote() ? -1 : (candidate1.getVote() == candidate2.getVote() ? 0 : 1));
		if(val != 0){
			return val;
		}
				
		return candidate1.getName().compareToIgnoreCase(candidate2.getName());
	}
}

class Candidate {
	private String name;
	private int vote;

	Candidate(String name, int vote){
		this.name = name;
		this.vote = vote;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVote() {
		return vote;
	}

	public void setVote(int vote) {
		this.vote = vote;
	}
	
	@Override
	public int hashCode(){
		int result = 17;
		result = 31 * result + this.name.hashCode();
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj == this){
			return true;
		}else if(!(obj instanceof Candidate)){
			return false;
		}else{
			Candidate candidate = (Candidate)obj;
			return candidate.getName().equals(this.name);
		}
		
	}
}