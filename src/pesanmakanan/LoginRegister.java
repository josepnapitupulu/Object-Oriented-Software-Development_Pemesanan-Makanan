/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pesanmakanan;

/**
 *
 * @author MSI GAMING
 */
import java.util.Scanner;

public class LoginRegister extends Validasi{

    static Scanner input = new Scanner(System.in);


    public static String[] authRegister(){
        String[] ArrAkun = new String[2];//penerapan dari generic and collection dimana disi terdapat pendefinisian array


        System.out.println("======== REGISTER ========");
        System.out.print("Masukkan Username : ");
        ArrAkun[0] = input.next();
        System.out.print("Masukkan Password : ");
        ArrAkun[1] = input.next();

        return ArrAkun;
    }
    public void authLogin(String [] arrAkun){//menggunakan konsep overload pada program atau bagian dari polymorphism.
        int failLogin = 0;
        String user,pass;
        try {//Penerapan Exception Handling pada program
            do {
                System.out.println("======== LOGIN ========");
                System.out.print("Masukkan Username : ");
                user = input.next();
                System.out.print("Masukkan Password : ");
                pass = input.next();

                failLogin++;
                if(user.equals(arrAkun[0]) && pass.equals(arrAkun[1])){
                    System.out.println("Selamat, Anda Berhasil Login");
                }
            } while (!user.equals(arrAkun[0]) || !pass.equals(arrAkun[1]));
        }catch (Exception e){
            if(failLogin > 0){
                System.err.println("Maaf username atau password anda salah !!!");
                System.exit(0);
            }
        }
    }
}

