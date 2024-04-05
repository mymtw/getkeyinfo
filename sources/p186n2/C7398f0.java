package p186n2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p186n2.C7418m;

/* renamed from: n2.f0 */
public abstract class C7398f0 extends C7418m {

    /* renamed from: A */
    public static final String[] f16522A = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: z */
    public int f16523z = 3;

    /* renamed from: n2.f0$a */
    public static class C7399a extends AnimatorListenerAdapter implements C7418m.C7422d {

        /* renamed from: a */
        public final View f16524a;

        /* renamed from: b */
        public final int f16525b;

        /* renamed from: c */
        public final ViewGroup f16526c;

        /* renamed from: d */
        public final boolean f16527d;

        /* renamed from: e */
        public boolean f16528e;

        /* renamed from: f */
        public boolean f16529f = false;

        public C7399a(View view, int i) {
            this.f16524a = view;
            this.f16525b = i;
            this.f16526c = (ViewGroup) view.getParent();
            this.f16527d = true;
            mo19753a(true);
        }

        /* renamed from: a */
        public final void mo19753a(boolean z) {
            ViewGroup viewGroup;
            if (this.f16527d && this.f16528e != z && (viewGroup = this.f16526c) != null) {
                this.f16528e = z;
                C7437w.m14371a(viewGroup, z);
            }
        }

        public final void onAnimationCancel(Animator animator) {
            this.f16529f = true;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f16529f) {
                View view = this.f16524a;
                C7439y.f16624a.mo19740p(this.f16525b, view);
                ViewGroup viewGroup = this.f16526c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            mo19753a(false);
        }

        public final void onAnimationPause(Animator animator) {
            if (!this.f16529f) {
                View view = this.f16524a;
                C7439y.f16624a.mo19740p(this.f16525b, view);
            }
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationResume(Animator animator) {
            if (!this.f16529f) {
                C7439y.f16624a.mo19740p(0, this.f16524a);
            }
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onTransitionCancel(C7418m mVar) {
        }

        public final void onTransitionEnd(C7418m mVar) {
            if (!this.f16529f) {
                View view = this.f16524a;
                C7439y.f16624a.mo19740p(this.f16525b, view);
                ViewGroup viewGroup = this.f16526c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            mo19753a(false);
            mVar.mo19793z(this);
        }

        public final void onTransitionPause(C7418m mVar) {
            mo19753a(false);
        }

        public final void onTransitionResume(C7418m mVar) {
            mo19753a(true);
        }

        public final void onTransitionStart(C7418m mVar) {
        }
    }

    /* renamed from: n2.f0$b */
    public static class C7400b {

        /* renamed from: a */
        public boolean f16530a;

        /* renamed from: b */
        public boolean f16531b;

        /* renamed from: c */
        public int f16532c;

        /* renamed from: d */
        public int f16533d;

        /* renamed from: e */
        public ViewGroup f16534e;

        /* renamed from: f */
        public ViewGroup f16535f;
    }

    /* renamed from: N */
    public static C7400b m14278N(C7433t tVar, C7433t tVar2) {
        C7400b bVar = new C7400b();
        bVar.f16530a = false;
        bVar.f16531b = false;
        if (tVar == null || !tVar.f16606a.containsKey("android:visibility:visibility")) {
            bVar.f16532c = -1;
            bVar.f16534e = null;
        } else {
            bVar.f16532c = ((Integer) tVar.f16606a.get("android:visibility:visibility")).intValue();
            bVar.f16534e = (ViewGroup) tVar.f16606a.get("android:visibility:parent");
        }
        if (tVar2 == null || !tVar2.f16606a.containsKey("android:visibility:visibility")) {
            bVar.f16533d = -1;
            bVar.f16535f = null;
        } else {
            bVar.f16533d = ((Integer) tVar2.f16606a.get("android:visibility:visibility")).intValue();
            bVar.f16535f = (ViewGroup) tVar2.f16606a.get("android:visibility:parent");
        }
        if (tVar != null && tVar2 != null) {
            int i = bVar.f16532c;
            int i2 = bVar.f16533d;
            if (i == i2 && bVar.f16534e == bVar.f16535f) {
                return bVar;
            }
            if (i != i2) {
                if (i == 0) {
                    bVar.f16531b = false;
                    bVar.f16530a = true;
                } else if (i2 == 0) {
                    bVar.f16531b = true;
                    bVar.f16530a = true;
                }
            } else if (bVar.f16535f == null) {
                bVar.f16531b = false;
                bVar.f16530a = true;
            } else if (bVar.f16534e == null) {
                bVar.f16531b = true;
                bVar.f16530a = true;
            }
        } else if (tVar == null && bVar.f16533d == 0) {
            bVar.f16531b = true;
            bVar.f16530a = true;
        } else if (tVar2 == null && bVar.f16532c == 0) {
            bVar.f16531b = false;
            bVar.f16530a = true;
        }
        return bVar;
    }

    /* renamed from: M */
    public final void mo19751M(C7433t tVar) {
        tVar.f16606a.put("android:visibility:visibility", Integer.valueOf(tVar.f16607b.getVisibility()));
        tVar.f16606a.put("android:visibility:parent", tVar.f16607b.getParent());
        int[] iArr = new int[2];
        tVar.f16607b.getLocationOnScreen(iArr);
        tVar.f16606a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: O */
    public abstract Animator mo19741O(ViewGroup viewGroup, View view, C7433t tVar, C7433t tVar2);

    /* renamed from: P */
    public abstract Animator mo19742P(ViewGroup viewGroup, View view, C7433t tVar);

    /* renamed from: d */
    public void mo19719d(C7433t tVar) {
        mo19751M(tVar);
    }

    /* renamed from: i */
    public void mo19720i(C7433t tVar) {
        mo19751M(tVar);
    }

    /* JADX WARNING: type inference failed for: r16v4, types: [android.view.ViewParent] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (m14278N(mo19788r(r4, false), mo19790u(r4, false)).f16530a != false) goto L_0x0048;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01c1  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator mo19721m(android.view.ViewGroup r21, p186n2.C7433t r22, p186n2.C7433t r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            n2.f0$b r4 = m14278N(r22, r23)
            boolean r5 = r4.f16530a
            if (r5 == 0) goto L_0x027d
            android.view.ViewGroup r5 = r4.f16534e
            if (r5 != 0) goto L_0x0018
            android.view.ViewGroup r5 = r4.f16535f
            if (r5 == 0) goto L_0x027d
        L_0x0018:
            boolean r5 = r4.f16531b
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x004a
            int r4 = r0.f16523z
            r4 = r4 & r7
            if (r4 != r7) goto L_0x0048
            if (r3 != 0) goto L_0x0026
            goto L_0x0048
        L_0x0026:
            if (r2 != 0) goto L_0x0041
            android.view.View r4 = r3.f16607b
            android.view.ViewParent r4 = r4.getParent()
            android.view.View r4 = (android.view.View) r4
            n2.t r5 = r0.mo19788r(r4, r8)
            n2.t r4 = r0.mo19790u(r4, r8)
            n2.f0$b r4 = m14278N(r5, r4)
            boolean r4 = r4.f16530a
            if (r4 == 0) goto L_0x0041
            goto L_0x0048
        L_0x0041:
            android.view.View r4 = r3.f16607b
            android.animation.Animator r6 = r0.mo19741O(r1, r4, r2, r3)
            goto L_0x0049
        L_0x0048:
            r6 = 0
        L_0x0049:
            return r6
        L_0x004a:
            int r4 = r4.f16533d
            int r5 = r0.f16523z
            r9 = 2
            r5 = r5 & r9
            if (r5 == r9) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            if (r2 != 0) goto L_0x0058
        L_0x0055:
            r2 = r0
            goto L_0x027b
        L_0x0058:
            android.view.View r5 = r2.f16607b
            if (r3 == 0) goto L_0x005f
            android.view.View r3 = r3.f16607b
            goto L_0x0060
        L_0x005f:
            r3 = 0
        L_0x0060:
            r10 = 2131429543(0x7f0b08a7, float:1.8480762E38)
            java.lang.Object r11 = r5.getTag(r10)
            android.view.View r11 = (android.view.View) r11
            if (r11 == 0) goto L_0x0070
            r19 = r4
            r3 = 0
            goto L_0x01f6
        L_0x0070:
            if (r3 == 0) goto L_0x0081
            android.view.ViewParent r11 = r3.getParent()
            if (r11 != 0) goto L_0x0079
            goto L_0x0081
        L_0x0079:
            r11 = 4
            if (r4 != r11) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            if (r5 != r3) goto L_0x0087
        L_0x007f:
            r11 = r8
            goto L_0x0089
        L_0x0081:
            if (r3 == 0) goto L_0x0087
            r11 = r3
            r12 = r8
            r3 = 0
            goto L_0x008b
        L_0x0087:
            r11 = r7
            r3 = 0
        L_0x0089:
            r12 = r11
            r11 = 0
        L_0x008b:
            if (r12 == 0) goto L_0x01ef
            android.view.ViewParent r12 = r5.getParent()
            if (r12 != 0) goto L_0x0099
            r19 = r4
            r11 = r5
            r7 = r8
            goto L_0x01f6
        L_0x0099:
            android.view.ViewParent r12 = r5.getParent()
            boolean r12 = r12 instanceof android.view.View
            if (r12 == 0) goto L_0x01ef
            android.view.ViewParent r12 = r5.getParent()
            android.view.View r12 = (android.view.View) r12
            n2.t r13 = r0.mo19790u(r12, r7)
            n2.t r14 = r0.mo19788r(r12, r7)
            n2.f0$b r13 = m14278N(r13, r14)
            boolean r13 = r13.f16530a
            if (r13 != 0) goto L_0x01da
            boolean r11 = p186n2.C7432s.f16603a
            android.graphics.Matrix r11 = new android.graphics.Matrix
            r11.<init>()
            int r13 = r12.getScrollX()
            int r13 = -r13
            float r13 = (float) r13
            int r12 = r12.getScrollY()
            int r12 = -r12
            float r12 = (float) r12
            r11.setTranslate(r13, r12)
            n2.c0 r12 = p186n2.C7439y.f16624a
            r12.mo19716s(r5, r11)
            r12.mo19717t(r1, r11)
            android.graphics.RectF r12 = new android.graphics.RectF
            int r13 = r5.getWidth()
            float r13 = (float) r13
            int r14 = r5.getHeight()
            float r14 = (float) r14
            r15 = 0
            r12.<init>(r15, r15, r13, r14)
            r11.mapRect(r12)
            float r13 = r12.left
            int r13 = java.lang.Math.round(r13)
            float r14 = r12.top
            int r14 = java.lang.Math.round(r14)
            float r15 = r12.right
            int r15 = java.lang.Math.round(r15)
            float r6 = r12.bottom
            int r6 = java.lang.Math.round(r6)
            android.widget.ImageView r10 = new android.widget.ImageView
            android.content.Context r9 = r5.getContext()
            r10.<init>(r9)
            android.widget.ImageView$ScaleType r9 = android.widget.ImageView.ScaleType.CENTER_CROP
            r10.setScaleType(r9)
            boolean r9 = p186n2.C7432s.f16603a
            if (r9 == 0) goto L_0x011c
            boolean r9 = r5.isAttachedToWindow()
            r9 = r9 ^ r7
            boolean r16 = r21.isAttachedToWindow()
            goto L_0x011f
        L_0x011c:
            r9 = r8
            r16 = r9
        L_0x011f:
            boolean r17 = p186n2.C7432s.f16604b
            if (r17 == 0) goto L_0x0144
            if (r9 == 0) goto L_0x0144
            if (r16 != 0) goto L_0x012e
            r18 = r3
            r19 = r4
            r0 = 0
            goto L_0x01bf
        L_0x012e:
            android.view.ViewParent r16 = r5.getParent()
            r7 = r16
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r16 = r7.indexOfChild(r5)
            android.view.ViewGroupOverlay r8 = r21.getOverlay()
            r8.add(r5)
            r8 = r16
            goto L_0x0146
        L_0x0144:
            r7 = 0
            r8 = 0
        L_0x0146:
            float r16 = r12.width()
            r18 = r3
            int r3 = java.lang.Math.round(r16)
            float r16 = r12.height()
            r19 = r4
            int r4 = java.lang.Math.round(r16)
            if (r3 <= 0) goto L_0x01b0
            if (r4 <= 0) goto L_0x01b0
            r16 = 1233125376(0x49800000, float:1048576.0)
            int r0 = r3 * r4
            float r0 = (float) r0
            float r0 = r16 / r0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r2, r0)
            float r2 = (float) r3
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            float r3 = (float) r4
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r4 = r12.left
            float r4 = -r4
            float r12 = r12.top
            float r12 = -r12
            r11.postTranslate(r4, r12)
            r11.postScale(r0, r0)
            boolean r0 = p186n2.C7432s.f16605c
            if (r0 == 0) goto L_0x019e
            android.graphics.Picture r0 = new android.graphics.Picture
            r0.<init>()
            android.graphics.Canvas r2 = r0.beginRecording(r2, r3)
            r2.concat(r11)
            r5.draw(r2)
            r0.endRecording()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0)
            goto L_0x01b1
        L_0x019e:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r3, r0)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            r2.concat(r11)
            r5.draw(r2)
            goto L_0x01b1
        L_0x01b0:
            r0 = 0
        L_0x01b1:
            if (r17 == 0) goto L_0x01bf
            if (r9 == 0) goto L_0x01bf
            android.view.ViewGroupOverlay r2 = r21.getOverlay()
            r2.remove(r5)
            r7.addView(r5, r8)
        L_0x01bf:
            if (r0 == 0) goto L_0x01c4
            r10.setImageBitmap(r0)
        L_0x01c4:
            int r0 = r15 - r13
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r3 = r6 - r14
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r10.measure(r0, r2)
            r10.layout(r13, r14, r15, r6)
            r11 = r10
            goto L_0x01f3
        L_0x01da:
            r18 = r3
            r19 = r4
            int r0 = r12.getId()
            android.view.ViewParent r2 = r12.getParent()
            if (r2 != 0) goto L_0x01f3
            r2 = -1
            if (r0 == r2) goto L_0x01f3
            r1.findViewById(r0)
            goto L_0x01f3
        L_0x01ef:
            r18 = r3
            r19 = r4
        L_0x01f3:
            r3 = r18
            r7 = 0
        L_0x01f6:
            if (r11 == 0) goto L_0x0250
            r0 = r22
            if (r7 != 0) goto L_0x022f
            java.util.HashMap r2 = r0.f16606a
            java.lang.String r3 = "android:visibility:screenLocation"
            java.lang.Object r2 = r2.get(r3)
            int[] r2 = (int[]) r2
            r3 = 0
            r4 = r2[r3]
            r6 = 1
            r2 = r2[r6]
            r8 = 2
            int[] r8 = new int[r8]
            r1.getLocationOnScreen(r8)
            r3 = r8[r3]
            int r4 = r4 - r3
            int r3 = r11.getLeft()
            int r4 = r4 - r3
            r11.offsetLeftAndRight(r4)
            r3 = r8[r6]
            int r2 = r2 - r3
            int r3 = r11.getTop()
            int r2 = r2 - r3
            r11.offsetTopAndBottom(r2)
            android.view.ViewGroupOverlay r2 = r21.getOverlay()
            r2.add(r11)
        L_0x022f:
            r2 = r20
            android.animation.Animator r6 = r2.mo19742P(r1, r11, r0)
            if (r7 != 0) goto L_0x027c
            if (r6 != 0) goto L_0x0241
            android.view.ViewGroupOverlay r0 = r21.getOverlay()
            r0.remove(r11)
            goto L_0x027c
        L_0x0241:
            r0 = 2131429543(0x7f0b08a7, float:1.8480762E38)
            r5.setTag(r0, r11)
            n2.e0 r0 = new n2.e0
            r0.<init>(r2, r1, r11, r5)
            r2.mo19776a(r0)
            goto L_0x027c
        L_0x0250:
            r2 = r20
            r0 = r22
            if (r3 == 0) goto L_0x027b
            int r4 = r3.getVisibility()
            n2.c0 r5 = p186n2.C7439y.f16624a
            r6 = 0
            r5.mo19740p(r6, r3)
            android.animation.Animator r6 = r2.mo19742P(r1, r3, r0)
            if (r6 == 0) goto L_0x0277
            n2.f0$a r0 = new n2.f0$a
            r1 = r19
            r0.<init>(r3, r1)
            r6.addListener(r0)
            r6.addPauseListener(r0)
            r2.mo19776a(r0)
            goto L_0x027c
        L_0x0277:
            r5.mo19740p(r4, r3)
            goto L_0x027c
        L_0x027b:
            r6 = 0
        L_0x027c:
            return r6
        L_0x027d:
            r2 = r0
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p186n2.C7398f0.mo19721m(android.view.ViewGroup, n2.t, n2.t):android.animation.Animator");
    }

    /* renamed from: t */
    public final String[] mo19722t() {
        return f16522A;
    }

    /* renamed from: v */
    public final boolean mo19752v(C7433t tVar, C7433t tVar2) {
        if (tVar == null && tVar2 == null) {
            return false;
        }
        if (tVar != null && tVar2 != null && tVar2.f16606a.containsKey("android:visibility:visibility") != tVar.f16606a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C7400b N = m14278N(tVar, tVar2);
        if (N.f16530a) {
            return N.f16532c == 0 || N.f16533d == 0;
        }
        return false;
    }
}
