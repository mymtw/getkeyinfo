package p167l3;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.C4845a;
import p113g3.C6841b;
import p113g3.C6857p;
import p158k3.C7184g;

/* renamed from: l3.j */
public final class C7244j implements C7236b {

    /* renamed from: a */
    public final String f16089a;

    /* renamed from: b */
    public final int f16090b;

    /* renamed from: c */
    public final C7184g f16091c;

    /* renamed from: d */
    public final boolean f16092d;

    public C7244j(String str, int i, C7184g gVar, boolean z) {
        this.f16089a = str;
        this.f16090b = i;
        this.f16091c = gVar;
        this.f16092d = z;
    }

    /* renamed from: a */
    public final C6841b mo14595a(LottieDrawable lottieDrawable, C4845a aVar) {
        return new C6857p(lottieDrawable, aVar, this);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ShapePath{name=");
        h.append(this.f16089a);
        h.append(", index=");
        return C0073e.m208h(h, this.f16090b, '}');
    }
}
