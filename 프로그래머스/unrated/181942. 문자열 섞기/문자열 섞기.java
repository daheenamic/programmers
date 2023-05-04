class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        char[] str1arr = str1.toCharArray();
        char[] str2arr = str2.toCharArray();
        for(int i = 0; i < str1arr.length; i++) {
            answer += str1arr[i] + "" + str2arr[i];
        }
        return answer;
    }
}