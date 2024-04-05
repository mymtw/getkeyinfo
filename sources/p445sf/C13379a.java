package p445sf;

import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.uikit.nav.transactions.C11869a;
import com.google.android.gms.common.api.Api;
import java.util.Map;

/* renamed from: sf.a */
public abstract class C13379a {

    /* renamed from: a */
    public String f29305a;

    /* renamed from: b */
    public int f29306b = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: c */
    public boolean f29307c;

    /* renamed from: a */
    public Map<String, String> mo46058a() {
        return null;
    }

    /* renamed from: b */
    public boolean mo46059b() {
        return false;
    }

    /* renamed from: c */
    public abstract void mo46060c(C11869a aVar);

    /* renamed from: d */
    public final void mo46061d(int i, Object obj) {
        if (this instanceof C13380b) {
            if (obj == null) {
                ((C13380b) this).mo46065h(i, (String) null);
            } else if (obj instanceof String) {
                ((C13380b) this).mo46065h(i, (String) obj);
            } else {
                C8694h a = LogCatKt.m17045a();
                a.mo21313g("PaginationForNextLink got an unexpected indicator: " + obj);
            }
        } else if (this instanceof C13381c) {
            if (obj == null) {
                ((C13381c) this).mo46067h(0, i);
            } else if (obj instanceof Integer) {
                ((C13381c) this).mo46067h(((Number) obj).intValue(), i);
            } else {
                C8694h a2 = LogCatKt.m17045a();
                a2.mo21313g("PaginationForOffset got an unexpected indicator: " + obj);
            }
        } else if (this instanceof C13382d) {
            ((C13382d) this).f29307c = true;
        }
    }

    /* renamed from: e */
    public abstract void mo46062e(C11869a aVar);

    /* renamed from: f */
    public void mo46063f(int i) {
        this.f29306b = i / 2;
    }

    /* renamed from: g */
    public abstract void mo46064g();
}
