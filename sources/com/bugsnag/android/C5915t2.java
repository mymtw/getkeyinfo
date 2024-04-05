package com.bugsnag.android;

import com.bugsnag.android.C5748g1;
import java.io.IOException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.t2 */
public final class C5915t2 implements C5748g1.C5749a {

    /* renamed from: e */
    public static final C5916a f12618e = new C5916a();

    /* renamed from: b */
    public final String f12619b;

    /* renamed from: c */
    public final String f12620c;

    /* renamed from: d */
    public final String f12621d;

    /* renamed from: com.bugsnag.android.t2$a */
    public static final class C5916a {
    }

    public C5915t2(String str, String str2, String str3) {
        this.f12619b = str;
        this.f12620c = str2;
        this.f12621d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C19383o.m32792b(C5915t2.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            C5915t2 t2Var = (C5915t2) obj;
            return !(C19383o.m32792b(this.f12619b, t2Var.f12619b) ^ true) && !(C19383o.m32792b(this.f12620c, t2Var.f12620c) ^ true) && !(C19383o.m32792b(this.f12621d, t2Var.f12621d) ^ true);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bugsnag.android.User");
    }

    public final int hashCode() {
        String str = this.f12619b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f12620c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12621d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final void toStream(C5748g1 g1Var) throws IOException {
        C19383o.m32798h(g1Var, "writer");
        g1Var.mo16522d();
        g1Var.mo16514B("id");
        g1Var.mo16530k(this.f12619b);
        g1Var.mo16514B("email");
        g1Var.mo16530k(this.f12620c);
        g1Var.mo16514B("name");
        g1Var.mo16530k(this.f12621d);
        g1Var.mo16526g();
    }

    public C5915t2() {
        this((String) null, (String) null, (String) null);
    }
}
