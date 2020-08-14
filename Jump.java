public class Jump{

    //declare fields;
    int releaseYear; 
    int size;
    String catalogueRef;
    int speed;
    double price;
    int numTracks;

    public Jump(int yearReleased, int recordSize, String catalogueCode, int recordSpeed, double recordPrice, int tracks){

    //match up constructors with declared fields
    releaseYear = yearReleased;    
    size = recordSize;
    catalogueRef = catalogueCode;
    speed = recordSpeed;
    price = recordPrice;
    numTracks = tracks;

    }

    public void recordAge(int potentialBuyYear){
        System.out.println("I only want to buy records released this year.  Does this one fit the bill?");
        boolean ageAnswer;
        ageAnswer = potentialBuyYear == 2020;
        System.out.println(ageAnswer);
    }

    public boolean inCollection(String ref1, String ref2){
        System.out.println("Let's see if we already have this in our collection! Don't want any duplicates.");
        boolean inCollectionAnswer;
        inCollectionAnswer = ref1.equals(ref2);
        return inCollectionAnswer;
    }

    public boolean affordableRecord(double priceCheck){
        System.out.println("Let's see if I can afford this record!");
        double myBudget = 25.99;
        boolean affordAnswer = priceCheck <= myBudget;
        return affordAnswer;
    }

    public void powerOff(){
        System.out.println("Bye! Turning the record player off now. Let's listen again soon!");
    }


}