package com.etsy.android.uikit.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.activity.C0114h;
import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.lib.models.IFullImage;

public class FullImageView extends ForegroundImageView {
    public static final float ASPECT_FULL_HEIGHT = 0.0f;
    public static final float ASPECT_NONE = -3423432.0f;
    public static final float ASPECT_RATIO_SQUARE = 1.0f;
    public static final int IMAGE_SHAPE_CIRCULAR = 1;
    public static final int IMAGE_SHAPE_RECTANGULAR = 2;
    public static final float SHOP_ABOUT_IMAGE_HEIGHT_RATIO = 0.6158f;
    public float mAspectRatio = 0.0f;
    public IFullImage mImage;
    public int mImageFullHeight = 1;
    public int mImageFullWidth = 1;
    public boolean mImageLoadRequested;
    public int mImageShape = 2;
    public int mLoadingColor;

    public FullImageView(Context context) {
        super(context);
        init(context, (AttributeSet) null);
    }

    public void cleanUp() {
        this.mImage = null;
        setImageDrawable((Drawable) null);
    }

    public void init(Context context, AttributeSet attributeSet) {
        if (attributeSet == null || context == null) {
            setHeightRatio(0.0f);
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1993m.f4493h);
        setHeightRatio(obtainStyledAttributes.getFloat(0, 0.0f));
        obtainStyledAttributes.recycle();
    }

    public void loadImage() {
        String fullHeightImageUrlForPixelWidth = this.mImage.getFullHeightImageUrlForPixelWidth(getMeasuredWidth());
        if (this.mImageShape == 2) {
            C0114h.m270B0(getContext()).load(fullHeightImageUrlForPixelWidth).mo17160t(new ColorDrawable(this.mLoadingColor)).mo16816M(this);
        } else {
            C0114h.m270B0(getContext()).load(fullHeightImageUrlForPixelWidth).mo17160t(new ColorDrawable(this.mLoadingColor)).mo46137e0().mo16816M(this);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.mImage != null && !this.mImageLoadRequested) {
            this.mImageLoadRequested = true;
            loadImage();
        }
    }

    public void onMeasure(int i, int i2) {
        float f = this.mAspectRatio;
        if (f == -3423432.0f) {
            super.onMeasure(i, i2);
            return;
        }
        float f2 = (((double) Math.abs(f - 0.0f)) > 1.0E-7d ? 1 : (((double) Math.abs(f - 0.0f)) == 1.0E-7d ? 0 : -1)) < 0 ? ((float) this.mImageFullHeight) / ((float) this.mImageFullWidth) : this.mAspectRatio;
        int size = View.MeasureSpec.getSize(i);
        setMeasuredDimension(size, (int) (((float) size) * f2));
    }

    public void setHeightRatio(float f) {
        this.mAspectRatio = f;
    }

    public void setImageInfo(IFullImage iFullImage) {
        setImageInfo(iFullImage, 2);
    }

    public void setImageInfo(IFullImage iFullImage, int i) {
        this.mImage = iFullImage;
        this.mImageLoadRequested = false;
        this.mImageShape = i;
        if (iFullImage != null) {
            this.mLoadingColor = iFullImage.getImageColor();
            this.mImageFullHeight = iFullImage.getFullHeight();
            this.mImageFullWidth = iFullImage.getFullWidth();
        }
        requestLayout();
    }

    public FullImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    public FullImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }
}
