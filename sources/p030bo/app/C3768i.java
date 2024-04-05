package p030bo.app;

import kotlin.jvm.internal.C19383o;
import p005a4.C0035b;

/* renamed from: bo.app.i */
public final class C3768i implements C0035b<String> {

    /* renamed from: b */
    private final String f8583b;

    public C3768i(String str) {
        C19383o.m32797g(str, "apiKey");
        this.f8583b = str;
    }

    /* renamed from: e */
    public String forJsonPut() {
        return this.f8583b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3768i) && C19383o.m32792b(this.f8583b, ((C3768i) obj).f8583b);
    }

    public int hashCode() {
        return this.f8583b.hashCode();
    }

    public String toString() {
        return this.f8583b;
    }
}
