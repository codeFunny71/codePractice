public class Practice {

    public int numJewelsInStones(String J, String S) {
        int result = 0;
        for (int i = 0; i < S.length(); i++) {
            if (J.indexOf(S.charAt(i)) >= 0) {
                result++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        String j = "Aaa";
        String s = "aAAaBBab";
        int result = new Practice().numJewelsInStones(j,s);
        System.out.println(result);
    }


}
