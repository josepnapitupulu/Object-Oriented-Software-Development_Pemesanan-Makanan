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

public class Login extends LoginRegister implements Access{//penggunaan inheritance pada program
    private String username;
    private String password;

    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }


    @Override
    public void loginAdmin() {//implements interface
        Scanner scan = new Scanner(System.in);
        Login login = new Login();
        System.out.println("=========================");
        System.out.println("Username : ");
        username = scan.nextLine();
        System.out.println("=========================");
        System.out.println("Password : ");
        password = scan.nextLine();
        try {//implements Exception Handling pada program
            if ("admin".equals(username) && "admin".equals(password)) {
                System.out.println("Successfully logged-in.. \n");
            } else {
                System.out.println(" In valid userName of password ");
                login.loginAdmin();
            }
        }catch (Exception e){
            System.err.println("terjadi kesalahan");
        }finally {
            System.out.println("===== Admin Login =====\n");
        }
    }

    @Override
    public void komen() {}//implements interface
}

