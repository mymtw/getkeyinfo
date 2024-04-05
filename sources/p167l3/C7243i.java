package p167l3;

import android.support.p013v4.media.C0072d;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.C4845a;
import java.util.Arrays;
import java.util.List;
import p113g3.C6841b;
import p113g3.C6842c;

/* renamed from: l3.i */
public final class C7243i implements C7236b {

    /* renamed from: a */
    public final String f16086a;

    /* renamed from: b */
    public final List<C7236b> f16087b;

    /* renamed from: c */
    public final boolean f16088c;

    public C7243i(boolean z, String str, List list) {
        this.f16086a = str;
        this.f16087b = list;
        this.f16088c = z;
    }

    /* renamed from: a */
    public final C6841b mo14595a(LottieDrawable lottieDrawable, C4845a aVar) {
        return new C6842c(lottieDrawable, aVar, this);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ShapeGroup{name='");
        h.append(this.f16086a);
        h.append("' Shapes: ");
        h.append(Arrays.toString(this.f16087b.toArray()));
        h.append('}');
        return h.toString();
    }
}
