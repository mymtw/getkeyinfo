package com.etsy.android.uikit.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.p015ui.text.input.C1993m;

public class LazyNativeAssetImageView extends AppCompatImageView {
    private int mImgResId = -1;

    public LazyNativeAssetImageView(Context context) {
        super(context);
    }

    private void init(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1993m.f4495j, 0, 0);
        this.mImgResId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
    }

    private void showImageResIfVisible(int i, int i2) {
        if (i != -1) {
            if (i2 == 0) {
                super.setImageResource(i);
            } else {
                super.setImageDrawable((Drawable) null);
            }
        }
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        showImageResIfVisible(this.mImgResId, i);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.mImgResId = -1;
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        this.mImgResId = -1;
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        this.mImgResId = i;
        showImageResIfVisible(i, getVisibility());
    }

    public void setImageURI(Uri uri) {
        this.mImgResId = -1;
        super.setImageURI(uri);
    }

    public LazyNativeAssetImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public LazyNativeAssetImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }
}
