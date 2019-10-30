import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Day1{
public static void main(String[] args) throws FileNotFoundException{
    Scanner file = new Scanner(new File("inputs/Day1.txt"));
    String line = file.nextLine();
    System.out.println(line.charAt(0));
    int floor = 0;
    for(int i=0; i<line.length();i++){
        char current = line.charAt(i);
        // System.out.println(current);
        if (current == '('){
            floor+=1;
        }
        else{
            floor-=1;


        }
        if(floor <0){
            System.out.println(i+1);
            break;
        }
        
       
            

        
    }
    


    


    System.out.println(floor);


    file.close();
}
}