package UserEntrance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        char answer;
        int counter = 0;

        Scanner scn = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = scn.nextLine();

        System.out.print("Şifreniz : ");
        password = scn.nextLine();

        if(userName.equals("patika") && password.equals("12345")){
            System.out.println("Başarılı bir şekilde giriş yapıldı.");
        }else {
            System.out.print("Şifrenizi sıfırlamak ister misiniz? Y/N : ");
            answer = scn.nextLine().toUpperCase().charAt(0);
            if (answer == 'Y'){
                String newPassword = "12345";
                while (newPassword.equals("12345")){
                    counter++;
                    if(counter == 4){
                        break;
                    }
                    if(counter != 1){
                        System.out.println("Şifreniz unuttuğunuz şifre ile aynı olamaz!!!");
                    }
                    System.out.print("Yeni Şifrenizi Giriniz : ");
                    newPassword = scn.nextLine();
                }
                if(counter == 4){
                    System.out.println("3 kere hatalı şifre oluşturmayı denediniz!!!");
                }else {
                    System.out.println("Şifre oluşturuldu.");
                }

            }else{
                System.out.println("Şifreniz eskisi gibi kalacaktır!!!");
            }
        }
    }
}
