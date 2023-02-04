import java.util.ArrayList;

/* Convert a decimal number to binary */

public class Solution {
    public static void main(String[] args) {
        int number=47;
        int taregt=47;
        ArrayList<Integer> s =  new ArrayList<>();
        while (number != 0) {
            int temp = number / 2;
            if (temp % 2 == 0) {
                s.add(0);
            } else {
                s.add(1);
            }
            number /= 2;
        }
        StringBuilder sb = new StringBuilder();
        for(int k = s.size()-1 ; k >= 0 ; k--){
            sb.append(s.get(k));
        }
        System.out.println(taregt+" in binary is: "+sb);
    }
}
