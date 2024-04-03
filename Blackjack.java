import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        
        scan.nextLine();//Wait for the user to press enter.

        // Get two random cards.call number btw 1 and 13
        int card1 = drawRandomCard();
        int card2 =drawRandomCard();

        //       – Print them: \n You get a \n" + <randomCard> + "\n and a \n" + <randomCard>
        System.out.println(" You get a \n " + cardString(card1) +"\n and a \n" + cardString(card2));


        //Task 5 – Print the sum of your hand value.
        //       – print: your total is: <hand value>

        int total= Math.min(card1, 10) + Math.min(10, card2); // Math.min function chose the minimum number btw 10 and this number.
        System.out.println("Your total is : " + total);


        
        //Task 6 – Get two random cards for the dealer.
        //       – Print: The dealer shows \n" + <first card> + "\nand has a card facing down \n" + <facedown card>
        //       – Print: \nThe dealer's total is hidden
        int dealerCard1 = drawRandomCard();
        int dealercard2 = drawRandomCard();
        System.out.println( "The dealer shows \n" + dealerCard1 + "\nand has a card facing down \n" + faceDown());

        int dealerTotal = Math.min(dealerCard1, 10) + Math.min(10, dealercard2); // Math.min is used is to generate a number that is smaller than 10
        System.out.println("\nThe dealer's total is hidden");


        



    

       
               

        while (true) {   // this while loop keeps asking the player for leaving or staying in the game
            String option = hitOrStay();

            if(option.equalsIgnoreCase("Stay")){
                break;
            }

            int newCard  = drawRandomCard();
            total += Math.min(10, newCard);
            System.out.println("\nYou get a\n" + cardString(newCard));
            System.out.println("Your total is " + total);

            if (total > 21){
                System.out.println("Bust! Player loses");
                System.exit(0);
            }
            
        }

        System.out.println("\nDealer's turn");
        System.out.println("\nThe dealer's cards are \n" + cardString(dealerCard1) + "\n and a \n" + cardString(dealercard2)); // revealing both cards by the dealer
        System.out.println("The dealer' s total is " + dealerTotal); // says the dealer total before second draw

        while (dealerTotal < 17) { // draw a new card for the dealer if dealer total less than 17
            int newCard = drawRandomCard();
            dealerTotal += Math.min(10, newCard);

            System.out.println("\nDealer gets a new card, a\n" + cardString(newCard));
            System.out.println("Dealer's total is \n" + dealerTotal);

            
        }

        if (dealerTotal > 21){ // dealer loses when total more than 21
            System.out.println("Bust! Dealer loses!!");
            System.exit(0); // exit the app process
        }

        if (total > dealerTotal){ // Determinig the winner based on their respective total score
            System.out.println("Player wins the game!!");
        }else{
            System.out.println("Dealer wins the game!!");
        }

        
         scan.close();

    }

     
     
     
    public static int drawRandomCard(){   // function that returns a random number between 1 and 13, used to draw a random card for both players
        double randomNumber = Math.random() * 13;
        randomNumber += 1;
        return (int)randomNumber;
    }

   
    
     

    public static String cardString(int cardNumber){  //  a function that returns a String drawing of the card, used to print the cards in the game
        switch (cardNumber) {
            case 1:
            return
             
            "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n";
   
                
               
            case 2:
            return

            "   _____\n"+              
            "  |2    |\n"+ 
            "  |  o  |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____Z|\n";
          

            case 3:
            return"   _____\n" +
            "  |3    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____E|\n";


            case 4:
            return
            "   _____\n" +
                   "  |4    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  | o o |\n"+
                   "  |____h|\n";

            case 5:
            return
            "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";


            case 6:
            return
            "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";


            case 7:
            return
            "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____7|\n";

            case 8:
            return

            "   _____ \n" +
            "  |8    |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  |____8|\n";
     

            case 9:
            return
            "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";

            case 10:
            return

            "   _____ \n" +
            "  |10  o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |___10|\n";
    

            case 11:
            return
            "   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";

            case 12:
            return
            "   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
              

            case 13:
            return

            "   _____\n" +
            "  |K  WW|\n"+ 
            "  | o {)|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%>|\n";


        
            default:
            return "Please choose a card";
            
        }


    }

    public static String faceDown() { // function to generate the facedown card by the dealer
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    
    
     
     

    public static String hitOrStay(){    //  function that asks the user to hit or stay.
        System.out.println("Would you like to hit or stay");
        String response = scan.nextLine();

       while(!(response.equalsIgnoreCase("hit") || response.equalsIgnoreCase("stay"))){ // while loop for the user to type hit or stay before the loop breaks
        System.out.println("Please enter hit or stay");
         response = scan.nextLine();
       }
       return response;
 
    }
    }

