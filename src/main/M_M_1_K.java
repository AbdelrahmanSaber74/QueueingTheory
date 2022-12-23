package main;
public class M_M_1_K extends StochasticQS {
    private final double arrivalRate, serviceRate, ρ;
    private final int K;
    public M_M_1_K(double arrivalRate, double serviceRate, int K) {
        this.arrivalRate = (arrivalRate > 0) ? arrivalRate : 1;
        this.serviceRate = (serviceRate > 0) ? serviceRate : 1;
        this.K = (K > 0) ? K : 1;
        ρ = this.arrivalRate / this.serviceRate;
    }
    public double getArrivalRate() {
        return arrivalRate;
    }
    public double getServiceRate() {
        return serviceRate;
    }
    public int getK() {
        return K;
    }
    private double getLambdaDash() {
        return (arrivalRate * (1 - pOfN(K)));
    }
    @Override
    public double getL() {
        if(ρ == 1.0)
            return (K / 2.0);
        return (ρ * ((1 - ((K + 1) * Math.pow(ρ, (K))) + (K * Math.pow(ρ, (K + 1)))) / ((1 - ρ) * (1 - Math.pow(ρ, (K + 1))))));
    }
    @Override
    public double getLq() {
        return (getLambdaDash() * getWq());
    }
    @Override
    public double getW() {
        return (getL() / getLambdaDash());
    }
    @Override
    public double getWq() {
        return (getW() - (1 / serviceRate));
    }
    @Override
    public double pOfN(int n) {
        if(n < 0)
            n = 0;
        if(ρ == 1.0)
            return (1.0 / (K + 1));
        return (Math.pow(ρ, n) * ((1 - ρ) / (1 - Math.pow(ρ, (K + 1)))));
    }
}