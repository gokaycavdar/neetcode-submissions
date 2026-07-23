class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> firstSet = new HashMap<>();
        Map<Character, Integer> secondSet = new HashMap<>();

        char[] firstArray = s.toCharArray();
        char[] secondArray = t.toCharArray();

        for(char c : firstArray){
            if(firstSet.containsKey(c)){
                firstSet.put(c,firstSet.get(c) + 1);
            }
            else{
                firstSet.put(c, 1);
            }
        }
        for(char m : secondArray){
            if(secondSet.containsKey(m)){
                secondSet.put(m,secondSet.get(m) + 1);
            }
            else{
                secondSet.put(m, 1);
            }
        }

        return firstSet.equals(secondSet);
    }
}
