public class Lab04 {
    static int FindMax(int a, int b) {
        if (a>b) {
            return a;
        }
        else {
            return b;
        }
    }
    static int FindMin(int[] ar, int n) {
        int min = ar[0];
        for (int i=1; i<n; i++) {
            if (ar[i] < min) {
                min = ar[i];
            }
        }
        return min;
    }
    static String BMI(float weight, float height) {
        float bmi = weight / (height*height);
        if (bmi < 18.5) return "Thieu can";
        else if (18.5 <=bmi && bmi <23) return "Binh thuong";
        else if (23<= bmi && bmi <=24.99) return "Thua can";
        else if (bmi >=25) return "Beo phi";
        else return "Khong xac dinh";
    }
}
