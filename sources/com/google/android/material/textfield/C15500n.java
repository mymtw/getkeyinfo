package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p507al.C14025c;
import p629nk.C18268a;

/* renamed from: com.google.android.material.textfield.n */
public final class C15500n {

    /* renamed from: a */
    public final Context f34791a;

    /* renamed from: b */
    public final TextInputLayout f34792b;

    /* renamed from: c */
    public LinearLayout f34793c;

    /* renamed from: d */
    public int f34794d;

    /* renamed from: e */
    public FrameLayout f34795e;

    /* renamed from: f */
    public Animator f34796f;

    /* renamed from: g */
    public final float f34797g;

    /* renamed from: h */
    public int f34798h;

    /* renamed from: i */
    public int f34799i;

    /* renamed from: j */
    public CharSequence f34800j;

    /* renamed from: k */
    public boolean f34801k;

    /* renamed from: l */
    public AppCompatTextView f34802l;

    /* renamed from: m */
    public CharSequence f34803m;

    /* renamed from: n */
    public int f34804n;

    /* renamed from: o */
    public ColorStateList f34805o;

    /* renamed from: p */
    public CharSequence f34806p;

    /* renamed from: q */
    public boolean f34807q;

    /* renamed from: r */
    public AppCompatTextView f34808r;

    /* renamed from: s */
    public int f34809s;

    /* renamed from: t */
    public ColorStateList f34810t;

    /* renamed from: u */
    public Typeface f34811u;

    /* renamed from: com.google.android.material.textfield.n$a */
    public class C15501a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f34812a;

        /* renamed from: b */
        public final /* synthetic */ TextView f34813b;

        /* renamed from: c */
        public final /* synthetic */ int f34814c;

        /* renamed from: d */
        public final /* synthetic */ TextView f34815d;

        public C15501a(int i, TextView textView, int i2, TextView textView2) {
            this.f34812a = i;
            this.f34813b = textView;
            this.f34814c = i2;
            this.f34815d = textView2;
        }

        public final void onAnimationEnd(Animator animator) {
            AppCompatTextView appCompatTextView;
            C15500n nVar = C15500n.this;
            nVar.f34798h = this.f34812a;
            nVar.f34796f = null;
            TextView textView = this.f34813b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f34814c == 1 && (appCompatTextView = C15500n.this.f34802l) != null) {
                    appCompatTextView.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f34815d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f34815d.setAlpha(1.0f);
            }
        }

        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f34815d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C15500n(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f34791a = context;
        this.f34792b = textInputLayout;
        this.f34797g = (float) context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    /* renamed from: a */
    public final void mo55119a(TextView textView, int i) {
        if (this.f34793c == null && this.f34795e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f34791a);
            this.f34793c = linearLayout;
            linearLayout.setOrientation(0);
            this.f34792b.addView(this.f34793c, -1, -2);
            this.f34795e = new FrameLayout(this.f34791a);
            this.f34793c.addView(this.f34795e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f34792b.getEditText() != null) {
                mo55120b();
            }
        }
        if (i == 0 || i == 1) {
            this.f34795e.setVisibility(0);
            this.f34795e.addView(textView);
        } else {
            this.f34793c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f34793c.setVisibility(0);
        this.f34794d++;
    }

    /* renamed from: b */
    public final void mo55120b() {
        if ((this.f34793c == null || this.f34792b.getEditText() == null) ? false : true) {
            EditText editText = this.f34792b.getEditText();
            boolean e = C14025c.m21586e(this.f34791a);
            LinearLayout linearLayout = this.f34793c;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            int f = C2364y.C2369e.m5235f(editText);
            if (e) {
                f = this.f34791a.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            int dimensionPixelSize = this.f34791a.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
            if (e) {
                dimensionPixelSize = this.f34791a.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
            }
            int e2 = C2364y.C2369e.m5234e(editText);
            if (e) {
                e2 = this.f34791a.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            C2364y.C2369e.m5240k(linearLayout, f, dimensionPixelSize, e2, 0);
        }
    }

    /* renamed from: c */
    public final void mo55121c() {
        Animator animator = this.f34796f;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: d */
    public final void mo55122d(ArrayList arrayList, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{i3 == i ? 1.0f : 0.0f});
                ofFloat.setDuration(167);
                ofFloat.setInterpolator(C18268a.f40091a);
                arrayList.add(ofFloat);
                if (i3 == i) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f34797g, 0.0f});
                    ofFloat2.setDuration(217);
                    ofFloat2.setInterpolator(C18268a.f40094d);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    /* renamed from: e */
    public final boolean mo55123e() {
        return this.f34799i == 1 && this.f34802l != null && !TextUtils.isEmpty(this.f34800j);
    }

    /* renamed from: f */
    public final TextView mo55124f(int i) {
        if (i == 1) {
            return this.f34802l;
        }
        if (i != 2) {
            return null;
        }
        return this.f34808r;
    }

    /* renamed from: g */
    public final int mo55125g() {
        AppCompatTextView appCompatTextView = this.f34802l;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: h */
    public final void mo55126h() {
        this.f34800j = null;
        mo55121c();
        if (this.f34798h == 1) {
            if (!this.f34807q || TextUtils.isEmpty(this.f34806p)) {
                this.f34799i = 0;
            } else {
                this.f34799i = 2;
            }
        }
        mo55129k(this.f34798h, this.f34799i, mo55128j(this.f34802l, (CharSequence) null));
    }

    /* renamed from: i */
    public final void mo55127i(TextView textView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f34793c;
        if (linearLayout != null) {
            boolean z = true;
            if (!(i == 0 || i == 1)) {
                z = false;
            }
            if (!z || (frameLayout = this.f34795e) == null) {
                linearLayout.removeView(textView);
            } else {
                frameLayout.removeView(textView);
            }
            int i2 = this.f34794d - 1;
            this.f34794d = i2;
            LinearLayout linearLayout2 = this.f34793c;
            if (i2 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    /* renamed from: j */
    public final boolean mo55128j(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f34792b;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        return C2364y.C2371g.m5246c(textInputLayout) && this.f34792b.isEnabled() && (this.f34799i != this.f34798h || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: k */
    public final void mo55129k(int i, int i2, boolean z) {
        TextView f;
        TextView f2;
        int i3 = i;
        int i4 = i2;
        boolean z2 = z;
        if (i3 != i4) {
            if (z2) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f34796f = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i5 = i;
                int i6 = i2;
                mo55122d(arrayList2, this.f34807q, this.f34808r, 2, i5, i6);
                mo55122d(arrayList2, this.f34801k, this.f34802l, 1, i5, i6);
                C15588c1.m25289K0(animatorSet, arrayList);
                animatorSet.addListener(new C15501a(i2, mo55124f(i), i, mo55124f(i2)));
                animatorSet.start();
            } else if (i3 != i4) {
                if (!(i4 == 0 || (f2 = mo55124f(i2)) == null)) {
                    f2.setVisibility(0);
                    f2.setAlpha(1.0f);
                }
                if (!(i3 == 0 || (f = mo55124f(i)) == null)) {
                    f.setVisibility(4);
                    if (i3 == 1) {
                        f.setText((CharSequence) null);
                    }
                }
                this.f34798h = i4;
            }
            this.f34792b.updateEditTextBackground();
            this.f34792b.updateLabelState(z2);
            this.f34792b.updateTextInputBoxState();
        }
    }
}
