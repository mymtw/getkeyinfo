package p595ji;

import android.webkit.WebView;
import com.google.android.exoplayer2.source.C14347j;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;

/* renamed from: ji.g */
public final /* synthetic */ class C17995g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f39351b;

    /* renamed from: c */
    public final /* synthetic */ Object f39352c;

    /* renamed from: d */
    public final /* synthetic */ Object f39353d;

    /* renamed from: e */
    public final /* synthetic */ Object f39354e;

    /* renamed from: f */
    public final /* synthetic */ Object f39355f;

    public /* synthetic */ C17995g(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f39351b = i;
        this.f39352c = obj;
        this.f39353d = obj2;
        this.f39354e = obj3;
        this.f39355f = obj4;
    }

    public final void run() {
        switch (this.f39351b) {
            case 0:
                C14347j.C14348a aVar = (C14347j.C14348a) this.f39352c;
                ((C14347j) this.f39353d).mo47688m(aVar.f32161a, aVar.f32162b, (C17992d) this.f39354e, (C17993e) this.f39355f);
                return;
            default:
                PYPLCheckoutUtils.m35465completeWithCheckoutJS$lambda18((String) this.f39352c, (PYPLCheckoutUtils) this.f39353d, (String) this.f39354e, (WebView) this.f39355f);
                return;
        }
    }
}
