package leetcode.editor.en.Day4_5PrefixSumExercises;

import java.util.*;

public class ProductOfTheLastKNumbers {

    //leetcode submit region begin(Prohibit modification and deletion)
    class ProductOfNumbers {

        ArrayList<Integer> prePro = new ArrayList<>();

        public ProductOfNumbers() {
            prePro.add(1);
        }
        
        public void add(int num) {
            if (num == 0) {
                prePro.clear();
                prePro.add(1);
                return;
            }
            int n = prePro.size();
            prePro.add(prePro.get(n - 1) * num);
        }
        
        public int getProduct(int k) {
            int n = prePro.size();
            if (k > n - 1) {
                return 0;
            }
            return prePro.get(n - 1) / prePro.get(n - k - 1);
        }
    }
    
    /**
     * Your ProductOfNumbers object will be instantiated and called as such:
     * ProductOfNumbers obj = new ProductOfNumbers();
     * obj.add(num);
     * int param_2 = obj.getProduct(k);
     */
    //leetcode submit region end(Prohibit modification and deletion)

}