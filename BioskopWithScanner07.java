import java.util.Scanner;

public class BioskopWithScanner07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, pilihan;
        String nama, next;

        String[][] penonton = new String[4][2];

       // while (true) {
           // System.out.print("Masukkan nama: ");
            // nama = sc.nextLine();
            //System.out.print("Masukkan baris: ");
            //baris = sc.nextInt();
            //System.out.print("Masukkan kolom: ");
            //kolom = sc.nextInt();
            //sc.nextLine();

            //penonton[baris-1][kolom-1] = nama;

            //System.out.print("Input penonton lainnya? (y/n): ");
            //next = sc.nextLine();

            //if (next.equalsIgnoreCase("n")) {
              //  break;
            //}
        //}

          do {
            System.out.println("=======MENU BIOSKOP=======");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // menghindari newline error

            switch (pilihan) {

                case 1:
                    // MENU 1 → Input penonton
                    System.out.print("Masukkan nama penonton: ");
                    nama = sc.nextLine();

                    //System.out.print("Masukkan nomor baris (0-3): ");
                    //baris = sc.nextInt();

                    //System.out.print("Masukkan nomor kolom (0-1): ");
                    //kolom = sc.nextInt();
                    //sc.nextLine();

                    while (true) {
        System.out.print("Masukkan nomor baris (0-3): ");
        baris = sc.nextInt();

        System.out.print("Masukkan nomor kolom (0-1): ");
        kolom = sc.nextInt();
        sc.nextLine();

        // Validasi baris & kolom tidak tersedia
        if (baris < 0 || baris >= 4 || kolom < 0 || kolom >= 2) {
            System.out.println("ERROR: Nomor baris/kolom tidak tersedia! Coba lagi.\n");
            continue; 
        }


        if (penonton[baris][kolom] != null) {
            System.out.println("KURSI SUDAH TERISI oleh \"" + penonton[baris][kolom] + "\".");
            System.out.println("Silakan pilih kursi lain!\n");
        } else {
            penonton[baris][kolom] = nama;
            System.out.println("Data berhasil dimasukkan!\n");
            break; 
        }
    }

    break;

                    //if (baris < 0 || baris >= 4 || kolom < 0 || kolom >= 2) {
                      //  System.out.println("ERROR: Nomor baris atau kolom tidak tersedia!\n");
                    //} else {
                      //  penonton[baris][kolom] = nama;
                        //System.out.println("Data berhasil dimasukkan!\n");
                    //}
                    //break;

                case 2:
                    System.out.println("\nDaftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            //System.out.print(penonton[i][j] + "\t");
                            if (penonton[i][j] == null) {
                System.out.print("***\t");
            } else {
                System.out.print(penonton[i][j] + "\t");
            }

                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!\n");
            }

        } while (pilihan != 3);

        sc.close();
    }
    
}
