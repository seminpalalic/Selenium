package Transformation;

public class GenderTransformation {

    public static String getElementName(String gender){
        switch (gender){
            case "Male":
                return "Male";
            case "Female":
                return "Female";
            default:
                return "";
        }
    }

}
