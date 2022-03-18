package homework5;

public class BMI {
    public static void main(String[] args) {
        float BodyMass = 76;
        double Height = 1.75;
        double BMI = BodyMass/Math.pow(Height,2);
         System.out.println("Вашият BMI е:" + BMI ); //Вариант 1 - Принтира резултата без закръгляне;
         System.out.printf("Вашият BMI е:" +"%.2f", BMI ); // Вариант 2 - Принтира резултата със закръгляне до втория знак след десетичната запетая;
        System.out.println("\nYour BMI value: " + BMI );  //  Вариант 3 - Тук се поразрових малко повече в интернет,
                                                              // защото ми беше интересно как ще отпечата в кои граници се намираме :)

        if(BMI < 18.5)
            System.out.println("You are underweight!");
        else if(BMI < 25)
            System.out.println("You are normal:)");
        else if(BMI < 30)
            System.out.println("You are overweight!");
        else
            System.out.println("You are obese!");




    }
}
