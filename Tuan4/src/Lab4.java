public class Lab4 {
    public static int findMax(int x, int y){
        return x > y ? x : y;
    }
    public static int findMinArray(int a[]){
        int min = a[0];
        for(int i=1; i< a.length; i++){
            if(min > a[i]){
                min = a[i];
            }
        }
        return  min;
    }
    public static String BMI( float w, float h){
        float bmi = w/(h*h);
        String output = "";
        if(bmi < 18.5){
            output = "Thieu can";
        }else if(bmi >=18.5 && bmi <23){
            output = "Binh thuong";
        }else if(bmi >=23 && bmi < 24.99){
            output = "Thua can";
        }else if(bmi >=25){
            output = "Beo phi";
        }else{
            output = "Error";
        }
        return  output;
    }
}
