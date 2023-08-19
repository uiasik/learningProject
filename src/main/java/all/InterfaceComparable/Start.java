package all.InterfaceComparable;


import java.util.Random;

public class Start {
    Number[] compareNumbers = new Number[10];

    private void generateNumbers () {
        Random random = new Random();
        for (int i = 0; i < compareNumbers.length; i++) {
            compareNumbers[i] = new Number(random.nextInt(100));
        }

    }
    private void printNumbers(){
        for (Number i : compareNumbers) {
            System.out.println(i.getNumber());
        }
    }

    private void sortNumbers(){
        for (int i = 1; i < compareNumbers.length; i++) {
            for (int j = 0; j < compareNumbers.length - i; j++) {
                if (compareNumbers[j].compareTo(compareNumbers[j + 1]) > 0){
                    int n = compareNumbers[j].getNumber();
                    compareNumbers[j].setNumber(compareNumbers[j+1].getNumber());
                    compareNumbers[j + 1].setNumber(n);
                }
            }
        }
    }

    public void run(){
        generateNumbers();
        //printNumbers();
        sortNumbers();
        printNumbers();
    }
}
