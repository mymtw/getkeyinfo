package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.google.android.material.shape.C15408d;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.ArrayList;
import java.util.BitSet;
import kotlin.jvm.internal.C19388s;
import p550dl.C17577c;
import p550dl.C17579e;

/* renamed from: com.google.android.material.shape.b */
public final class C15404b {

    /* renamed from: a */
    public final C15408d[] f34595a = new C15408d[4];

    /* renamed from: b */
    public final Matrix[] f34596b = new Matrix[4];

    /* renamed from: c */
    public final Matrix[] f34597c = new Matrix[4];

    /* renamed from: d */
    public final PointF f34598d = new PointF();

    /* renamed from: e */
    public final Path f34599e = new Path();

    /* renamed from: f */
    public final Path f34600f = new Path();

    /* renamed from: g */
    public final C15408d f34601g = new C15408d();

    /* renamed from: h */
    public final float[] f34602h = new float[2];

    /* renamed from: i */
    public final float[] f34603i = new float[2];

    /* renamed from: j */
    public final Path f34604j = new Path();

    /* renamed from: k */
    public final Path f34605k = new Path();

    /* renamed from: l */
    public boolean f34606l = true;

    /* renamed from: com.google.android.material.shape.b$a */
    public static class C15405a {

        /* renamed from: a */
        public static final C15404b f34607a = new C15404b();
    }

    /* renamed from: com.google.android.material.shape.b$b */
    public interface C15406b {
    }

    public C15404b() {
        for (int i = 0; i < 4; i++) {
            this.f34595a[i] = new C15408d();
            this.f34596b[i] = new Matrix();
            this.f34597c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    public final void mo54622a(C15401a aVar, float f, RectF rectF, Path path) {
        mo54623b(aVar, f, rectF, (C15406b) null, path);
    }

    /* renamed from: b */
    public final void mo54623b(C15401a aVar, float f, RectF rectF, C15406b bVar, Path path) {
        int i;
        C15401a aVar2 = aVar;
        float f2 = f;
        RectF rectF2 = rectF;
        Path path2 = path;
        path.rewind();
        this.f34599e.rewind();
        this.f34600f.rewind();
        this.f34600f.addRect(rectF2, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                break;
            }
            C17577c cVar = i2 != 1 ? i2 != 2 ? i2 != 3 ? aVar2.f34576f : aVar2.f34575e : aVar2.f34578h : aVar2.f34577g;
            C19388s sVar = i2 != 1 ? i2 != 2 ? i2 != 3 ? aVar2.f34572b : aVar2.f34571a : aVar2.f34574d : aVar2.f34573c;
            C15408d dVar = this.f34595a[i2];
            sVar.getClass();
            sVar.mo68906d0(f2, cVar.mo68901a(rectF2), dVar);
            int i3 = i2 + 1;
            float f3 = (float) (i3 * 90);
            this.f34596b[i2].reset();
            PointF pointF = this.f34598d;
            if (i2 == 1) {
                pointF.set(rectF2.right, rectF2.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF2.left, rectF2.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF2.right, rectF2.top);
            } else {
                pointF.set(rectF2.left, rectF2.top);
            }
            Matrix matrix = this.f34596b[i2];
            PointF pointF2 = this.f34598d;
            matrix.setTranslate(pointF2.x, pointF2.y);
            this.f34596b[i2].preRotate(f3);
            float[] fArr = this.f34602h;
            C15408d dVar2 = this.f34595a[i2];
            fArr[0] = dVar2.f34612c;
            fArr[1] = dVar2.f34613d;
            this.f34596b[i2].mapPoints(fArr);
            this.f34597c[i2].reset();
            Matrix matrix2 = this.f34597c[i2];
            float[] fArr2 = this.f34602h;
            matrix2.setTranslate(fArr2[0], fArr2[1]);
            this.f34597c[i2].preRotate(f3);
            i2 = i3;
        }
        int i4 = 0;
        for (i = 4; i4 < i; i = 4) {
            float[] fArr3 = this.f34602h;
            C15408d dVar3 = this.f34595a[i4];
            fArr3[0] = dVar3.f34610a;
            fArr3[1] = dVar3.f34611b;
            this.f34596b[i4].mapPoints(fArr3);
            if (i4 == 0) {
                float[] fArr4 = this.f34602h;
                path2.moveTo(fArr4[0], fArr4[1]);
            } else {
                float[] fArr5 = this.f34602h;
                path2.lineTo(fArr5[0], fArr5[1]);
            }
            this.f34595a[i4].mo54628c(this.f34596b[i4], path2);
            if (bVar != null) {
                C15408d dVar4 = this.f34595a[i4];
                Matrix matrix3 = this.f34596b[i4];
                MaterialShapeDrawable.C15398a aVar3 = (MaterialShapeDrawable.C15398a) bVar;
                BitSet access$000 = MaterialShapeDrawable.this.containsIncompatibleShadowOp;
                dVar4.getClass();
                access$000.set(i4, false);
                C15408d.C15414f[] access$100 = MaterialShapeDrawable.this.cornerShadowOperation;
                dVar4.mo54627b(dVar4.f34615f);
                access$100[i4] = new C15407c(new ArrayList(dVar4.f34617h), new Matrix(matrix3));
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            float[] fArr6 = this.f34602h;
            C15408d dVar5 = this.f34595a[i4];
            fArr6[0] = dVar5.f34612c;
            fArr6[1] = dVar5.f34613d;
            this.f34596b[i4].mapPoints(fArr6);
            float[] fArr7 = this.f34603i;
            C15408d dVar6 = this.f34595a[i6];
            fArr7[0] = dVar6.f34610a;
            fArr7[1] = dVar6.f34611b;
            this.f34596b[i6].mapPoints(fArr7);
            float[] fArr8 = this.f34602h;
            float f4 = fArr8[0];
            float[] fArr9 = this.f34603i;
            float max = Math.max(((float) Math.hypot((double) (f4 - fArr9[0]), (double) (fArr8[1] - fArr9[1]))) - 0.001f, 0.0f);
            float[] fArr10 = this.f34602h;
            C15408d dVar7 = this.f34595a[i4];
            fArr10[0] = dVar7.f34612c;
            fArr10[1] = dVar7.f34613d;
            this.f34596b[i4].mapPoints(fArr10);
            float abs = (i4 == 1 || i4 == 3) ? Math.abs(rectF.centerX() - this.f34602h[0]) : Math.abs(rectF.centerY() - this.f34602h[1]);
            this.f34601g.mo54630e(0.0f, 0.0f, 270.0f, 0.0f);
            C17579e eVar = i4 != 1 ? i4 != 2 ? i4 != 3 ? aVar2.f34580j : aVar2.f34579i : aVar2.f34582l : aVar2.f34581k;
            eVar.mo53159b(max, abs, f2, this.f34601g);
            this.f34604j.reset();
            this.f34601g.mo54628c(this.f34597c[i4], this.f34604j);
            if (!this.f34606l || (!eVar.mo68907a() && !mo54624c(this.f34604j, i4) && !mo54624c(this.f34604j, i6))) {
                this.f34601g.mo54628c(this.f34597c[i4], path2);
            } else {
                Path path3 = this.f34604j;
                path3.op(path3, this.f34600f, Path.Op.DIFFERENCE);
                float[] fArr11 = this.f34602h;
                C15408d dVar8 = this.f34601g;
                fArr11[0] = dVar8.f34610a;
                fArr11[1] = dVar8.f34611b;
                this.f34597c[i4].mapPoints(fArr11);
                Path path4 = this.f34599e;
                float[] fArr12 = this.f34602h;
                path4.moveTo(fArr12[0], fArr12[1]);
                this.f34601g.mo54628c(this.f34597c[i4], this.f34599e);
            }
            if (bVar != null) {
                C15408d dVar9 = this.f34601g;
                Matrix matrix4 = this.f34597c[i4];
                MaterialShapeDrawable.C15398a aVar4 = (MaterialShapeDrawable.C15398a) bVar;
                dVar9.getClass();
                MaterialShapeDrawable.this.containsIncompatibleShadowOp.set(i4 + 4, false);
                C15408d.C15414f[] access$200 = MaterialShapeDrawable.this.edgeShadowOperation;
                dVar9.mo54627b(dVar9.f34615f);
                access$200[i4] = new C15407c(new ArrayList(dVar9.f34617h), new Matrix(matrix4));
            }
            i4 = i5;
        }
        path.close();
        this.f34599e.close();
        if (!this.f34599e.isEmpty()) {
            path2.op(this.f34599e, Path.Op.UNION);
        }
    }

    /* renamed from: c */
    public final boolean mo54624c(Path path, int i) {
        this.f34605k.reset();
        this.f34595a[i].mo54628c(this.f34596b[i], this.f34605k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f34605k.computeBounds(rectF, true);
        path.op(this.f34605k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
