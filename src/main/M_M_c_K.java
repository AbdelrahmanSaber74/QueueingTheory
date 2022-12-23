package main;
public class M_M_c_K extends StochasticQS {
    private final double arrivalRate, serviceRate, r, ρ;
    private int c, K;
    public M_M_c_K(double arrivalRate, double serviceRate, int c, int K) {
        this.arrivalRate = (arrivalRate > 0) ? arrivalRate : 1;
        this.serviceRate = (serviceRate > 0) ? serviceRate : 1;
        this.c = (c > 0) ? c : 1;
        this.K = (K > 0) ? K : 1;
        if(this.K < this.c)
            this.K = this.c;
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
    public int getK() {
        return K;
    }
    private double getLambdaDash() {
        return (arrivalRate * (1 - pOfN(K)));
    }
    @Override
    public double getL() {
        double total = 0.0;
        for (int n = 0; n < c; n++)
            total += ((Math.pow(r, n) / factorial(n)) * (c - n));
        return (getLq() + c - (pOf0() * total));
    }
    @Override
    public double getLq() {
        return (((ρ * Math.pow(r, c) * pOf0()) / (factorial(c) * Math.pow((1 - ρ), 2))) * (1 - Math.pow(ρ, (K - c + 1)) - ((1 - ρ) * (K - c + 1) * Math.pow(ρ, (K - c)))));
    }
    @Override
    public double getW() {
        return (getL() / getLambdaDash());
    }
    @Override
    public double getWq() {
        return (getLq() / getLambdaDash());
    }
    private double pOf0() {
        double total = 0.0;
        for (int n = 0; n < c; n++)
            total += (Math.pow(r, n) / factorial(n));
        if(ρ == 1)
            total += ((Math.pow(r, c) / factorial(c)) * (K - c + 1));
        else
            total += ((Math.pow(r, c) / factorial(c)) * ((1 - Math.pow(ρ, (K - c + 1))) / (1 - ρ)));
        return (1 / total);
    }
    @Override
    public double pOfN(int n) {
        if(n <= 0)
            return pOf0();
        if(n < c)
            return ((Math.pow(r, n) / factorial(n)) * pOf0());
        if(n > K)
            n = K;
        return ((Math.pow(r, n) / (Math.pow(c, (n - c)) * factorial(c))) * pOf0());
    }
    private long factorial(int n) {
        long total = 1;
        for (int i = 2; i <= n; i++)
            total *= i;
        return total;
    }
}