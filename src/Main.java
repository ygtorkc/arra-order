import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz");
        int boyut = input.nextInt();
        int[] arrr = new int[boyut];
        System.out.println("Dizideki elemanları giriniz:");
        for (int i = 0; i < boyut; i++) {
            arrr[i] = input.nextInt();
        }
        for (int i = 0; i < boyut; i++) {
            for (int j = i + 1; j < boyut; j++) {
                if (arrr[i] > arrr[j]) {
                    int temp = arrr[i];
                    arrr[i] = arrr[j];
                    arrr[j] = temp;
                }


            }


        }
        System.out.println("Sıralanmış dizi:");
        for(int i=0; i<boyut;i++){
            System.out.println(arrr[i]+" ");
        }


    }
}