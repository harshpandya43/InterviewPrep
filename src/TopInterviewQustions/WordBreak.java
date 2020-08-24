package TopInterviewQustions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordBreak w = new WordBreak();
		String s = "leetcode";
		List<String> wordDict = new ArrayList<>();
		wordDict.add("leet");
		wordDict.add("code");
		System.out.println(w.wordBreak(s, wordDict));
	}
	
	public boolean wordBreak(String s, List<String> wordDict) {
		Set<String> wordDictSet = new HashSet(wordDict);
		Queue<Integer> queue = new LinkedList<>();
		int[] visited = new int[s.length()];
		queue.add(0);
		
		while(!queue.isEmpty()) {
			int start = queue.poll();
			if(visited[start] == 0) {
				for(int i=start+1;i<=s.length();i++) {
					if(wordDictSet.contains(s.substring(start, i))) {
						queue.add(i);
						if(i==s.length()) {
							return true;
						}
					}
				}
			}
			visited[start] = 1;
		}
		return false;
	}

}
