package p177m3;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C4840k;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.model.layer.C4845a;
import com.airbnb.lottie.model.layer.Layer;
import p125h3.C6928a;
import p125h3.C6944p;
import p214q3.C7720c;

/* renamed from: m3.e */
public final class C7317e extends C4845a {

    /* renamed from: A */
    public C6944p f16213A;

    /* renamed from: v */
    public final RectF f16214v = new RectF();

    /* renamed from: w */
    public final LPaint f16215w;

    /* renamed from: x */
    public final float[] f16216x;

    /* renamed from: y */
    public final Path f16217y;

    /* renamed from: z */
    public final Layer f16218z;

    public C7317e(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        LPaint lPaint = new LPaint();
        this.f16215w = lPaint;
        this.f16216x = new float[8];
        this.f16217y = new Path();
        this.f16218z = layer;
        lPaint.setAlpha(0);
        lPaint.setStyle(Paint.Style.FILL);
        lPaint.setColor(layer.f10973l);
    }

    /* renamed from: c */
    public final void mo14604c(C7720c cVar, Object obj) {
        super.mo14604c(cVar, obj);
        if (obj != C4840k.f10874B) {
            return;
        }
        if (cVar == null) {
            this.f16213A = null;
        } else {
            this.f16213A = new C6944p(cVar, null);
        }
    }

    /* renamed from: d */
    public final void mo14605d(RectF rectF, Matrix matrix, boolean z) {
        super.mo14605d(rectF, matrix, z);
        RectF rectF2 = this.f16214v;
        Layer layer = this.f16218z;
        rectF2.set(0.0f, 0.0f, (float) layer.f10971j, (float) layer.f10972k);
        this.f10995l.mapRect(this.f16214v);
        rectF.set(this.f16214v);
    }

    /* renamed from: j */
    public final void mo14612j(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.f16218z.f10973l);
        if (alpha != 0) {
            C6928a<Integer, Integer> aVar = this.f11003t.f15386j;
            int intValue = (int) ((((((float) alpha) / 255.0f) * ((float) (aVar == null ? 100 : aVar.mo19083g().intValue()))) / 100.0f) * (((float) i) / 255.0f) * 255.0f);
            this.f16215w.setAlpha(intValue);
            C6944p pVar = this.f16213A;
            if (pVar != null) {
                this.f16215w.setColorFilter((ColorFilter) pVar.mo19083g());
            }
            if (intValue > 0) {
                float[] fArr = this.f16216x;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                Layer layer = this.f16218z;
                float f = (float) layer.f10971j;
                fArr[2] = f;
                fArr[3] = 0.0f;
                fArr[4] = f;
                float f2 = (float) layer.f10972k;
                fArr[5] = f2;
                fArr[6] = 0.0f;
                fArr[7] = f2;
                matrix.mapPoints(fArr);
                this.f16217y.reset();
                Path path = this.f16217y;
                float[] fArr2 = this.f16216x;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.f16217y;
                float[] fArr3 = this.f16216x;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.f16217y;
                float[] fArr4 = this.f16216x;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.f16217y;
                float[] fArr5 = this.f16216x;
                path4.lineTo(fArr5[6], fArr5[7]);
                Path path5 = this.f16217y;
                float[] fArr6 = this.f16216x;
                path5.lineTo(fArr6[0], fArr6[1]);
                this.f16217y.close();
                canvas.drawPath(this.f16217y, this.f16215w);
            }
        }
    }
}
