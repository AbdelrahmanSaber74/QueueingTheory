package main;
public class M_M_c extends StochasticQS {
    private final double arrivalRate, serviceRate, r, ρ;
    private final int c;
    public M_M_c(double arrivalRate, double serviceRate, int c) {
        this.arrivalRate = (arrivalRate > 0) ? arrivalRate : 1;
        this.serviceRate = (serviceRate > 0) ? serviceRate : 1;
        this.c = (c > 0) ? c : 1;
        r = this.arrivalRate / this.serviceRate;
        ρ = r / this.c;
    }
    public double getArrivalRate() {
        return arrivalRate;
    }
    public double getServiceRate() {
        return serviceRate;
    }
    public int getC() {
        return c;
    }
    @Override
    public double getL() {
        return (getLq() + r);
    }
    @Override
    public double getLq() {
        return (((Math.pow(r, (c + 1)) / c) / (factorial(c) * Math.pow((1 - ρ), 2))) * pOf0());
    }
    @Override
    public double getW() {
        return (getL() / arrivalRate);
    }
    @Override
    public double getWq() {
        return (getLq() / arrivalRate);
    }
    public double getCi() {
        return (c - r);
    }
    private double pOf0() {
        double total = 0.0;
        for (int n = 0; n < c; n++)
            total += (Math.pow(r, n) / factorial(n));
        if(ρ < 1)
            total += ((c * Math.pow(r, c)) / (factorial(c) * (c - r)));
        else
            total += ((Math.pow(r, c) / factorial(c)) * ((c * serviceRate) / (c * serviceRate - arrivalRate)));
        return (1 / total);
    }
    @Override
    public double pOfN(int n) {
        if(n <= 0)
            return pOf0();
        if(n < c)
            return ((Math.pow(arrivalRate, n) / (factorial(n) * Math.pow(serviceRate, n))) * pOf0());
        return ((Math.pow(arrivalRate, n) / (Math.pow(c, (n - c)) * factorial(c) * Math.pow(serviceRate, n))) * pOf0());
    }
    private long factorial(int n) {
        long total = 1;
        for (int i = 2; i <= n; i++)
            total *= i;
        return total;
    }
}