package p113g3;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.compose.p015ui.platform.C1830f0;
import com.airbnb.lottie.C4840k;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.C4845a;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.ArrayList;
import java.util.List;
import p003a2.C0023f;
import p125h3.C6928a;
import p125h3.C6931c;
import p149j3.C7103d;
import p206p3.C7658d;
import p214q3.C7720c;

/* renamed from: g3.m */
public final class C6853m implements C6852l, C6928a.C6929a, C6849j {

    /* renamed from: a */
    public final Path f15120a = new Path();

    /* renamed from: b */
    public final String f15121b;

    /* renamed from: c */
    public final LottieDrawable f15122c;

    /* renamed from: d */
    public final PolystarShape.Type f15123d;

    /* renamed from: e */
    public final boolean f15124e;

    /* renamed from: f */
    public final C6931c f15125f;

    /* renamed from: g */
    public final C6928a<?, PointF> f15126g;

    /* renamed from: h */
    public final C6931c f15127h;

    /* renamed from: i */
    public final C6931c f15128i;

    /* renamed from: j */
    public final C6931c f15129j;

    /* renamed from: k */
    public final C6931c f15130k;

    /* renamed from: l */
    public final C6931c f15131l;

    /* renamed from: m */
    public C1830f0 f15132m = new C1830f0(2, 0);

    /* renamed from: n */
    public boolean f15133n;

    /* renamed from: g3.m$a */
    public static /* synthetic */ class C6854a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15134a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.airbnb.lottie.model.content.PolystarShape$Type[] r0 = com.airbnb.lottie.model.content.PolystarShape.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15134a = r0
                com.airbnb.lottie.model.content.PolystarShape$Type r1 = com.airbnb.lottie.model.content.PolystarShape.Type.STAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15134a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.content.PolystarShape$Type r1 = com.airbnb.lottie.model.content.PolystarShape.Type.POLYGON     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p113g3.C6853m.C6854a.<clinit>():void");
        }
    }

    public C6853m(LottieDrawable lottieDrawable, C4845a aVar, PolystarShape polystarShape) {
        this.f15122c = lottieDrawable;
        this.f15121b = polystarShape.f10922a;
        PolystarShape.Type type = polystarShape.f10923b;
        this.f15123d = type;
        this.f15124e = polystarShape.f10931j;
        C6928a<Float, Float> a = polystarShape.f10924c.mo19485a();
        this.f15125f = (C6931c) a;
        C6928a<PointF, PointF> a2 = polystarShape.f10925d.mo19485a();
        this.f15126g = a2;
        C6928a<Float, Float> a3 = polystarShape.f10926e.mo19485a();
        this.f15127h = (C6931c) a3;
        C6928a<Float, Float> a4 = polystarShape.f10928g.mo19485a();
        this.f15129j = (C6931c) a4;
        C6928a<Float, Float> a5 = polystarShape.f10930i.mo19485a();
        this.f15131l = (C6931c) a5;
        PolystarShape.Type type2 = PolystarShape.Type.STAR;
        if (type == type2) {
            this.f15128i = (C6931c) polystarShape.f10927f.mo19485a();
            this.f15130k = (C6931c) polystarShape.f10929h.mo19485a();
        } else {
            this.f15128i = null;
            this.f15130k = null;
        }
        aVar.mo14606e(a);
        aVar.mo14606e(a2);
        aVar.mo14606e(a3);
        aVar.mo14606e(a4);
        aVar.mo14606e(a5);
        if (type == type2) {
            aVar.mo14606e(this.f15128i);
            aVar.mo14606e(this.f15130k);
        }
        a.mo19077a(this);
        a2.mo19077a(this);
        a3.mo19077a(this);
        a4.mo19077a(this);
        a5.mo19077a(this);
        if (type == type2) {
            this.f15128i.mo19077a(this);
            this.f15130k.mo19077a(this);
        }
    }

    /* renamed from: a */
    public final void mo14602a() {
        this.f15133n = false;
        this.f15122c.invalidateSelf();
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
                        ((List) this.f15132m.f4088a).add(rVar);
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
        C6931c cVar2;
        C6931c cVar3;
        if (obj == C4840k.f10894s) {
            this.f15125f.mo19087k(cVar);
        } else if (obj == C4840k.f10895t) {
            this.f15127h.mo19087k(cVar);
        } else if (obj == C4840k.f10885j) {
            this.f15126g.mo19087k(cVar);
        } else if (obj == C4840k.f10896u && (cVar3 = this.f15128i) != null) {
            cVar3.mo19087k(cVar);
        } else if (obj == C4840k.f10897v) {
            this.f15129j.mo19087k(cVar);
        } else if (obj == C4840k.f10898w && (cVar2 = this.f15130k) != null) {
            cVar2.mo19087k(cVar);
        } else if (obj == C4840k.f10899x) {
            this.f15131l.mo19087k(cVar);
        }
    }

    /* renamed from: g */
    public final void mo14608g(C7103d dVar, int i, ArrayList arrayList, C7103d dVar2) {
        C7658d.m14699d(dVar, i, arrayList, dVar2, this);
    }

    public final String getName() {
        return this.f15121b;
    }

    public final Path getPath() {
        float f;
        float f2;
        float f3;
        float f4;
        double d;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        double d2;
        float f10;
        float f11;
        double d3;
        double d4;
        double d5;
        if (this.f15133n) {
            return this.f15120a;
        }
        this.f15120a.reset();
        if (this.f15124e) {
            this.f15133n = true;
            return this.f15120a;
        }
        int i = C6854a.f15134a[this.f15123d.ordinal()];
        double d6 = ShadowDrawableWrapper.COS_45;
        if (i == 1) {
            float floatValue = ((Float) this.f15125f.mo19083g()).floatValue();
            C6931c cVar = this.f15127h;
            if (cVar != null) {
                d6 = (double) ((Float) cVar.mo19083g()).floatValue();
            }
            double radians = Math.toRadians(d6 - 90.0d);
            double d7 = (double) floatValue;
            float f12 = (float) (6.283185307179586d / d7);
            float f13 = f12 / 2.0f;
            float f14 = floatValue - ((float) ((int) floatValue));
            int i2 = (f14 > 0.0f ? 1 : (f14 == 0.0f ? 0 : -1));
            if (i2 != 0) {
                radians += (double) ((1.0f - f14) * f13);
            }
            float floatValue2 = ((Float) this.f15129j.mo19083g()).floatValue();
            float floatValue3 = ((Float) this.f15128i.mo19083g()).floatValue();
            C6931c cVar2 = this.f15130k;
            float floatValue4 = cVar2 != null ? ((Float) cVar2.mo19083g()).floatValue() / 100.0f : 0.0f;
            C6931c cVar3 = this.f15131l;
            float floatValue5 = cVar3 != null ? ((Float) cVar3.mo19083g()).floatValue() / 100.0f : 0.0f;
            if (i2 != 0) {
                f5 = C0023f.m103b(floatValue2, floatValue3, f14, floatValue3);
                double d8 = (double) f5;
                f2 = floatValue3;
                f = floatValue4;
                f4 = (float) (Math.cos(radians) * d8);
                f3 = (float) (d8 * Math.sin(radians));
                this.f15120a.moveTo(f4, f3);
                d = radians + ((double) ((f12 * f14) / 2.0f));
            } else {
                f2 = floatValue3;
                f = floatValue4;
                double d9 = (double) floatValue2;
                float cos = (float) (Math.cos(radians) * d9);
                f3 = (float) (Math.sin(radians) * d9);
                this.f15120a.moveTo(cos, f3);
                d = radians + ((double) f13);
                f4 = cos;
                f5 = 0.0f;
            }
            double ceil = Math.ceil(d7) * 2.0d;
            float f15 = f13;
            int i3 = i2;
            int i4 = 0;
            boolean z = false;
            while (true) {
                double d10 = (double) i4;
                if (d10 >= ceil) {
                    break;
                }
                float f16 = z ? floatValue2 : f2;
                int i5 = (f5 > 0.0f ? 1 : (f5 == 0.0f ? 0 : -1));
                if (i5 == 0 || d10 != ceil - 2.0d) {
                    f6 = f12;
                    f7 = f15;
                } else {
                    f6 = f12;
                    f7 = (f12 * f14) / 2.0f;
                }
                if (i5 == 0 || d10 != ceil - 1.0d) {
                    f8 = f5;
                    f5 = f16;
                    f9 = f7;
                } else {
                    f9 = f7;
                    f8 = f5;
                }
                double d11 = (double) f5;
                double d12 = d10;
                float cos2 = (float) (Math.cos(d) * d11);
                float sin = (float) (d11 * Math.sin(d));
                if (f == 0.0f && floatValue5 == 0.0f) {
                    this.f15120a.lineTo(cos2, sin);
                    f10 = sin;
                    d2 = d;
                    f11 = floatValue5;
                } else {
                    d2 = d;
                    float f17 = f3;
                    float f18 = floatValue5;
                    double atan2 = (double) ((float) (Math.atan2((double) f3, (double) f4) - 1.5707963267948966d));
                    float cos3 = (float) Math.cos(atan2);
                    float sin2 = (float) Math.sin(atan2);
                    float f19 = f17;
                    f10 = sin;
                    f11 = f18;
                    double atan22 = (double) ((float) (Math.atan2((double) sin, (double) cos2) - 1.5707963267948966d));
                    float cos4 = (float) Math.cos(atan22);
                    float sin3 = (float) Math.sin(atan22);
                    float f20 = z ? f : f11;
                    float f21 = z ? f11 : f;
                    float f22 = (z ? f2 : floatValue2) * f20 * 0.47829f;
                    float f23 = cos3 * f22;
                    float f24 = f22 * sin2;
                    float f25 = (z ? floatValue2 : f2) * f21 * 0.47829f;
                    float f26 = cos4 * f25;
                    float f27 = f25 * sin3;
                    if (i3 != 0) {
                        if (i4 == 0) {
                            f23 *= f14;
                            f24 *= f14;
                        } else if (d12 == ceil - 1.0d) {
                            f26 *= f14;
                            f27 *= f14;
                        }
                    }
                    this.f15120a.cubicTo(f4 - f23, f19 - f24, cos2 + f26, f10 + f27, cos2, f10);
                }
                d = d2 + ((double) f9);
                z = !z;
                i4++;
                f4 = cos2;
                f5 = f8;
                f12 = f6;
                f3 = f10;
                floatValue5 = f11;
            }
            PointF g = this.f15126g.mo19083g();
            this.f15120a.offset(g.x, g.y);
            this.f15120a.close();
        } else if (i == 2) {
            int floor = (int) Math.floor((double) ((Float) this.f15125f.mo19083g()).floatValue());
            C6931c cVar4 = this.f15127h;
            if (cVar4 != null) {
                d6 = (double) ((Float) cVar4.mo19083g()).floatValue();
            }
            double radians2 = Math.toRadians(d6 - 90.0d);
            double d13 = (double) floor;
            float floatValue6 = ((Float) this.f15131l.mo19083g()).floatValue() / 100.0f;
            float floatValue7 = ((Float) this.f15129j.mo19083g()).floatValue();
            double d14 = (double) floatValue7;
            float cos5 = (float) (Math.cos(radians2) * d14);
            float sin4 = (float) (Math.sin(radians2) * d14);
            this.f15120a.moveTo(cos5, sin4);
            double d15 = (double) ((float) (6.283185307179586d / d13));
            double d16 = radians2 + d15;
            double ceil2 = Math.ceil(d13);
            int i6 = 0;
            while (((double) i6) < ceil2) {
                float cos6 = (float) (Math.cos(d16) * d14);
                double d17 = ceil2;
                float sin5 = (float) (Math.sin(d16) * d14);
                if (floatValue6 != 0.0f) {
                    d5 = d14;
                    d4 = d16;
                    double atan23 = (double) ((float) (Math.atan2((double) sin4, (double) cos5) - 1.5707963267948966d));
                    float cos7 = (float) Math.cos(atan23);
                    d3 = d15;
                    double atan24 = (double) ((float) (Math.atan2((double) sin5, (double) cos6) - 1.5707963267948966d));
                    float f28 = floatValue7 * floatValue6 * 0.25f;
                    this.f15120a.cubicTo(cos5 - (cos7 * f28), sin4 - (((float) Math.sin(atan23)) * f28), cos6 + (((float) Math.cos(atan24)) * f28), sin5 + (f28 * ((float) Math.sin(atan24))), cos6, sin5);
                } else {
                    d4 = d16;
                    d5 = d14;
                    d3 = d15;
                    this.f15120a.lineTo(cos6, sin5);
                }
                d16 = d4 + d3;
                i6++;
                sin4 = sin5;
                cos5 = cos6;
                ceil2 = d17;
                d14 = d5;
                d15 = d3;
            }
            PointF g2 = this.f15126g.mo19083g();
            this.f15120a.offset(g2.x, g2.y);
            this.f15120a.close();
        }
        this.f15120a.close();
        this.f15132m.mo7211c(this.f15120a);
        this.f15133n = true;
        return this.f15120a;
    }
}
