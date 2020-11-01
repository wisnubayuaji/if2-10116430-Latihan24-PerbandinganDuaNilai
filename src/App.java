/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */
public class App {
    public static void main(String[] args) throws Exception {

    int jumlahMahasiswa, jml, nilai[];
    double rata, totalNilai = 0;
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan Jumlah Mahasiswa : ");
    jumlahMahasiswa = input.nextInt();
    
    nilai = new int[jumlahMahasiswa];
    
    for(int i=0;i<= jumlahMahasiswa-1;i++){
        System.out.print("Nilai Mahasiswa " + (i+1) + " : ");
        nilai[i] = input.nextInt();
        System.out.println();
    }
    
    for(int j=0;j<= jumlahMahasiswa-1;j++){
        totalNilai = totalNilai + nilai[j];
    }
    
    rata = totalNilai/jumlahMahasiswa;
    
    //Output
    System.out.println("Maka, rata-rata nilainya adalah : " + rata);
    System.out.println("Developed by : Wisnu Bayu");
    System.out.println("Daftar"+);
}
}
