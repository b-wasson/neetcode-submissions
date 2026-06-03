class Solution {

    public String encode(List<String> strs) {
        StringBuilder output = new StringBuilder("");
        for(String str : strs){
            output.append(str);
            output.append("&+#");
        }
        return output.toString();
    }

    public List<String> decode(String str) {
        StringBuilder output = new StringBuilder("");
        List<String> list = new ArrayList<>();
        int left = 0;
        for(int i = 0; i < str.length() - 2; i++){
            if(str.charAt(i) == '&' &&
                str.charAt(i+1) == '+' &&
                str.charAt(i+2) == '#'){
                    //now i have to split it 
                while(left < i){
                    output.append(str.charAt(left));
                    left++;
                }
                list.add(output.toString());
                output.setLength(0);
                left = i + 3;
            }

        }

        return list;
    }
}
