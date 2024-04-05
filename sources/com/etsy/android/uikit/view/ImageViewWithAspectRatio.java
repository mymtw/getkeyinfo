package com.etsy.android.uikit.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import p455u9.C13449c;
import p455u9.C13450d;

public class ImageViewWithAspectRatio extends AppCompatImageView {
    public static final double STANDARD_IMAGE_ASPECT_RATIO = 0.75d;
    private CropType mCropType = CropType.NONE;
    private boolean mDoMaintainAspectRatio = false;
    private double mHeightRatio;
    private ListingImage mImage;
    private boolean mImageLoadRequested;
    private C13449c mListener;
    private int mLoadingColor;
    private boolean mUseStandardRatio = false;

    public enum CropType {
        TOP,
        BOTTOM,
        NONE
    }

    /* renamed from: com.etsy.android.uikit.view.ImageViewWithAspectRatio$a */
    public static /* synthetic */ class C11919a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26485a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.etsy.android.uikit.view.ImageViewWithAspectRatio$CropType[] r0 = com.etsy.android.uikit.view.ImageViewWithAspectRatio.CropType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26485a = r0
                com.etsy.android.uikit.view.ImageViewWithAspectRatio$CropType r1 = com.etsy.android.uikit.view.ImageViewWithAspectRatio.CropType.TOP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26485a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.etsy.android.uikit.view.ImageViewWithAspectRatio$CropType r1 = com.etsy.android.uikit.view.ImageViewWithAspectRatio.CropType.BOTTOM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.uikit.view.ImageViewWithAspectRatio.C11919a.<clinit>():void");
        }
    }

    public ImageViewWithAspectRatio(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1993m.f4494i);
            setAspectRatio((double) obtainStyledAttributes.getFloat(1, 0.0f));
            this.mDoMaintainAspectRatio = obtainStyledAttributes.getBoolean(0, this.mDoMaintainAspectRatio);
            obtainStyledAttributes.recycle();
        }
    }

    private void specialCrop() {
        float f;
        float f2;
        float f3;
        if (getDrawable() != null) {
            int intrinsicWidth = getDrawable().getIntrinsicWidth();
            int intrinsicHeight = getDrawable().getIntrinsicHeight();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            Matrix matrix = new Matrix();
            if (intrinsicWidth * height > width * intrinsicHeight) {
                f = ((float) height) / ((float) intrinsicHeight);
                f3 = (((float) width) - (((float) intrinsicWidth) * f)) * 0.5f;
                f2 = 0.0f;
            } else {
                float f4 = ((float) width) / ((float) intrinsicWidth);
                f2 = ((float) height) - (((float) intrinsicHeight) * f4);
                f = f4;
                f3 = 0.0f;
            }
            matrix.setScale(f, f);
            int i = C11919a.f26485a[this.mCropType.ordinal()];
            if (i == 1) {
                matrix.postTranslate((float) ((int) (f3 + 0.5f)), 0.0f);
            } else if (i != 2) {
                matrix.postTranslate((float) ((int) (f3 + 0.5f)), (float) ((int) ((f2 * 0.5f) + 0.5f)));
            } else {
                matrix.postTranslate((float) ((int) (f3 + 0.5f)), (float) ((int) (f2 + 0.5f)));
            }
            setScaleType(ImageView.ScaleType.MATRIX);
            setImageMatrix(matrix);
        }
    }

    public void cleanup() {
        setImageDrawable((Drawable) null);
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        ListingImage listingImage = this.mImage;
        double fullHeight = (listingImage == null || !this.mDoMaintainAspectRatio) ? this.mHeightRatio : (double) (((float) listingImage.getFullHeight()) / ((float) this.mImage.getFullWidth()));
        this.mHeightRatio = fullHeight;
        int i3 = (int) (((double) size) * fullHeight);
        if (this.mImage != null) {
            setMeasuredDimension(size, i3);
            if (!this.mImageLoadRequested) {
                setBackgroundColor(this.mLoadingColor);
                if (size > 0) {
                    this.mImageLoadRequested = true;
                    C13450d dVar = new C13450d(this, this.mUseStandardRatio ? this.mImage.get4to3ImageUrlForPixelWidth(size) : this.mImage.getImageUrlForPixelWidth(size));
                    dVar.f29469c = size;
                    dVar.f29470d = i3;
                    dVar.f29471e = this.mListener;
                    C0761x.m1705Z(dVar);
                }
            }
        } else if (fullHeight != ShadowDrawableWrapper.COS_45) {
            setMeasuredDimension(size, i3);
        } else {
            super.onMeasure(i, i2);
        }
        if (this.mCropType != CropType.NONE) {
            specialCrop();
        }
    }

    public void setAspectRatio(double d) {
        this.mHeightRatio = d;
        this.mUseStandardRatio = Math.abs(d - 0.75d) < 1.0E-7d;
    }

    public void setDoMaintainAspectRatio(boolean z) {
        this.mDoMaintainAspectRatio = z;
    }

    public void setImageDownloadListener(C13449c cVar) {
        this.mListener = cVar;
    }

    public void setImageInfo(ListingImage listingImage) {
        this.mImage = listingImage;
        this.mImageLoadRequested = false;
        if (listingImage != null) {
            this.mLoadingColor = listingImage.getImageColor();
        }
        requestLayout();
    }

    public void setSpecialCrop(CropType cropType) {
        if (cropType != null) {
            this.mCropType = cropType;
        }
    }

    public void setUseStandardRatio(boolean z) {
        this.mUseStandardRatio = z;
        if (z) {
            this.mHeightRatio = 0.75d;
        }
    }

    public ImageViewWithAspectRatio(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public ImageViewWithAspectRatio(Context context) {
        super(context);
        init(context, (AttributeSet) null);
    }
}
