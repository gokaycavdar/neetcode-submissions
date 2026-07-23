class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean contains = false;
        HashSet<Integer> list = new HashSet<Integer>();

        for(int number : nums)
        if(list.contains(number)){
            contains = true;
            break;
        }
        else{
            list.add(number);
        }
        return contains;
    }
}