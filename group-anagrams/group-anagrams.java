class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
        HashMap<String, Integer> temp = new HashMap<String, Integer>();
        int index = 0;

        for(String word : strs){
            char[] current_word = word.toCharArray();
            Arrays.sort(current_word);
            if(!temp.containsKey(new String(current_word))){
                List<String> a = new ArrayList<String>();
                temp.put(new String(current_word), index);
                index += 1;
                a.add(word);
                result.add(a);
            } else{
                int word_index = temp.get(new String(current_word));
                List<String> current_word_list = result.get(word_index);
                current_word_list.add(word);
            }
        }
        temp.forEach((k,v) -> {
            System.out.println("K = "+k +" v = "+v);
        });
        return result;
    }
}