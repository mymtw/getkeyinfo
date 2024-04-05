package p167l3;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.C4845a;
import p113g3.C6841b;
import p113g3.C6846g;
import p158k3.C7180c;
import p158k3.C7181d;
import p158k3.C7182e;

/* renamed from: l3.d */
public final class C7238d implements C7236b {

    /* renamed from: a */
    public final GradientType f16059a;

    /* renamed from: b */
    public final Path.FillType f16060b;

    /* renamed from: c */
    public final C7180c f16061c;

    /* renamed from: d */
    public final C7181d f16062d;

    /* renamed from: e */
    public final C7182e f16063e;

    /* renamed from: f */
    public final C7182e f16064f;

    /* renamed from: g */
    public final String f16065g;

    /* renamed from: h */
    public final boolean f16066h;

    public C7238d(String str, GradientType gradientType, Path.FillType fillType, C7180c cVar, C7181d dVar, C7182e eVar, C7182e eVar2, boolean z) {
        this.f16059a = gradientType;
        this.f16060b = fillType;
        this.f16061c = cVar;
        this.f16062d = dVar;
        this.f16063e = eVar;
        this.f16064f = eVar2;
        this.f16065g = str;
        this.f16066h = z;
    }

    /* renamed from: a */
    public final C6841b mo14595a(LottieDrawable lottieDrawable, C4845a aVar) {
        return new C6846g(lottieDrawable, aVar, this);
    }
}
