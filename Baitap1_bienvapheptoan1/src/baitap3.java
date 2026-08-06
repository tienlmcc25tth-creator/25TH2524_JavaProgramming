
public class baitap3 {
	public static void main (String[] args) {
		//BMI = cân nặng (kg) / (chiều cao (m) * chiều cao (m))
		double weight =60.5; //kg
		double height =1.74; //m
		
		double bmi = weight / (height * height);
		
		System.out.println("cân nặng:" + weight + "kg");
		System.out.println("chiều cao:" + height + "m");
		System.out.println("chỉ số BMI:" + bmi);
		
		//phân loại BMI
		if(bmi < 18.5) {
			System.out.println("phân loại: thiếu cân");
		} else if (bmi <25) {
			System.out.println("phân loại: bình thường");
		} else if (bmi <30) {
			System.out.println("phân loại: thừa cân");
		} else {
			System.out.println("phân loại: béo phì");
		}
	}

}
