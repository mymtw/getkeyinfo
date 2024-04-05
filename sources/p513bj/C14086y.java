package p513bj;

/* renamed from: bj.y */
public final class C14086y {

    /* renamed from: a */
    public boolean f31017a;

    /* renamed from: b */
    public long f31018b;

    /* renamed from: c */
    public long f31019c;

    /* renamed from: d */
    public long f31020d = -9223372036854775807L;

    public C14086y(long j) {
        this.f31018b = j;
    }

    /* renamed from: a */
    public final synchronized long mo46957a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f31020d != -9223372036854775807L) {
            this.f31020d = j;
        } else {
            long j2 = this.f31018b;
            if (j2 != Long.MAX_VALUE) {
                this.f31019c = j2 - j;
            }
            this.f31020d = j;
            notifyAll();
        }
        return j + this.f31019c;
    }

    /* renamed from: b */
    public final synchronized long mo46958b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.f31020d;
        if (j2 != -9223372036854775807L) {
            long j3 = (j2 * 90000) / 1000000;
            long j4 = (4294967296L + j3) / 8589934592L;
            long j5 = ((j4 - 1) * 8589934592L) + j;
            j += j4 * 8589934592L;
            if (Math.abs(j5 - j3) < Math.abs(j - j3)) {
                j = j5;
            }
        }
        return mo46957a((j * 1000000) / 90000);
    }

    /* renamed from: c */
    public final synchronized long mo46959c() {
        long j;
        j = -9223372036854775807L;
        if (this.f31018b == Long.MAX_VALUE) {
            j = 0;
        } else if (this.f31020d != -9223372036854775807L) {
            j = this.f31019c;
        }
        return j;
    }
}
