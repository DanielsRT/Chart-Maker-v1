import java.util.*;
import java.io.*;
public class ChartMaker_v1 {   
    static Scanner keyb = new Scanner(System.in);
    
    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("Welcome to Chart Maker, v1");
        System.out.print("What filename to use for the chart? ");
        String outFileName = keyb.nextLine();
        PrintWriter pw = new PrintWriter(outFileName);
        System.out.println("Done. Thanks for using the Chart Maker, v1");
        
        int JAX = 890467;
        int MIA = 454279;
        int TB = 387916;
        int ORL = 280832;
        int SPB = 261338;
        int TLH = 191279;
        int CLW = 115159;
        int DAB = 67604;
        
        int maxValue = 890467;
        int chartWidth = 60;
        int dashValue = maxValue / chartWidth;
        
        pw.println("\n--<<== Population sizes of 8 cities " +
                           "in Florida ==>>--");
        pw.println("\tChart width is: " + chartWidth);
        pw.printf("\tMax value is: %,d people\n", maxValue);
        pw.printf("\tOne dash represents %,d people\n", dashValue);
        
        printLine(JAX, dashValue, '-', "JAX", pw);
        printLine(MIA, dashValue, '-', "MIA", pw);
        printLine(TB, dashValue, '-', "T.B.", pw);
        printLine(ORL, dashValue, '-', "ORL", pw);
        printLine(SPB, dashValue, '-', "SPB", pw);
        printLine(TLH, dashValue, '-', "TLH", pw);
        printLine(CLW, dashValue, '-', "CLW", pw);
        printLine(DAB, dashValue, '-', "DAB", pw);
        pw.println();
        
        pw.close();
    }
    
    static void printLine(int num, int dashValue, char symbol, String name, PrintWriter pw) {
        int quot = num / dashValue;
        for (int n = 1; n <= quot; n++) {
            pw.print(symbol);
        }
        pw.printf("%s (%,d)\n", name, num);
    }
    
}