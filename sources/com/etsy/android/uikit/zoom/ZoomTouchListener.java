package com.etsy.android.uikit.zoom;

import android.graphics.Color;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;

public final class ZoomTouchListener implements View.OnTouchListener, ScaleGestureDetector.OnScaleGestureListener {
    /* access modifiers changed from: private */
    public final C12031c config;
    /* access modifiers changed from: private */
    public final ViewGroup decorView;
    /* access modifiers changed from: private */
    public final C12029a doubleTapListener;
    private final C19285c eventHandler$delegate = C19350d.m32677b(new ZoomTouchListener$eventHandler$2(this));
    private final C19285c gestureDetector$delegate = C19350d.m32677b(new ZoomTouchListener$gestureDetector$2(this));
    private final C19285c gestureListener$delegate = C19350d.m32677b(new ZoomTouchListener$gestureListener$2(this));
    private final C19285c scaleGestureDetector$delegate = C19350d.m32677b(new ZoomTouchListener$scaleGestureDetector$2(this));
    /* access modifiers changed from: private */
    public final C12030b singleTapListener;
    /* access modifiers changed from: private */
    public final View target;
    /* access modifiers changed from: private */
    public final C12032d zoomListener;

    public ZoomTouchListener(ViewGroup viewGroup, View view, C12031c cVar, C12030b bVar, C12029a aVar, C12032d dVar) {
        C19383o.m32797g(viewGroup, "decorView");
        C19383o.m32797g(view, "target");
        C19383o.m32797g(cVar, "config");
        this.decorView = viewGroup;
        this.target = view;
        this.config = cVar;
        this.singleTapListener = bVar;
        this.doubleTapListener = aVar;
        this.zoomListener = dVar;
    }

    private final ZoomEventHandler getEventHandler() {
        return (ZoomEventHandler) this.eventHandler$delegate.getValue();
    }

    private final GestureDetector getGestureDetector() {
        return (GestureDetector) this.gestureDetector$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final ViewZoomDoubleTapGestureListener getGestureListener() {
        return (ViewZoomDoubleTapGestureListener) this.gestureListener$delegate.getValue();
    }

    private final ScaleGestureDetector getScaleGestureDetector() {
        return (ScaleGestureDetector) this.scaleGestureDetector$delegate.getValue();
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C19383o.m32797g(scaleGestureDetector, "detector");
        ZoomEventHandler eventHandler = getEventHandler();
        eventHandler.getClass();
        ImageView imageView = eventHandler.f26814e;
        if (imageView == null) {
            return false;
        }
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (Float.valueOf(scaleFactor).equals(Float.valueOf(Float.NaN))) {
            return false;
        }
        float f = eventHandler.f26815f * scaleFactor;
        eventHandler.f26815f = f;
        float max = Math.max(1.0f, Math.min(f, 5.0f));
        eventHandler.f26815f = max;
        imageView.setScaleX(max);
        imageView.setScaleY(eventHandler.f26815f);
        float f2 = ((eventHandler.f26815f - 1.0f) / 4.0f) * ((float) 2);
        if (f2 > 0.75f) {
            f2 = 0.75f;
        }
        ((View) eventHandler.f26817h.getValue()).setBackgroundColor(Color.argb((int) (f2 * ((float) 255)), 0, 0, 0));
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        C19383o.m32797g(scaleGestureDetector, "detector");
        return getEventHandler().f26814e != null;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        C19383o.m32797g(scaleGestureDetector, "detector");
        getEventHandler().f26815f = 1.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r3 != 6) goto L_0x0197;
     */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            java.lang.String r0 = "target"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            java.lang.String r7 = "event"
            kotlin.jvm.internal.C19383o.m32797g(r8, r7)
            com.etsy.android.uikit.zoom.ZoomEventHandler r7 = r6.getEventHandler()
            r7.getClass()
            com.etsy.android.uikit.zoom.e r7 = r7.f26816g
            boolean r7 = r7 instanceof com.etsy.android.uikit.zoom.C12033e.C12034a
            r0 = 0
            r1 = 2
            r2 = 1
            if (r7 != 0) goto L_0x0023
            int r7 = r8.getPointerCount()
            if (r7 <= r1) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r7 = r0
            goto L_0x0024
        L_0x0023:
            r7 = r2
        L_0x0024:
            if (r7 == 0) goto L_0x0027
            return r2
        L_0x0027:
            android.view.GestureDetector r7 = r6.getGestureDetector()
            r7.onTouchEvent(r8)
            android.view.ScaleGestureDetector r7 = r6.getScaleGestureDetector()
            r7.onTouchEvent(r8)
            com.etsy.android.uikit.zoom.ZoomEventHandler r7 = r6.getEventHandler()
            r7.getClass()
            int r3 = r8.getActionMasked()
            if (r3 == 0) goto L_0x00e4
            if (r3 == r2) goto L_0x008c
            if (r3 == r1) goto L_0x0051
            r1 = 3
            if (r3 == r1) goto L_0x008c
            r1 = 5
            if (r3 == r1) goto L_0x00e4
            r8 = 6
            if (r3 == r8) goto L_0x008c
            goto L_0x0197
        L_0x0051:
            com.etsy.android.uikit.zoom.e r0 = r7.f26816g
            boolean r0 = r0 instanceof com.etsy.android.uikit.zoom.C12033e.C12037d
            if (r0 == 0) goto L_0x0197
            android.widget.ImageView r0 = r7.f26814e
            if (r0 == 0) goto L_0x0197
            android.graphics.PointF r1 = r7.f26819j
            com.google.android.play.core.assetpacks.C15588c1.m25301Q0(r1, r8)
            android.graphics.PointF r8 = r7.f26819j
            float r1 = r8.x
            android.graphics.PointF r3 = r7.f26818i
            float r4 = r3.x
            float r1 = r1 - r4
            r8.x = r1
            float r4 = r8.y
            float r3 = r3.y
            float r4 = r4 - r3
            r8.y = r4
            android.graphics.Point r3 = r7.f26820k
            int r5 = r3.x
            float r5 = (float) r5
            float r1 = r1 + r5
            r8.x = r1
            int r3 = r3.y
            float r3 = (float) r3
            float r4 = r4 + r3
            r8.y = r4
            r0.setX(r1)
            android.graphics.PointF r7 = r7.f26819j
            float r7 = r7.y
            r0.setY(r7)
            goto L_0x0197
        L_0x008c:
            com.etsy.android.uikit.zoom.e r8 = r7.f26816g
            boolean r0 = r8 instanceof com.etsy.android.uikit.zoom.C12033e.C12037d
            if (r0 == 0) goto L_0x00da
            com.etsy.android.uikit.zoom.c r8 = r7.f26812c
            boolean r8 = r8.f26822a
            if (r8 == 0) goto L_0x00d3
            android.widget.ImageView r8 = r7.f26814e
            if (r8 == 0) goto L_0x0197
            com.etsy.android.uikit.zoom.e$a r0 = com.etsy.android.uikit.zoom.C12033e.C12034a.f26825a
            r7.f26816g = r0
            android.view.ViewPropertyAnimator r8 = r8.animate()
            android.graphics.Point r0 = r7.f26820k
            int r0 = r0.x
            float r0 = (float) r0
            android.view.ViewPropertyAnimator r8 = r8.x(r0)
            android.graphics.Point r0 = r7.f26820k
            int r0 = r0.y
            float r0 = (float) r0
            android.view.ViewPropertyAnimator r8 = r8.y(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r8 = r8.scaleX(r0)
            android.view.ViewPropertyAnimator r8 = r8.scaleY(r0)
            com.etsy.android.uikit.zoom.c r0 = r7.f26812c
            android.view.animation.Interpolator r0 = r0.f26824c
            android.view.ViewPropertyAnimator r8 = r8.setInterpolator(r0)
            androidx.core.widget.d r7 = r7.f26821l
            android.view.ViewPropertyAnimator r7 = r8.withEndAction(r7)
            r7.start()
            goto L_0x0197
        L_0x00d3:
            androidx.core.widget.d r7 = r7.f26821l
            r7.run()
            goto L_0x0197
        L_0x00da:
            boolean r8 = r8 instanceof com.etsy.android.uikit.zoom.C12033e.C12036c
            if (r8 == 0) goto L_0x0197
            com.etsy.android.uikit.zoom.e$b r8 = com.etsy.android.uikit.zoom.C12033e.C12035b.f26826a
            r7.f26816g = r8
            goto L_0x0197
        L_0x00e4:
            com.etsy.android.uikit.zoom.e r1 = r7.f26816g
            boolean r3 = r1 instanceof com.etsy.android.uikit.zoom.C12033e.C12035b
            if (r3 == 0) goto L_0x00f0
            com.etsy.android.uikit.zoom.e$c r8 = com.etsy.android.uikit.zoom.C12033e.C12036c.f26827a
            r7.f26816g = r8
            goto L_0x0197
        L_0x00f0:
            boolean r1 = r1 instanceof com.etsy.android.uikit.zoom.C12033e.C12036c
            if (r1 == 0) goto L_0x0197
            com.etsy.android.uikit.zoom.d r1 = r7.f26813d
            if (r1 == 0) goto L_0x00fd
            android.view.View r3 = r7.f26811b
            r1.mo32487a(r3)
        L_0x00fd:
            com.etsy.android.uikit.zoom.e$d r1 = com.etsy.android.uikit.zoom.C12033e.C12037d.f26828a
            r7.f26816g = r1
            android.graphics.PointF r1 = r7.f26818i
            com.google.android.play.core.assetpacks.C15588c1.m25301Q0(r1, r8)
            android.view.View r8 = r7.f26811b
            android.widget.ImageView r1 = new android.widget.ImageView
            android.content.Context r3 = r8.getContext()
            r1.<init>(r3)
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            int r4 = r8.getWidth()
            int r5 = r8.getHeight()
            r3.<init>(r4, r5)
            r1.setLayoutParams(r3)
            android.graphics.Bitmap r3 = com.google.android.play.core.assetpacks.C15588c1.m25323e0(r8)
            r1.setImageBitmap(r3)
            android.graphics.Point r3 = com.google.android.play.core.assetpacks.C15588c1.m25358y0(r8)
            r7.f26820k = r3
            int r3 = r3.x
            float r3 = (float) r3
            r1.setX(r3)
            android.graphics.Point r3 = r7.f26820k
            int r3 = r3.y
            float r3 = (float) r3
            r1.setY(r3)
            android.graphics.PointF r3 = r7.f26818i
            float r3 = r3.x
            r1.setPivotX(r3)
            android.graphics.PointF r3 = r7.f26818i
            float r3 = r3.y
            r1.setPivotY(r3)
            r7.f26814e = r1
            kotlin.c r1 = r7.f26817h
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            r1.setBackgroundColor(r0)
            kotlin.c r0 = r7.f26817h
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0168
            android.view.ViewGroup r1 = r7.f26810a
            r1.addView(r0)
            kotlin.m r0 = kotlin.C19394m.f43287a
        L_0x0168:
            android.widget.ImageView r0 = r7.f26814e
            if (r0 == 0) goto L_0x0173
            android.view.ViewGroup r1 = r7.f26810a
            r1.addView(r0)
            kotlin.m r0 = kotlin.C19394m.f43287a
        L_0x0173:
            r0 = 4
            r8.setVisibility(r0)
            android.view.ViewParent r8 = r8.getParent()
            java.lang.String r0 = "target.parent"
            kotlin.jvm.internal.C19383o.m32796f(r8, r0)
            com.etsy.android.uikit.zoom.ZoomEventHandler.m19849a(r8)
            com.etsy.android.uikit.zoom.c r8 = r7.f26812c
            boolean r8 = r8.f26823b
            if (r8 == 0) goto L_0x0197
            android.view.ViewGroup r7 = r7.f26810a
            androidx.core.view.c1 r7 = androidx.core.view.C2364y.m5193h(r7)
            if (r7 != 0) goto L_0x0192
            goto L_0x0197
        L_0x0192:
            androidx.core.view.c1$e r7 = r7.f5551a
            r7.mo8886a()
        L_0x0197:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.uikit.zoom.ZoomTouchListener.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
