package p644ph;

import android.util.Log;
import p513bj.C14077r;
import p644ph.C18368v;

/* renamed from: ph.b */
public final class C18343b {
    /* renamed from: a */
    public static void m30976a(long j, C14077r rVar, C18368v[] vVarArr) {
        int i;
        while (true) {
            boolean z = true;
            if (rVar.f30988c - rVar.f30987b > 1) {
                int i2 = 0;
                while (true) {
                    if (rVar.f30988c - rVar.f30987b != 0) {
                        int p = rVar.mo46925p();
                        i2 += p;
                        if (p != 255) {
                            i = i2;
                            break;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                int i3 = 0;
                while (true) {
                    if (rVar.f30988c - rVar.f30987b != 0) {
                        int p2 = rVar.mo46925p();
                        i3 += p2;
                        if (p2 != 255) {
                            break;
                        }
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                int i4 = rVar.f30987b;
                int i5 = i4 + i3;
                if (i3 == -1 || i3 > rVar.f30988c - i4) {
                    Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i5 = rVar.f30988c;
                } else if (i == 4 && i3 >= 8) {
                    int p3 = rVar.mo46925p();
                    int u = rVar.mo46930u();
                    int c = u == 49 ? rVar.mo46912c() : 0;
                    int p4 = rVar.mo46925p();
                    if (u == 47) {
                        rVar.mo46909A(1);
                    }
                    boolean z2 = p3 == 181 && (u == 49 || u == 47) && p4 == 3;
                    if (u == 49) {
                        if (c != 1195456820) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        m30977b(j, rVar, vVarArr);
                    }
                }
                rVar.mo46935z(i5);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static void m30977b(long j, C14077r rVar, C18368v[] vVarArr) {
        int p = rVar.mo46925p();
        if ((p & 64) != 0) {
            rVar.mo46909A(1);
            int i = (p & 31) * 3;
            int i2 = rVar.f30987b;
            for (C18368v vVar : vVarArr) {
                rVar.mo46935z(i2);
                vVar.mo69899d(i, rVar);
                vVar.mo47754c(j, 1, i, 0, (C18368v.C18369a) null);
            }
        }
    }
}
