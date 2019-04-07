
import java.io.IOException;
import java.util.Scanner;


public class Main {
    
    public static void yas_kontrol(int yas) throws IOException {
        
        if (yas < 18) {
            throw new IOException();
            
        }
        else {
            System.out.println("Kayıt için yaşınız tutuyor...");
        }
        
        
    }
    public static void main(String[] args) throws IOException {
        
        
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas = scanner.nextInt();
        
        
        yas_kontrol(yas);
       
        
        
        
    }
}
