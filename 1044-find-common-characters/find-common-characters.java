class Solution {
    public List<String> commonChars(String[] arr) {
        List<String> a = new ArrayList<>();

        String first = arr[0];

        for (int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);
            String s = String.valueOf(c);

            boolean common = true;

            for (int j = 1; j < arr.length; j++) {
                if (arr[j].contains(s)) {
                
                    arr[j] = arr[j].replaceFirst(s, "");
                } else {
                    common = false;
                    break;
                }
            }

            if (common) {
                a.add(s);
            }
        }

        return a;
    }
}