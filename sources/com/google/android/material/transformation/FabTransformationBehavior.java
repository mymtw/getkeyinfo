package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import kotlin.reflect.C19421p;
import p003a2.C0023f;
import p629nk.C18268a;
import p629nk.C18269b;
import p629nk.C18270c;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final Rect f34926c = new Rect();

    /* renamed from: d */
    public final RectF f34927d = new RectF();

    /* renamed from: e */
    public final RectF f34928e = new RectF();

    /* renamed from: f */
    public final int[] f34929f = new int[2];

    /* renamed from: g */
    public float f34930g;

    /* renamed from: h */
    public float f34931h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    public class C15542a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f34932a;

        /* renamed from: b */
        public final /* synthetic */ View f34933b;

        /* renamed from: c */
        public final /* synthetic */ View f34934c;

        public C15542a(boolean z, View view, View view2) {
            this.f34932a = z;
            this.f34933b = view;
            this.f34934c = view2;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f34932a) {
                this.f34933b.setVisibility(4);
                this.f34934c.setAlpha(1.0f);
                this.f34934c.setVisibility(0);
            }
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f34932a) {
                this.f34933b.setVisibility(0);
                this.f34934c.setAlpha(0.0f);
                this.f34934c.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    public static class C15543b {

        /* renamed from: a */
        public C18269b f34935a;

        /* renamed from: b */
        public C19421p f34936b;
    }

    public FabTransformationBehavior() {
    }

    /* renamed from: c */
    public static Pair m25140c(float f, float f2, boolean z, C15543b bVar) {
        C18270c cVar;
        C18270c cVar2;
        int i;
        if (f == 0.0f || f2 == 0.0f) {
            cVar2 = bVar.f34935a.mo69812f("translationXLinear");
            cVar = bVar.f34935a.mo69812f("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || i <= 0)) {
            cVar2 = bVar.f34935a.mo69812f("translationXCurveDownwards");
            cVar = bVar.f34935a.mo69812f("translationYCurveDownwards");
        } else {
            cVar2 = bVar.f34935a.mo69812f("translationXCurveUpwards");
            cVar = bVar.f34935a.mo69812f("translationYCurveUpwards");
        }
        return new Pair(cVar2, cVar);
    }

    /* renamed from: f */
    public static float m25141f(C15543b bVar, C18270c cVar, float f) {
        long j = cVar.f40098a;
        long j2 = cVar.f40099b;
        C18270c f2 = bVar.f34935a.mo69812f("expansion");
        float interpolation = cVar.mo69818b().getInterpolation(((float) (((f2.f40098a + f2.f40099b) + 17) - j)) / ((float) j2));
        LinearInterpolator linearInterpolator = C18268a.f40091a;
        return C0023f.m103b(0.0f, f, interpolation, f);
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x03b7 A[LOOP:1: B:97:0x03b5->B:98:0x03b7, LOOP_END] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.AnimatorSet mo55229b(android.view.View r27, android.view.View r28, boolean r29, boolean r30) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            android.content.Context r4 = r28.getContext()
            com.google.android.material.transformation.FabTransformationBehavior$b r4 = r0.mo55233h(r4, r3)
            if (r3 == 0) goto L_0x001e
            float r5 = r27.getTranslationX()
            r0.f34930g = r5
            float r5 = r27.getTranslationY()
            r0.f34931h = r5
        L_0x001e:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r7 = androidx.core.view.C2364y.f5646a
            float r7 = androidx.core.view.C2364y.C2373i.m5262i(r28)
            float r8 = androidx.core.view.C2364y.C2373i.m5262i(r27)
            float r7 = r7 - r8
            r8 = 0
            r9 = 0
            r10 = 1
            if (r3 == 0) goto L_0x0049
            if (r30 != 0) goto L_0x003e
            float r7 = -r7
            r2.setTranslationZ(r7)
        L_0x003e:
            android.util.Property r7 = android.view.View.TRANSLATION_Z
            float[] r11 = new float[r10]
            r11[r9] = r8
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r2, r7, r11)
            goto L_0x0054
        L_0x0049:
            android.util.Property r11 = android.view.View.TRANSLATION_Z
            float[] r12 = new float[r10]
            float r7 = -r7
            r12[r9] = r7
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r2, r11, r12)
        L_0x0054:
            nk.b r11 = r4.f34935a
            java.lang.String r12 = "elevation"
            nk.c r11 = r11.mo69812f(r12)
            r11.mo69817a(r7)
            r5.add(r7)
            android.graphics.RectF r7 = r0.f34927d
            kotlin.reflect.p r11 = r4.f34936b
            float r11 = r0.mo55230d(r1, r2, r11)
            kotlin.reflect.p r12 = r4.f34936b
            float r12 = r0.mo55231e(r1, r2, r12)
            android.util.Pair r13 = m25140c(r11, r12, r3, r4)
            java.lang.Object r14 = r13.first
            nk.c r14 = (p629nk.C18270c) r14
            java.lang.Object r13 = r13.second
            nk.c r13 = (p629nk.C18270c) r13
            if (r3 == 0) goto L_0x00c6
            if (r30 != 0) goto L_0x0088
            float r15 = -r11
            r2.setTranslationX(r15)
            float r15 = -r12
            r2.setTranslationY(r15)
        L_0x0088:
            android.util.Property r15 = android.view.View.TRANSLATION_X
            r16 = r6
            float[] r6 = new float[r10]
            r6[r9] = r8
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r15, r6)
            android.util.Property r15 = android.view.View.TRANSLATION_Y
            r17 = r6
            float[] r6 = new float[r10]
            r6[r9] = r8
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r15, r6)
            float r11 = -r11
            float r12 = -r12
            float r11 = m25141f(r4, r14, r11)
            float r12 = m25141f(r4, r13, r12)
            android.graphics.Rect r15 = r0.f34926c
            r2.getWindowVisibleDisplayFrame(r15)
            android.graphics.RectF r8 = r0.f34927d
            r8.set(r15)
            android.graphics.RectF r15 = r0.f34928e
            r0.mo55232g(r2, r15)
            r15.offset(r11, r12)
            r15.intersect(r8)
            r7.set(r15)
            r8 = r6
            r6 = r17
            goto L_0x00de
        L_0x00c6:
            r16 = r6
            android.util.Property r6 = android.view.View.TRANSLATION_X
            float[] r8 = new float[r10]
            float r11 = -r11
            r8[r9] = r11
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r6, r8)
            android.util.Property r8 = android.view.View.TRANSLATION_Y
            float[] r11 = new float[r10]
            float r12 = -r12
            r11[r9] = r12
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r2, r8, r11)
        L_0x00de:
            r14.mo69817a(r6)
            r13.mo69817a(r8)
            r5.add(r6)
            r5.add(r8)
            float r6 = r7.width()
            float r7 = r7.height()
            kotlin.reflect.p r8 = r4.f34936b
            float r8 = r0.mo55230d(r1, r2, r8)
            kotlin.reflect.p r11 = r4.f34936b
            float r11 = r0.mo55231e(r1, r2, r11)
            android.util.Pair r12 = m25140c(r8, r11, r3, r4)
            java.lang.Object r13 = r12.first
            nk.c r13 = (p629nk.C18270c) r13
            java.lang.Object r12 = r12.second
            nk.c r12 = (p629nk.C18270c) r12
            android.util.Property r14 = android.view.View.TRANSLATION_X
            float[] r15 = new float[r10]
            if (r3 == 0) goto L_0x0111
            goto L_0x0113
        L_0x0111:
            float r8 = r0.f34930g
        L_0x0113:
            r15[r9] = r8
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r1, r14, r15)
            android.util.Property r14 = android.view.View.TRANSLATION_Y
            float[] r15 = new float[r10]
            if (r3 == 0) goto L_0x0120
            goto L_0x0122
        L_0x0120:
            float r11 = r0.f34931h
        L_0x0122:
            r15[r9] = r11
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r1, r14, r15)
            r13.mo69817a(r8)
            r12.mo69817a(r11)
            r5.add(r8)
            r5.add(r11)
            boolean r8 = r2 instanceof com.google.android.material.circularreveal.CircularRevealWidget
            if (r8 == 0) goto L_0x018c
            boolean r11 = r1 instanceof android.widget.ImageView
            if (r11 != 0) goto L_0x013d
            goto L_0x018c
        L_0x013d:
            r11 = r2
            com.google.android.material.circularreveal.CircularRevealWidget r11 = (com.google.android.material.circularreveal.CircularRevealWidget) r11
            r12 = r1
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            android.graphics.drawable.Drawable r12 = r12.getDrawable()
            if (r12 != 0) goto L_0x014a
            goto L_0x018c
        L_0x014a:
            r12.mutate()
            r13 = 255(0xff, float:3.57E-43)
            if (r3 == 0) goto L_0x0161
            if (r30 != 0) goto L_0x0156
            r12.setAlpha(r13)
        L_0x0156:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r13 = com.google.android.material.animation.DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT
            int[] r14 = new int[r10]
            r14[r9] = r9
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofInt(r12, r13, r14)
            goto L_0x016b
        L_0x0161:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r14 = com.google.android.material.animation.DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT
            int[] r15 = new int[r10]
            r15[r9] = r13
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofInt(r12, r14, r15)
        L_0x016b:
            com.google.android.material.transformation.a r14 = new com.google.android.material.transformation.a
            r14.<init>(r2)
            r13.addUpdateListener(r14)
            nk.b r14 = r4.f34935a
            java.lang.String r15 = "iconFade"
            nk.c r14 = r14.mo69812f(r15)
            r14.mo69817a(r13)
            r5.add(r13)
            com.google.android.material.transformation.b r13 = new com.google.android.material.transformation.b
            r13.<init>(r11, r12)
            r11 = r16
            r11.add(r13)
            goto L_0x018e
        L_0x018c:
            r11 = r16
        L_0x018e:
            if (r8 != 0) goto L_0x0198
            r22 = r4
            r1 = r5
            r18 = r8
            r3 = r11
            goto L_0x02d0
        L_0x0198:
            r12 = r2
            com.google.android.material.circularreveal.CircularRevealWidget r12 = (com.google.android.material.circularreveal.CircularRevealWidget) r12
            kotlin.reflect.p r13 = r4.f34936b
            android.graphics.RectF r14 = r0.f34927d
            android.graphics.RectF r15 = r0.f34928e
            r0.mo55232g(r1, r14)
            float r9 = r0.f34930g
            float r10 = r0.f34931h
            r14.offset(r9, r10)
            r0.mo55232g(r2, r15)
            float r9 = r0.mo55230d(r1, r2, r13)
            float r9 = -r9
            r10 = 0
            r15.offset(r9, r10)
            float r9 = r14.centerX()
            float r10 = r15.left
            float r9 = r9 - r10
            kotlin.reflect.p r10 = r4.f34936b
            android.graphics.RectF r13 = r0.f34927d
            android.graphics.RectF r14 = r0.f34928e
            r0.mo55232g(r1, r13)
            float r15 = r0.f34930g
            r18 = r8
            float r8 = r0.f34931h
            r13.offset(r15, r8)
            r0.mo55232g(r2, r14)
            float r8 = r0.mo55231e(r1, r2, r10)
            float r8 = -r8
            r10 = 0
            r14.offset(r10, r8)
            float r8 = r13.centerY()
            float r10 = r14.top
            float r8 = r8 - r10
            r10 = r1
            com.google.android.material.floatingactionbutton.FloatingActionButton r10 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r10
            android.graphics.Rect r13 = r0.f34926c
            r10.getContentRect(r13)
            android.graphics.Rect r10 = r0.f34926c
            int r10 = r10.width()
            float r10 = (float) r10
            r13 = 1073741824(0x40000000, float:2.0)
            float r10 = r10 / r13
            nk.b r13 = r4.f34935a
            java.lang.String r14 = "expansion"
            nk.c r13 = r13.mo69812f(r14)
            if (r3 == 0) goto L_0x0242
            if (r30 != 0) goto L_0x0209
            com.google.android.material.circularreveal.CircularRevealWidget$a r14 = new com.google.android.material.circularreveal.CircularRevealWidget$a
            r14.<init>(r9, r8, r10)
            r12.setRevealInfo(r14)
        L_0x0209:
            if (r30 == 0) goto L_0x0211
            com.google.android.material.circularreveal.CircularRevealWidget$a r10 = r12.getRevealInfo()
            float r10 = r10.f34200c
        L_0x0211:
            float r6 = kotlin.jvm.internal.C19382n.m32736X(r9, r8, r6, r7)
            android.animation.AnimatorSet r6 = com.google.android.material.circularreveal.C15249a.m24805a(r12, r9, r8, r6)
            com.google.android.material.transformation.c r7 = new com.google.android.material.transformation.c
            r7.<init>(r12)
            r6.addListener(r7)
            long r14 = r13.f40098a
            int r7 = (int) r9
            int r8 = (int) r8
            r0 = 0
            int r9 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x0238
            android.animation.Animator r7 = android.view.ViewAnimationUtils.createCircularReveal(r2, r7, r8, r10, r10)
            r7.setStartDelay(r0)
            r7.setDuration(r14)
            r5.add(r7)
        L_0x0238:
            r22 = r4
            r1 = r5
            r19 = r11
            r23 = r12
            r0 = r13
            goto L_0x02be
        L_0x0242:
            com.google.android.material.circularreveal.CircularRevealWidget$a r0 = r12.getRevealInfo()
            float r0 = r0.f34200c
            android.animation.AnimatorSet r6 = com.google.android.material.circularreveal.C15249a.m24805a(r12, r9, r8, r10)
            long r14 = r13.f40098a
            int r1 = (int) r9
            int r7 = (int) r8
            r8 = 0
            int r19 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r19 <= 0) goto L_0x0263
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r2, r1, r7, r0, r0)
            r0.setStartDelay(r8)
            r0.setDuration(r14)
            r5.add(r0)
        L_0x0263:
            long r14 = r13.f40098a
            long r8 = r13.f40099b
            nk.b r0 = r4.f34935a
            r21 = r6
            o.i<java.lang.String, nk.c> r6 = r0.f40096a
            int r6 = r6.f16745d
            r22 = r4
            r19 = r11
            r3 = 0
            r11 = 0
        L_0x0276:
            if (r11 >= r6) goto L_0x029c
            r20 = r6
            o.i<java.lang.String, nk.c> r6 = r0.f40096a
            java.lang.Object r6 = r6.mo19980n(r11)
            nk.c r6 = (p629nk.C18270c) r6
            r23 = r12
            r24 = r13
            long r12 = r6.f40098a
            r25 = r5
            long r5 = r6.f40099b
            long r12 = r12 + r5
            long r3 = java.lang.Math.max(r3, r12)
            int r11 = r11 + 1
            r6 = r20
            r12 = r23
            r13 = r24
            r5 = r25
            goto L_0x0276
        L_0x029c:
            r25 = r5
            r23 = r12
            r24 = r13
            long r14 = r14 + r8
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x02b8
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r2, r1, r7, r10, r10)
            r0.setStartDelay(r14)
            long r3 = r3 - r14
            r0.setDuration(r3)
            r1 = r25
            r1.add(r0)
            goto L_0x02ba
        L_0x02b8:
            r1 = r25
        L_0x02ba:
            r6 = r21
            r0 = r24
        L_0x02be:
            r0.mo69817a(r6)
            r1.add(r6)
            rk.a r0 = new rk.a
            r3 = r23
            r0.<init>(r3)
            r3 = r19
            r3.add(r0)
        L_0x02d0:
            if (r18 != 0) goto L_0x02d7
            r6 = r29
            r4 = r22
            goto L_0x032d
        L_0x02d7:
            r0 = r2
            com.google.android.material.circularreveal.CircularRevealWidget r0 = (com.google.android.material.circularreveal.CircularRevealWidget) r0
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r4 = androidx.core.view.C2364y.f5646a
            android.content.res.ColorStateList r4 = androidx.core.view.C2364y.C2373i.m5260g(r27)
            if (r4 == 0) goto L_0x02ef
            int[] r5 = r27.getDrawableState()
            int r6 = r4.getDefaultColor()
            int r4 = r4.getColorForState(r5, r6)
            goto L_0x02f0
        L_0x02ef:
            r4 = 0
        L_0x02f0:
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r4
            r6 = r29
            if (r6 == 0) goto L_0x030a
            if (r30 != 0) goto L_0x02fd
            r0.setCircularRevealScrimColor(r4)
        L_0x02fd:
            android.util.Property<com.google.android.material.circularreveal.CircularRevealWidget, java.lang.Integer> r4 = com.google.android.material.circularreveal.CircularRevealWidget.CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR
            r7 = 1
            int[] r8 = new int[r7]
            r9 = 0
            r8[r9] = r5
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r4, r8)
            goto L_0x0316
        L_0x030a:
            r7 = 1
            r9 = 0
            android.util.Property<com.google.android.material.circularreveal.CircularRevealWidget, java.lang.Integer> r5 = com.google.android.material.circularreveal.CircularRevealWidget.CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR
            int[] r8 = new int[r7]
            r8[r9] = r4
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r5, r8)
        L_0x0316:
            com.google.android.material.animation.ArgbEvaluatorCompat r4 = com.google.android.material.animation.ArgbEvaluatorCompat.getInstance()
            r0.setEvaluator(r4)
            r4 = r22
            nk.b r5 = r4.f34935a
            java.lang.String r7 = "color"
            nk.c r5 = r5.mo69812f(r7)
            r5.mo69817a(r0)
            r1.add(r0)
        L_0x032d:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 != 0) goto L_0x0334
        L_0x0331:
            r9 = 0
            goto L_0x039f
        L_0x0334:
            r5 = 2131429029(0x7f0b06a5, float:1.847972E38)
            android.view.View r5 = r2.findViewById(r5)
            r7 = 0
            if (r5 == 0) goto L_0x0346
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0364
            r7 = r5
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L_0x0364
        L_0x0346:
            boolean r5 = r2 instanceof com.google.android.material.transformation.TransformationChildLayout
            if (r5 != 0) goto L_0x0355
            boolean r5 = r2 instanceof com.google.android.material.transformation.TransformationChildCard
            if (r5 == 0) goto L_0x034f
            goto L_0x0355
        L_0x034f:
            if (r0 == 0) goto L_0x0364
            r7 = r2
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L_0x0364
        L_0x0355:
            r0 = r2
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5 = 0
            android.view.View r0 = r0.getChildAt(r5)
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x0364
            r7 = r0
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
        L_0x0364:
            if (r7 != 0) goto L_0x0367
            goto L_0x0331
        L_0x0367:
            if (r6 == 0) goto L_0x0384
            if (r30 != 0) goto L_0x0375
            android.util.Property<android.view.ViewGroup, java.lang.Float> r0 = com.google.android.material.animation.ChildrenAlphaProperty.CHILDREN_ALPHA
            r5 = 0
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r0.set(r7, r5)
        L_0x0375:
            android.util.Property<android.view.ViewGroup, java.lang.Float> r0 = com.google.android.material.animation.ChildrenAlphaProperty.CHILDREN_ALPHA
            r5 = 1
            float[] r5 = new float[r5]
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r5[r9] = r8
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r0, r5)
            goto L_0x0391
        L_0x0384:
            r5 = 1
            r9 = 0
            android.util.Property<android.view.ViewGroup, java.lang.Float> r0 = com.google.android.material.animation.ChildrenAlphaProperty.CHILDREN_ALPHA
            float[] r5 = new float[r5]
            r8 = 0
            r5[r9] = r8
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r0, r5)
        L_0x0391:
            nk.b r4 = r4.f34935a
            java.lang.String r5 = "contentFade"
            nk.c r4 = r4.mo69812f(r5)
            r4.mo69817a(r0)
            r1.add(r0)
        L_0x039f:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            com.google.android.play.core.assetpacks.C15588c1.m25289K0(r0, r1)
            com.google.android.material.transformation.FabTransformationBehavior$a r1 = new com.google.android.material.transformation.FabTransformationBehavior$a
            r4 = r27
            r1.<init>(r6, r2, r4)
            r0.addListener(r1)
            int r1 = r3.size()
        L_0x03b5:
            if (r9 >= r1) goto L_0x03c3
            java.lang.Object r2 = r3.get(r9)
            android.animation.Animator$AnimatorListener r2 = (android.animation.Animator.AnimatorListener) r2
            r0.addListener(r2)
            int r9 = r9 + 1
            goto L_0x03b5
        L_0x03c3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.mo55229b(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    /* renamed from: d */
    public final float mo55230d(View view, View view2, C19421p pVar) {
        RectF rectF = this.f34927d;
        RectF rectF2 = this.f34928e;
        mo55232g(view, rectF);
        rectF.offset(this.f34930g, this.f34931h);
        mo55232g(view2, rectF2);
        pVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    /* renamed from: e */
    public final float mo55231e(View view, View view2, C19421p pVar) {
        RectF rectF = this.f34927d;
        RectF rectF2 = this.f34928e;
        mo55232g(view, rectF);
        rectF.offset(this.f34930g, this.f34931h);
        mo55232g(view2, rectF2);
        pVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    /* renamed from: g */
    public final void mo55232g(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f34929f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: h */
    public abstract C15543b mo55233h(Context context, boolean z);

    public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
    }

    public final void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
        if (layoutParams.dodgeInsetEdges == 0) {
            layoutParams.dodgeInsetEdges = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
