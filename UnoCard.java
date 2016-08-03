
package Game;
public class UnoCard {
    private String Color;
    private String CardType;
    private int CardValue;
    private String CardImage;

    public UnoCard(String Color, String CardType, int CardValue, String CardImage) {
        this.Color = Color;
        this.CardType = CardType;
        this.CardValue = CardValue;
        this.CardImage = CardImage;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getCardType() {
        return CardType;
    }

    public void setCardType(String CardType) {
        this.CardType = CardType;
    }

    public int getCardValue() {
        return CardValue;
    }

    public void setCardValue(int CardValue) {
        this.CardValue = CardValue;
    }

    public String getCardImage() {
        return CardImage;
    }

    public void setCardImage(String CardImage) {
        this.CardImage = CardImage;
    }

    @Override
    public String toString() {
        return "UnoCard{" + "Color=" + Color + ", CardType=" + CardType + ", CardValue=" + CardValue + ", CardImage=" + CardImage + '}';
    }
    
    
}
