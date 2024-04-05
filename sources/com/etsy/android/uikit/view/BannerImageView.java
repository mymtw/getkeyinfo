package com.etsy.android.uikit.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.Glide;
import com.etsy.android.lib.models.apiv3.Image;
import p455u9.C13449c;

public class BannerImageView extends AppCompatImageView {
    private C13449c mDownloadListener;
    private Image mImage;
    private boolean mImageLoadRequested;
    private int mLoadingColor;

    public BannerImageView(Context context) {
        super(context);
    }

    public void loadImage() {
        String pickBestImageSource = this.mImage.pickBestImageSource(getMeasuredWidth(), getMeasuredHeight());
        C13449c cVar = new C13449c(this);
        C13449c cVar2 = this.mDownloadListener;
        if (cVar2 != null) {
            cVar = cVar2;
        }
        Glide.with((View) this).load(pickBestImageSource).mo16818O(cVar).mo16816M(this);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.mImage != null && !this.mImageLoadRequested) {
            this.mImageLoadRequested = true;
            loadImage();
        }
    }

    public void onMeasure(int i, int i2) {
        float fullHeight = ((float) this.mImage.getFullHeight()) / ((float) this.mImage.getFullWidth());
        int size = View.MeasureSpec.getSize(i);
        setMeasuredDimension(size, (int) (((float) size) * fullHeight));
    }

    public void setImageInfo(Image image, C13449c cVar) {
        this.mImage = image;
        this.mDownloadListener = cVar;
        this.mLoadingColor = image.getImageColor();
        this.mImageLoadRequested = false;
        requestLayout();
    }

    public BannerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BannerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
