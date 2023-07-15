package generic;

public record Box<D>(D data) {

    @Override
    public String toString() {
        return String.format("Box{data=%s}", data);
    }
}