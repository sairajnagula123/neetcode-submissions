class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer>list = new ArrayList<>();   

        int n = nums.length;
        int seen[] = new int[n+1];

        for(int i=0;i<nums.length;i++){ 
            seen[nums[i]]=1;
        }     
        for(int i=1;i<seen.length;i++){
            if(seen[i]==0){
                list.add(i);
            }
        }
        return list;
    }
}