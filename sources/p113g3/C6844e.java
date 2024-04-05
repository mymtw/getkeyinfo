package p113g3;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.compose.p015ui.platform.C1830f0;
import com.airbnb.lottie.C4840k;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.C4845a;
import java.util.ArrayList;
import java.util.List;
import p125h3.C6928a;
import p125h3.C6938j;
import p149j3.C7103d;
import p167l3.C7235a;
import p206p3.C7658d;
import p214q3.C7720c;

/* renamed from: g3.e */
public final class C6844e implements C6852l, C6928a.C6929a, C6849j {

    /* renamed from: a */
    public final Path f15067a = new Path();

    /* renamed from: b */
    public final String f15068b;

    /* renamed from: c */
    public final LottieDrawable f15069c;

    /* renamed from: d */
    public final C6938j f15070d;

    /* renamed from: e */
    public final C6928a<?, PointF> f15071e;

    /* renamed from: f */
    public final C7235a f15072f;

    /* renamed from: g */
    public C1830f0 f15073g = new C1830f0(2, 0);

    /* renamed from: h */
    public boolean f15074h;

    public C6844e(LottieDrawable lottieDrawable, C4845a aVar, C7235a aVar2) {
        this.f15068b = aVar2.f16052a;
        this.f15069c = lottieDrawable;
        C6928a<PointF, PointF> a = aVar2.f16054c.mo19485a();
        this.f15070d = (C6938j) a;
        C6928a<PointF, PointF> a2 = aVar2.f16053b.mo19485a();
        this.f15071e = a2;
        this.f15072f = aVar2;
        aVar.mo14606e(a);
        aVar.mo14606e(a2);
        a.mo19077a(this);
        a2.mo19077a(this);
    }

    /* renamed from: a */
    public final void mo14602a() {
        this.f15074h = false;
        this.f15069c.invalidateSelf();
    }

    /* renamed from: b */
    public final void mo14603b(List<C6841b> list, List<C6841b> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i < arrayList.size()) {
                C6841b bVar = (C6841b) arrayList.get(i);
                if (bVar instanceof C6859r) {
                    C6859r rVar = (C6859r) bVar;
                    if (rVar.f15168c == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                        ((List) this.f15073g.f4088a).add(rVar);
                        rVar.mo18981c(this);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo14604c(C7720c cVar, Object obj) {
        if (obj == C4840k.f10882g) {
            this.f15070d.mo19087k(cVar);
        } else if (obj == C4840k.f10885j) {
            this.f15071e.mo19087k(cVar);
        }
    }

    /* renamed from: g */
    public final void mo14608g(C7103d dVar, int i, ArrayList arrayList, C7103d dVar2) {
        C7658d.m14699d(dVar, i, arrayList, dVar2, this);
    }

    public final String getName() {
        return this.f15068b;
    }

    public final Path getPath() {
        if (this.f15074h) {
            return this.f15067a;
        }
        this.f15067a.reset();
        if (this.f15072f.f16056e) {
            this.f15074h = true;
            return this.f15067a;
        }
        PointF pointF = (PointF) this.f15070d.mo19083g();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f15067a.reset();
        if (this.f15072f.f16055d) {
            float f5 = -f2;
            this.f15067a.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.f15067a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            float f10 = f5;
            this.f15067a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f11 = f3 + 0.0f;
            this.f15067a.cubicTo(f11, f2, f, f9, f, 0.0f);
            this.f15067a.cubicTo(f, f8, f11, f10, 0.0f, f10);
        } else {
            float f12 = -f2;
            this.f15067a.moveTo(0.0f, f12);
            float f13 = f3 + 0.0f;
            float f14 = 0.0f - f4;
            this.f15067a.cubicTo(f13, f12, f, f14, f, 0.0f);
            float f15 = f4 + 0.0f;
            this.f15067a.cubicTo(f, f15, f13, f2, 0.0f, f2);
            float f16 = 0.0f - f3;
            float f17 = -f;
            this.f15067a.cubicTo(f16, f2, f17, f15, f17, 0.0f);
            float f18 = f12;
            this.f15067a.cubicTo(f17, f14, f16, f18, 0.0f, f18);
        }
        PointF g = this.f15071e.mo19083g();
        this.f15067a.offset(g.x, g.y);
        this.f15067a.close();
        this.f15073g.mo7211c(this.f15067a);
        this.f15074h = true;
        return this.f15067a;
    }
}
