class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i=0; i<array.length; i++) {
            String tmpStr = Integer.toString(array[i]) + ",";
            for (int j=0; j<tmpStr.length(); j++) {
                if (tmpStr.charAt(j) == '7')    answer++;
            }
        }
        return answer;
    }
}