测试用例设计的总体原则：
边界值测试：测试数组长度的边界情况，如空数组、只有一个元素的数组、最大长度的数组。
等价类划分：将输入数据分为几个等价类，如：
所有元素都是1的数组。
数组中包含连续的倍数关系。
数组中包含非连续的倍数关系。
数组中元素随机分布，没有明显的倍数关系。
特殊情况测试：测试包含特殊数字的数组，如数组中包含0或负数（虽然题目中明确指出是正整数）。
import org.junit.Assert;
import org.junit.Test;

public class Solution3Test {

    @Test
    public void testLargestDivisibleSubset() {
        Solution3 solution = new Solution3();

        // 测试目的：测试基本功能
        // 测试用例：[1,2,3]
        // 预期输出：[1,2] 或 [1,3]
        int[] nums1 = {1, 2, 3};
        List<Integer> result1 = solution.largestDivisibleSubset(nums1);
        Assert.assertTrue(isSubsetValid(result1, nums1) && result1.size() == 2);

        // 测试目的：测试包含连续倍数关系的数组
        // 测试用例：[1,2,4,8]
        // 预期输出：[1,2,4,8]
        int[] nums2 = {1, 2, 4, 8};
        List<Integer> result2 = solution.largestDivisibleSubset(nums2);
        Assert.assertTrue(isSubsetValid(result2, nums2) && result2.size() == 4);


        // 测试目的：测试空数组
        // 测试用例：[]
        // 预期输出：[]
        int[] nums4 = {};
        List<Integer> result4 = solution.largestDivisibleSubset(nums4);
        Assert.assertTrue(result4.isEmpty());

        // 测试目的：测试只有一个元素的数组
        // 测试用例：[7]
        // 预期输出：[7]
        int[] nums5 = {7};
        List<Integer> result5 = solution.largestDivisibleSubset(nums5);
        Assert.assertTrue(result5.contains(7) && result5.size() == 1);

       
}