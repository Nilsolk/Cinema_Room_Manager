package cinema;

import java.util.Arrays;
import java.util.Scanner;

public class Cinema {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int rows;
    private static final int seatsInRow;
    private static int ticketsSold = 0;
    private static int ticketsAll;
    private static int currIncome = 0;
    private static int totalIncome;
    private static char [][] cinema;

    static {
        System.out.println("Enter the number of rows:");
        rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        seatsInRow = scanner.nextInt();
        cinema = new char [rows][seatsInRow];
        for (char[] row: cinema){
            Arrays.fill(row,'S');
        }
        ticketsAll = rows * seatsInRow;
        totalIncome = ticketsAll < 60 ? ticketsAll*10 : rows/2*seatsInRow*10 + (rows - rows/2)*seatsInRow*8;
    }

    static void printCinema() {
        System.out.println("Cinema:");
        System.out.print("  ");
        for(int j=0; j<seatsInRow; j++) {
            System.out.print(j+1 + (j == seatsInRow - 1 ? "": " "));

        }
        System.out.println("");
        for(int i=0; i < rows; i++){
            System.out.print(i+1 + " ");
            for(int j=0; j<seatsInRow; j++) {
                System.out.print( cinema[i][j]  + (j == seatsInRow - 1 ? "": " "));
            }
            System.out.println("");
        }
    }

    static void buyTicket() {
        int seatRow;
        int seatNum;
        while(true){
            System.out.println("Enter a row number:");
            seatRow = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            seatNum = scanner.nextInt();
            if (seatRow < 1 || seatNum < 1 || seatRow > rows  || seatNum > seatsInRow ) {
                System.out.println("Wrong input!");
            } else if (cinema[seatRow-1][seatNum-1] == 'B') {
                System.out.println("That ticket has already been purchased!");
            } else {
                cinema[seatRow-1][seatNum-1] = 'B';
                break;
            }
        }

        int price = ticketsAll < 60 ? 10 : (seatRow > rows/2 ? 8 : 10 );
        currIncome += price;
        ticketsSold += 1;
        System.out.format("Ticket price: $%d\n", price);
    }

    static void printStat(){
        float percent = (float)ticketsSold / ticketsAll * 100;
        System.out.printf("Number of purchased tickets: %d\n", ticketsSold);
        System.out.printf("Percentage: %.2f%%\n", percent);
        System.out.printf("Current income: $%d\n", currIncome);
        System.out.printf("Total income: $%d\n", totalIncome);
    }

    static void askAction () {
        boolean finished = false;
        while(!finished) {
            System.out.println("\n1. Show the seats\n2. Buy a ticket\n3. Statistics\n0. Exit");
            switch (scanner.nextInt()) {
                case 1:
                    printCinema();
                    break;
                case 2:
                    buyTicket();
                    break;
                case 3:
                    printStat();
                    break;
                case 0:
                    finished = true;
                    break;

            }
        }
    }

    public static void main(String[] args) {
        askAction();
    }
}