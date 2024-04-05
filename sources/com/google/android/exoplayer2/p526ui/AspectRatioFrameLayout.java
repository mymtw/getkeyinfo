package com.google.android.exoplayer2.p526ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.internal.C19382n;

/* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout */
public final class AspectRatioFrameLayout extends FrameLayout {
    private static final float MAX_ASPECT_RATIO_DEFORMATION_FRACTION = 0.01f;
    public static final int RESIZE_MODE_FILL = 3;
    public static final int RESIZE_MODE_FIT = 0;
    public static final int RESIZE_MODE_FIXED_HEIGHT = 2;
    public static final int RESIZE_MODE_FIXED_WIDTH = 1;
    public static final int RESIZE_MODE_ZOOM = 4;
    /* access modifiers changed from: private */
    public C14392a aspectRatioListener;
    private final C14393b aspectRatioUpdateDispatcher;
    private int resizeMode;
    private float videoAspectRatio;

    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$a */
    public interface C14392a {
        /* renamed from: a */
        void mo47908a();
    }

    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$b */
    public final class C14393b implements Runnable {

        /* renamed from: b */
        public boolean f32409b;

        public C14393b() {
        }

        public final void run() {
            this.f32409b = false;
            if (AspectRatioFrameLayout.this.aspectRatioListener != null) {
                AspectRatioFrameLayout.this.aspectRatioListener.mo47908a();
            }
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public int getResizeMode() {
        return this.resizeMode;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            float r8 = r7.videoAspectRatio
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 > 0) goto L_0x000b
            return
        L_0x000b:
            int r8 = r7.getMeasuredWidth()
            int r0 = r7.getMeasuredHeight()
            float r1 = (float) r8
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r7.videoAspectRatio
            float r4 = r4 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r3
            float r3 = java.lang.Math.abs(r4)
            r5 = 1008981770(0x3c23d70a, float:0.01)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r5 = 1
            if (r3 > 0) goto L_0x0040
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$b r8 = r7.aspectRatioUpdateDispatcher
            r8.getClass()
            r8.getClass()
            r8.getClass()
            boolean r9 = r8.f32409b
            if (r9 != 0) goto L_0x003f
            r8.f32409b = r5
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r9 = com.google.android.exoplayer2.p526ui.AspectRatioFrameLayout.this
            r9.post(r8)
        L_0x003f:
            return
        L_0x0040:
            int r3 = r7.resizeMode
            if (r3 == 0) goto L_0x005d
            if (r3 == r5) goto L_0x005a
            r6 = 2
            if (r3 == r6) goto L_0x0057
            r6 = 4
            if (r3 == r6) goto L_0x004d
            goto L_0x006a
        L_0x004d:
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x0054
            float r8 = r7.videoAspectRatio
            goto L_0x0068
        L_0x0054:
            float r9 = r7.videoAspectRatio
            goto L_0x0063
        L_0x0057:
            float r8 = r7.videoAspectRatio
            goto L_0x0068
        L_0x005a:
            float r9 = r7.videoAspectRatio
            goto L_0x0063
        L_0x005d:
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x0066
            float r9 = r7.videoAspectRatio
        L_0x0063:
            float r1 = r1 / r9
            int r0 = (int) r1
            goto L_0x006a
        L_0x0066:
            float r8 = r7.videoAspectRatio
        L_0x0068:
            float r2 = r2 * r8
            int r8 = (int) r2
        L_0x006a:
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$b r9 = r7.aspectRatioUpdateDispatcher
            r9.getClass()
            r9.getClass()
            r9.getClass()
            boolean r1 = r9.f32409b
            if (r1 != 0) goto L_0x0080
            r9.f32409b = r5
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r1 = com.google.android.exoplayer2.p526ui.AspectRatioFrameLayout.this
            r1.post(r9)
        L_0x0080:
            r9 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9)
            super.onMeasure(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p526ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public void setAspectRatio(float f) {
        if (this.videoAspectRatio != f) {
            this.videoAspectRatio = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(C14392a aVar) {
        this.aspectRatioListener = aVar;
    }

    public void setResizeMode(int i) {
        if (this.resizeMode != i) {
            this.resizeMode = i;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.resizeMode = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C19382n.f43262l, 0, 0);
            try {
                this.resizeMode = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.aspectRatioUpdateDispatcher = new C14393b();
    }
}
