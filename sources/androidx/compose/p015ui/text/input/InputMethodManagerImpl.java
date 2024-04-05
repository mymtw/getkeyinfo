package androidx.compose.p015ui.text.input;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.input.InputMethodManagerImpl */
public final class InputMethodManagerImpl implements C1992l {

    /* renamed from: a */
    public final C19285c f4447a;

    public InputMethodManagerImpl(Context context) {
        this.f4447a = C19350d.m32676a(LazyThreadSafetyMode.NONE, new InputMethodManagerImpl$imm$2(context));
    }

    /* renamed from: a */
    public final void mo7597a(IBinder iBinder) {
        ((InputMethodManager) this.f4447a.getValue()).hideSoftInputFromWindow(iBinder, 0);
    }

    /* renamed from: b */
    public final void mo7598b(View view, int i, int i2, int i3, int i4) {
        C19383o.m32797g(view, "view");
        ((InputMethodManager) this.f4447a.getValue()).updateSelection(view, i, i2, i3, i4);
    }

    /* renamed from: c */
    public final void mo7599c(View view) {
        C19383o.m32797g(view, "view");
        ((InputMethodManager) this.f4447a.getValue()).showSoftInput(view, 0);
    }

    /* renamed from: d */
    public final void mo7600d(View view, int i, ExtractedText extractedText) {
        C19383o.m32797g(view, "view");
        ((InputMethodManager) this.f4447a.getValue()).updateExtractedText(view, i, extractedText);
    }

    /* renamed from: e */
    public final void mo7601e(View view) {
        C19383o.m32797g(view, "view");
        ((InputMethodManager) this.f4447a.getValue()).restartInput(view);
    }
}
