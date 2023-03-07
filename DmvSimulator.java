import java.lang.Math;

public class DmvSimulator{
    public static void main(String[]args){
        int waitNum = (int)(Math.random() * (100)+1);
        System.out.println("welcome to the DMV.");
        System.out.println("You are number " + waitNum + ". Please wait to be called.");
        for(int i = waitNum; i < 100; i++){
            System.out.print((i+1)+" ");
        }
        for(int i = 1; i <= waitNum; i++){
            System.out.print(i + " ");
        }
        System.out.println("\nGet the right paperwork this instant or else!");
    }
}