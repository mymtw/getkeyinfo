package p409o9;

import com.etsy.android.lib.config.EtsyConfigKey;
import com.etsy.android.lib.logger.C8677e;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19456j;
import kotlin.text.C19457k;
import kotlin.text.C19459m;
import p003a2.C0023f;
import p504ai.C13983i;

/* renamed from: o9.l */
public final class C13132l implements C13137p, C8677e.C8678a {

    /* renamed from: a */
    public final String f28870a;

    /* renamed from: b */
    public final String f28871b;

    /* renamed from: c */
    public final String f28872c;

    /* renamed from: d */
    public final String f28873d;

    /* renamed from: e */
    public final List<C8677e.C8678a> f28874e;

    /* renamed from: f */
    public final C13122d f28875f;

    /* renamed from: g */
    public final String f28876g;

    /* renamed from: h */
    public final boolean f28877h;

    /* renamed from: i */
    public Boolean f28878i;

    /* renamed from: j */
    public Integer f28879j;

    /* renamed from: k */
    public Double f28880k;

    /* renamed from: l */
    public Long f28881l;

    /* renamed from: m */
    public int[] f28882m;

    /* renamed from: n */
    public String[] f28883n;

    /* renamed from: o9.l$a */
    public static final class C13133a {
        /* renamed from: a */
        public static int[] m20804a(String str) {
            C19383o.m32797g(str, "value");
            try {
                List<String> y1 = C19459m.m33056y1(str, new String[]{","}, 0, 6);
                ArrayList arrayList = new ArrayList(C19322o.m32624F0(y1));
                for (String parseInt : y1) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(parseInt)));
                }
                return C19327t.m32659o1(arrayList);
            } catch (NumberFormatException unused) {
                return new int[0];
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C13132l(String str, String str2) {
        this(str, str2, (String) null, (String) null, (C13122d) null, (String) null, 124);
        C19383o.m32797g(str, "name");
        C19383o.m32797g(str2, "valueString");
    }

    public C13132l(String str, String str2, String str3, String str4, List<? extends C8677e.C8678a> list, C13122d dVar, String str5) {
        C19383o.m32797g(str, "name");
        C19383o.m32797g(str2, "valueString");
        C19383o.m32797g(list, "persistentExperimentsList");
        this.f28870a = str;
        this.f28871b = str2;
        this.f28872c = str3;
        this.f28873d = str4;
        this.f28874e = list;
        this.f28875f = dVar;
        this.f28876g = str5;
        boolean z = true;
        this.f28877h = (str3 == null || str4 == null) ? false : true;
        if (str2.length() != 0 ? false : z) {
            this.f28878i = Boolean.FALSE;
            this.f28879j = 0;
            this.f28880k = Double.valueOf(ShadowDrawableWrapper.COS_45);
            this.f28881l = 0L;
            this.f28882m = new int[0];
            this.f28883n = new String[0];
        }
    }

    /* renamed from: g */
    public static C13132l m20792g(C13132l lVar, String str) {
        String str2 = lVar.f28870a;
        String str3 = lVar.f28872c;
        String str4 = lVar.f28873d;
        List<C8677e.C8678a> list = lVar.f28874e;
        C13122d dVar = lVar.f28875f;
        String str5 = lVar.f28876g;
        C19383o.m32797g(str2, "name");
        C19383o.m32797g(list, "persistentExperimentsList");
        return new C13132l(str2, str, str3, str4, (List<? extends C8677e.C8678a>) list, dVar, str5);
    }

    /* renamed from: a */
    public final String mo21123a() {
        return this.f28876g;
    }

    /* renamed from: b */
    public final String mo21124b() {
        return this.f28873d;
    }

    /* renamed from: c */
    public final String mo21125c() {
        return this.f28872c;
    }

    /* renamed from: d */
    public final C13132l mo21103d(EtsyConfigKey.Environment environment, boolean z) {
        C19383o.m32797g(environment, "environment");
        return this;
    }

    /* renamed from: e */
    public final String mo21126e() {
        return this.f28871b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13132l)) {
            return false;
        }
        C13132l lVar = (C13132l) obj;
        return C19383o.m32792b(this.f28870a, lVar.f28870a) && C19383o.m32792b(this.f28871b, lVar.f28871b) && C19383o.m32792b(this.f28872c, lVar.f28872c) && C19383o.m32792b(this.f28873d, lVar.f28873d) && C19383o.m32792b(this.f28874e, lVar.f28874e) && C19383o.m32792b(this.f28875f, lVar.f28875f) && C19383o.m32792b(this.f28876g, lVar.f28876g);
    }

    /* renamed from: f */
    public final List<C8677e.C8678a> mo21128f() {
        return this.f28874e;
    }

    public final String getName() {
        return this.f28870a;
    }

    /* renamed from: h */
    public final boolean mo45840h() {
        boolean booleanValue;
        Boolean bool = this.f28878i;
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (this) {
            if (this.f28878i == null) {
                String str = this.f28871b;
                C19383o.m32797g(str, "value");
                boolean z = false;
                if (!(str.length() == 0) && !C19457k.m33019W0(str, "off", true) && !C19383o.m32792b(str, "0") && !C19457k.m33019W0(str, "false", true)) {
                    z = true;
                }
                this.f28878i = Boolean.valueOf(z);
            }
            Boolean bool2 = this.f28878i;
            C19383o.m32794d(bool2);
            booleanValue = bool2.booleanValue();
        }
        return booleanValue;
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f28871b, this.f28870a.hashCode() * 31, 31);
        String str = this.f28872c;
        int i = 0;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f28873d;
        int g = C13983i.m21488g(this.f28874e, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        C13122d dVar = this.f28875f;
        int hashCode2 = (g + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str3 = this.f28876g;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    /* renamed from: i */
    public final int[] mo45842i() {
        int[] iArr = this.f28882m;
        if (iArr == null) {
            synchronized (this) {
                if (this.f28882m == null) {
                    this.f28882m = C13133a.m20804a(this.f28871b);
                }
                iArr = this.f28882m;
                C19383o.m32794d(iArr);
            }
        }
        return iArr;
    }

    /* renamed from: j */
    public final int mo45843j() {
        int intValue;
        Integer num = this.f28879j;
        if (num != null) {
            return num.intValue();
        }
        synchronized (this) {
            if (this.f28879j == null) {
                int T0 = C19456j.m33016T0(this.f28871b);
                if (T0 == null) {
                    T0 = 0;
                }
                this.f28879j = T0;
            }
            Integer num2 = this.f28879j;
            C19383o.m32794d(num2);
            intValue = num2.intValue();
        }
        return intValue;
    }

    /* renamed from: k */
    public final long mo45844k() {
        long longValue;
        Long l = this.f28881l;
        if (l != null) {
            return l.longValue();
        }
        synchronized (this) {
            if (this.f28881l == null) {
                long U0 = C19456j.m33017U0(this.f28871b);
                if (U0 == null) {
                    U0 = 0L;
                }
                this.f28881l = U0;
            }
            Long l2 = this.f28881l;
            C19383o.m32794d(l2);
            longValue = l2.longValue();
        }
        return longValue;
    }

    /* renamed from: l */
    public final String[] mo45845l() {
        String[] strArr = this.f28883n;
        if (strArr == null) {
            synchronized (this) {
                if (this.f28883n == null) {
                    String str = this.f28871b;
                    C19383o.m32797g(str, "value");
                    Object[] array = C19459m.m33056y1(str, new String[]{","}, 0, 6).toArray(new String[0]);
                    C19383o.m32795e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    this.f28883n = (String[]) array;
                }
                strArr = this.f28883n;
                C19383o.m32794d(strArr);
            }
        }
        return strArr;
    }

    public final String toString() {
        return this.f28871b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C13132l(String str, String str2, String str3, String str4, C13122d dVar, String str5, int i) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (List<? extends C8677e.C8678a>) (i & 16) != 0 ? EmptyList.INSTANCE : null, (i & 32) != 0 ? null : dVar, (i & 64) != 0 ? null : str5);
    }
}
