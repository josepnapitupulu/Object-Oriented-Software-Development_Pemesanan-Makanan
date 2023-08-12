/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pesanmakanan;

/**
 *
 * @author MSI GAMING
 */
import java.util.ArrayList;
import java.util.Scanner;

public class DataFeedback extends Fungsi implements Access{//implements interface
    ArrayList<Feedback> listFeed = new ArrayList<Feedback>();//penerapan dari generic and collection
    Scanner scan = new Scanner(System.in);

    Feedback f;

    String komentar;

    public void komen(){//implements interface
        do {
            System.out.println("Masukkan Feedback Anda Kepada Kami :");
            komentar = scan.nextLine();
        }while (komentar.length() < 3);
        f = new Feedback(komentar);
        listFeed.add(f);
        System.out.println("====================================================");
        System.out.println("Terimakasih Telah Memberikan Feedback Kepada Kami :)");
        System.out.println("====================================================");
    }
    int x = 1;
    public void play(){//menggunakan abstrack class dari fungsi abstrack class Fungsi.
        for (Feedback feed : listFeed) {
            System.out.println("List Feedback : ");
            System.out.println("=======================================");
            System.out.printf(x+". "+feed.getKomentar()+"\n");
            System.out.println("=======================================");
        }
        x++;
    }
    public void loginAdmin(){}//implements interface
}

