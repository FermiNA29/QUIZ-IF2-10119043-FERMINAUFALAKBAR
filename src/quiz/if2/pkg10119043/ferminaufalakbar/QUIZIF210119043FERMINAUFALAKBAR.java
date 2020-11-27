/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119043.ferminaufalakbar;
import java.util.Scanner;
/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : program belanja
 */
public class QUIZIF210119043FERMINAUFALAKBAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        ServicePrice serviceprice = new ServicePrice();
        Customer customer = new Customer();
        
        System.out.println("====Program Kasir Rock n Roll Haircut====");
        System.out.print("Customer Name : ");
        String name = scanner.nextLine();
        customer.setName(name);
        System.out.print("Customer Email : ");
        String email = scanner.nextLine();
        customer.setEmail(email);
        System.out.println();
        
        System.out.println("====Program Kasir Rock n Roll Haircut====");
        System.out.println("Customer Name : " + customer.getName());
        System.out.println("Customer Email : " + customer.getEmail());
        
       
        serviceprice.displayService();
        System.out.print("Choose (1/2/3):");
        int chose = scanner.nextInt();
        
        System.out.print("Are you Member : ");
        String valid = scanner.next();
        
        
        
        System.out.println("**********************");
        System.out.println("**CUSTOMER SERVICE****");
        System.out.println("Date Transaction : ");
        System.out.println("Service Price : " + serviceprice.getPrice(chose));
        System.out.println("Discount : " + serviceprice.getSale(serviceprice.checkMemberStatus(valid.toLowerCase()), serviceprice.getPrice(chose)));
        System.out.println("Total Pay : ");
    }
    
}