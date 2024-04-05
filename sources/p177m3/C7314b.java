package p177m3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.C4840k;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.model.layer.C4845a;
import com.airbnb.lottie.model.layer.Layer;
import p125h3.C6944p;
import p206p3.C7659e;
import p214q3.C7720c;

/* renamed from: m3.b */
public final class C7314b extends C4845a {

    /* renamed from: v */
    public final LPaint f16208v = new LPaint(3);

    /* renamed from: w */
    public final Rect f16209w = new Rect();

    /* renamed from: x */
    public final Rect f16210x = new Rect();

    /* renamed from: y */
    public C6944p f16211y;

    public C7314b(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
    }

    /* renamed from: c */
    public final void mo14604c(C7720c cVar, Object obj) {
        super.mo14604c(cVar, obj);
        if (obj != C4840k.f10874B) {
            return;
        }
        if (cVar == null) {
            this.f16211y = null;
        } else {
            this.f16211y = new C6944p(cVar, null);
        }
    }

    /* renamed from: d */
    public final void mo14605d(RectF rectF, Matrix matrix, boolean z) {
        super.mo14605d(rectF, matrix, z);
        Bitmap imageAsset = this.f10996m.getImageAsset(this.f10997n.f10968g);
        if (imageAsset != null) {
            rectF.set(0.0f, 0.0f, C7659e.m14702c() * ((float) imageAsset.getWidth()), C7659e.m14702c() * ((float) imageAsset.getHeight()));
            this.f10995l.mapRect(rectF);
        }
    }

    /* renamed from: j */
    public final void mo14612j(Canvas canvas, Matrix matrix, int i) {
        Bitmap imageAsset = this.f10996m.getImageAsset(this.f10997n.f10968g);
        if (imageAsset != null && !imageAsset.isRecycled()) {
            float c = C7659e.m14702c();
            this.f16208v.setAlpha(i);
            C6944p pVar = this.f16211y;
            if (pVar != null) {
                this.f16208v.setColorFilter((ColorFilter) pVar.mo19083g());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f16209w.set(0, 0, imageAsset.getWidth(), imageAsset.getHeight());
            this.f16210x.set(0, 0, (int) (((float) imageAsset.getWidth()) * c), (int) (((float) imageAsset.getHeight()) * c));
            canvas.drawBitmap(imageAsset, this.f16209w, this.f16210x, this.f16208v);
            canvas.restore();
        }
    }
}
