
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())    return false;
        if(s.equals(t))  return true;
        
        int [] letterCounts = new int [26];
        int [] letterCountt = new int [26];
        for(int i = 0;i < 26;i++)
        {
            letterCounts[i] = 0;
            letterCountt[i] = 0;
        }
        for(int i = 0;i < s.length();i++)
        {
            letterCounts[s.charAt(i)-'a']++;
            letterCountt[t.charAt(i)-'a']++;
        }
        for(int i = 0;i < 26;i++)
        {
            if(letterCounts[i] != letterCountt[i])
                return false;
        }
        return true;
    }
}
