package p383ke;

import android.support.p013v4.media.C0069a;
import androidx.compose.foundation.layout.C0761x;
import androidx.datastore.preferences.protobuf.C2606m;
import androidx.preference.C3039b;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.internal.FeatureManager;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.internal.C19736t;
import okhttp3.C19931b;
import okhttp3.C19940c0;
import okhttp3.C20011u;
import okhttp3.C20018z;
import p273w4.C8238g;
import p401mg.C13080a;
import p484xf.C13882a;
import p715xn.C18822c;
import p715xn.C18823d;

/* renamed from: ke.a */
public final class C12995a implements C19931b, FeatureManager.C12256a, C8238g, C18822c {

    /* renamed from: b */
    public static final C19736t f28606b = new C19736t("RESUME_TOKEN");

    /* renamed from: c */
    public static final int[] f28607c = {1, 0, 0, -1, -1, -1, -1};

    /* renamed from: d */
    public static final int[] f28608d = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};

    /* renamed from: e */
    public static final int[] f28609e = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    /* renamed from: f */
    public static final int[] f28610f = {-1, -1, -2, -1, -1, -1};

    /* renamed from: g */
    public static final int[] f28611g = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};

    /* renamed from: h */
    public static final int[] f28612h = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

    /* renamed from: i */
    public static final C12995a f28613i = new C12995a();

    /* renamed from: d */
    public static void m20689d(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & UnsignedInteger.INT_MASK;
            long j3 = ((((long) iArr[0]) & UnsignedInteger.INT_MASK) - j2) + 0;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & UnsignedInteger.INT_MASK);
                iArr[1] = (int) j5;
                long j6 = (j5 >> 32) + (((long) iArr[2]) & UnsignedInteger.INT_MASK);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = (UnsignedInteger.INT_MASK & ((long) iArr[3])) + j2 + j4;
            iArr[3] = (int) j7;
            j = j7 >> 32;
        } else {
            j = 0;
        }
        if ((j != 0 && C2606m.m6159y(7, iArr, 4) != 0) || (iArr[6] == -1 && C2606m.m6122Q(iArr, f28607c))) {
            m20691f(iArr);
        }
    }

    /* renamed from: e */
    public static void m20690e(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        C3039b.m7165g0(iArr, iArr3);
        while (true) {
            m20698m(iArr3, iArr2);
            i--;
            if (i > 0) {
                C3039b.m7165g0(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public static void m20691f(int[] iArr) {
        long j = (((long) iArr[0]) & UnsignedInteger.INT_MASK) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & UnsignedInteger.INT_MASK);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & UnsignedInteger.INT_MASK);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = (UnsignedInteger.INT_MASK & ((long) iArr[3])) + 1 + j2;
        iArr[3] = (int) j5;
        if ((j5 >> 32) != 0) {
            C2606m.m6159y(7, iArr, 4);
        }
    }

    /* renamed from: g */
    public static void m20692g(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C2606m.m6140f(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && C2606m.m6122Q(iArr3, f28607c))) {
            m20691f(iArr3);
        }
    }

    /* renamed from: h */
    public static void m20693h(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & UnsignedInteger.INT_MASK;
            long j3 = (((long) iArr[0]) & UnsignedInteger.INT_MASK) + j2 + 0;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & UnsignedInteger.INT_MASK);
                iArr[1] = (int) j5;
                j4 = j5 >> 32;
            }
            long j6 = (UnsignedInteger.INT_MASK & ((long) iArr[2])) + j2 + j4;
            iArr[2] = (int) j6;
            j = j6 >> 32;
        } else {
            j = 0;
        }
        if ((j != 0 && C2606m.m6159y(6, iArr, 3) != 0) || (iArr[5] == -1 && C3039b.m7152V(iArr, f28610f))) {
            m20694i(iArr);
        }
    }

    /* renamed from: i */
    public static void m20694i(int[] iArr) {
        long j = (((long) iArr[0]) & UnsignedInteger.INT_MASK) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & UnsignedInteger.INT_MASK);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = (UnsignedInteger.INT_MASK & ((long) iArr[2])) + 1 + j2;
        iArr[2] = (int) j4;
        if ((j4 >> 32) != 0) {
            C2606m.m6159y(6, iArr, 3);
        }
    }

    /* renamed from: j */
    public static void m20695j(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[14];
        C2606m.m6120O(iArr, iArr2, iArr4);
        m20697l(iArr4, iArr3);
    }

    /* renamed from: k */
    public static void m20696k(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        C3039b.m7163f0(iArr, iArr2, iArr4);
        m20698m(iArr4, iArr3);
    }

    /* renamed from: l */
    public static void m20697l(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) iArr[10]) & UnsignedInteger.INT_MASK;
        long j2 = ((long) iArr[11]) & UnsignedInteger.INT_MASK;
        long j3 = ((long) iArr[12]) & UnsignedInteger.INT_MASK;
        long j4 = ((long) iArr[13]) & UnsignedInteger.INT_MASK;
        long j5 = ((((long) iArr[7]) & UnsignedInteger.INT_MASK) + j2) - 1;
        long j6 = (((long) iArr[8]) & UnsignedInteger.INT_MASK) + j3;
        long j7 = j3;
        long j8 = (((long) iArr[9]) & UnsignedInteger.INT_MASK) + j4;
        long j9 = j4;
        long j10 = ((((long) iArr[0]) & UnsignedInteger.INT_MASK) - j5) + 0;
        long j11 = j10 & UnsignedInteger.INT_MASK;
        long j12 = j2;
        long j13 = ((((long) iArr[1]) & UnsignedInteger.INT_MASK) - j6) + (j10 >> 32);
        int i = (int) j13;
        iArr3[1] = i;
        long j14 = ((((long) iArr[2]) & UnsignedInteger.INT_MASK) - j8) + (j13 >> 32);
        int i2 = (int) j14;
        iArr3[2] = i2;
        int i3 = i2;
        long j15 = (((((long) iArr[3]) & UnsignedInteger.INT_MASK) + j5) - j) + (j14 >> 32);
        long j16 = j15 & UnsignedInteger.INT_MASK;
        long j17 = (((((long) iArr[4]) & UnsignedInteger.INT_MASK) + j6) - j12) + (j15 >> 32);
        iArr3[4] = (int) j17;
        long j18 = (((((long) iArr[5]) & UnsignedInteger.INT_MASK) + j8) - j7) + (j17 >> 32);
        iArr3[5] = (int) j18;
        long j19 = (((((long) iArr[6]) & UnsignedInteger.INT_MASK) + j) - j9) + (j18 >> 32);
        iArr3[6] = (int) j19;
        long j20 = (j19 >> 32) + 1;
        long j21 = j16 + j20;
        long j22 = j11 - j20;
        iArr3[0] = (int) j22;
        long j23 = j22 >> 32;
        if (j23 != 0) {
            long j24 = j23 + (((long) i) & UnsignedInteger.INT_MASK);
            iArr3[1] = (int) j24;
            long j25 = (j24 >> 32) + (UnsignedInteger.INT_MASK & ((long) i3));
            iArr3[2] = (int) j25;
            j21 += j25 >> 32;
        }
        iArr3[3] = (int) j21;
        if (((j21 >> 32) != 0 && C2606m.m6159y(7, iArr3, 4) != 0) || (iArr3[6] == -1 && C2606m.m6122Q(iArr3, f28607c))) {
            m20691f(iArr2);
        }
    }

    /* renamed from: m */
    public static void m20698m(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) iArr[6]) & UnsignedInteger.INT_MASK;
        long j2 = ((long) iArr[7]) & UnsignedInteger.INT_MASK;
        long j3 = ((long) iArr[8]) & UnsignedInteger.INT_MASK;
        long j4 = ((long) iArr[9]) & UnsignedInteger.INT_MASK;
        long j5 = (((long) iArr[10]) & UnsignedInteger.INT_MASK) + j;
        long j6 = (((long) iArr[11]) & UnsignedInteger.INT_MASK) + j2;
        long j7 = j2;
        long j8 = (((long) iArr[0]) & UnsignedInteger.INT_MASK) + j5 + 0;
        int i = (int) j8;
        long j9 = (((long) iArr[1]) & UnsignedInteger.INT_MASK) + j6 + (j8 >> 32);
        int i2 = (int) j9;
        iArr3[1] = i2;
        long j10 = j5 + j3;
        long j11 = j6 + j4;
        long j12 = (((long) iArr[2]) & UnsignedInteger.INT_MASK) + j10 + (j9 >> 32);
        long j13 = j12 & UnsignedInteger.INT_MASK;
        long j14 = (((long) iArr[3]) & UnsignedInteger.INT_MASK) + j11 + (j12 >> 32);
        iArr3[3] = (int) j14;
        long j15 = (((long) iArr[4]) & UnsignedInteger.INT_MASK) + (j10 - j) + (j14 >> 32);
        iArr3[4] = (int) j15;
        long j16 = (((long) iArr[5]) & UnsignedInteger.INT_MASK) + (j11 - j7) + (j15 >> 32);
        iArr3[5] = (int) j16;
        long j17 = j16 >> 32;
        long j18 = j13 + j17;
        long j19 = j17 + (((long) i) & UnsignedInteger.INT_MASK);
        iArr3[0] = (int) j19;
        long j20 = j19 >> 32;
        if (j20 != 0) {
            long j21 = j20 + (((long) i2) & UnsignedInteger.INT_MASK);
            iArr3[1] = (int) j21;
            j18 += j21 >> 32;
        }
        iArr3[2] = (int) j18;
        if (((j18 >> 32) != 0 && C2606m.m6159y(6, iArr3, 3) != 0) || (iArr3[5] == -1 && C3039b.m7152V(iArr3, f28610f))) {
            m20694i(iArr2);
        }
    }

    /* renamed from: o */
    public static void m20699o(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        C2606m.m6128W(iArr, iArr3);
        m20697l(iArr3, iArr2);
    }

    /* renamed from: p */
    public static void m20700p(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C2606m.m6131Z(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & UnsignedInteger.INT_MASK) + 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & UnsignedInteger.INT_MASK);
                iArr3[1] = (int) j3;
                long j4 = (j3 >> 32) + (((long) iArr3[2]) & UnsignedInteger.INT_MASK);
                iArr3[2] = (int) j4;
                j2 = j4 >> 32;
            }
            long j5 = ((UnsignedInteger.INT_MASK & ((long) iArr3[3])) - 1) + j2;
            iArr3[3] = (int) j5;
            if ((j5 >> 32) != 0) {
                C2606m.m6134b(7, iArr3, 4);
            }
        }
    }

    /* renamed from: q */
    public static void m20701q(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        C3039b.m7165g0(iArr, iArr3);
        m20698m(iArr3, iArr2);
    }

    /* renamed from: r */
    public static void m20702r(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C3039b.m7180p0(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & UnsignedInteger.INT_MASK) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & UnsignedInteger.INT_MASK);
                iArr3[1] = (int) j3;
                j2 = j3 >> 32;
            }
            long j4 = ((UnsignedInteger.INT_MASK & ((long) iArr3[2])) - 1) + j2;
            iArr3[2] = (int) j4;
            if ((j4 >> 32) != 0) {
                C2606m.m6134b(6, iArr3, 3);
            }
        }
    }

    /* renamed from: a */
    public void mo45793a(C18823d dVar) {
        int i;
        String str = dVar.f41673a;
        int i2 = dVar.f41678f;
        int length = str.length();
        boolean z = false;
        if (i2 < length) {
            char charAt = str.charAt(i2);
            i = 0;
            while (true) {
                if (!(charAt >= '0' && charAt <= '9') || i2 >= length) {
                    break;
                }
                i++;
                i2++;
                if (i2 < length) {
                    charAt = str.charAt(i2);
                }
            }
        } else {
            i = 0;
        }
        if (i >= 2) {
            char charAt2 = dVar.f41673a.charAt(dVar.f41678f);
            char charAt3 = dVar.f41673a.charAt(dVar.f41678f + 1);
            if (charAt2 >= '0' && charAt2 <= '9') {
                if (charAt3 >= '0' && charAt3 <= '9') {
                    z = true;
                }
                if (z) {
                    dVar.mo70272e((char) C0069a.m171b(charAt3, -48, (charAt2 - '0') * 10, 130));
                    dVar.f41678f += 2;
                    return;
                }
            }
            throw new IllegalArgumentException("not digits: " + charAt2 + charAt3);
        }
        char b = dVar.mo70269b();
        int t0 = C0761x.m1745t0(dVar.f41678f, 0, dVar.f41673a);
        if (t0 != 0) {
            if (t0 == 1) {
                dVar.mo70272e(230);
                dVar.f41679g = 1;
            } else if (t0 == 2) {
                dVar.mo70272e(239);
                dVar.f41679g = 2;
            } else if (t0 == 3) {
                dVar.mo70272e(238);
                dVar.f41679g = 3;
            } else if (t0 == 4) {
                dVar.mo70272e(240);
                dVar.f41679g = 4;
            } else if (t0 == 5) {
                dVar.mo70272e(231);
                dVar.f41679g = 5;
            } else {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(t0)));
            }
        } else if (C0761x.m1737o0(b)) {
            dVar.mo70272e(235);
            dVar.mo70272e((char) ((b - 128) + 1));
            dVar.f41678f++;
        } else {
            dVar.mo70272e((char) (b + 1));
            dVar.f41678f++;
        }
    }

    /* renamed from: b */
    public void mo20846b() {
    }

    /* renamed from: c */
    public C20011u mo30010c(C19940c0 c0Var, C20018z zVar) {
        C19383o.m32797g(zVar, ResponseConstants.RESPONSE);
        return null;
    }

    /* renamed from: n */
    public void mo20n(boolean z) {
        if (z) {
            boolean z2 = C13882a.f30540a;
            Class<C13882a> cls = C13882a.class;
            if (!C13080a.m20762b(cls)) {
                try {
                    C13882a.f30540a = true;
                    C13882a.f30543d.mo46711a();
                } catch (Throwable th) {
                    C13080a.m20761a(cls, th);
                }
            }
        }
    }
}
