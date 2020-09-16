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
        int initial = 0,next;
        Boolean anexar = false, otherString = false, secondCorrection = false;
        char firstLetter = ' ', nextLetter = ' ', temp;

        for (int x = 0; x < gnomes.length(); x++){
            if (initial == 0){
                result.append(gnomes.charAt(x));
            }
            if (anexar){
                if (x == ' '){
                    anexar = false;
                }else{
                    result.append(gnomes.charAt(x));
                    secondCorrection = false;
                }
            }
            if (secondCorrection){
                if (x == nextLetter){
                    anexar = true;
                    result.append(temp);
                }
            }
            if (otherString){
                if (x == firstLetter){
                    secondCorrection = true;
                    temp = gnomes.charAt(x);
                }
                else{
                    boolean findTheLetter = false;
                    while (!findTheLetter){
                        initial += 1;
                        firstLetter = result.charAt(initial);
                        nextLetter = result.charAt(initial + 1);
                        if (x == firstLetter){
                            secondCorrection = true;
                            temp = gnomes.charAt(x);
                            findTheLetter = true;
                        }
                    }
                }
            }
            if (x == ' '){
                firstLetter = result.charAt(initial);
                nextLetter = result.charAt(initial + 1);
                otherString = true;
            }
        }
        
        return "result";


    }

    public String getinput(){
        Scanner input = new Scanner(System.in);
        int gnomes = input.nextLine();
        return gnomes;
    }

}
