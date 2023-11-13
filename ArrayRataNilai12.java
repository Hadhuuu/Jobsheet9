import java.util.Scanner;

public class ArrayRataNilai12 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlmhs=sc.nextInt();
        int[] nilaiMhs = new int [jmlmhs];
        double total = 0, totalulus=0, totaltdk=0;
        double rata2, rata2lls, rata2tdk;
        int jmllulus=0, jmltdklls=0;
        for (int i=0 ; i<nilaiMhs.length ;i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i=0 ; i<nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i]>70) {
                jmllulus++;
            }
            else if (nilaiMhs[i]<=70) {
                jmltdklls++;
            }
        }
        for (int i=0 ; i<nilaiMhs.length; i++) {
            if (nilaiMhs[i]>70) {
                totalulus += nilaiMhs[i];
            }
            else if (nilaiMhs[i]<70) {
                totaltdk += nilaiMhs[i];
            }
            
        }
        rata2lls=totalulus/jmllulus;
        rata2tdk=totaltdk/jmltdklls;
        rata2=total/nilaiMhs.length;
        // System.out.println("Rata-rata nilai =" +rata2);
        System.out.println("Banyak mahasiswa lulus = " +jmllulus);
        System.out.println("Banyak mahasiswa tidak lulus = " +jmltdklls);
        System.out.println("Rata-rata nilai lulus = " +rata2lls);
        System.out.println("Rata-rata nilai tidak lulus = " +rata2tdk);
    }
}