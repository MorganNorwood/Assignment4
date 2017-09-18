/*Morgan Norwood
       (Game: pick four cards)
       Write a program that picks four cards from a deck of 52 cards
       and computes their sum. An Ace, King, Queen, and Jack represent 1, 13, 12, and 11,
       respectively. Your program should display the number of picks that yields the sum of 24.

 */

public class assingment7 {

    public static void main(String[] args){
        //create the deck
        int[] deck = new int[52];
        //card suits
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        //card values
        int Val[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int sum = 0;
        //number of hands (4 cards in a hand)
        int handCounter=0;

        //initialize the cards
        for (int i = 0; i < deck.length; i++)
            deck[i] = i;

        boolean Card = true; //set boolean to true
        //loop until 24 is found
        while (Card) {


            //shuffle the cards
            for (int i = 0; i < deck.length; i++) {
                //generate an index randomly
                int index = (int)(Math.random() * deck.length);
                int temp = deck[i];
                deck [i] = deck[index];
                deck[index] = temp;
            }

            for (int i = 0; i<4; i++) {
                String suit = suits[deck[i] / 13];
                int rank = Val[deck[i] % 13];
                //add suit to card value
                sum += rank;


                //Ace/Jack/Queen/King and suits
                if (rank == 1) {
                    System.out.println("Ace " + suit);

                }
                else if (rank ==11) {
                    System.out.println("Jack of " + suit);

                }
                else if (rank == 12) {
                    System.out.println("Queen of " + suit);

                }
                else if (rank==13) {
                    System.out.println("King of " + suit);

                }
                else {
                    System.out.println(rank + " of " + suit);

                }

            }

            if (sum == 24)
                Card=false; //loop will stop once it hits 24

            System.out.println("Sum is " + sum);
            sum =0;
            handCounter= handCounter+ 1; //counts number of hands

        }
        System.out.println("Hands drawn until 24 was reached : " + (handCounter));
    }
}
