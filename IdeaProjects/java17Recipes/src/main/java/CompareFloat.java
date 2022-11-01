public class CompareFloat {
    public static void compareFloat() {
        Float float1 = Float.valueOf("9.675");
        Float float2 = Float.valueOf("7.3826");
        Float float3 = Float.valueOf("23467.373");

        System.out.println(float1.compareTo(float3));
        System.out.println(float2.compareTo(float3));
        System.out.println(float1.compareTo(float1));
        System.out.println(float3.compareTo(float2));
    }

    public static void main (String[] args) {
        compareFloat();

        Float float1 = Float.valueOf("9.675");
        Float float2 = Float.valueOf("7.3826");
        Float float3 = Float.valueOf("23467.373");
        System.out.println(Float.compare(float1, float3));
        System.out.println(Float.compare(float2, float3));
        System.out.println(Float.compare(float1, float1));
        System.out.println(Float.compare(float3, float2 ));

    }
}
