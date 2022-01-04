public class Port {
    public String name;
    public Object objectValue;

    public Port(){
    }

    public Port(String name, Object objectValue) {
        this.name = name;
        this.objectValue = objectValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getObjectValue() {
        return objectValue;
    }

    public void setObjectValue(Object objectValue) {
        this.objectValue = objectValue;
    }
}
