package p612li;

/* renamed from: li.a */
public abstract class C18185a implements C18189e {

    /* renamed from: b */
    public final long f39822b = 0;

    /* renamed from: c */
    public final long f39823c;

    /* renamed from: d */
    public long f39824d;

    public C18185a(long j) {
        this.f39823c = j;
        this.f39824d = -1;
    }

    public final boolean next() {
        long j = this.f39824d + 1;
        this.f39824d = j;
        return !(j > this.f39823c);
    }
}
