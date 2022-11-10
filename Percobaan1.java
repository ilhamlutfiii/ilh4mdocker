import java.util.Scanner;

public class Percobaan1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int nilai;

		System.out.println("Masukkan Nilai Ujian (0-100) : ");
		nilai = input.nextInt();

		if (nilai>=0 || nilai<=100) {
			if (nilai >=90 && nilai <=100) {
				System.out.println("Nilai A, EXCELLENT!");
			}else if (nilai >=80 && nilai<=89){
				System.out.println("Nilai B, Pertahankan prestasi Anda!");
			}else if (nilai >=60 && nilai<=79){
				System.out.println("Nilai C, Tingkatkan prestasi Anda!");
			}else if (nilai >=50 && nilai<=59)	{
				System.out.println("Nilai D, Tingkatkan belajar Anda!");
			}else {
				System.out.println("Nilai E, Anda tidak lulus!");
			}
		}else if (nilai<0){
			System.out.println("Nilai yang Anda masukkan kurang dari 0");
		}else if (nilai>100){
			System.out.println("Nilai yang Anda masukkan lebih dari 100");
		}else{
			System.out.println("Nilai yang Anda masukkan tidak valid");
		}
	}	
}		