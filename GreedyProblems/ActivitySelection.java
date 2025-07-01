import java.util.*;
public class ActivitySelection{
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a,b) -> Integer.compare(a[1],b[1]));
        int prev = pairs[0][1];
        int ans = 1;
        for(int i=1; i<pairs.length; i++){
            if(prev < pairs[i][0]){
                ans++;
                prev = pairs[i][1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}