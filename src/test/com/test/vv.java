package test.com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/*
 * 1)	Election Winner: Provide the implementation for the function which will find out the winner. 
 * An array contains the list of candidates names of polled votes will be provided. 
 * The function should return the name of the candidate who wins. 
 * If more than one candidate gets same highest numbers of votes then sort their names in alphabetical order 
 * and winner should be the last name in the order.
Example Input : {joe,mon,joe,mon,rach,rach,rach,phoe,phoe,phoe}
Output : rach

 * */
public class vv {

	public static void main(String[] args) {

		String arr[] = { "joe", "mon", "joe", "mon", "rach", "rach", "phoe", "phoe", "que", "que", "que" };

		String winner = findElectionWinner(arr);
		System.out.println(winner);

	}

	private static String findElectionWinner(String[] votes) {

		String winner = null;
		List<String> tieList = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		int oldWinner = 0;
		int newWinner = 0;
		Arrays.sort(votes);
		for (String str : votes) {
			if (null != str) {
				if (null != map.get(str)) {
					map.put(str, map.get(str) + 1);
				} else {
					map.put(str, 1);
				}
			}
		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			newWinner = entry.getValue();
			if (oldWinner <= newWinner) {
				winner = entry.getKey();
				if (oldWinner < newWinner) {
					tieList.removeAll(tieList);
				}
				tieList.add(winner);
				oldWinner = newWinner;
			}
		}
		/*for (String str : tieList) {
			System.out.print(str + " l");
		}
		System.out.println();
		Collections.sort(tieList);
		winner = tieList.get(tieList.size() - 1);*/
		return winner;
	}

}
