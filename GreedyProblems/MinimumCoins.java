import java.util.*;
public class MinimumCoins {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for(int i=1; i<=amount; i++){
            for(int j=0; j<coins.length; j++){
                if(i-coins[j] >= 0){
                    dp[i] = Math.min(dp[i], 1+dp[i-coins[j]]);
                }
            }
        }
        return dp[amount] == amount+1 ? -1 : dp[amount];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] coins = new int[n];
        for(int i=0; i<n; i++){
            coins[i] = sc.nextInt();
        }
        int amount = sc.nextInt();
        System.out.println(coinChange(coins, amount));
    }
}