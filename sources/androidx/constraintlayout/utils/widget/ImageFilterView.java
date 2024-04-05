package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.reflect.C19421p;

public class ImageFilterView extends AppCompatImageView {
    private float mCrossfade = 0.0f;
    private C2231c mImageMatrix = new C2231c();
    public LayerDrawable mLayer;
    public Drawable[] mLayers;
    private boolean mOverlay = true;
    private Path mPath;
    public RectF mRect;
    /* access modifiers changed from: private */
    public float mRound = Float.NaN;
    /* access modifiers changed from: private */
    public float mRoundPercent = 0.0f;
    public ViewOutlineProvider mViewOutlineProvider;

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$a */
    public class C2229a extends ViewOutlineProvider {
        public C2229a() {
        }

        public final void getOutline(View view, Outline outline) {
            int width = ImageFilterView.this.getWidth();
            int height = ImageFilterView.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (ImageFilterView.this.mRoundPercent * ((float) Math.min(width, height))) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$b */
    public class C2230b extends ViewOutlineProvider {
        public C2230b() {
        }

        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.mRound);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$c */
    public static class C2231c {

        /* renamed from: a */
        public float[] f5346a = new float[20];

        /* renamed from: b */
        public ColorMatrix f5347b = new ColorMatrix();

        /* renamed from: c */
        public ColorMatrix f5348c = new ColorMatrix();

        /* renamed from: d */
        public float f5349d = 1.0f;

        /* renamed from: e */
        public float f5350e = 1.0f;

        /* renamed from: f */
        public float f5351f = 1.0f;

        /* renamed from: g */
        public float f5352g = 1.0f;

        /* renamed from: a */
        public final void mo8390a(ImageView imageView) {
            boolean z;
            float f;
            float f2;
            float f3;
            this.f5347b.reset();
            float f4 = this.f5350e;
            boolean z2 = true;
            if (f4 != 1.0f) {
                float f5 = 1.0f - f4;
                float f6 = 0.2999f * f5;
                float f7 = 0.587f * f5;
                float f8 = f5 * 0.114f;
                float[] fArr = this.f5346a;
                fArr[0] = f6 + f4;
                fArr[1] = f7;
                fArr[2] = f8;
                fArr[3] = 0.0f;
                fArr[4] = 0.0f;
                fArr[5] = f6;
                fArr[6] = f7 + f4;
                fArr[7] = f8;
                fArr[8] = 0.0f;
                fArr[9] = 0.0f;
                fArr[10] = f6;
                fArr[11] = f7;
                fArr[12] = f8 + f4;
                fArr[13] = 0.0f;
                fArr[14] = 0.0f;
                fArr[15] = 0.0f;
                fArr[16] = 0.0f;
                fArr[17] = 0.0f;
                f = 1.0f;
                fArr[18] = 1.0f;
                fArr[19] = 0.0f;
                this.f5347b.set(fArr);
                z = true;
            } else {
                f = 1.0f;
                z = false;
            }
            float f9 = this.f5351f;
            if (f9 != f) {
                this.f5348c.setScale(f9, f9, f9, f);
                this.f5347b.postConcat(this.f5348c);
                z = true;
            }
            float f10 = this.f5352g;
            if (f10 != f) {
                if (f10 <= 0.0f) {
                    f10 = 0.01f;
                }
                float f11 = (5000.0f / f10) / 100.0f;
                if (f11 > 66.0f) {
                    double d = (double) (f11 - 60.0f);
                    f2 = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                    f3 = ((float) Math.pow(d, 0.07551484555006027d)) * 288.12216f;
                } else {
                    f3 = (((float) Math.log((double) f11)) * 99.4708f) - 161.11957f;
                    f2 = 255.0f;
                }
                float log = f11 < 66.0f ? f11 > 19.0f ? (((float) Math.log((double) (f11 - 10.0f))) * 138.51773f) - 305.0448f : 0.0f : 255.0f;
                float min = Math.min(255.0f, Math.max(f2, 0.0f));
                float min2 = Math.min(255.0f, Math.max(f3, 0.0f));
                float min3 = Math.min(255.0f, Math.max(log, 0.0f));
                float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
                float min5 = Math.min(255.0f, Math.max((((float) Math.log((double) 50.0f)) * 99.4708f) - 161.11957f, 0.0f));
                float min6 = min3 / Math.min(255.0f, Math.max((((float) Math.log((double) 40.0f)) * 138.51773f) - 305.0448f, 0.0f));
                float[] fArr2 = this.f5346a;
                fArr2[0] = min / min4;
                fArr2[1] = 0.0f;
                fArr2[2] = 0.0f;
                fArr2[3] = 0.0f;
                fArr2[4] = 0.0f;
                fArr2[5] = 0.0f;
                fArr2[6] = min2 / min5;
                fArr2[7] = 0.0f;
                fArr2[8] = 0.0f;
                fArr2[9] = 0.0f;
                fArr2[10] = 0.0f;
                fArr2[11] = 0.0f;
                fArr2[12] = min6;
                fArr2[13] = 0.0f;
                fArr2[14] = 0.0f;
                fArr2[15] = 0.0f;
                fArr2[16] = 0.0f;
                fArr2[17] = 0.0f;
                fArr2[18] = 1.0f;
                fArr2[19] = 0.0f;
                this.f5348c.set(fArr2);
                this.f5347b.postConcat(this.f5348c);
                z = true;
            }
            float f12 = this.f5349d;
            if (f12 != 1.0f) {
                float[] fArr3 = this.f5346a;
                fArr3[0] = f12;
                fArr3[1] = 0.0f;
                fArr3[2] = 0.0f;
                fArr3[3] = 0.0f;
                fArr3[4] = 0.0f;
                fArr3[5] = 0.0f;
                fArr3[6] = f12;
                fArr3[7] = 0.0f;
                fArr3[8] = 0.0f;
                fArr3[9] = 0.0f;
                fArr3[10] = 0.0f;
                fArr3[11] = 0.0f;
                fArr3[12] = f12;
                fArr3[13] = 0.0f;
                fArr3[14] = 0.0f;
                fArr3[15] = 0.0f;
                fArr3[16] = 0.0f;
                fArr3[17] = 0.0f;
                fArr3[18] = 1.0f;
                fArr3[19] = 0.0f;
                this.f5348c.set(fArr3);
                this.f5347b.postConcat(this.f5348c);
            } else {
                z2 = z;
            }
            if (z2) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.f5347b));
                return;
            }
            ImageView imageView2 = imageView;
            imageView.clearColorFilter();
        }
    }

    public ImageFilterView(Context context) {
        super(context);
        init(context, (AttributeSet) null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C19421p.f43329s);
            int indexCount = obtainStyledAttributes.getIndexCount();
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 3) {
                    this.mCrossfade = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == 8) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 7) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 2) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 5) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 6) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 4) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.mOverlay));
                }
            }
            obtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.mLayers = drawableArr;
                drawableArr[0] = getDrawable();
                this.mLayers[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.mLayers);
                this.mLayer = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.mCrossfade * 255.0f));
                super.setImageDrawable(this.mLayer);
            }
        }
    }

    private void setOverlay(boolean z) {
        this.mOverlay = z;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getBrightness() {
        return this.mImageMatrix.f5349d;
    }

    public float getContrast() {
        return this.mImageMatrix.f5351f;
    }

    public float getCrossfade() {
        return this.mCrossfade;
    }

    public float getRound() {
        return this.mRound;
    }

    public float getRoundPercent() {
        return this.mRoundPercent;
    }

    public float getSaturation() {
        return this.mImageMatrix.f5350e;
    }

    public float getWarmth() {
        return this.mImageMatrix.f5352g;
    }

    public void setBrightness(float f) {
        C2231c cVar = this.mImageMatrix;
        cVar.f5349d = f;
        cVar.mo8390a(this);
    }

    public void setContrast(float f) {
        C2231c cVar = this.mImageMatrix;
        cVar.f5351f = f;
        cVar.mo8390a(this);
    }

    public void setCrossfade(float f) {
        this.mCrossfade = f;
        if (this.mLayers != null) {
            if (!this.mOverlay) {
                this.mLayer.getDrawable(0).setAlpha((int) ((1.0f - this.mCrossfade) * 255.0f));
            }
            this.mLayer.getDrawable(1).setAlpha((int) (this.mCrossfade * 255.0f));
            super.setImageDrawable(this.mLayer);
        }
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.mRound = f;
            float f2 = this.mRoundPercent;
            this.mRoundPercent = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.mRound != f;
        this.mRound = f;
        if (f != 0.0f) {
            if (this.mPath == null) {
                this.mPath = new Path();
            }
            if (this.mRect == null) {
                this.mRect = new RectF();
            }
            if (this.mViewOutlineProvider == null) {
                C2230b bVar = new C2230b();
                this.mViewOutlineProvider = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.mRect.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.mPath.reset();
            Path path = this.mPath;
            RectF rectF = this.mRect;
            float f3 = this.mRound;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z = this.mRoundPercent != f;
        this.mRoundPercent = f;
        if (f != 0.0f) {
            if (this.mPath == null) {
                this.mPath = new Path();
            }
            if (this.mRect == null) {
                this.mRect = new RectF();
            }
            if (this.mViewOutlineProvider == null) {
                C2229a aVar = new C2229a();
                this.mViewOutlineProvider = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.mRoundPercent) / 2.0f;
            this.mRect.set(0.0f, 0.0f, (float) width, (float) height);
            this.mPath.reset();
            this.mPath.addRoundRect(this.mRect, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        C2231c cVar = this.mImageMatrix;
        cVar.f5350e = f;
        cVar.mo8390a(this);
    }

    public void setWarmth(float f) {
        C2231c cVar = this.mImageMatrix;
        cVar.f5352g = f;
        cVar.mo8390a(this);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }
}
