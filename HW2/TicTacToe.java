import java.util.Scanner;

public class TicTacToe{

    // use enum type to represent the value in each cell of the array
    public enum value{
        X, O, EMPTY;
        public String toString(){
        	switch (this){
        		case EMPTY:
        			return "   ";
        		case X:
        			return " X ";
        		case O:
        			return " O ";
        	}
        	return "   ";
        }
    };

    // private 3-by-3 two-demensional array
    private static value[][] map;

    // constructor
    public TicTacToe(){
        map = new value[3][3];
        initializeMap();
    }

    public static void printMap(){
        System.out.printf("%s|%s|%s\n", 
        map[0][0].toString(), map[0][1].toString(), map[0][2].toString());
    	System.out.println("---|---|---");
        System.out.printf("%s|%s|%s\n", 
        map[1][0].toString(), map[1][1].toString(), map[1][2].toString());
    	System.out.println("---|---|---");
        System.out.printf("%s|%s|%s\n", 
        map[2][0].toString(), map[2][1].toString(), map[2][2].toString());
    }

    public static boolean isWon(value v){
    	if(map[0][0] == v && map[0][1] == v && map[0][2] == v){
    		return true;
    	}
    	else if(map[1][0] == v && map[1][1] == v && map[1][2] == v){
    		return true;
    	}
    	else if(map[2][0] == v && map[2][1] == v && map[2][2] == v){
    		return true;
    	}
    	else if(map[0][0] == v && map[1][0] == v && map[2][0] == v){
    		return true;
    	}
    	else if(map[0][1] == v && map[1][1] == v && map[2][1] == v){
    		return true;
    	}
    	else if(map[0][2] == v && map[1][2] == v && map[2][2] == v){
    		return true;
    	}
    	else if(map[0][0] == v && map[1][1] == v && map[2][2] == v){
    		return true;
    	}
    	else if(map[0][2] == v && map[1][1] == v && map[2][0] == v){
    		return true;
    	}

    	return false;
    }

    public static boolean isTie(){
    	if (map[0][0] != value.EMPTY && map[0][1] != value.EMPTY &&
    		map[0][2] != value.EMPTY && map[1][0] != value.EMPTY &&
    		map[1][1] != value.EMPTY && map[1][2] != value.EMPTY &&
    		map[2][0] != value.EMPTY && map[2][1] != value.EMPTY &&
    		map[2][2] != value.EMPTY){
    		return true;
    	}

    	return false;
    }

    public static void fillIn(value v, int position){
    	if(position == 1)
            map[0][0] = v;
        if(position == 2)
            map[0][1] = v;
        if(position == 3)
            map[0][2] = v;
        if(position == 4)
            map[1][0] = v;
        if(position == 5)
            map[1][1] = v;
        if(position == 6)
            map[1][2] = v;
        if(position == 7)
            map[2][0] = v;
        if(position == 8)
            map[2][1] = v;
        if(position == 9)
            map[2][2] = v;
    }

    public boolean isEmpty(int position){
        if(position == 1){
            if(map[0][0] == value.EMPTY)
                return true;
        }
        if(position == 2){
            if(map[0][1] == value.EMPTY)
                return true;
        }
        if(position == 3){
            if(map[0][2] == value.EMPTY)
                return true;
        }
        if(position == 4){
            if(map[1][0] == value.EMPTY)
                return true;
        }
        if(position == 5){
            if(map[1][1] == value.EMPTY)
                return true;
        }
        if(position == 6){
            if(map[1][2] == value.EMPTY)
                return true;
        }
        if(position == 7){
            if(map[2][0] == value.EMPTY)
                return true;
        }
        if(position == 8){
            if(map[2][1] == value.EMPTY)
                return true;
        }
        if(position == 9){
            if(map[2][2] == value.EMPTY)
                return true;
        }
        return false;
    }

    public void initializeMap(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3;j++)
                map[i][j] = value.EMPTY;
        }
    }

    public void run(){
        Scanner input = new Scanner(System.in);
        int pos, counter = 1;
        System.out.println("        Tic Tac Toe\n");
        System.out.println("Player 1 (X) - Player 2 (O)\n");
        System.out.println("         1 | 2 | 3 ");
    	System.out.println("        ---|---|---");
        System.out.println("         4 | 5 | 6 ");
    	System.out.println("        ---|---|---");
        System.out.println("         7 | 8 | 9 ");
        System.out.println("Enter the number of position to fill in.");
        System.out.println("Enter -1 to end the game.\n");
        while(true){
            if(counter % 2 == 1){
                System.out.println("Player 1, Please choose a square: ");
                pos = input.nextInt();
                if(pos == -1){
                    System.out.println("Game Over.");
                    break;
                }
                if(isEmpty(pos)){
                    fillIn(value.X, pos);
                    printMap();
                }
                else
                    System.out.println("Invalid position.");
            }
            if(counter % 2 == 0){
                System.out.println("Player 2, Please choose a square: ");
                pos = input.nextInt();
                if(pos == -1){
                    System.out.println("Game Over.");
                    break;
                }
                if(isEmpty(pos)){
                    fillIn(value.O, pos);
                    printMap();
                }
                    //player = 2; ?
            }
            if(isWon(value.X)){
                System.out.println("Player 1 has won!");
                initializeMap();
            }
            if(isWon(value.O)){
                System.out.println("Player 2 has won!");
                initializeMap();
            }
            if(isTie()){
                System.out.println("No one wins!");
                initializeMap();
            }
            counter++;
        }
    }

    public static void main(String[] args){
        TicTacToe game = new TicTacToe();
        game.run();
    }


}