package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
import p522cl.C14169a;

/* renamed from: com.google.android.material.shape.d */
public final class C15408d {
    @Deprecated

    /* renamed from: a */
    public float f34610a;
    @Deprecated

    /* renamed from: b */
    public float f34611b;
    @Deprecated

    /* renamed from: c */
    public float f34612c;
    @Deprecated

    /* renamed from: d */
    public float f34613d;
    @Deprecated

    /* renamed from: e */
    public float f34614e;
    @Deprecated

    /* renamed from: f */
    public float f34615f;

    /* renamed from: g */
    public final ArrayList f34616g = new ArrayList();

    /* renamed from: h */
    public final ArrayList f34617h = new ArrayList();

    /* renamed from: com.google.android.material.shape.d$a */
    public static class C15409a extends C15414f {

        /* renamed from: b */
        public final C15411c f34618b;

        public C15409a(C15411c cVar) {
            this.f34618b = cVar;
        }

        /* renamed from: a */
        public final void mo54625a(Matrix matrix, C14169a aVar, int i, Canvas canvas) {
            C14169a aVar2 = aVar;
            int i2 = i;
            Canvas canvas2 = canvas;
            C15411c cVar = this.f34618b;
            float f = cVar.f34627f;
            float f2 = cVar.f34628g;
            C15411c cVar2 = this.f34618b;
            RectF rectF = new RectF(cVar2.f34623b, cVar2.f34624c, cVar2.f34625d, cVar2.f34626e);
            boolean z = f2 < 0.0f;
            Path path = aVar2.f31284g;
            if (z) {
                int[] iArr = C14169a.f31276k;
                iArr[0] = 0;
                iArr[1] = aVar2.f31283f;
                iArr[2] = aVar2.f31282e;
                iArr[3] = aVar2.f31281d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f, f2);
                path.close();
                float f3 = (float) (-i2);
                rectF.inset(f3, f3);
                int[] iArr2 = C14169a.f31276k;
                iArr2[0] = 0;
                iArr2[1] = aVar2.f31281d;
                iArr2[2] = aVar2.f31282e;
                iArr2[3] = aVar2.f31283f;
            }
            float width = rectF.width() / 2.0f;
            if (width > 0.0f) {
                float f4 = 1.0f - (((float) i2) / width);
                float[] fArr = C14169a.f31277l;
                fArr[1] = f4;
                fArr[2] = ((1.0f - f4) / 2.0f) + f4;
                aVar2.f31279b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, C14169a.f31276k, fArr, Shader.TileMode.CLAMP));
                canvas.save();
                canvas2.concat(matrix);
                canvas2.scale(1.0f, rectF.height() / rectF.width());
                if (!z) {
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                    canvas2.drawPath(path, aVar2.f31285h);
                }
                canvas.drawArc(rectF, f, f2, true, aVar2.f31279b);
                canvas.restore();
            }
        }
    }

    /* renamed from: com.google.android.material.shape.d$b */
    public static class C15410b extends C15414f {

        /* renamed from: b */
        public final C15412d f34619b;

        /* renamed from: c */
        public final float f34620c;

        /* renamed from: d */
        public final float f34621d;

        public C15410b(C15412d dVar, float f, float f2) {
            this.f34619b = dVar;
            this.f34620c = f;
            this.f34621d = f2;
        }

        /* renamed from: a */
        public final void mo54625a(Matrix matrix, C14169a aVar, int i, Canvas canvas) {
            C15412d dVar = this.f34619b;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (dVar.f34630c - this.f34621d), (double) (dVar.f34629b - this.f34620c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f34620c, this.f34621d);
            matrix2.preRotate(mo54631b());
            aVar.getClass();
            rectF.bottom += (float) i;
            rectF.offset(0.0f, (float) (-i));
            int[] iArr = C14169a.f31274i;
            iArr[0] = aVar.f31283f;
            iArr[1] = aVar.f31282e;
            iArr[2] = aVar.f31281d;
            Paint paint = aVar.f31280c;
            float f = rectF.left;
            paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, C14169a.f31275j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, aVar.f31280c);
            canvas.restore();
        }

        /* renamed from: b */
        public final float mo54631b() {
            C15412d dVar = this.f34619b;
            return (float) Math.toDegrees(Math.atan((double) ((dVar.f34630c - this.f34621d) / (dVar.f34629b - this.f34620c))));
        }
    }

    /* renamed from: com.google.android.material.shape.d$c */
    public static class C15411c extends C15413e {

        /* renamed from: h */
        public static final RectF f34622h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f34623b;
        @Deprecated

        /* renamed from: c */
        public float f34624c;
        @Deprecated

        /* renamed from: d */
        public float f34625d;
        @Deprecated

        /* renamed from: e */
        public float f34626e;
        @Deprecated

        /* renamed from: f */
        public float f34627f;
        @Deprecated

        /* renamed from: g */
        public float f34628g;

        public C15411c(float f, float f2, float f3, float f4) {
            this.f34623b = f;
            this.f34624c = f2;
            this.f34625d = f3;
            this.f34626e = f4;
        }

        /* renamed from: a */
        public final void mo54632a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f34631a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f34622h;
            rectF.set(this.f34623b, this.f34624c, this.f34625d, this.f34626e);
            path.arcTo(rectF, this.f34627f, this.f34628g, false);
            path.transform(matrix);
        }
    }

    /* renamed from: com.google.android.material.shape.d$d */
    public static class C15412d extends C15413e {

        /* renamed from: b */
        public float f34629b;

        /* renamed from: c */
        public float f34630c;

        /* renamed from: a */
        public final void mo54632a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f34631a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f34629b, this.f34630c);
            path.transform(matrix);
        }
    }

    /* renamed from: com.google.android.material.shape.d$e */
    public static abstract class C15413e {

        /* renamed from: a */
        public final Matrix f34631a = new Matrix();

        /* renamed from: a */
        public abstract void mo54632a(Matrix matrix, Path path);
    }

    /* renamed from: com.google.android.material.shape.d$f */
    public static abstract class C15414f {

        /* renamed from: a */
        public static final Matrix f34632a = new Matrix();

        /* renamed from: a */
        public abstract void mo54625a(Matrix matrix, C14169a aVar, int i, Canvas canvas);
    }

    public C15408d() {
        mo54630e(0.0f, 0.0f, 270.0f, 0.0f);
    }

    /* renamed from: a */
    public final void mo54626a(float f, float f2, float f3, float f4, float f5, float f6) {
        C15411c cVar = new C15411c(f, f2, f3, f4);
        cVar.f34627f = f5;
        cVar.f34628g = f6;
        this.f34616g.add(cVar);
        C15409a aVar = new C15409a(cVar);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        float f8 = z ? (180.0f + f7) % 360.0f : f7;
        mo54627b(f5);
        this.f34617h.add(aVar);
        this.f34614e = f8;
        double d = (double) f7;
        this.f34612c = (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))) + ((f + f3) * 0.5f);
        this.f34613d = (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))) + ((f2 + f4) * 0.5f);
    }

    /* renamed from: b */
    public final void mo54627b(float f) {
        float f2 = this.f34614e;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 <= 180.0f) {
                float f4 = this.f34612c;
                float f5 = this.f34613d;
                C15411c cVar = new C15411c(f4, f5, f4, f5);
                cVar.f34627f = this.f34614e;
                cVar.f34628g = f3;
                this.f34617h.add(new C15409a(cVar));
                this.f34614e = f;
            }
        }
    }

    /* renamed from: c */
    public final void mo54628c(Matrix matrix, Path path) {
        int size = this.f34616g.size();
        for (int i = 0; i < size; i++) {
            ((C15413e) this.f34616g.get(i)).mo54632a(matrix, path);
        }
    }

    /* renamed from: d */
    public final void mo54629d(float f, float f2) {
        C15412d dVar = new C15412d();
        dVar.f34629b = f;
        dVar.f34630c = f2;
        this.f34616g.add(dVar);
        C15410b bVar = new C15410b(dVar, this.f34612c, this.f34613d);
        mo54627b(bVar.mo54631b() + 270.0f);
        this.f34617h.add(bVar);
        this.f34614e = bVar.mo54631b() + 270.0f;
        this.f34612c = f;
        this.f34613d = f2;
    }

    /* renamed from: e */
    public final void mo54630e(float f, float f2, float f3, float f4) {
        this.f34610a = f;
        this.f34611b = f2;
        this.f34612c = f;
        this.f34613d = f2;
        this.f34614e = f3;
        this.f34615f = (f3 + f4) % 360.0f;
        this.f34616g.clear();
        this.f34617h.clear();
    }
}
