class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0, s)
            + overwrite_string + my_string.substring(s + overwrite_string.length());
        // my_string = He11oWorl1d, overwrite_string = lloWorl, s = 2 일 때
        // 1. my_string을 인덱스 0부터 s까지 자른다. (0부터 s-1까지만 출력) - He
        // 2. overwrite_string을 붙여주고 - He + lloWorl
        // 3. my_string의 인덱스 (s + overwrite_string의 길이 = 2 + 7 = 9) 만큼 자른 뒤에 문자를 붙여준다.
        // - He + lloWorl + d
        return answer;
    }
}

// substring(n)을 하면 index가 n인 위치의 문자를 포함한 뒤의 문자를 출력한다.