package p445sf;

import com.etsy.android.uikit.nav.transactions.C11869a;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;

/* renamed from: sf.c */
public final class C13381c extends C13379a {

    /* renamed from: d */
    public final int f29308d = 24;

    /* renamed from: e */
    public int f29309e;

    /* renamed from: a */
    public final Map<String, String> mo46058a() {
        return C19294b0.m32562s0(new Pair("offset", String.valueOf(this.f29309e)), new Pair("limit", String.valueOf(this.f29308d)));
    }

    /* renamed from: b */
    public final boolean mo46059b() {
        return this.f29309e == 0;
    }

    /* renamed from: c */
    public final void mo46060c(C11869a aVar) {
        C19383o.m32797g(aVar, "outState");
        aVar.mo38349f("key_content_exhausted", Boolean.valueOf(this.f29307c));
        aVar.mo38349f("key_offset", Integer.valueOf(this.f29309e));
    }

    /* renamed from: e */
    public final void mo46062e(C11869a aVar) {
        if (aVar != null) {
            this.f29307c = aVar.mo38346c("key_content_exhausted", false);
            this.f29309e = aVar.mo38347d("key_offset", 0);
        }
    }

    /* renamed from: g */
    public final void mo46064g() {
        this.f29307c = false;
        this.f29309e = 0;
    }

    /* renamed from: h */
    public final void mo46067h(int i, int i2) {
        int i3 = this.f29309e + i2;
        this.f29309e = i3;
        if (i3 >= i) {
            this.f29307c = true;
        }
        if (!this.f29307c && this.f29306b == Integer.MAX_VALUE) {
            this.f29306b = i2 / 2;
        }
    }
}
