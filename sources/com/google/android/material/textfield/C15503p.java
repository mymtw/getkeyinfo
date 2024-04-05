package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.etsy.android.R;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: com.google.android.material.textfield.p */
public final class C15503p extends C15499m {

    /* renamed from: e */
    public final C15504a f34817e = new C15504a();

    /* renamed from: f */
    public final C15505b f34818f = new C15505b();

    /* renamed from: g */
    public final C15506c f34819g = new C15506c();

    /* renamed from: com.google.android.material.textfield.p$a */
    public class C15504a extends TextWatcherAdapter {
        public C15504a() {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C15503p pVar = C15503p.this;
            pVar.f34789c.setChecked(!C15503p.m25101d(pVar));
        }
    }

    /* renamed from: com.google.android.material.textfield.p$b */
    public class C15505b implements TextInputLayout.C15471f {
        public C15505b() {
        }

        /* renamed from: a */
        public final void mo55092a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            C15503p pVar = C15503p.this;
            pVar.f34789c.setChecked(!C15503p.m25101d(pVar));
            editText.removeTextChangedListener(C15503p.this.f34817e);
            editText.addTextChangedListener(C15503p.this.f34817e);
        }
    }

    /* renamed from: com.google.android.material.textfield.p$c */
    public class C15506c implements TextInputLayout.C15472g {

        /* renamed from: com.google.android.material.textfield.p$c$a */
        public class C15507a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ EditText f34823b;

            public C15507a(EditText editText) {
                this.f34823b = editText;
            }

            public final void run() {
                this.f34823b.removeTextChangedListener(C15503p.this.f34817e);
            }
        }

        public C15506c() {
        }

        /* renamed from: a */
        public final void mo55093a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.post(new C15507a(editText));
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.p$d */
    public class C15508d implements View.OnClickListener {
        public C15508d() {
        }

        public final void onClick(View view) {
            EditText editText = C15503p.this.f34787a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                if (C15503p.m25101d(C15503p.this)) {
                    editText.setTransformationMethod((TransformationMethod) null);
                } else {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
                C15503p.this.f34787a.refreshEndIconDrawableState();
            }
        }
    }

    public C15503p(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
    }

    /* renamed from: d */
    public static boolean m25101d(C15503p pVar) {
        EditText editText = pVar.f34787a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* renamed from: a */
    public final void mo55094a() {
        TextInputLayout textInputLayout = this.f34787a;
        int i = this.f34790d;
        if (i == 0) {
            i = R.drawable.design_password_eye;
        }
        textInputLayout.setEndIconDrawable(i);
        TextInputLayout textInputLayout2 = this.f34787a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(R.string.password_toggle_content_description));
        this.f34787a.setEndIconOnClickListener(new C15508d());
        this.f34787a.addOnEditTextAttachedListener(this.f34818f);
        this.f34787a.addOnEndIconChangedListener(this.f34819g);
        EditText editText = this.f34787a.getEditText();
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
