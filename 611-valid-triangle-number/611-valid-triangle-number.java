class Solution {
public int triangleNumber(int[] nums) {
Arrays.sort(nums);
int ans=0;
if (nums.length<=2){
return 0;
}
for (int small=0;small<nums.length-2;small++){
if (nums[small]==0){
continue;
}
int medium=small+1;
int large=medium+1;
while (large<nums.length){
if (nums[small]+nums[medium]>nums[large]){
ans+=large-medium;
large++;
}
else{
medium++;
}
}
}
return ans;

}

}