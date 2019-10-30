import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Day2{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner file = new Scanner(new File("inputs/Day2.txt"));
        int ans = 0 ;
        int ans2=0;

        while(file.hasNextLine()){
            String line = file.nextLine();
            // System.out.println(line);
            int x1 = line.indexOf("x");
            int x2 = line.lastIndexOf("x");

            int l = Integer.parseInt(line.substring(0, x1));
            int w = Integer.parseInt(line.substring(x1+1, x2));
            int h = Integer.parseInt(line.substring(x2+1));
            // System.out.println(l+ " "+ w+" "+h);
            int side1 = (l*w) ;
            int side2= (w*h) ;
            int side3 =(h*l) ;
            int minSide = Math.min(Math.min(side1, side2), side3);
            int surfaceArea = (2*(side1+side2+side3))+minSide;
            ans+=surfaceArea;

            int face1= (2*w)+(2*l);

            int face2= (2*h)+(2*l);

            int face3=  (2*w)+(2*h);
            int minFace = Math.min(Math.min(face1, face2), face3);


            int bow = l*w*h;
            int ribbon = bow + minFace;
            ans2 += ribbon;


        }
        System.out.println(ans);
        System.out.println(ans2);


        file.close();
    }
}