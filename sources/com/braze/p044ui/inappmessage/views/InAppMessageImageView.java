package com.braze.p044ui.inappmessage.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import com.braze.enums.inappmessage.CropType;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.C19383o;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.braze.ui.inappmessage.views.InAppMessageImageView */
public final class InAppMessageImageView extends ImageView implements C5695a {
    private float aspectRatio = -1.0f;
    private Path clipPath = new Path();
    private float[] inAppRadii;
    private RectF rectf = new RectF();
    private boolean setToHalfParentHeight;

    public InAppMessageImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setAdjustViewBounds(true);
    }

    private static /* synthetic */ void getSetToHalfParentHeight$annotations() {
    }

    public final boolean clipCanvasToPath(Canvas canvas, int i, int i2) {
        C19383o.m32797g(canvas, "canvas");
        try {
            this.clipPath.reset();
            this.rectf.set(0.0f, 0.0f, (float) i, (float) i2);
            this.clipPath.addRoundRect(this.rectf, getInAppRadii(), Path.Direction.CW);
            canvas.clipPath(this.clipPath);
            return true;
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, InAppMessageImageView$clipCanvasToPath$1.INSTANCE, 4);
            return false;
        }
    }

    public final Path getClipPath() {
        return this.clipPath;
    }

    public final float[] getInAppRadii() {
        float[] fArr = this.inAppRadii;
        if (fArr != null) {
            return fArr;
        }
        C19383o.m32805o("inAppRadii");
        throw null;
    }

    public final RectF getRectf() {
        return this.rectf;
    }

    public void onDraw(Canvas canvas) {
        C19383o.m32797g(canvas, "canvas");
        clipCanvasToPath(canvas, getWidth(), getHeight());
        super.onDraw(canvas);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if ((this.aspectRatio == -1.0f) || getMeasuredHeight() <= 0 || getMeasuredWidth() <= 0) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            int measuredWidth = getMeasuredWidth();
            setMeasuredDimension(measuredWidth, Math.min(getMeasuredHeight(), (int) (((float) measuredWidth) / this.aspectRatio)) + 1);
        }
        if (this.setToHalfParentHeight) {
            ViewParent parent = getParent();
            if (parent != null) {
                setMeasuredDimension(getMeasuredWidth(), (int) (((double) ((View) parent).getHeight()) * 0.5d));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
    }

    public void setAspectRatio(float f) {
        this.aspectRatio = f;
        requestLayout();
    }

    public final void setClipPath(Path path) {
        C19383o.m32797g(path, "<set-?>");
        this.clipPath = path;
    }

    public void setCornersRadiiPx(float f, float f2, float f3, float f4) {
        this.inAppRadii = new float[]{f, f, f2, f2, f3, f3, f4, f4};
    }

    public void setCornersRadiusPx(float f) {
        setCornersRadiiPx(f, f, f, f);
    }

    public void setInAppMessageImageCropType(CropType cropType) {
        if (cropType == CropType.FIT_CENTER) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (cropType == CropType.CENTER_CROP) {
            setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    public final void setRectf(RectF rectF) {
        C19383o.m32797g(rectF, "<set-?>");
        this.rectf = rectF;
    }

    public void setToHalfParentHeight(boolean z) {
        this.setToHalfParentHeight = z;
        requestLayout();
    }
}
