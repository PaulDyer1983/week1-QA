package Software;

public class Calculation {
    private int card1;
    private int card2;
    private int cards;

    public Calculation(int card1, int card2, int cards){
        this.card1 = card1;
        this.card2 = card2;
        this.cards = cards;
    }
    public int blackJackNumber(int card1, int card2){

        int cards;
        if(card1 + card2 >= 1 && card1 + card2 <= 21){
            cards = card1 + card2;
            return cards;
        }
        else {
            cards = 0;
            return cards;
        }
    }
}
