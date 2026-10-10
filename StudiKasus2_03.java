import java.util.Scanner;
public class StudiKasus2_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();

        System.out.print("Masukkan nama kegiatan: ");
        String namaKegiatan = scanner.nextLine();

        System.out.print("Masukkan jumlah dokmen upload: ");
        int jmlDokumenUpload = scanner.nextInt();

        System.out.print("Masukkan peringkat juara: ");
        int peringkatJuara = scanner.nextInt();

        System.out.print("Masukkan status pendanaan PKM: ");
        int statusPendanaanPKM = scanner.nextInt();

        boolean lolosPKM = statusPendanaanPKM == 1;

        if (namaKegiatan.equalsIgnoreCase("BELMAWA")
                || namaKegiatan.equalsIgnoreCase("BAKORMA")
                || namaKegiatan.equalsIgnoreCase("Mandiri")) {
            if (jmlDokumenUpload <= 4) { 
                if (lolosPKM) {
                    System.out.println("Mendapatkan dana penghargaan");
                } else {
                    System.out.println("Tidak mendapatkan dana penghargaan");
                }
                } else {
                   System.out.println("Tidak mendapatkan dana penghargaan"); 
                }
                } else {
                    System.out.println("Tidak mendapatkan dana penghargaan");
                }
            }
            
             }
