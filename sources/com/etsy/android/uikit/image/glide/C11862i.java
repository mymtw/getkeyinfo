package com.etsy.android.uikit.image.glide;

import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.uikit.image.glide.i */
public final /* synthetic */ class C11862i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ImageView f26391b;

    /* renamed from: c */
    public final /* synthetic */ Bitmap f26392c;

    /* renamed from: d */
    public final /* synthetic */ Bitmap f26393d;

    public /* synthetic */ C11862i(ImageView imageView, Bitmap bitmap, Bitmap bitmap2) {
        this.f26391b = imageView;
        this.f26392c = bitmap;
        this.f26393d = bitmap2;
    }

    public final void run() {
        ImageView imageView = this.f26391b;
        Bitmap bitmap = this.f26392c;
        Bitmap bitmap2 = this.f26393d;
        C19383o.m32797g(bitmap, "$bitmap");
        imageView.setImageBitmap(bitmap);
        imageView.postInvalidate();
        boolean z = false;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            z = true;
        }
        if (z) {
            bitmap2.recycle();
        }
    }
}
