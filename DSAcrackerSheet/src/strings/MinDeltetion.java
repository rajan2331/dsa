package strings;

import java.util.HashSet;
import java.util.Set;

public class MinDeltetion {

	public static void main(String[] args) {
		System.out.println(minDeletions("aaabbbcc"));
	}

public  static int minDeletions(String s) {
    int cnt[] = new int[26];
    for(int i = 0; i < s.length(); i++) {
        cnt[s.charAt(i) - 'a']++;
    }
    int ans = 0;
    Set<Integer> set = new HashSet<>();
    for(int i = 0; i < 26; i++) {
        if(cnt[i] == 0) continue;
        if(set.contains(cnt[i])) {
            int tmp = cnt[i];
            while(set.contains(tmp)) {
                tmp--;
                ans++;
            }
            if(tmp != 0) {
             set.add(tmp);
            }
        } else {
           set.add(cnt[i]);
        }
    }
    return ans;
    
}
}