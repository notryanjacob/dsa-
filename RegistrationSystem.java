import java.util.Scanner;

public class RegistrationSystem {
    //codeforces registration system problem

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            System.out.println(regSystem(s));
        }
        sc.close();
    }

    static String regSystem(String s){
        String[] names={};
        boolean check=false;
        for(int i=0;i<s.length()-1;i++){
            if(s==names[i]) check=true;
        }
        if(check){
            return s+"1";
        }
        else return "OK";
    }
    
}
//CODE APPARENTLY USES HASHMAPS. INCOMPLETE RN