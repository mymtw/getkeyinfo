package p167l3;

import android.graphics.Path;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.C4845a;
import p113g3.C6841b;
import p113g3.C6845f;
import p158k3.C7178a;
import p158k3.C7181d;

/* renamed from: l3.h */
public final class C7242h implements C7236b {

    /* renamed from: a */
    public final boolean f16080a;

    /* renamed from: b */
    public final Path.FillType f16081b;

    /* renamed from: c */
    public final String f16082c;

    /* renamed from: d */
    public final C7178a f16083d;

    /* renamed from: e */
    public final C7181d f16084e;

    /* renamed from: f */
    public final boolean f16085f;

    public C7242h(String str, boolean z, Path.FillType fillType, C7178a aVar, C7181d dVar, boolean z2) {
        this.f16082c = str;
        this.f16080a = z;
        this.f16081b = fillType;
        this.f16083d = aVar;
        this.f16084e = dVar;
        this.f16085f = z2;
    }

    /* renamed from: a */
    public final C6841b mo14595a(LottieDrawable lottieDrawable, C4845a aVar) {
        return new C6845f(lottieDrawable, aVar, this);
    }

    public final String toString() {
        return C0391c.m1058d(C0072d.m201h("ShapeFill{color=, fillEnabled="), this.f16080a, '}');
    }
}
