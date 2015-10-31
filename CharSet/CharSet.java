
public class CharSet {
    
    private String s;
    
    // Rep invariant:
    //     s contains no repeated characters;
    //     s is sorted such that s[0] < s[1] < ... < s[s.length()-1]
    // Abstraction function:
    //     represents the set of characters found in s
    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        
        if (obj instanceof String){
            String thisstring = (String) obj;
            int n = s.length();
            if (n == thisstring.length()){
                char[] chara1 = s.toCharArray();
                char[] chara2 = thisstring.toCharArray();
                
                //given that they're supposed to be sorted in non-descending order, each index entry should be the same
                for (int i = 0; i < s.length(); i++){
                    if (chara1[i] != chara2[i]){
                        return false;
                    }
                }
                return true;
            }
            
        }
        return false; 
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((s == null) ? 0 : s.hashCode());
        return result;

}
}
