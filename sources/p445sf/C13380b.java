package p445sf;

import com.etsy.android.uikit.nav.transactions.C11869a;
import kotlin.jvm.internal.C19383o;

/* renamed from: sf.b */
public final class C13380b extends C13379a {
    /* renamed from: b */
    public final boolean mo46059b() {
        return this.f29305a == null;
    }

    /* renamed from: c */
    public final void mo46060c(C11869a aVar) {
        C19383o.m32797g(aVar, "outState");
        aVar.mo38349f("key_content_exhausted", Boolean.valueOf(this.f29307c));
        aVar.mo38349f("saved_api_next_link", this.f29305a);
    }

    /* renamed from: e */
    public final void mo46062e(C11869a aVar) {
        if (aVar != null) {
            this.f29307c = aVar.mo38346c("key_content_exhausted", false);
            this.f29305a = aVar.mo38348e("saved_api_next_link", (String) null);
        }
    }

    /* renamed from: g */
    public final void mo46064g() {
        this.f29307c = false;
        this.f29305a = null;
    }

    /* renamed from: h */
    public final void mo46065h(int i, String str) {
        if (str == null) {
            str = "";
        }
        mo46066i(str);
        if (!this.f29307c && this.f29306b == Integer.MAX_VALUE) {
            this.f29306b = i / 2;
        }
    }

    /* renamed from: i */
    public final void mo46066i(String str) {
        this.f29305a = str;
        if (str == null || str.length() == 0) {
            this.f29307c = true;
        }
    }
}
