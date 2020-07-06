import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistantSubSequence {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        String t = bf.readLine();

        Solution sol = new Solution();

        System.out.println(sol.numDistint(s, t));

    }

    static class Solution {
        public int numDistint(String S, String T) {

            int dp[][] = new int[T.length() + 1][S.length() + 1];

            for (int j = 0; j < S.length(); j++) {
                dp[0][j] = 1;

            }

            for (int i = 0; i < T.length(); i++) {
                for (int j = 0; j < S.length(); j++) {
                    if (T.charAt(i) == S.charAt(j)) {
                        dp[i + 1][j + 1] = dp[i][j] + dp[i + 1][j];

                    } else {
                        dp[i + 1][j + 1] = dp[i + 1][j];
                    }
                }
            }

            return dp[T.length()][S.length()];

        }
    }

}
