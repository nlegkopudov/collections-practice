package resources.test_objects;

public class TestObject_1 {
    private String id;
    private String strData;
    private int intData;

    public TestObject_1(String id, String strData, int intData) {
        this.id = id;
        this.strData = strData;
        this.intData = intData;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setStrData(String strData) {
        this.strData = strData;
    }

    public void setIntData(int intData) {
        this.intData = intData;
    }

    public String getId() {
        return id;
    }

    public String getStrData() {
        return strData;
    }

    public int getIntData() {
        return intData;
    }
}
