package p034c3;

import android.support.p013v4.media.C0072d;
import androidx.work.BackoffPolicy;
import androidx.work.C3376c;
import androidx.work.C3380e;
import androidx.work.C3422l;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import p003a2.C0023f;

/* renamed from: c3.o */
public final class C4391o {

    /* renamed from: s */
    public static final String f9643s = C3422l.m8214e("WorkSpec");

    /* renamed from: a */
    public String f9644a;

    /* renamed from: b */
    public WorkInfo$State f9645b = WorkInfo$State.ENQUEUED;

    /* renamed from: c */
    public String f9646c;

    /* renamed from: d */
    public String f9647d;

    /* renamed from: e */
    public C3380e f9648e;

    /* renamed from: f */
    public C3380e f9649f;

    /* renamed from: g */
    public long f9650g;

    /* renamed from: h */
    public long f9651h;

    /* renamed from: i */
    public long f9652i;

    /* renamed from: j */
    public C3376c f9653j;

    /* renamed from: k */
    public int f9654k;

    /* renamed from: l */
    public BackoffPolicy f9655l;

    /* renamed from: m */
    public long f9656m;

    /* renamed from: n */
    public long f9657n;

    /* renamed from: o */
    public long f9658o;

    /* renamed from: p */
    public long f9659p;

    /* renamed from: q */
    public boolean f9660q;

    /* renamed from: r */
    public OutOfQuotaPolicy f9661r;

    /* renamed from: c3.o$a */
    public static class C4392a {

        /* renamed from: a */
        public String f9662a;

        /* renamed from: b */
        public WorkInfo$State f9663b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4392a)) {
                return false;
            }
            C4392a aVar = (C4392a) obj;
            if (this.f9663b != aVar.f9663b) {
                return false;
            }
            return this.f9662a.equals(aVar.f9662a);
        }

        public final int hashCode() {
            return this.f9663b.hashCode() + (this.f9662a.hashCode() * 31);
        }
    }

    public C4391o(String str, String str2) {
        C3380e eVar = C3380e.f7898c;
        this.f9648e = eVar;
        this.f9649f = eVar;
        this.f9653j = C3376c.f7881i;
        this.f9655l = BackoffPolicy.EXPONENTIAL;
        this.f9656m = 30000;
        this.f9659p = -1;
        this.f9661r = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f9644a = str;
        this.f9646c = str2;
    }

    /* renamed from: a */
    public final long mo14317a() {
        long j;
        long j2;
        boolean z = true;
        boolean z2 = false;
        if (this.f9645b == WorkInfo$State.ENQUEUED && this.f9654k > 0) {
            if (this.f9655l == BackoffPolicy.LINEAR) {
                z2 = true;
            }
            long scalb = z2 ? this.f9656m * ((long) this.f9654k) : (long) Math.scalb((float) this.f9656m, this.f9654k - 1);
            j = this.f9657n;
            j2 = Math.min(18000000, scalb);
        } else {
            long j3 = 0;
            if (mo14319c()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j4 = this.f9657n;
                int i = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
                if (i == 0) {
                    j4 = this.f9650g + currentTimeMillis;
                }
                long j5 = this.f9652i;
                long j6 = this.f9651h;
                if (j5 == j6) {
                    z = false;
                }
                if (z) {
                    if (i == 0) {
                        j3 = j5 * -1;
                    }
                    return j4 + j6 + j3;
                }
                if (i != 0) {
                    j3 = j6;
                }
                return j4 + j3;
            }
            j2 = this.f9657n;
            if (j2 == 0) {
                j2 = System.currentTimeMillis();
            }
            j = this.f9650g;
        }
        return j2 + j;
    }

    /* renamed from: b */
    public final boolean mo14318b() {
        return !C3376c.f7881i.equals(this.f9653j);
    }

    /* renamed from: c */
    public final boolean mo14319c() {
        return this.f9651h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4391o.class != obj.getClass()) {
            return false;
        }
        C4391o oVar = (C4391o) obj;
        if (this.f9650g != oVar.f9650g || this.f9651h != oVar.f9651h || this.f9652i != oVar.f9652i || this.f9654k != oVar.f9654k || this.f9656m != oVar.f9656m || this.f9657n != oVar.f9657n || this.f9658o != oVar.f9658o || this.f9659p != oVar.f9659p || this.f9660q != oVar.f9660q || !this.f9644a.equals(oVar.f9644a) || this.f9645b != oVar.f9645b || !this.f9646c.equals(oVar.f9646c)) {
            return false;
        }
        String str = this.f9647d;
        if (str == null ? oVar.f9647d != null : !str.equals(oVar.f9647d)) {
            return false;
        }
        if (this.f9648e.equals(oVar.f9648e) && this.f9649f.equals(oVar.f9649f) && this.f9653j.equals(oVar.f9653j) && this.f9655l == oVar.f9655l) {
            return this.f9661r == oVar.f9661r;
        }
        return false;
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f9646c, (this.f9645b.hashCode() + (this.f9644a.hashCode() * 31)) * 31, 31);
        String str = this.f9647d;
        int hashCode = str != null ? str.hashCode() : 0;
        int hashCode2 = this.f9648e.hashCode();
        int hashCode3 = this.f9649f.hashCode();
        long j = this.f9650g;
        long j2 = this.f9651h;
        long j3 = this.f9652i;
        int hashCode4 = this.f9653j.hashCode();
        int hashCode5 = this.f9655l.hashCode();
        long j4 = this.f9656m;
        long j5 = this.f9657n;
        long j6 = this.f9658o;
        long j7 = this.f9659p;
        return this.f9661r.hashCode() + ((((((((((((hashCode5 + ((((hashCode4 + ((((((((hashCode3 + ((hashCode2 + ((e + hashCode) * 31)) * 31)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.f9654k) * 31)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f9660q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return C0023f.m110k(C0072d.m201h("{WorkSpec: "), this.f9644a, "}");
    }

    public C4391o(C4391o oVar) {
        C3380e eVar = C3380e.f7898c;
        this.f9648e = eVar;
        this.f9649f = eVar;
        this.f9653j = C3376c.f7881i;
        this.f9655l = BackoffPolicy.EXPONENTIAL;
        this.f9656m = 30000;
        this.f9659p = -1;
        this.f9661r = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f9644a = oVar.f9644a;
        this.f9646c = oVar.f9646c;
        this.f9645b = oVar.f9645b;
        this.f9647d = oVar.f9647d;
        this.f9648e = new C3380e(oVar.f9648e);
        this.f9649f = new C3380e(oVar.f9649f);
        this.f9650g = oVar.f9650g;
        this.f9651h = oVar.f9651h;
        this.f9652i = oVar.f9652i;
        this.f9653j = new C3376c(oVar.f9653j);
        this.f9654k = oVar.f9654k;
        this.f9655l = oVar.f9655l;
        this.f9656m = oVar.f9656m;
        this.f9657n = oVar.f9657n;
        this.f9658o = oVar.f9658o;
        this.f9659p = oVar.f9659p;
        this.f9660q = oVar.f9660q;
        this.f9661r = oVar.f9661r;
    }
}
