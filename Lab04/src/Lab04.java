/*Neu mot phuong thuc duoc khai bao voi tu khoa static thi co the truy cap truc tiep thong qua ten lop
  * ma khong can phai tao ra 1 doi tuong
  */
//Mot phuong thuc static khong the su dung tu khoa this và super

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
    static String BMI(double weight, double height) {
        double bmi;
        bmi = weight / (height*height);
        if (bmi < 18.5) return "Thieu can";
        else if (18.5 <=bmi && bmi <23) return "Binh thuong";
        else if (23<= bmi && bmi <=24.99) return "Thua can";
        else return "Beo phi";

    }
}
