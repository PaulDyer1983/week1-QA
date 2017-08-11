public class Calaculation {

    Paint p = new Paint();
    private double cCoverage;
    private double aCoverage;
    private double dCoverage;
    private double cLitrePrice;
    private double aLitrePrice;
    private double dLitrePrice;
    private double cBestValue;
    private double aBestValue;
    private double dBestValue;
    private double cCansNeeded;
    private double aCansNeeded;
    private double dCansNeeded;
    private double wasteMost;
    private double wasteMiddle;
    private double wasteLeast;

    public Calaculation() {
    }

    public int roomSize(int size){

        return size;
    }

    public void cheapoMaxCalcs(){

        double[] cheapomax = p.getCheapomax();
        double litre;
        double price;
        double sqrMeter;
        litre = cheapomax[0];
        price = cheapomax[1];
        sqrMeter = cheapomax[2];
        cCoverage = litre * sqrMeter;
        cLitrePrice = price / litre;
        cBestValue = roomSize(25) * price;
        wasteLeast = (roomSize(25)/sqrMeter) - Math.floor((roomSize(25)/sqrMeter));
        cCansNeeded = Math.ceil(roomSize(25)/sqrMeter);


    }

    public void averageJoesMaxCalcs(){

        double[] averageJoes = p.getAverageJoes();
        double litre;
        double price;
        double sqrMeter;
        litre = averageJoes[0];
        price = averageJoes[1];
        sqrMeter = averageJoes[2];
        aCoverage = litre * sqrMeter;
        aLitrePrice = litre / price;
        aBestValue = roomSize(25) * price;
        wasteMiddle = (roomSize(25)/sqrMeter) - Math.floor((roomSize(25)/sqrMeter));
        aCansNeeded = Math.ceil(roomSize(25)/sqrMeter);

    }

    public void duluxourousPaintsMaxCalcs(){

        double[] duluxourousPaints = p.getDuluxourousPaints();
        double litre;
        double price;
        double sqrMeter;
        litre = duluxourousPaints[0];
        price = duluxourousPaints[1];
        sqrMeter = duluxourousPaints[2];
        dCoverage = litre * sqrMeter;
        dLitrePrice = price / litre;
        wasteMost = (roomSize(25)/sqrMeter) - Math.floor((roomSize(25)/sqrMeter));
        dBestValue = roomSize(25) * price;
        dCansNeeded = Math.ceil(roomSize(25)/sqrMeter);
    }

    public void bestValue(){
        System.out.println("-----Best Value-----");
        if(cBestValue < aBestValue || cBestValue < dBestValue){
            System.out.println("CheapoMax is the Best Value.");
        }
        else if(aBestValue < cBestValue || aBestValue < dBestValue){
            System.out.println("AverageJoes is the Best Value.");
        }
        else{
            System.out.println("DeluxourousPaint is the Best Value.");
        }
    }
    public void cansNeeded(){
        System.out.println();
        System.out.println("-----Cans Needed-----");
        System.out.println("CheapoMax Cans Needed: "+ cCansNeeded);
        System.out.println("AverageJoes Cans Needed: "+ aCansNeeded);
        System.out.println("Deluxourous Cans Needed: "+ dCansNeeded);

    }

    public void wastLeast(){
        System.out.println();
        System.out.println("-----Wastes the Least-----");

        if(wasteMost < wasteMiddle || wasteMost < wasteLeast){
            System.out.println("Delouxourous wastes the least.");
        }
        else if(wasteLeast < wasteMiddle || wasteLeast < wasteMost){
            System.out.println("CheapoMax wastes the least.");
        }
        else{
            System.out.println("AverageJoes wastes the least.");
        }

    }


}
