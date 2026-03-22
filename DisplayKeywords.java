
import javax.lang.model.SourceVersion;

public class DisplayKeywords {

    public static void main(String[] args) {

        String[] words = {
            "abstract","assert","boolean","break","byte",
            "case","catch","char","class","const",
            "continue","default","do","double","else",
            "enum","extends","final","finally","float",
            "for","goto","if","implements","import",
            "instanceof","int","interface","long","native",
            "new","package","private","protected","public",
            "return","short","static","strictfp","super",
            "switch","synchronized","this","throw","throws",
            "transient","try","void","volatile","while",
            "record","sealed","permits","yield","var"
        };

        System.out.println("Java Keywords:\n");

        for (String word : words) {

            if (SourceVersion.isKeyword(word)) {
                System.out.println(word);
            }

        }
    }
}