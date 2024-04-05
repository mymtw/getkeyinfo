package p030bo.app;

/* renamed from: bo.app.i3 */
public final class C3778i3 {

    /* renamed from: a */
    public static final C3778i3 f8594a = new C3778i3();

    private C3778i3() {
    }

    /* renamed from: a */
    public static final double m8823a(double d, double d2, double d3, double d4) {
        double radians = Math.toRadians(d3 - d);
        double radians2 = Math.toRadians(d4 - d2);
        double d5 = (double) 2;
        return Math.asin(Math.sqrt((Math.cos(Math.toRadians(d3)) * Math.cos(Math.toRadians(d)) * Math.pow(Math.sin(radians2 / d5), 2.0d)) + Math.pow(Math.sin(radians / d5), 2.0d))) * 6371000.0d * d5;
    }
}
