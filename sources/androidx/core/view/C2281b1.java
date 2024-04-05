package androidx.core.view;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: androidx.core.view.b1 */
public final class C2281b1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ View f5537b;

    public C2281b1(View view) {
        this.f5537b = view;
    }

    public final void run() {
        ((InputMethodManager) this.f5537b.getContext().getSystemService("input_method")).showSoftInput(this.f5537b, 0);
    }
}
