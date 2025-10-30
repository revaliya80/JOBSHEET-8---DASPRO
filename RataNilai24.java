import java.util.Scanner;

public class RataNilai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1, j, nilaiMhs;
        float totalNilai, rataNilai;

        while (i <= 5) {
            System.out.println("Mahasiswa ke-" + i);
            totalNilai = 0;
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + "=");
                nilaiMhs = sc.nextInt();
                totalNilai += nilaiMhs;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata nilai mahasiswa ke-" + i + "=" + rataNilai);
            System.out.println();
            i++;
        }
        System.out.println("Program selesai");
    }
}
