package resources.test_objects;

public class TestObject_1 {
    private String orderNumber;
    private String strData;
    private int intData;

    public TestObject_1(String orderNumber, String strData, int intData) {
        this.orderNumber = orderNumber;
        this.strData = strData;
        this.intData = intData;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setStrData(String strData) {
        this.strData = strData;
    }

    public void setIntData(int intData) {
        this.intData = intData;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getStrData() {
        return strData;
    }

    public int getIntData() {
        return intData;
    }

    public void printObjectFields(){
        System.out.println("Order: " + this.orderNumber + " Data: " + this.strData + " " + this.intData);
    }
}
