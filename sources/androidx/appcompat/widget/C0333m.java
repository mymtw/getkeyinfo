package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.etsy.android.lib.requests.EtsyRequest;
import p298z0.C8419c;

/* renamed from: androidx.appcompat.widget.m */
public class C0333m {

    /* renamed from: c */
    public static final int[] f852c = {16843067, 16843068};

    /* renamed from: a */
    public final ProgressBar f853a;

    /* renamed from: b */
    public Bitmap f854b;

    public C0333m(ProgressBar progressBar) {
        this.f853a = progressBar;
    }

    /* renamed from: a */
    public void mo3093a(AttributeSet attributeSet, int i) {
        C0340p0 m = C0340p0.m891m(this.f853a.getContext(), attributeSet, f852c, i);
        Drawable f = m.mo3102f(0);
        if (f != null) {
            ProgressBar progressBar = this.f853a;
            if (f instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) f;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable b = mo3094b(animationDrawable.getFrame(i2), true);
                    b.setLevel(EtsyRequest.DEFAULT_TIMEOUT);
                    animationDrawable2.addFrame(b, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(EtsyRequest.DEFAULT_TIMEOUT);
                f = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(f);
        }
        Drawable f2 = m.mo3102f(1);
        if (f2 != null) {
            this.f853a.setProgressDrawable(mo3094b(f2, false));
        }
        m.mo3109n();
    }

    /* renamed from: b */
    public final Drawable mo3094b(Drawable drawable, boolean z) {
        if (drawable instanceof C8419c) {
            C8419c cVar = (C8419c) drawable;
            Drawable a = cVar.mo21005a();
            if (a != null) {
                cVar.mo21006b(mo3094b(a, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = mo3094b(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
                layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f854b == null) {
                this.f854b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }
}
