package p193o;

/* renamed from: o.e */
public final class C7497e {

    /* renamed from: a */
    public int[] f16717a;

    /* renamed from: b */
    public int f16718b;

    public C7497e() {
        int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f16718b = highestOneBit - 1;
        this.f16717a = new int[highestOneBit];
    }
}
