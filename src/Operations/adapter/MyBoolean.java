package Operations.adapter;

public class MyBoolean {
    boolean value;

    public MyBoolean(boolean value) {
        this.value = value;
    }

    public boolean isTrue() {
        return value;
    }

    public void setTrue() {
        this.value = true;
    }

    public void setFalse() {
        this.value = false;
    }

    @Override
    public String toString() {
        return "MyBoolean{" +
                "value=" + value +
                '}';
    }
}
