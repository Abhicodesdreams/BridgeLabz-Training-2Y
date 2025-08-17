public class Earth_Volume {
    public static void main(String[] args) {

        double RadiusKm = 6378;
        double conversion_fac = 1.6;

        double Volume_Km= (4.0/3.0)*Math.PI * Math.pow(RadiusKm,3);
        double RadiusMiles =  RadiusKm/conversion_fac;

        double Volume_miles = (4.0/3.0)*Math.PI*Math.pow(RadiusMiles,3);

        System.out.println("The volume of earth in cubic kilometres is "+Volume_Km+" and cubic metres is "+Volume_miles);



    }
}
