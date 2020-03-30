package Transformation;

import cucumber.api.Transformer;

public class TitleTransformation {

    public static String transform(String title) {
        switch (title){
            case "Mr.":
                return "1";
            case "Ms.":
                return "2";
            default:
                return "";
        }
    }
}
