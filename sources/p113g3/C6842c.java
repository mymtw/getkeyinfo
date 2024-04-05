package p113g3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.model.layer.C4845a;
import java.util.ArrayList;
import java.util.List;
import p125h3.C6928a;
import p125h3.C6943o;
import p149j3.C7103d;
import p149j3.C7104e;
import p158k3.C7188k;
import p206p3.C7659e;
import p214q3.C7720c;
import p772tq.C20203a;

/* renamed from: g3.c */
public final class C6842c implements C6843d, C6852l, C6928a.C6929a, C7104e {

    /* renamed from: a */
    public LPaint f15056a;

    /* renamed from: b */
    public RectF f15057b;

    /* renamed from: c */
    public final Matrix f15058c;

    /* renamed from: d */
    public final Path f15059d;

    /* renamed from: e */
    public final RectF f15060e;

    /* renamed from: f */
    public final String f15061f;

    /* renamed from: g */
    public final boolean f15062g;

    /* renamed from: h */
    public final List<C6841b> f15063h;

    /* renamed from: i */
    public final LottieDrawable f15064i;

    /* renamed from: j */
    public ArrayList f15065j;

    /* renamed from: k */
    public C6943o f15066k;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6842c(com.airbnb.lottie.LottieDrawable r8, com.airbnb.lottie.model.layer.C4845a r9, p167l3.C7243i r10) {
        /*
            r7 = this;
            java.lang.String r3 = r10.f16086a
            boolean r4 = r10.f16088c
            java.util.List<l3.b> r0 = r10.f16087b
            java.util.ArrayList r5 = new java.util.ArrayList
            int r1 = r0.size()
            r5.<init>(r1)
            r1 = 0
            r2 = r1
        L_0x0011:
            int r6 = r0.size()
            if (r2 >= r6) goto L_0x0029
            java.lang.Object r6 = r0.get(r2)
            l3.b r6 = (p167l3.C7236b) r6
            g3.b r6 = r6.mo14595a(r8, r9)
            if (r6 == 0) goto L_0x0026
            r5.add(r6)
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0029:
            java.util.List<l3.b> r10 = r10.f16087b
        L_0x002b:
            int r0 = r10.size()
            if (r1 >= r0) goto L_0x0042
            java.lang.Object r0 = r10.get(r1)
            l3.b r0 = (p167l3.C7236b) r0
            boolean r2 = r0 instanceof p158k3.C7188k
            if (r2 == 0) goto L_0x003f
            k3.k r0 = (p158k3.C7188k) r0
            r6 = r0
            goto L_0x0044
        L_0x003f:
            int r1 = r1 + 1
            goto L_0x002b
        L_0x0042:
            r10 = 0
            r6 = r10
        L_0x0044:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p113g3.C6842c.<init>(com.airbnb.lottie.LottieDrawable, com.airbnb.lottie.model.layer.a, l3.i):void");
    }

    /* renamed from: a */
    public final void mo14602a() {
        this.f15064i.invalidateSelf();
    }

    /* renamed from: b */
    public final void mo14603b(List<C6841b> list, List<C6841b> list2) {
        ArrayList arrayList = new ArrayList(this.f15063h.size() + list.size());
        arrayList.addAll(list);
        for (int size = this.f15063h.size() - 1; size >= 0; size--) {
            C6841b bVar = this.f15063h.get(size);
            bVar.mo14603b(arrayList, this.f15063h.subList(0, size));
            arrayList.add(bVar);
        }
    }

    /* renamed from: c */
    public final void mo14604c(C7720c cVar, Object obj) {
        C6943o oVar = this.f15066k;
        if (oVar != null) {
            oVar.mo19095c(cVar, obj);
        }
    }

    /* renamed from: d */
    public final void mo14605d(RectF rectF, Matrix matrix, boolean z) {
        this.f15058c.set(matrix);
        C6943o oVar = this.f15066k;
        if (oVar != null) {
            this.f15058c.preConcat(oVar.mo19096d());
        }
        this.f15060e.set(0.0f, 0.0f, 0.0f, 0.0f);
        int size = this.f15063h.size();
        while (true) {
            size--;
            if (size >= 0) {
                C6841b bVar = this.f15063h.get(size);
                if (bVar instanceof C6843d) {
                    ((C6843d) bVar).mo14605d(this.f15060e, this.f15058c, z);
                    rectF.union(this.f15060e);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public final List<C6852l> mo18973e() {
        if (this.f15065j == null) {
            this.f15065j = new ArrayList();
            for (int i = 0; i < this.f15063h.size(); i++) {
                C6841b bVar = this.f15063h.get(i);
                if (bVar instanceof C6852l) {
                    this.f15065j.add((C6852l) bVar);
                }
            }
        }
        return this.f15065j;
    }

    /* renamed from: f */
    public final void mo14607f(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        if (!this.f15062g) {
            this.f15058c.set(matrix);
            C6943o oVar = this.f15066k;
            if (oVar != null) {
                this.f15058c.preConcat(oVar.mo19096d());
                C6928a<Integer, Integer> aVar = this.f15066k.f15386j;
                i = (int) ((((((float) (aVar == null ? 100 : aVar.mo19083g().intValue())) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
            }
            boolean z2 = false;
            if (this.f15064i.isApplyingOpacityToLayersEnabled()) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 < this.f15063h.size()) {
                        if ((this.f15063h.get(i2) instanceof C6843d) && (i3 = i3 + 1) >= 2) {
                            z = true;
                            break;
                        }
                        i2++;
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z && i != 255) {
                    z2 = true;
                }
            }
            if (z2) {
                this.f15057b.set(0.0f, 0.0f, 0.0f, 0.0f);
                mo14605d(this.f15057b, this.f15058c, true);
                this.f15056a.setAlpha(i);
                RectF rectF = this.f15057b;
                LPaint lPaint = this.f15056a;
                PathMeasure pathMeasure = C7659e.f16963a;
                canvas.saveLayer(rectF, lPaint);
                C20203a.m34518A();
            }
            if (z2) {
                i = 255;
            }
            for (int size = this.f15063h.size() - 1; size >= 0; size--) {
                C6841b bVar = this.f15063h.get(size);
                if (bVar instanceof C6843d) {
                    ((C6843d) bVar).mo14607f(canvas, this.f15058c, i);
                }
            }
            if (z2) {
                canvas.restore();
            }
        }
    }

    /* renamed from: g */
    public final void mo14608g(C7103d dVar, int i, ArrayList arrayList, C7103d dVar2) {
        if (dVar.mo19433c(i, this.f15061f)) {
            if (!"__container".equals(this.f15061f)) {
                String str = this.f15061f;
                dVar2.getClass();
                C7103d dVar3 = new C7103d(dVar2);
                dVar3.f15803a.add(str);
                if (dVar.mo19431a(i, this.f15061f)) {
                    C7103d dVar4 = new C7103d(dVar3);
                    dVar4.f15804b = this;
                    arrayList.add(dVar4);
                }
                dVar2 = dVar3;
            }
            if (dVar.mo19434d(i, this.f15061f)) {
                int b = dVar.mo19432b(i, this.f15061f) + i;
                for (int i2 = 0; i2 < this.f15063h.size(); i2++) {
                    C6841b bVar = this.f15063h.get(i2);
                    if (bVar instanceof C7104e) {
                        ((C7104e) bVar).mo14608g(dVar, b, arrayList, dVar2);
                    }
                }
            }
        }
    }

    public final String getName() {
        return this.f15061f;
    }

    public final Path getPath() {
        this.f15058c.reset();
        C6943o oVar = this.f15066k;
        if (oVar != null) {
            this.f15058c.set(oVar.mo19096d());
        }
        this.f15059d.reset();
        if (this.f15062g) {
            return this.f15059d;
        }
        for (int size = this.f15063h.size() - 1; size >= 0; size--) {
            C6841b bVar = this.f15063h.get(size);
            if (bVar instanceof C6852l) {
                this.f15059d.addPath(((C6852l) bVar).getPath(), this.f15058c);
            }
        }
        return this.f15059d;
    }

    public C6842c(LottieDrawable lottieDrawable, C4845a aVar, String str, boolean z, ArrayList arrayList, C7188k kVar) {
        this.f15056a = new LPaint();
        this.f15057b = new RectF();
        this.f15058c = new Matrix();
        this.f15059d = new Path();
        this.f15060e = new RectF();
        this.f15061f = str;
        this.f15064i = lottieDrawable;
        this.f15062g = z;
        this.f15063h = arrayList;
        if (kVar != null) {
            C6943o oVar = new C6943o(kVar);
            this.f15066k = oVar;
            oVar.mo19093a(aVar);
            this.f15066k.mo19094b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C6841b bVar = (C6841b) arrayList.get(size);
            if (bVar instanceof C6848i) {
                arrayList2.add((C6848i) bVar);
            }
        }
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                ((C6848i) arrayList2.get(size2)).mo18979e(arrayList.listIterator(arrayList.size()));
            } else {
                return;
            }
        }
    }
}
