public class TestClass {
    private long visibleOnlyInThisClass;
    double visibleFroEntirePackage;
    void setLong(long val) {
        visibleOnlyInThisClass = val;
    }

    long getLong() {
        return visibleOnlyInThisClass;
    }
}
