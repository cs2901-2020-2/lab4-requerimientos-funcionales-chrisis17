package cs.lab;

import java.util.List;
import java.util.logging.Logger;
import java.util.Scanner;

public class  DNASequencer {

    static final Logger logger = Logger.getLogger(DNASequencer.class.getName());
    public DNASequencer() {
        logger.info("Starting sequencer...");
    }

    public String calculate(List<String> part){
        String gnomes = getinput();
        StringBuffer result;

        for (char x : genomes){
            result.append(x);
        }
        
        return "result";


    }

    public String getinput(){
        Scanner input = new Scanner(System.in);
        int gnomes = input.nextLine();
        return gnomes;
    }

}
