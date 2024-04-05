package p425q9;

import com.etsy.android.lib.models.ResponseConstants;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import okhttp3.C19994o;
import okhttp3.C20018z;

/* renamed from: q9.g */
public final class C13255g {

    /* renamed from: a */
    public final byte[] f29118a;

    /* renamed from: b */
    public final int f29119b;

    /* renamed from: c */
    public final LinkedHashMap f29120c;

    /* renamed from: q9.g$a */
    public static final class C13256a {
        /* renamed from: a */
        public static C13255g m20917a(C20018z zVar) {
            C19383o.m32797g(zVar, ResponseConstants.RESPONSE);
            C19994o oVar = zVar.f44367h;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (oVar.f44235b.length / 2 > 0) {
                for (String str : oVar.mo72950e()) {
                    String a = oVar.mo72948a(str);
                    if (a != null) {
                        Locale locale = Locale.getDefault();
                        C19383o.m32796f(locale, "getDefault()");
                        String lowerCase = str.toLowerCase(locale);
                        C19383o.m32796f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        linkedHashMap.put(lowerCase, a);
                    }
                }
            }
            C19928a0 a0Var = zVar.f44368i;
            return new C13255g(zVar.f44365f, C19294b0.m32568y0(linkedHashMap), a0Var != null ? a0Var.mo72841a() : null);
        }
    }

    public C13255g(int i, Map map, byte[] bArr) {
        this.f29118a = bArr;
        this.f29119b = i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Locale locale = Locale.getDefault();
            C19383o.m32796f(locale, "getDefault()");
            String lowerCase = ((String) entry.getKey()).toLowerCase(locale);
            C19383o.m32796f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            linkedHashMap.put(lowerCase, (String) entry.getValue());
        }
        this.f29120c = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C19383o.m32792b(C13255g.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C19383o.m32795e(obj, "null cannot be cast to non-null type com.etsy.android.lib.core.HttpResponse");
        C13255g gVar = (C13255g) obj;
        byte[] bArr = this.f29118a;
        if (bArr != null) {
            byte[] bArr2 = gVar.f29118a;
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (gVar.f29118a != null) {
            return false;
        }
        return this.f29119b == gVar.f29119b && C19383o.m32792b(this.f29120c, gVar.f29120c);
    }

    public final int hashCode() {
        byte[] bArr = this.f29118a;
        int i = 0;
        int hashCode = (((bArr != null ? Arrays.hashCode(bArr) : 0) * 31) + this.f29119b) * 31;
        LinkedHashMap linkedHashMap = this.f29120c;
        if (linkedHashMap != null) {
            i = linkedHashMap.hashCode();
        }
        return hashCode + i;
    }
}
