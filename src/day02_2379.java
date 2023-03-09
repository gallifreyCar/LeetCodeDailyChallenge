public class day02_2379 {


    public static void main(String[] args) {
        Solution2379 solution2379 = new Solution2379();
        String blocks = "WBBWWWWBBWWBBBBWWBBWWBBBWWBBBWWWBWBWW";
        int k = 15;
        System.out.println(solution2379.minimumRecolors(blocks, k));
    }

}

class Solution2379 {
    public int minimumRecolors(String blocks, int k) {
        char[] str = blocks.toCharArray();
        int right = k - 1;
        int count = 0;
        int min = 0;


        for (int left = 0; left <= right; left++) {
            if (str[left] == 'W') {
                count++;
                min = count;
            }
        }
        right++;
        for (int left = 1; left <= str.length - k; left++) {
            if (str[left - 1] == 'W' && str[right] == 'B') {
                min = Math.min(count - 1, min);
                count--;
            }

            if (str[left - 1] == 'B' && str[right] == 'W') {
                count++;
            }

            right++;
        }

        return min;
    }


}