/**
 * @param {number[]} height
  * @return {number}
   */
   var maxArea = function(height) {
       let left = 0;
           let right = height.length - 1;
               let maxWater = 0;
               
                   while (left < right) {
                           let h = Math.min(height[left], height[right]);
                                   let width = right - left;
                                           maxWater = Math.max(maxWater, h * width);
                                           
                                                   if (height[left] < height[right]) {
                                                               left++;
                                                                       } else {
                                                                                   right--;
                                                                                           }
                                                                                               }
                                                                                               
                                                                                                   return maxWater;
                                                                                                   }; 