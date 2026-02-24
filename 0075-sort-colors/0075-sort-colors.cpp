class Solution {
public:
    void sortColors(vector<int>& nums) {
        int a=0;
        int b=0;
        int c=0;
        for(int i : nums){
            if(i == 0) a++;
            if(i == 1) b++;
            if(i == 2) c++;
        }
        // cout<<a<<b<<c;
        for(int i=0; i<a; i++){
            nums[i] = 0;
        }
        for(int i=a; i<a+b; i++){
            nums[i] = 1;
        }
        
        for(int i=a+b; i<a+b+c; i++){
            nums[i] = 2;
        }
        
    }
};