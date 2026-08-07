class Solution {
    public boolean isAnagram(String s, String t) {
    //     if(s.length()!=t.length()){
    //         return false;
    //     }
    //   char ch [] = s.toCharArray();
    //   char ch1[] = t.toCharArray();

    //   Arrays.sort(ch);
    //   Arrays.sort(ch1);

    //   for(int i=0;i<ch.length;i++){
    //     if(ch[i]!=ch1[i]){
    //         return false;
    //     }
    //   }

    //   return true;

    HashMap<Character,Integer> mp = new HashMap<>();

    for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if(mp.containsKey(ch)){
            mp.put(ch,mp.get(ch)+1);
        }else{
            mp.put(ch,1);
        }
    }

     for(int i=0;i<t.length();i++){
        char ch = t.charAt(i);
        if(mp.containsKey(ch)){
            if(mp.get(ch)>0){
                mp.put(ch,mp.get(ch)-1);
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
     }
     Set<Character> set = mp.keySet();

     for(char s1:set){
        if(mp.get(s1)>0){
            return false;
        }
     }
       return true;
    }
}
