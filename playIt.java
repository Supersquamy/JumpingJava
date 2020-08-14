public class playIt {
    
    public static void main(String[] args){

        Jump newRecord = new Jump(2020, 7, "LP2020NU", 33, 15.65, 12);
        newRecord.recordAge(newRecord.releaseYear);

        Jump oldRecord = new Jump(1968, 10, "XYZABC", 45, 20.30, 7);
        boolean duplicate = oldRecord.inCollection(oldRecord.catalogueRef, newRecord.catalogueRef);
        System.out.println(duplicate);

        Jump epicRecord = new Jump(1985, 12, "1979DKH", 45, 25.75, 25);
        boolean affordable = epicRecord.affordableRecord(epicRecord.price);
        System.out.println(affordable);

        epicRecord.powerOff();

    }


}

