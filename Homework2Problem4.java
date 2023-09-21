import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        String s = "cbacdcbc";

        s = RemoveDupLetters(s);

        System.out.println(s);

    }

    public static String RemoveDupLetters(String s) {

        char strArray[] = s.toCharArray();
        Arrays.sort(strArray);
        StringBuilder sb = new StringBuilder();
        sb.append(strArray[0]);
        int index = 0;
        for (char c : strArray) {
            if (c != sb.charAt(index)) {
                sb.append(c);
                index++;
            }
        }

        return sb.toString();
    }

}
