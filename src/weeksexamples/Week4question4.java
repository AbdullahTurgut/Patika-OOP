package weeksexamples;

public class Week4question4 {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }

    public static String sortSentence(String str) {
        // 1.adım cümleyi ayırma
        // " is2 sentence4 This1 a3"
        String[] array = str.split(" "); // boşluk görene kadar stringi ayırdık ve array dizisine attık
        String[] result = new String[array.length]; // result adında bir string array

        for (String element : array) {
            char ch = element.charAt(element.length() - 1);
            System.out.println(ch);
            int index = Character.getNumericValue(ch) - 1;
            System.out.println(index);
            result[index] = element.substring(0, element.length() - 1);

        }
        String output = "";
        for (String element : result) {
            output += " " + element;
        }
        return output;
    }
}
