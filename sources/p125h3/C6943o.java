package p125h3;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.C4840k;
import com.airbnb.lottie.model.layer.C4845a;
import java.util.Collections;
import p125h3.C6928a;
import p158k3.C7179b;
import p158k3.C7181d;
import p158k3.C7183f;
import p158k3.C7188k;
import p158k3.C7189l;
import p214q3.C7718a;
import p214q3.C7720c;
import p214q3.C7721d;
import p226r8.C7784a;

/* renamed from: h3.o */
public final class C6943o {

    /* renamed from: a */
    public final Matrix f15377a = new Matrix();

    /* renamed from: b */
    public final Matrix f15378b;

    /* renamed from: c */
    public final Matrix f15379c;

    /* renamed from: d */
    public final Matrix f15380d;

    /* renamed from: e */
    public final float[] f15381e;

    /* renamed from: f */
    public C6928a<PointF, PointF> f15382f;

    /* renamed from: g */
    public C6928a<?, PointF> f15383g;

    /* renamed from: h */
    public C6928a<C7721d, C7721d> f15384h;

    /* renamed from: i */
    public C6928a<Float, Float> f15385i;

    /* renamed from: j */
    public C6928a<Integer, Integer> f15386j;

    /* renamed from: k */
    public C6931c f15387k;

    /* renamed from: l */
    public C6931c f15388l;

    /* renamed from: m */
    public C6928a<?, Float> f15389m;

    /* renamed from: n */
    public C6928a<?, Float> f15390n;

    public C6943o(C7188k kVar) {
        C7784a aVar = kVar.f15959a;
        this.f15382f = aVar == null ? null : aVar.mo19485a();
        C7189l<PointF, PointF> lVar = kVar.f15960b;
        this.f15383g = lVar == null ? null : lVar.mo19485a();
        C7183f fVar = kVar.f15961c;
        this.f15384h = fVar == null ? null : fVar.mo19485a();
        C7179b bVar = kVar.f15962d;
        this.f15385i = bVar == null ? null : bVar.mo19485a();
        C7179b bVar2 = kVar.f15964f;
        C6931c cVar = bVar2 == null ? null : (C6931c) bVar2.mo19485a();
        this.f15387k = cVar;
        if (cVar != null) {
            this.f15378b = new Matrix();
            this.f15379c = new Matrix();
            this.f15380d = new Matrix();
            this.f15381e = new float[9];
        } else {
            this.f15378b = null;
            this.f15379c = null;
            this.f15380d = null;
            this.f15381e = null;
        }
        C7179b bVar3 = kVar.f15965g;
        this.f15388l = bVar3 == null ? null : (C6931c) bVar3.mo19485a();
        C7181d dVar = kVar.f15963e;
        if (dVar != null) {
            this.f15386j = dVar.mo19485a();
        }
        C7179b bVar4 = kVar.f15966h;
        if (bVar4 != null) {
            this.f15389m = bVar4.mo19485a();
        } else {
            this.f15389m = null;
        }
        C7179b bVar5 = kVar.f15967i;
        if (bVar5 != null) {
            this.f15390n = bVar5.mo19485a();
        } else {
            this.f15390n = null;
        }
    }

    /* renamed from: a */
    public final void mo19093a(C4845a aVar) {
        aVar.mo14606e(this.f15386j);
        aVar.mo14606e(this.f15389m);
        aVar.mo14606e(this.f15390n);
        aVar.mo14606e(this.f15382f);
        aVar.mo14606e(this.f15383g);
        aVar.mo14606e(this.f15384h);
        aVar.mo14606e(this.f15385i);
        aVar.mo14606e(this.f15387k);
        aVar.mo14606e(this.f15388l);
    }

    /* renamed from: b */
    public final void mo19094b(C6928a.C6929a aVar) {
        C6928a<Integer, Integer> aVar2 = this.f15386j;
        if (aVar2 != null) {
            aVar2.mo19077a(aVar);
        }
        C6928a<?, Float> aVar3 = this.f15389m;
        if (aVar3 != null) {
            aVar3.mo19077a(aVar);
        }
        C6928a<?, Float> aVar4 = this.f15390n;
        if (aVar4 != null) {
            aVar4.mo19077a(aVar);
        }
        C6928a<PointF, PointF> aVar5 = this.f15382f;
        if (aVar5 != null) {
            aVar5.mo19077a(aVar);
        }
        C6928a<?, PointF> aVar6 = this.f15383g;
        if (aVar6 != null) {
            aVar6.mo19077a(aVar);
        }
        C6928a<C7721d, C7721d> aVar7 = this.f15384h;
        if (aVar7 != null) {
            aVar7.mo19077a(aVar);
        }
        C6928a<Float, Float> aVar8 = this.f15385i;
        if (aVar8 != null) {
            aVar8.mo19077a(aVar);
        }
        C6931c cVar = this.f15387k;
        if (cVar != null) {
            cVar.mo19077a(aVar);
        }
        C6931c cVar2 = this.f15388l;
        if (cVar2 != null) {
            cVar2.mo19077a(aVar);
        }
    }

    /* renamed from: c */
    public final boolean mo19095c(C7720c cVar, Object obj) {
        C6931c cVar2;
        C6931c cVar3;
        C6928a<?, Float> aVar;
        C6928a<?, Float> aVar2;
        if (obj == C4840k.f10880e) {
            C6928a<PointF, PointF> aVar3 = this.f15382f;
            if (aVar3 == null) {
                this.f15382f = new C6944p(cVar, new PointF());
                return true;
            }
            aVar3.mo19087k(cVar);
            return true;
        } else if (obj == C4840k.f10881f) {
            C6928a<?, PointF> aVar4 = this.f15383g;
            if (aVar4 == null) {
                this.f15383g = new C6944p(cVar, new PointF());
                return true;
            }
            aVar4.mo19087k(cVar);
            return true;
        } else if (obj == C4840k.f10886k) {
            C6928a<C7721d, C7721d> aVar5 = this.f15384h;
            if (aVar5 == null) {
                this.f15384h = new C6944p(cVar, new C7721d());
                return true;
            }
            aVar5.mo19087k(cVar);
            return true;
        } else if (obj == C4840k.f10887l) {
            C6928a<Float, Float> aVar6 = this.f15385i;
            if (aVar6 == null) {
                this.f15385i = new C6944p(cVar, Float.valueOf(0.0f));
                return true;
            }
            aVar6.mo19087k(cVar);
            return true;
        } else if (obj == C4840k.f10878c) {
            C6928a<Integer, Integer> aVar7 = this.f15386j;
            if (aVar7 == null) {
                this.f15386j = new C6944p(cVar, 100);
                return true;
            }
            aVar7.mo19087k(cVar);
            return true;
        } else if (obj != C4840k.f10900y || (aVar2 = this.f15389m) == null) {
            if (obj != C4840k.f10901z || (aVar = this.f15390n) == null) {
                if (obj == C4840k.f10888m && (cVar3 = this.f15387k) != null) {
                    if (cVar3 == null) {
                        this.f15387k = new C6931c(Collections.singletonList(new C7718a(Float.valueOf(0.0f))));
                    }
                    this.f15387k.mo19087k(cVar);
                    return true;
                } else if (obj != C4840k.f10889n || (cVar2 = this.f15388l) == null) {
                    return false;
                } else {
                    if (cVar2 == null) {
                        this.f15388l = new C6931c(Collections.singletonList(new C7718a(Float.valueOf(0.0f))));
                    }
                    this.f15388l.mo19087k(cVar);
                    return true;
                }
            } else if (aVar == null) {
                this.f15390n = new C6944p(cVar, 100);
                return true;
            } else {
                aVar.mo19087k(cVar);
                return true;
            }
        } else if (aVar2 == null) {
            this.f15389m = new C6944p(cVar, 100);
            return true;
        } else {
            aVar2.mo19087k(cVar);
            return true;
        }
    }

    /* renamed from: d */
    public final Matrix mo19096d() {
        this.f15377a.reset();
        C6928a<?, PointF> aVar = this.f15383g;
        if (aVar != null) {
            PointF g = aVar.mo19083g();
            float f = g.x;
            if (!(f == 0.0f && g.y == 0.0f)) {
                this.f15377a.preTranslate(f, g.y);
            }
        }
        C6928a<Float, Float> aVar2 = this.f15385i;
        if (aVar2 != null) {
            float floatValue = aVar2 instanceof C6944p ? aVar2.mo19083g().floatValue() : ((C6931c) aVar2).mo19089l();
            if (floatValue != 0.0f) {
                this.f15377a.preRotate(floatValue);
            }
        }
        if (this.f15387k != null) {
            C6931c cVar = this.f15388l;
            float cos = cVar == null ? 0.0f : (float) Math.cos(Math.toRadians((double) ((-cVar.mo19089l()) + 90.0f)));
            C6931c cVar2 = this.f15388l;
            float sin = cVar2 == null ? 1.0f : (float) Math.sin(Math.toRadians((double) ((-cVar2.mo19089l()) + 90.0f)));
            float tan = (float) Math.tan(Math.toRadians((double) this.f15387k.mo19089l()));
            for (int i = 0; i < 9; i++) {
                this.f15381e[i] = 0.0f;
            }
            float[] fArr = this.f15381e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f2 = -sin;
            fArr[3] = f2;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f15378b.setValues(fArr);
            for (int i2 = 0; i2 < 9; i2++) {
                this.f15381e[i2] = 0.0f;
            }
            float[] fArr2 = this.f15381e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f15379c.setValues(fArr2);
            for (int i3 = 0; i3 < 9; i3++) {
                this.f15381e[i3] = 0.0f;
            }
            float[] fArr3 = this.f15381e;
            fArr3[0] = cos;
            fArr3[1] = f2;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f15380d.setValues(fArr3);
            this.f15379c.preConcat(this.f15378b);
            this.f15380d.preConcat(this.f15379c);
            this.f15377a.preConcat(this.f15380d);
        }
        C6928a<C7721d, C7721d> aVar3 = this.f15384h;
        if (aVar3 != null) {
            C7721d g2 = aVar3.mo19083g();
            float f3 = g2.f17131a;
            if (!(f3 == 1.0f && g2.f17132b == 1.0f)) {
                this.f15377a.preScale(f3, g2.f17132b);
            }
        }
        C6928a<PointF, PointF> aVar4 = this.f15382f;
        if (aVar4 != null) {
            PointF g3 = aVar4.mo19083g();
            float f4 = g3.x;
            if (!(f4 == 0.0f && g3.y == 0.0f)) {
                this.f15377a.preTranslate(-f4, -g3.y);
            }
        }
        return this.f15377a;
    }

    /* renamed from: e */
    public final Matrix mo19097e(float f) {
        C6928a<?, PointF> aVar = this.f15383g;
        PointF pointF = null;
        PointF g = aVar == null ? null : aVar.mo19083g();
        C6928a<C7721d, C7721d> aVar2 = this.f15384h;
        C7721d g2 = aVar2 == null ? null : aVar2.mo19083g();
        this.f15377a.reset();
        if (g != null) {
            this.f15377a.preTranslate(g.x * f, g.y * f);
        }
        if (g2 != null) {
            double d = (double) f;
            this.f15377a.preScale((float) Math.pow((double) g2.f17131a, d), (float) Math.pow((double) g2.f17132b, d));
        }
        C6928a<Float, Float> aVar3 = this.f15385i;
        if (aVar3 != null) {
            float floatValue = aVar3.mo19083g().floatValue();
            C6928a<PointF, PointF> aVar4 = this.f15382f;
            if (aVar4 != null) {
                pointF = aVar4.mo19083g();
            }
            Matrix matrix = this.f15377a;
            float f2 = floatValue * f;
            float f3 = 0.0f;
            float f4 = pointF == null ? 0.0f : pointF.x;
            if (pointF != null) {
                f3 = pointF.y;
            }
            matrix.preRotate(f2, f4, f3);
        }
        return this.f15377a;
    }
}
