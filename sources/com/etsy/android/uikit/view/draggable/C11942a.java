package com.etsy.android.uikit.view.draggable;

/* renamed from: com.etsy.android.uikit.view.draggable.a */
public final /* synthetic */ class C11942a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f26544b;

    /* renamed from: c */
    public final /* synthetic */ Object f26545c;

    public /* synthetic */ C11942a(Object obj, int i) {
        this.f26544b = i;
        this.f26545c = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.f26544b
            r1 = 0
            switch(r0) {
                case 0: goto L_0x00f6;
                case 1: goto L_0x00ee;
                case 2: goto L_0x0010;
                case 3: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x0143
        L_0x0008:
            java.lang.Object r0 = r10.f26545c
            kq.a r0 = (p753kq.C19846a) r0
            com.paypal.pyplcheckout.addshipping.ShippingUtils.m35198runOnUiThread$lambda5(r0)
            return
        L_0x0010:
            java.lang.Object r0 = r10.f26545c
            zi.l r0 = (p726zi.C18917l) r0
            android.view.ViewGroup r2 = r0.f42145f
            if (r2 == 0) goto L_0x00ed
            android.view.ViewGroup r2 = r0.f42146g
            if (r2 != 0) goto L_0x001e
            goto L_0x00ed
        L_0x001e:
            com.google.android.exoplayer2.ui.StyledPlayerControlView r2 = r0.f42140a
            int r2 = r2.getWidth()
            com.google.android.exoplayer2.ui.StyledPlayerControlView r3 = r0.f42140a
            int r3 = r3.getPaddingLeft()
            int r2 = r2 - r3
            com.google.android.exoplayer2.ui.StyledPlayerControlView r3 = r0.f42140a
            int r3 = r3.getPaddingRight()
            int r2 = r2 - r3
        L_0x0032:
            android.view.ViewGroup r3 = r0.f42146g
            int r3 = r3.getChildCount()
            r4 = 1
            if (r3 <= r4) goto L_0x0054
            android.view.ViewGroup r3 = r0.f42146g
            int r3 = r3.getChildCount()
            int r3 = r3 + -2
            android.view.ViewGroup r4 = r0.f42146g
            android.view.View r4 = r4.getChildAt(r3)
            android.view.ViewGroup r5 = r0.f42146g
            r5.removeViewAt(r3)
            android.view.ViewGroup r3 = r0.f42145f
            r3.addView(r4, r1)
            goto L_0x0032
        L_0x0054:
            android.view.View r3 = r0.f42150k
            if (r3 == 0) goto L_0x005d
            r5 = 8
            r3.setVisibility(r5)
        L_0x005d:
            android.view.ViewGroup r3 = r0.f42148i
            int r3 = p726zi.C18917l.m32012d(r3)
            android.view.ViewGroup r5 = r0.f42145f
            int r5 = r5.getChildCount()
            int r5 = r5 - r4
            r6 = r1
        L_0x006b:
            if (r6 >= r5) goto L_0x007b
            android.view.ViewGroup r7 = r0.f42145f
            android.view.View r7 = r7.getChildAt(r6)
            int r7 = p726zi.C18917l.m32012d(r7)
            int r3 = r3 + r7
            int r6 = r6 + 1
            goto L_0x006b
        L_0x007b:
            if (r3 <= r2) goto L_0x00d1
            android.view.View r6 = r0.f42150k
            if (r6 == 0) goto L_0x008b
            r6.setVisibility(r1)
            android.view.View r6 = r0.f42150k
            int r6 = p726zi.C18917l.m32012d(r6)
            int r3 = r3 + r6
        L_0x008b:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = r1
        L_0x0091:
            if (r7 >= r5) goto L_0x00a7
            android.view.ViewGroup r8 = r0.f42145f
            android.view.View r8 = r8.getChildAt(r7)
            int r9 = p726zi.C18917l.m32012d(r8)
            int r3 = r3 - r9
            r6.add(r8)
            if (r3 > r2) goto L_0x00a4
            goto L_0x00a7
        L_0x00a4:
            int r7 = r7 + 1
            goto L_0x0091
        L_0x00a7:
            boolean r2 = r6.isEmpty()
            if (r2 != 0) goto L_0x00ed
            android.view.ViewGroup r2 = r0.f42145f
            int r3 = r6.size()
            r2.removeViews(r1, r3)
        L_0x00b6:
            int r2 = r6.size()
            if (r1 >= r2) goto L_0x00ed
            android.view.ViewGroup r2 = r0.f42146g
            int r2 = r2.getChildCount()
            int r2 = r2 - r4
            android.view.ViewGroup r3 = r0.f42146g
            java.lang.Object r5 = r6.get(r1)
            android.view.View r5 = (android.view.View) r5
            r3.addView(r5, r2)
            int r1 = r1 + 1
            goto L_0x00b6
        L_0x00d1:
            android.view.ViewGroup r1 = r0.f42147h
            if (r1 == 0) goto L_0x00ed
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x00ed
            android.animation.ValueAnimator r1 = r0.f42157r
            boolean r1 = r1.isStarted()
            if (r1 != 0) goto L_0x00ed
            android.animation.ValueAnimator r1 = r0.f42156q
            r1.cancel()
            android.animation.ValueAnimator r0 = r0.f42157r
            r0.start()
        L_0x00ed:
            return
        L_0x00ee:
            java.lang.Object r0 = r10.f26545c
            com.google.android.exoplayer2.ui.PlayerControlView r0 = (com.google.android.exoplayer2.p526ui.PlayerControlView) r0
            r0.hide()
            return
        L_0x00f6:
            java.lang.Object r0 = r10.f26545c
            com.etsy.android.uikit.view.draggable.DragEventHandlerWithShrink r0 = (com.etsy.android.uikit.view.draggable.DragEventHandlerWithShrink) r0
            java.lang.String r2 = "this$0"
            kotlin.jvm.internal.C19383o.m32797g(r0, r2)
            android.widget.ImageView r2 = r0.f26522g
            if (r2 == 0) goto L_0x010a
            android.view.ViewGroup r3 = r0.f26516a
            r3.removeView(r2)
            kotlin.m r2 = kotlin.C19394m.f43287a
        L_0x010a:
            android.view.View r2 = r0.f26523h
            if (r2 == 0) goto L_0x0115
            android.view.ViewGroup r3 = r0.f26516a
            r3.removeView(r2)
            kotlin.m r2 = kotlin.C19394m.f43287a
        L_0x0115:
            r2 = 0
            r0.f26522g = r2
            r0.f26523h = r2
            r2 = 0
            r0.f26519d = r2
            android.view.View r2 = r0.f26517b
            boolean r3 = r2 instanceof com.github.chrisbanes.photoview.PhotoView
            if (r3 == 0) goto L_0x012b
            com.github.chrisbanes.photoview.PhotoView r2 = (com.github.chrisbanes.photoview.PhotoView) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setScale(r3, r1)
            goto L_0x0134
        L_0x012b:
            boolean r3 = r2 instanceof com.etsy.android.stylekit.views.CollagePlayerView
            if (r3 == 0) goto L_0x0134
            com.etsy.android.stylekit.views.CollagePlayerView r2 = (com.etsy.android.stylekit.views.CollagePlayerView) r2
            r2.resume()
        L_0x0134:
            android.view.View r2 = r0.f26517b
            r2.setVisibility(r1)
            com.etsy.android.uikit.view.draggable.b$d r1 = com.etsy.android.uikit.view.draggable.C11943b.C11947d.f26549a
            java.lang.String r2 = "<set-?>"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            r0.f26520e = r1
            return
        L_0x0143:
            java.lang.Object r0 = r10.f26545c
            com.paypal.pyplcheckout.sca.CompleteStrongCustomerAuthenticationCallback r0 = (com.paypal.pyplcheckout.sca.CompleteStrongCustomerAuthenticationCallback) r0
            com.paypal.pyplcheckout.sca.CompleteStrongCustomerAuthenticationCallback.m35421onApiSuccess$lambda0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.uikit.view.draggable.C11942a.run():void");
    }
}
