class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int sol[]= new int[2];
        // int sum =0;
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //        sum=nums[i]+nums[j];
        //        if(sum==target){
        //         sol[0]=i;
        //         sol[1]=j;
        //        }
        //     }
        // }
        // return sol;


        int sol1[] = new int [2];
        int m=0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m = target-nums[i];
            if(mp.containsKey(m)){
                sol1[0]=mp.get(m);
                sol1[1]=i;
            }
            else{
                mp.put(nums[i],i);
            }
        }
        return sol1;
    }
}
