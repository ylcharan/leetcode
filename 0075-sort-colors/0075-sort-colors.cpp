class Solution {
public:
    void sortColors(vector<int>& nums) {
        int n = nums.size();
        vector<int>arr;
        int a=0,b=0,c=0;
        for(int i=0;i<n;i++){
            if(nums[i] == 0) a++;
            else if(nums[i] == 1) b++;
            else c++;
        }
        for(int i=0;i<n;i++){
            if(i<a){
                arr.push_back(0);
            }else if(i<a+b){
                arr.push_back(1);
            }else{
                arr.push_back(2);
            }
        }

        nums = arr;
    }
};