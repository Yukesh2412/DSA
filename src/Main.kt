import java.util.ArrayList

fun main(){
    var arr= intArrayOf(4,5,2,2,3,3)

    var obj=Solution()
    print(obj.smallerNumbersThanCurrent(arr))
//    println(obj.arr)
}
class Solution {
    fun smallerNumbersThanCurrent(arr: IntArray): IntArray {
        var nums=arr
        val n = nums.size
        var count = IntArray(maxfind(nums)+1)
        var output=IntArray(n)


        for (i in 0 until count.size){
            count[i]=0
        }

        for( i in 0 until nums.size){
            count[nums[i]]++
        }

        for(i in 1 until count.size){
            count[i]=count[i]+count[i-1]
        }
        //original nums
        //cum freq count

        for (i in nums.size-1 downTo 0){
            var value=nums[i]
            var index=count[value]-1
            count[value]--
            output[index]=value
        }


     return output
    }

    fun maxfind(arr:IntArray):Int{
        var max=arr[0]

        for(i in 0 until arr.size){
            if(arr[i]>max) {
                max=arr[i]
            }
    }
        return max
    }
}
