package probelms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class RankTeamsByVotesCalculator {
	 private ArrayList<Character> storageOfTeams;
	 private HashMap<Character, int[]> teamRecords;
	 private String[] inputVotes;
	 
	 public RankTeamsByVotesCalculator(String[] inputVotes) {
		 this.storageOfTeams = new ArrayList<Character>();
		 this.teamRecords = new HashMap<Character, int[]>();
		 this.inputVotes = inputVotes;
	 }
	 
	 public String calculate() {
		 initailizeHashMapandAddTeams(teamRecords,storageOfTeams, inputVotes);
		 updateRecords(teamRecords,inputVotes);
		 sort(storageOfTeams);
		 String res = concatSortedCharacters(storageOfTeams);
		 return res;
	 }

	private String concatSortedCharacters(ArrayList<Character> storageOfTeams2) {
		String res = "";
		for(Character somechar : storageOfTeams2) {
			res += somechar;
		}
		return res;
	}

	private void sort(ArrayList<Character> storageOfTeams2 ) {
	     Comparator<Character> ac = new Comparator<>() {
            @Override
            public int compare(Character a, Character b) {
                return customComparebyArray(a,b, teamRecords);
            }
         };
         Collections.sort(storageOfTeams2, ac);
	}
	private int customComparebyArray(Character a, Character b, HashMap<Character, int[]> teamRecords) {
		int[] extractA = teamRecords.get(a);
        int[] extractB = teamRecords.get(b);
        for(int i = 0; i < extractA.length; i++ ) {
            if(extractA[i] ==  extractB[i]) {
                continue;
            }else if(extractA[i] >  extractB[i]){
                return -1;
            }else{
                return 1;
            }
        }
        int res = Character.compare(a,b);
        if(res > 0) {
            return 1;
        }
        return -1;
	}

	private void updateRecords(HashMap<Character, int[]> teamRecords2,String[] inputVotes2) {
		for(int i = 0; i < inputVotes2.length; i++) {
            String currString = inputVotes2[i];
            for(int j = 0; j < currString.length(); j++) {
                Character key = currString.charAt(j);
                int[] arr = teamRecords2.get(key);
                arr[j] += 1;
                teamRecords2.put(key, arr);
            }
        }
		
	}

	private void initailizeHashMapandAddTeams(HashMap<Character, int[]> teamRecords2,ArrayList<Character> storageOfTeams2, String[] votes) {
		
		for(int start = 0; start< votes[0].length(); start++) {
	       Character extract = votes[0].charAt(start);
	       int[] arr = new int[votes[0].length()];
	       teamRecords2.putIfAbsent(extract,arr);
	       storageOfTeams2.add(extract);
	    }
		
		
	}
	 
}
