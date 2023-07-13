public class Client {
    public static void main(String[] args) {
        //We are using Builder as well as factory both
        GellPen gellPen = PenFactory.createGellPen()
                                    .setCanChangeRefill(true)
                                    .setRefill(new Refill())
                                    .build();

//        We can also use a prototype as well for example
//        GellPen reynoldsGellPen = PenFactory.createGellPen()
//                                            .setCanChangeRefill(true)
//                                            .setRefill(new Refill())
//                                            .build();
//        reynoldsGellPen.setPenType(PenType.GELL);
//        reynoldsGellPen.setCompany("Reynolds");
//        reynoldsGellPen.setName("Trimax");
//        Now we can put this reynolds pen in a registry so that it can be used again

        FountainPen fountainPen = PenFactory
                .createFountainPen()
                .setInk(new Ink())
                .setNib(new Nib())
                .build();
    }
}
