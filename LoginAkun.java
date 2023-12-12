import java.util.Scanner;

public class LoginAkun {

    public String Code[] = {"AbCDe","FgHij","kLMNo"};
    public String Captcha;
    public int hitung =-1;
    public LoginAkun(){
        String username;
        String password;
        System.out.println("SELAMAT DATANG DI NDAMART");
        System.out.println("Log in  ");
            do{
                Scanner input = new Scanner(System.in);
                System.out.print("Username         : ");
                username = input.next();
                System.out.print("Password         : ");
                password = input.next();
                if(username.equalsIgnoreCase("naufal") && password.equals("naufal284")){
                    int random = 0;
                    String n;
                    do{
                        if(random>0){
                            System.out.println("Gagal memasukan captcha");
                        }
                        random++;
                        hitung ++;
                        hitung %=3;
                        System.out.println("Kode Captcha     : " + Code[hitung]);
                        System.out.print("Entry Captcha    : ");
                        Scanner codScanner = new Scanner(System.in);
                        Captcha = codScanner.next();

                    }while(!Captcha.equalsIgnoreCase(Code[hitung]));


                    System.out.println("Berhasil LOgin");
                    break;
                }else{
                    System.out.println("Coba Lagi");
                }
            }while(!username.equals("admin") || !password.equals("admin123"));

        
    }
}

