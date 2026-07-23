class Solution {
    public int[] twoSum(int[] nums, int target) {
        int smaller = 0;
        int bigger = 0;
        HashMap<Integer, Integer> list = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            list.put(nums[i], i);
        }
        for(int z = 0; z < nums.length; z++){
            int num = nums[z];
            int point = target - num;
            if(list.containsKey(point) && z != list.get(point)){
                smaller = z;
                bigger = list.get(point);
                break;
            }
        }
        return new int[]{smaller,bigger};

    }
}
