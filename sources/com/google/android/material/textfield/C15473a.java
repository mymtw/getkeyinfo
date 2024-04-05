package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import com.etsy.android.R;
import com.google.android.material.textfield.TextInputLayout;
import p629nk.C18268a;

/* renamed from: com.google.android.material.textfield.a */
public final class C15473a extends C15499m {

    /* renamed from: e */
    public final C15474a f34739e = new C15474a();

    /* renamed from: f */
    public final C15475b f34740f = new C15475b();

    /* renamed from: g */
    public final C15476c f34741g = new C15476c();

    /* renamed from: h */
    public final C15477d f34742h = new C15477d();

    /* renamed from: i */
    public AnimatorSet f34743i;

    /* renamed from: j */
    public ValueAnimator f34744j;

    /* renamed from: com.google.android.material.textfield.a$a */
    public class C15474a implements TextWatcher {
        public C15474a() {
        }

        public final void afterTextChanged(Editable editable) {
            if (C15473a.this.f34787a.getSuffixText() == null) {
                C15473a aVar = C15473a.this;
                aVar.mo55096e(C15473a.m25071d(aVar));
            }
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    public class C15475b implements View.OnFocusChangeListener {
        public C15475b() {
        }

        public final void onFocusChange(View view, boolean z) {
            C15473a aVar = C15473a.this;
            aVar.mo55096e(C15473a.m25071d(aVar));
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    public class C15476c implements TextInputLayout.C15471f {
        public C15476c() {
        }

        /* renamed from: a */
        public final void mo55092a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(C15473a.m25071d(C15473a.this));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(C15473a.this.f34740f);
            C15473a aVar = C15473a.this;
            aVar.f34789c.setOnFocusChangeListener(aVar.f34740f);
            editText.removeTextChangedListener(C15473a.this.f34739e);
            editText.addTextChangedListener(C15473a.this.f34739e);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$d */
    public class C15477d implements TextInputLayout.C15472g {

        /* renamed from: com.google.android.material.textfield.a$d$a */
        public class C15478a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ EditText f34749b;

            public C15478a(EditText editText) {
                this.f34749b = editText;
            }

            public final void run() {
                this.f34749b.removeTextChangedListener(C15473a.this.f34739e);
            }
        }

        public C15477d() {
        }

        /* renamed from: a */
        public final void mo55093a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 2) {
                editText.post(new C15478a(editText));
                if (editText.getOnFocusChangeListener() == C15473a.this.f34740f) {
                    editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                View.OnFocusChangeListener onFocusChangeListener = C15473a.this.f34789c.getOnFocusChangeListener();
                C15473a aVar = C15473a.this;
                if (onFocusChangeListener == aVar.f34740f) {
                    aVar.f34789c.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.a$e */
    public class C15479e implements View.OnClickListener {
        public C15479e() {
        }

        public final void onClick(View view) {
            Editable text = C15473a.this.f34787a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            C15473a.this.f34787a.refreshEndIconDrawableState();
        }
    }

    public C15473a(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
    }

    /* renamed from: d */
    public static boolean m25071d(C15473a aVar) {
        EditText editText = aVar.f34787a.getEditText();
        return editText != null && (editText.hasFocus() || aVar.f34789c.hasFocus()) && editText.getText().length() > 0;
    }

    /* renamed from: a */
    public final void mo55094a() {
        TextInputLayout textInputLayout = this.f34787a;
        int i = this.f34790d;
        if (i == 0) {
            i = R.drawable.mtrl_ic_cancel;
        }
        textInputLayout.setEndIconDrawable(i);
        TextInputLayout textInputLayout2 = this.f34787a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(R.string.clear_text_end_icon_content_description));
        this.f34787a.setEndIconOnClickListener(new C15479e());
        this.f34787a.addOnEditTextAttachedListener(this.f34741g);
        this.f34787a.addOnEndIconChangedListener(this.f34742h);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(C18268a.f40094d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C15483e(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        LinearInterpolator linearInterpolator = C18268a.f40091a;
        ofFloat2.setInterpolator(linearInterpolator);
        ofFloat2.setDuration(100);
        ofFloat2.addUpdateListener(new C15482d(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f34743i = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.f34743i.addListener(new C15480b(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat3.setInterpolator(linearInterpolator);
        ofFloat3.setDuration(100);
        ofFloat3.addUpdateListener(new C15482d(this));
        this.f34744j = ofFloat3;
        ofFloat3.addListener(new C15481c(this));
    }

    /* renamed from: c */
    public final void mo55095c(boolean z) {
        if (this.f34787a.getSuffixText() != null) {
            mo55096e(z);
        }
    }

    /* renamed from: e */
    public final void mo55096e(boolean z) {
        boolean z2 = this.f34787a.isEndIconVisible() == z;
        if (z && !this.f34743i.isRunning()) {
            this.f34744j.cancel();
            this.f34743i.start();
            if (z2) {
                this.f34743i.end();
            }
        } else if (!z) {
            this.f34743i.cancel();
            this.f34744j.start();
            if (z2) {
                this.f34744j.end();
            }
        }
    }
}
