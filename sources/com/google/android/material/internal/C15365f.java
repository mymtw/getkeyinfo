package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;
import p186n2.C7418m;
import p186n2.C7433t;

/* renamed from: com.google.android.material.internal.f */
public final class C15365f extends C7418m {

    /* renamed from: com.google.android.material.internal.f$a */
    public class C15366a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ TextView f34512a;

        public C15366a(TextView textView) {
            this.f34512a = textView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f34512a.setScaleX(floatValue);
            this.f34512a.setScaleY(floatValue);
        }
    }

    /* renamed from: d */
    public final void mo19719d(C7433t tVar) {
        View view = tVar.f16607b;
        if (view instanceof TextView) {
            tVar.f16606a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    /* renamed from: i */
    public final void mo19720i(C7433t tVar) {
        View view = tVar.f16607b;
        if (view instanceof TextView) {
            tVar.f16606a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    /* renamed from: m */
    public final Animator mo19721m(ViewGroup viewGroup, C7433t tVar, C7433t tVar2) {
        if (tVar == null || tVar2 == null || !(tVar.f16607b instanceof TextView)) {
            return null;
        }
        View view = tVar2.f16607b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap hashMap = tVar.f16606a;
        HashMap hashMap2 = tVar2.f16606a;
        float f = 1.0f;
        float floatValue = hashMap.get("android:textscale:scale") != null ? ((Float) hashMap.get("android:textscale:scale")).floatValue() : 1.0f;
        if (hashMap2.get("android:textscale:scale") != null) {
            f = ((Float) hashMap2.get("android:textscale:scale")).floatValue();
        }
        if (floatValue == f) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{floatValue, f});
        ofFloat.addUpdateListener(new C15366a(textView));
        return ofFloat;
    }
}
