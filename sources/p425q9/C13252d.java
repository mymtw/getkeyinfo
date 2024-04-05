package p425q9;

import android.webkit.CookieManager;
import com.etsy.android.lib.network.C8809t;
import com.etsy.android.lib.network.oauth2.XAuthAccessToken;

/* renamed from: q9.d */
public final class C13252d {

    /* renamed from: a */
    public XAuthAccessToken f29107a = null;

    /* renamed from: b */
    public C13270t f29108b;

    /* renamed from: c */
    public C8809t f29109c;

    public C13252d() {
        C13270t tVar = new C13270t();
        this.f29108b = tVar;
        mo45945b((String) null, tVar.mo45963e0());
    }

    /* renamed from: a */
    public final void mo45944a() {
        this.f29107a = null;
        C13270t tVar = this.f29108b;
        if (tVar != null) {
            tVar.mo45962d0();
        }
        CookieManager.getInstance().removeAllCookie();
    }

    /* renamed from: b */
    public final void mo45945b(String str, XAuthAccessToken xAuthAccessToken) {
        if (xAuthAccessToken == null) {
            this.f29108b.mo45962d0();
        } else {
            this.f29108b.mo45964f0(xAuthAccessToken);
        }
        this.f29107a = xAuthAccessToken;
    }
}
