package observerpattern;

// Represents each Observer that is monitoring changes in the subject
public class StockObserver implements Observer{

    private double ibmPrice;
    private double applPrice;
    private double googPrice;

    //static used as a counter
    private static int observerIDTracker=0;
    //used to track the observers
    private int observerID;
    //will hold reference to the StockGrabber object
    private Subject stockGrabber;
    public StockObserver(Subject stockGrabber){
        //store the reference to the stockGrabber object so
        //I can make calls to its methods
        this.stockGrabber= stockGrabber;
        //Assign an observer ID and increment the static counter
        this.observerID=++observerIDTracker;
        //Message notifies user of new observer
        System.out.println("New observer " + this.observerID);
        //add the observer to the Subjects ArrayList
        stockGrabber.register(this);
    }

    //called to update all observers
    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.applPrice = aaplPrice;
        this.googPrice = googPrice;
        printThePrices();
    }

    public void printThePrices(){
        System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAPPL: " +
        applPrice + "\nGOOG: " + googPrice + "\n");
    }
}
