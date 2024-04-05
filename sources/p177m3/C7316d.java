package p177m3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.C4845a;
import com.airbnb.lottie.model.layer.Layer;
import java.util.ArrayList;
import java.util.Collections;
import p113g3.C6842c;
import p149j3.C7103d;
import p167l3.C7243i;

/* renamed from: m3.d */
public final class C7316d extends C4845a {

    /* renamed from: v */
    public final C6842c f16212v;

    public C7316d(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        C6842c cVar = new C6842c(lottieDrawable, this, new C7243i(false, "__container", layer.f10962a));
        this.f16212v = cVar;
        cVar.mo14603b(Collections.emptyList(), Collections.emptyList());
    }

    /* renamed from: d */
    public final void mo14605d(RectF rectF, Matrix matrix, boolean z) {
        super.mo14605d(rectF, matrix, z);
        this.f16212v.mo14605d(rectF, this.f10995l, z);
    }

    /* renamed from: j */
    public final void mo14612j(Canvas canvas, Matrix matrix, int i) {
        this.f16212v.mo14607f(canvas, matrix, i);
    }

    /* renamed from: n */
    public final void mo14616n(C7103d dVar, int i, ArrayList arrayList, C7103d dVar2) {
        this.f16212v.mo14608g(dVar, i, arrayList, dVar2);
    }
}
