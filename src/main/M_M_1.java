package main;
public class M_M_1 extends StochasticQS {
    private double arrivalRate, serviceRate;
    M_M_1(double arrivalRate, double serviceRate) {
        this.arrivalRate = (arrivalRate > 0) ? arrivalRate : 1;
        this.serviceRate = (serviceRate > 0) ? serviceRate : 1;
        if(this.arrivalRate >= this.serviceRate)
            this.serviceRate = this.arrivalRate + (this.arrivalRate / 100.0);
    }
    public double getArrivalRate() {
        return arrivalRate;
    }
    public double getServiceRate() {
        return serviceRate;
    }
    @Override
    public double getL() {
        return (arrivalRate * getW());
    }
    @Override
    public double getLq() {
        return (arrivalRate * getWq());
    }
    @Override
    public double getW() {
        return (1 / (serviceRate - arrivalRate));
    }
    @Override
    public double getWq() {
        return (getW() - (1 / serviceRate));
    }
    @Override
    public double pOfN(int n) {
        if(n < 0)
            n = 0;
        return (Math.pow((arrivalRate / serviceRate), n) * (1 - (arrivalRate / serviceRate)));
    }
}