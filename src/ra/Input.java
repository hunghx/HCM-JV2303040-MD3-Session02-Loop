package ra;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public static Integer getInt(){
        while (true){
            try{
                return getScanner().nextInt();
            }catch (InputMismatchException e){
                System.err.println("bạn hãy nhập vào 1 số");
            }
        }
    }
    private static Scanner getScanner(){
        return new Scanner(System.in);
    }

    public static void main(String[] args) {
        System.out.println("hãy nhập 1 số");
        int n = getInt();
    }
}
