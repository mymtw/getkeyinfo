package p186n2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import java.util.WeakHashMap;

/* renamed from: n2.d */
public final class C7390d extends C7398f0 {

    /* renamed from: n2.d$a */
    public static class C7391a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final View f16512a;

        /* renamed from: b */
        public boolean f16513b = false;

        public C7391a(View view) {
            this.f16512a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            C7439y.f16624a.mo19747r(1.0f, this.f16512a);
            if (this.f16513b) {
                this.f16512a.setLayerType(0, (Paint) null);
            }
        }

        public final void onAnimationStart(Animator animator) {
            View view = this.f16512a;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            if (C2364y.C2368d.m5218h(view) && this.f16512a.getLayerType() == 0) {
                this.f16513b = true;
                this.f16512a.setLayerType(2, (Paint) null);
            }
        }
    }

    public C7390d(int i) {
        if ((i & -4) == 0) {
            this.f16523z = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r4 = (java.lang.Float) r4.f16606a.get("android:fade:transitionAlpha");
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator mo19741O(android.view.ViewGroup r2, android.view.View r3, p186n2.C7433t r4, p186n2.C7433t r5) {
        /*
            r1 = this;
            r2 = 0
            if (r4 == 0) goto L_0x0014
            java.util.HashMap r4 = r4.f16606a
            java.lang.String r5 = "android:fade:transitionAlpha"
            java.lang.Object r4 = r4.get(r5)
            java.lang.Float r4 = (java.lang.Float) r4
            if (r4 == 0) goto L_0x0014
            float r4 = r4.floatValue()
            goto L_0x0015
        L_0x0014:
            r4 = r2
        L_0x0015:
            r5 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r2 = r4
        L_0x001d:
            android.animation.ObjectAnimator r2 = r1.mo19743Q(r2, r5, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p186n2.C7390d.mo19741O(android.view.ViewGroup, android.view.View, n2.t, n2.t):android.animation.Animator");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r1 = (java.lang.Float) r3.f16606a.get("android:fade:transitionAlpha");
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator mo19742P(android.view.ViewGroup r1, android.view.View r2, p186n2.C7433t r3) {
        /*
            r0 = this;
            n2.c0 r1 = p186n2.C7439y.f16624a
            r1.getClass()
            if (r3 == 0) goto L_0x0018
            java.util.HashMap r1 = r3.f16606a
            java.lang.String r3 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r3)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0018
            float r1 = r1.floatValue()
            goto L_0x001a
        L_0x0018:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x001a:
            r3 = 0
            android.animation.ObjectAnimator r1 = r0.mo19743Q(r1, r3, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p186n2.C7390d.mo19742P(android.view.ViewGroup, android.view.View, n2.t):android.animation.Animator");
    }

    /* renamed from: Q */
    public final ObjectAnimator mo19743Q(float f, float f2, View view) {
        if (f == f2) {
            return null;
        }
        C7439y.f16624a.mo19747r(f, view);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C7439y.f16625b, new float[]{f2});
        ofFloat.addListener(new C7391a(view));
        mo19776a(new C7388c(view));
        return ofFloat;
    }

    /* renamed from: i */
    public final void mo19720i(C7433t tVar) {
        mo19751M(tVar);
        tVar.f16606a.put("android:fade:transitionAlpha", Float.valueOf(C7439y.f16624a.mo19746q(tVar.f16607b)));
    }

    public C7390d() {
    }
}
