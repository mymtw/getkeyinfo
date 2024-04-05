package p167l3;

import android.graphics.PointF;
import android.support.p013v4.media.C0072d;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.C4845a;
import p113g3.C6841b;
import p113g3.C6855n;
import p158k3.C7179b;
import p158k3.C7182e;
import p158k3.C7189l;

/* renamed from: l3.e */
public final class C7239e implements C7236b {

    /* renamed from: a */
    public final String f16067a;

    /* renamed from: b */
    public final C7189l<PointF, PointF> f16068b;

    /* renamed from: c */
    public final C7182e f16069c;

    /* renamed from: d */
    public final C7179b f16070d;

    /* renamed from: e */
    public final boolean f16071e;

    public C7239e(String str, C7189l<PointF, PointF> lVar, C7182e eVar, C7179b bVar, boolean z) {
        this.f16067a = str;
        this.f16068b = lVar;
        this.f16069c = eVar;
        this.f16070d = bVar;
        this.f16071e = z;
    }

    /* renamed from: a */
    public final C6841b mo14595a(LottieDrawable lottieDrawable, C4845a aVar) {
        return new C6855n(lottieDrawable, aVar, this);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("RectangleShape{position=");
        h.append(this.f16068b);
        h.append(", size=");
        h.append(this.f16069c);
        h.append('}');
        return h.toString();
    }
}
