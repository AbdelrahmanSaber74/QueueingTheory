package main;
public class DeterministicQS {
    private final double interArrivalTime, serviceTime;
    private final int systemCapacity, M, ti;
    private final boolean isCase1;
    public DeterministicQS(int systemCapacity, double interArrivalTime, double serviceTime) {
        this.systemCapacity = (systemCapacity > 0) ? systemCapacity : 1;
        this.interArrivalTime = (interArrivalTime > 0) ? interArrivalTime : 1;
        this.serviceTime = (serviceTime > 0) ? serviceTime : 1;
        isCase1 = (this.interArrivalTime < this.serviceTime);
        M = 0;
        if(isCase1)
        {
            int t = (int) this.interArrivalTime;
            for (; ((int) (Math.floor(t / this.interArrivalTime) - Math.floor((t - this.interArrivalTime) / this.serviceTime))) != (this.systemCapacity + 1); t++) {}
            ti = t;
        }
        else
            ti = 0;
    }
    public DeterministicQS(int systemCapacity, double interArrivalTime, double serviceTime, int M) {
        this.systemCapacity = (systemCapacity > 0) ? systemCapacity : 1;
        this.interArrivalTime = (interArrivalTime > 0) ? interArrivalTime : 1;
        this.serviceTime = (serviceTime > 0) ? serviceTime : 1;
        isCase1 = (this.interArrivalTime < this.serviceTime);
        if(isCase1)
        {
            this.M = 0;
            int t = (int) this.interArrivalTime;
            for (; ((int) (Math.floor(t / this.interArrivalTime) - Math.floor((t - this.interArrivalTime) / this.serviceTime))) != (this.systemCapacity + 1); t++) {}
            ti = t;
        }
        else
        {
            this.M = (M > 0) ? M : 0;
            int t = 0;
            for (; ((int) (Math.floor(t / this.serviceTime) - Math.floor(t / this.interArrivalTime))) != this.M; t++) {}
            ti = t;
        }
    }
    public double getInterArrivalTime() {
        return interArrivalTime;
    }
    public double getServiceTime() {
        return serviceTime;
    }
    public int getSystemCapacity() {
        return systemCapacity;
    }
    public int getM() {
        return M;
    }
    public int getTi() {
        return ti;
    }
    public int nOfT(int t) {
        if(isCase1)
        {
            if(t < interArrivalTime)
                return 0;
            if(t < ti)
                return ((int) (Math.floor(t / interArrivalTime) - Math.floor((t - interArrivalTime) / serviceTime)));
            return systemCapacity;
        }
        if(t < serviceTime)
            return M;
        if(t < ti)
            return (M + ((int) (Math.floor(t / interArrivalTime) - Math.floor(t / serviceTime))));
        return 0;
    }
    public double wqOfN(int n) {
        if(isCase1)
        {
            if(n == 0)
                return 0;
            if(n < (ti / interArrivalTime))
                return ((serviceTime - interArrivalTime) * (n - 1));
            return ((serviceTime - interArrivalTime) * ((ti / interArrivalTime) - 2));
        }
        if(n == 0)
            return Math.max(((M - 1) * serviceTime * 0.5), 0);
        if(n < (ti / interArrivalTime))
                return (((M + n - 1) * serviceTime) - (n * interArrivalTime));
        return 0;
    }
}