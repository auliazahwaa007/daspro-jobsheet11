import java.util.Scanner;

public class SIAKAD07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();

        int[][] nilai = new int[jumlahSiswa][jumlahMatkul];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("\nInput nilai untuk siswa ke-" + (i + 1) + ":");
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai mata kuliah ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nRata-rata tiap siswa:");
        for (int i = 0; i < jumlahSiswa; i++) {
            int total = 0;
            for (int j = 0; j < jumlahMatkul; j++) {
                total += nilai[i][j];
            }
            double rata2 = (double) total / jumlahMatkul;
            System.out.println("Siswa ke-" + (i + 1) + ": " + rata2);
        }

        System.out.println("\nRata-rata tiap mata kuliah:");
        for (int j = 0; j < jumlahMatkul; j++) {
            int total = 0;
            for (int i = 0; i < jumlahSiswa; i++) {
                total += nilai[i][j];
            }
            double rata2 = (double) total / jumlahSiswa;
            System.out.println("Mata kuliah ke-" + (j + 1) + ": " + rata2);
        }

        sc.close();

        //int[][] nilai = new int[4][3];

        //for (int i = 0; i < nilai.length; i++){
          //  System.out.println("Input nilai mahasiswa ke-" + (i+1));
            //double totalPersiswa = 0;

            //for (int j = 0; j < nilai[i].length; j++){
              //  System.out.println("Nilai mata kuliah " + (j+1) + ": ");
                //nilai[i][j] = sc.nextInt();
                //totalPersiswa += nilai[i][j];
            //}
            //System.out.println("Nilai rata-rata: " + totalPersiswa/3);

            //System.out.println("\n=========================");
            //System.out.println("Rata-rata Nilai setiap mata kuliah; ");

            //for (int j = 0; j < 3; j++){
              //  double totalPerMatkul = 0;

                //for (i = 0; i < 4; i++) {
                 //   totalPerMatkul += nilai[i][j];
                //}
                //System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMatkul / 4);
            //}
        //}
    }
    
}
