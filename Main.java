import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.nio.file.Files;
import java.time.LocalDate;



public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        persegi persegi = new persegi();
        persegi_panjang persegi_panjang = new persegi_panjang();
        segitiga segitiga = new segitiga();
        lingkaran lingkaran = new  lingkaran();
        LocalDate Time = LocalDate.now();
        System.out.println("Waktu Sekarang adalah : "+Time);

        menu();
        int A = input.nextInt();
        while(A<6) {
            switch (A) {
                //==========PERSEGI===========
                case 1:
                    // Create File
                    System.out.println("---MEMBUAT FILE---");
                    try {
                        File myobj1 = new File("C:\\Ketika\\persegi.txt");
                        if (myobj1.createNewFile()) {
                            System.out.println("File created: " + myobj1.getName());
                        } else {
                            System.out.println("File already exist");
                        }
                    } catch (IOException e) {
                        System.out.println("ERROR");
                        e.printStackTrace();
                    }
                    //Check the Information
                    System.out.println("\n---INFROMASI FILE---");
                    File myobj1 = new File("C:\\Ketika\\persegi.txt");
                    if (myobj1.exists()) {
                        System.out.println("File name: " + myobj1.getName());
                        System.out.println("Absolute path: " + myobj1.getAbsolutePath());
                        System.out.println("Writeable: " + myobj1.canWrite());
                        System.out.println("Readable: " + myobj1.canRead());
                        System.out.println("File size in bytes: " + myobj1.length());
                    } else {
                        System.out.println("The file does not exist.");
                    }
                    //Perhitungan Bangun Persegi
                    System.out.println("\n---PERHITUNGAN---");
                    int sisi;
                    System.out.print("Masukkan sisi persegi = ");
                    sisi = input.nextInt();
                    double Luas = persegi.luas(sisi);
                    double Keliling = persegi.keliling(sisi);

                    System.out.println("\n----HASIL----");
                    System.out.println("Luas Persegi adalah: " + Luas);
                    System.out.println("Keliling Persegi adalah: " + Keliling);

                    //Write File
                    try {
                        FileWriter myWriter = new FileWriter("C:\\Ketika\\persegi.txt", true);
                        myWriter.write("Luas Persegi adalah: " + Luas + "\n");
                        myWriter.write("Keliling Persegi adalah: " + Keliling + "\n\n");
                        myWriter.close();
                        System.out.println("Berhasil di write");
                    } catch (IOException e) {
                        System.out.println("ERROR");
                        e.printStackTrace();
                    }

                    //Read File
                    System.out.println();
                    System.out.println("---DATA DALAM FILE---");
                    try {
                        File myobj11 = new File("C:\\Ketika\\persegi.txt");
                        Scanner myReader = new Scanner(myobj11);
                        while (myReader.hasNextLine()) {
                            String data = myReader.nextLine();
                            System.out.println(data);
                        }
                        myReader.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("ERROR");
                        e.printStackTrace();
                    }
                    break;


                //==========PERSEGI PANJANG========
                case 2:
                    // Creat File
                    System.out.println("---MEMBUAT FILE---");
                    try {
                        File myobj2 = new File("C:\\Ketika\\persegi_panjang.txt");
                        if (myobj2.createNewFile()) {
                            System.out.println("File created: " + myobj2.getName());
                        } else {
                            System.out.println("File already exist");
                        }
                    } catch (IOException e) {
                        System.out.println("ERROR");
                        e.printStackTrace();
                    }

                    //Check the Information
                    System.out.println("\n---INFORMASI FILE---");
                    File myobj2 = new File("C:\\Ketika\\persegi_panjang.txt");
                    if (myobj2.exists()) {
                        System.out.println("File name: " + myobj2.getName());
                        System.out.println("Absolute path: " + myobj2.getAbsolutePath());
                        System.out.println("Writeable: " + myobj2.canWrite());
                        System.out.println("Readable: " + myobj2.canRead());
                        System.out.println("File size in bytes: " + myobj2.length());
                    } else {
                        System.out.println("The file does not exist.");
                    }

                    //Perhitungan bangun persegi_panjang
                    System.out.println("\n---PERHITUNGAN---");
                    int panjang, lebar;
                    System.out.print("Masukkan panjang : ");
                    panjang = input.nextInt();
                    System.out.print("Masukkan lebar: ");
                    lebar = input.nextInt();

                    System.out.println("\n----Hasil----");
                    double Luas_Persegi_Panjang = persegi_panjang.luas(panjang, lebar);
                    double Keliling_Persegi_Panjang = persegi_panjang.keliling(panjang, lebar);
                    System.out.println("Luas persegi_panjang : " + Luas_Persegi_Panjang);
                    System.out.println("Keliling persegi_panjang: " + Keliling_Persegi_Panjang);

                    //Write File
                    try {
                        FileWriter myWriter = new FileWriter("C:\\Ketika\\persegi_panjang.txt", true);
                        myWriter.write("Luas Persegi Panjang adalah: " + Luas_Persegi_Panjang + "\n");
                        myWriter.write("Keliling Persegi Panjang adalah: " + Keliling_Persegi_Panjang + "\n\n");
                        myWriter.close();
                        System.out.println("Berhasil di write");
                    } catch (IOException e) {
                        System.out.println("ERROR");
                        e.printStackTrace();
                    }

                    //Read File
                    System.out.println("\n---DATA DALAM FILE---");
                    try {
                        File myobj22 = new File("C:\\Ketika\\persegi_panjang.txt");
                        Scanner myReader = new Scanner(myobj22);
                        while (myReader.hasNextLine()) {
                            String data = myReader.nextLine();
                            System.out.println(data);
                        }
                        myReader.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("ERROR");
                        e.printStackTrace();
                    }
                    break;

                // ============SEGITIGA============
                case 3:
                    // Creat File
                    System.out.println("---MEMBUAT FILE---");
                    try {
                        File myobj3 = new File("C:\\Ketika\\segitiga.txt");
                        if (myobj3.createNewFile()) {
                            System.out.println("File created: " + myobj3.getName());
                        } else {
                            System.out.println("File already exist");
                        }
                    } catch (IOException e) {
                        System.out.println("ERROR");
                        e.printStackTrace();
                    }

                    //Check the Information
                    System.out.println("\n---INFORMASI FILE---");
                    File myobj3 = new File("C:\\Ketika\\segitiga.txt");
                    if (myobj3.exists()) {
                        System.out.println("File name: " + myobj3.getName());
                        System.out.println("Absolute path: " + myobj3.getAbsolutePath());
                        System.out.println("Writeable: " + myobj3.canWrite());
                        System.out.println("Readable: " + myobj3.canRead());
                        System.out.println("File size in bytes: " + myobj3.length());
                    } else {
                        System.out.println("The file does not exist.");
                    }

                    //Perhitungan Segitiga
                    System.out.println("\n---PERHITUNGAN---");
                    int alas, tinggi, sisi1, sisi2, sisi3;
                    System.out.print("Masukkan alas : ");
                    alas = input.nextInt();
                    System.out.print("Masukkan tinggi : ");
                    tinggi = input.nextInt();
                    System.out.print("Masukkan sisi 1: ");
                    sisi1 = input.nextInt();
                    System.out.print("Masukkan sisi 2: ");
                    sisi2 = input.nextInt();
                    System.out.print("Masukkan sisi 3: ");
                    sisi3 = input.nextInt();

                    System.out.println("\n----HASIL---");
                    double luas_segitiga = segitiga.luas(alas, tinggi);
                    double keliling_segitiga = segitiga.keliling(sisi1, sisi2, sisi3);
                    System.out.println("Luas Segitiga : " + luas_segitiga);
                    System.out.println("Keliling Segitiga : " + keliling_segitiga);

                    //Write File
                    try {
                        FileWriter myWriter = new FileWriter("C:\\Ketika\\segitiga.txt", true);
                        myWriter.write("Luas Segitiga adalah: " + luas_segitiga + "\n");
                        myWriter.write("Keliling Segitiga adalah: " + keliling_segitiga + "\n\n");
                        myWriter.close();
                        System.out.println("Berhasil di write");
                    } catch (IOException e) {
                        System.out.println("ERROR");
                        e.printStackTrace();
                    }

                    //Read File
                    System.out.println("\n---DATA DALAM FILE---");
                    try {
                        File myobj33 = new File("C:\\Ketika\\segitiga.txt");
                        Scanner myReader = new Scanner(myobj33);
                        while (myReader.hasNextLine()) {
                            String data = myReader.nextLine();
                            System.out.println(data);
                        }
                        myReader.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("ERROR");
                        e.printStackTrace();
                    }
                    break;

                //===========LINGKARAN=========
                case 4:
                    // Creat File
                    System.out.println("---MEMBUAT FILE---");
                    try {
                        File myobj4 = new File("C:\\Ketika\\lingkaran.txt");
                        if (myobj4.createNewFile()) {
                            System.out.println("File created: " + myobj4.getName());
                        } else {
                            System.out.println("File already exist");
                        }
                    } catch (IOException e) {
                        System.out.println("ERROR");
                        e.printStackTrace();
                    }

                    //Check the Information
                    System.out.println("\n---INFORMASI FILE---");
                    File myobj4 = new File("C:\\Ketika\\lingkaran.txt");
                    if (myobj4.exists()) {
                        System.out.println("File name: " + myobj4.getName());
                        System.out.println("Absolute path: " + myobj4.getAbsolutePath());
                        System.out.println("Writeable: " + myobj4.canWrite());
                        System.out.println("Readable: " + myobj4.canRead());
                        System.out.println("File size in bytes: " + myobj4.length());
                    } else {
                        System.out.println("The file does not exist.");
                    }

                    //Perhitungan Lingkaran
                    System.out.println("\n---PERHITUNGAN---");
                    int r;
                    System.out.print("Masukkan jari-jari : ");
                    r = input.nextInt();
                    double luas_lingkaran = lingkaran.luas(r);
                    double keliling_lingkaran = lingkaran.keliling(r);

                    System.out.println("----HASIL----");
                    System.out.println("Luas Lingkaran: " + luas_lingkaran);
                    System.out.println("Keliling Lingkaran: " + keliling_lingkaran);

                    //Write
                    try {
                        FileWriter myWriter = new FileWriter("C:\\Ketika\\lingkaran.txt", true);
                        myWriter.write("Luas lingkaran adalah: " + luas_lingkaran + "\n");
                        myWriter.write("Keliling lingkaran adalah: " + keliling_lingkaran + "\n\n");
                        myWriter.close();
                        System.out.println("Berhasil di write");
                    } catch (IOException e) {
                        System.out.println("ERROR");
                        e.printStackTrace();
                    }

                    //Read File
                    System.out.println("\n---DATA DALAM FILE---");
                    try {
                        File myobj44 = new File("C:\\Ketika\\persegi.txt");
                        Scanner myReader = new Scanner(myobj44);
                        while (myReader.hasNextLine()) {
                            String data = myReader.nextLine();
                            System.out.println(data);
                        }
                        myReader.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("ERROR");
                        e.printStackTrace();
                    }
                    break;

                case 5:
                    showpath();
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Masukkan File/Folder yang ingin dihapus");
                    String filename = sc.nextLine();
                    deleteFileOrFolder(filename);
                    break;

                default:
                    System.out.println("Masukin angka yang bener");
                    break;

            }
            menu();
            A = input.nextInt();
        }


    }









    static void menu(){
        System.out.println("\nPerhitungan Luas dan Keliling Bangun");
        System.out.println("==========Pilihan==========");
        System.out.println("1.Persegi");
        System.out.println("2.Persegi_panjang");
        System.out.println("3.Segitiga");
        System.out.println("4.lingkaran");
        System.out.println("5.Menghapus File");
        System.out.println("!!!!!Angka selain pilihan program berhenti!!!!!");
        System.out.print("Masukkan Pilihan: ");

    }

    public static void deleteFileOrFolder(String filename){
        File fileobj = new File(filename);
        if(fileobj.exists()){
            if(fileobj.delete()){
                System.out.println("File/Folder berhasil dihapus");
            }
            else{
                System.out.println("File/Folder tidak bisa dihapus");
            }
        }
        else{
            System.out.println("File/Folder tidak exist");
        }

    }
    public static void showpath(){
        Path path = Paths.get("C:\\Ketika");
        try (Stream<Path> subPaths = Files.walk(path)) {
            subPaths.forEach(a -> System.out.println(a));
        } catch (IOException e) {
            e.printStackTrace();
    }
}
}

