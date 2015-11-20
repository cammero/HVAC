import java.util.Date;

/**
 * Created by Cameo on 11/18/2015.
 */

public class WaterHeater extends ServiceCall {
    private int ageOfWaterHeater;
    private static double mandatoryExtraCharge = 20;

    public WaterHeater(String serviceAddress, String problemDescription, Date date, int age) {
        super(serviceAddress, problemDescription, date);
        this.ageOfWaterHeater = age;
    }

    @Override
    public String toString() {

        String resolvedDateString = (resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = (this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee + mandatoryExtraCharge) + " Which includes the mandatory city fee of $" + mandatoryExtraCharge;


        return "Water Heater Service Call " + "\n" +
                "Service Address = " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription  + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Fee = " + feeString;
    }
}
