const twoSum = function(nums, target) {
    const comp = {};
    for(let i=0; i<nums.length; i++){
        if(comp[nums[i]]>=0){
            return [ comp[nums[i] ] , i]
        }
        comp[target-nums[i]] = i
    }
};
result = twoSum([1,2,3,32,1,2], 4)
// result = [0,2] 
// because: nums[0] + nums[2] = target 

console.log(result)
