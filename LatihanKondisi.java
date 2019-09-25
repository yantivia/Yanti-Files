/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg173040011_latihan;
import java.util.Scanner;


public class LatihanKondisi {

    
        
/*
        *input dalam java
        
        * program pasrinya akan membutuhkan interaksi dengan user
        salah satunya keyboard
        
        * dalam java ada 3 input keyboard
        1. Scanner(paling sering digunakan)
        2. bufferedreder(sudah mulai di tinggalkan)
        3. console(ini di gunakakn oleh admin, berjalan di command prompt
        
        *Scanner vs bufferedreader
        dalam menciptakan bufferedreader dan menjadi cikal bakal scanner
        
        * bila di lihat dari fungsi dibedakan berdasarkan tipedatanya 
        contoh: 
        String .next()
        int .nextInt()
        double .nextDouble()
        
        *bufferedreader hanya memiliki satu fungsi yaitu .readline()
        tipe datanya String
        
        *tapi kelemahan dari Scanner adalah hanya bisa menampung data 1kb
        sedangkan bufferedreader 8kb
        *dampaknya Scanner tidak bisa meneriman spasi, bufferedreader bisa menerima spasi
        */
        
        public static void main(String[] args){
            Scanner sc = new Scanner (System.in);
            
            String nama = sc.next();
            int nilai = sc.nextInt();
            double ipk = sc.nextDouble();
            
            BufferedReader br = new  BufferedReader (System.in);
            
            try{
                //fungsinya utuk menangani error manusia
                
                nama = br.readLine();
                nilai = Integer.parseInt(br.readLine());
                ipk = Double.parseDouble(br.readLine());
                
            }catch(Exception e){
                System.out.println("Maaf anda salah input");
            }
            
            StringBuilder sb = new StringBuilder();
            sb.append("ryan");
            sb.append("rinaldy");
            sb.append("S.T");
            System.out.println(sb.toString());
        }
        
    }
    

