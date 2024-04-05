package p167l3;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.C4845a;
import p113g3.C6841b;
import p113g3.C6844e;
import p158k3.C7182e;
import p158k3.C7189l;

/* renamed from: l3.a */
public final class C7235a implements C7236b {

    /* renamed from: a */
    public final String f16052a;

    /* renamed from: b */
    public final C7189l<PointF, PointF> f16053b;

    /* renamed from: c */
    public final C7182e f16054c;

    /* renamed from: d */
    public final boolean f16055d;

    /* renamed from: e */
    public final boolean f16056e;

    public C7235a(String str, C7189l<PointF, PointF> lVar, C7182e eVar, boolean z, boolean z2) {
        this.f16052a = str;
        this.f16053b = lVar;
        this.f16054c = eVar;
        this.f16055d = z;
        this.f16056e = z2;
    }

    /* renamed from: a */
    public final C6841b mo14595a(LottieDrawable lottieDrawable, C4845a aVar) {
        return new C6844e(lottieDrawable, aVar, this);
    }
}
