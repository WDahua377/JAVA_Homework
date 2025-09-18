import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Simpletron{
    private int accumulator;
    private int[] mem;
    private static final int READ = 10;
	private static final int WRITE = 11;
	private static final int LOAD = 20;
	private static final int STORE = 21;
	private static final int ADD = 30;
	private static final int SUBTRACT = 31;
	private static final int DIVIDE = 32;
	private static final int MULTIPLY = 33;
	private static final int BRANCH = 40;
	private static final int BRANCHNEG = 41;
	private static final int BRANCHZERO = 42;
	private static final int HALT = 43;
    // private int instructionLocation;    // record the mem location of intruction being executed
    private int instructionCounter; // record the mem location of instruction being performed
	private int instructionRegister; // storing next instruction to be performed
    private int operationcode;
    private int operand;

    // constructor
    public Simpletron(){
        mem = new int[100];
        accumulator = 0;
        instructionCounter = 0;
        instructionRegister = 0;
    }

    // error handle
    private void error(){
        System.out.println("*** Simpletron execution abnormally terminated ***");
        dump();
    }

    // read a word from the keyboard into a specific location in mem.
    private void read(int operand){
        System.out.println("Enter an integer:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        mem[operand] = num;
        instructionCounter++;
    }

    // write a word from a specific location in mem to the screen.
    private void write(int operand){
        System.out.println(mem[operand]);
        instructionCounter++;
    }

    // load a word from a specific location in mem into the accumulator.
    private void load(int operand){
        accumulator = mem[operand];
        instructionCounter++;
    }

    // store a word from the accumulator into a specific location in mem.
    private void store(int operand){
        mem[operand] = accumulator;
        instructionCounter++;
    }

    // add a word from a specific location in mem to the word in the accumulator (leave the result in the accumulator)
    private void add(int operand){
        accumulator += mem[operand];
        if(accumulator > 9999 || accumulator < -9999)
            error();
        else
            instructionCounter++;
    }

    // subtract a word from a specific location in mem from the word in the accumulator (leave the result in the accumulator)
    private void subtract(int operand){
        accumulator -= mem[operand];
        if(accumulator > 9999 || accumulator < -9999)
            error();
        else
            instructionCounter++;
    }

    // divide a word from a specific locaiton in mem into the word in the accumulator (leave the result in the accumulator)
    private void divide(int operand){
        if(mem[operand] != 0){
            accumulator /= mem[operand];
            if(accumulator > 9999 || accumulator < -9999)
                error();
        }
        else{
            System.out.println("*** Attempt to divide by zero ***");
            error();
        }
        instructionCounter++;
    }

    // multiply a word from a specific location in mem into the word in the accumuulator (leave the result in the accumulator)
    private void multiply(int operand){
        accumulator *= mem[operand];
        if(accumulator > 9999 || accumulator < -9999)
            error();
        else
            instructionCounter++;
    }

    // branch to a specitif location in mem.
    private void branch(int operand){
        instructionCounter = operand;
    }

    // branch to a specific location in memory if the accumulator is negative.
    private void branchneg(int operand){
        if(accumulator < 0){
            instructionCounter = operand;
        }
        else
            instructionCounter++;
    }

    // branch to a specific location in memory if the accumulator is zero.
    private void branchzero(int operand){
        if(accumulator == 0){
            instructionCounter = operand;
        }
        else
            instructionCounter++;
    }

    // display the information of memory and registers
    // it's not where old computers go
    private void dump(){
        System.out.println();
		System.out.println("REGISTERS:");
		System.out.printf("accumulator         %04d%n", accumulator);
		System.out.printf("instructionCounter  %04d%n", instructionCounter);
		System.out.printf("instructionRegister %04d%n", instructionRegister);
		System.out.printf("operationCode       %02d%n", operationcode);
		System.out.printf("operand             %02d%n\n", operand);

		System.out.printf("%s", "MEMORY:");
		for (int i = 0; i < mem.length; i++){
			if (i % 10 == 0){
				System.out.printf("\n%2d ", i);
            }
			System.out.printf("%04d ", mem[i]);
		}
        System.exit(0);
	}

    // halt. the program has completed its task
    private void halt(){
        System.out.println("*** Simpletron execution terminated ***");
        dump();
    }

    public void run(){
        // displaying welcome message
        System.out.printf ("%s%s%s%s%s%s",
        "*** Welcome to Simpletron! ***\n",
        "*** Please enter your program one instruction    ***\n",
        "*** (or data word) at a time. I will display     ***\n",
        "*** the location number and a question mark (?). ***\n",
        "*** You then type the word for that location.    ***\n",
        "*** Type -99999 to stop entering your program.   ***\n");

        int counter = 0;
        instructionRegister = 0;
        instructionCounter = 0;
        Scanner input = new Scanner(System.in);

        // user enter the program
        while(true){
            System.out.printf("%02d %s ", counter, "?");
            mem[counter] = input.nextInt();
            if(mem[counter] == -99999){
                // mem[counter] = 4300;
                break;
            }
            else if(mem[counter] < -9999 || mem[counter] > 9999){
                System.out.println("The input should be in range -9999 ~ 9999\nPlease enter again:");
            }
            else
                counter++;
        }

        System.out.printf("%s%s",
            "*** Program loading completed ***\n",
            "*** Program execution begins ***\n");

        // now fetch the instructions, begining at memory location 00
        while(true){
            instructionRegister = mem[instructionCounter];
            if(instructionRegister == -99999)
                halt();
            operationcode = instructionRegister / 100;
            operand = instructionRegister % 100;
            switch (operationcode){
                    case READ:
                        read(operand);
                        break;
                    case WRITE:
                        write(operand);
                        break;
                    case LOAD:
                        load(operand);
                        break;
                    case STORE:
                        store(operand);
                        break;
                    case ADD:
                        add(operand);
                        break;
                    case SUBTRACT:
                        subtract(operand);
                        break;
                    case DIVIDE:
                        divide(operand);
                        break;
                    case MULTIPLY:
                        multiply(operand);
                        break;
                    case BRANCH:
                        branch(operand);
                        break;
                    case BRANCHNEG:
                        branchneg(operand);
                        break;
                    case BRANCHZERO:
                        branchzero(operand);
                        break;
                    case HALT:
                        halt();
                        break;
                    default:
                        System.out.println("Invalid Operation Code.");
                        error();
                        // instructionCounter++;
            }
        }
    }

    public static void main(String s[]){
        Simpletron computer =  new Simpletron();
        computer.run();
    }
}