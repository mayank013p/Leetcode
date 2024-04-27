class Solution {
    public double[] convertTemperature(double celsius) {
        double kal = celsius + 273.15;
        double fah = celsius * 1.80 + 32.00;

        double arr[] = {kal,fah};
        return arr;
    }
}