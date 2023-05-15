package by.academiapvt;

public class Lambda {
    public static void main(String[] args) {
//        ********* Task1
        String newText1 = "Это тестовый пример 1";
        LambdaString lambdaString = (text)->{
            String text1 = text.toUpperCase();
            return text1;
        };
        System.out.println(lambdaString.text(newText1));
//        ********* Task2
        String newText2 = "абыр";
        String newText3 = "А это пример №3";

        LambdaString lambdaString1 = (text)->{
            String newText = "";
            if (text.length()<5){
                for (int i =0;i<text.length();i++){
                    newText = text.charAt(i) + newText;
                }
            }
            else {
                String textCutted = text.substring(5);
                for (int i =0;i<textCutted.length();i++){
                    newText = textCutted.charAt(i) + newText;
                }
            }
                return  newText;
        };

        System.out.println(lambdaString1.text(newText2));
        System.out.println(lambdaString1.text(newText3));


    }

}
