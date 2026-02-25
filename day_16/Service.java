package day_16;

public class Service {

    private String serviceName;
    private double serviceCharge;
    private int serviceId;
    private static int count = 2001;

    public Service(String serviceName, double serviceCharge) {
        this.serviceName = serviceName;
        this.serviceCharge = serviceCharge;
        this.serviceId = count++;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    @Override
    public String toString() {
        return "Service{ID=" + serviceId + ", name='" + serviceName + "', charge=" + serviceCharge + "}";
    }
}