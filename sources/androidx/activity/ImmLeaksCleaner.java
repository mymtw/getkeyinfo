package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.C2885q;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;

final class ImmLeaksCleaner implements C2885q {

    /* renamed from: b */
    public static int f136b;

    public ImmLeaksCleaner() {
        throw null;
    }

    public final void onStateChanged(C2887s sVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            if (f136b == 0) {
                try {
                    f136b = 2;
                    InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                    InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                    f136b = 1;
                } catch (NoSuchFieldException unused) {
                }
            }
            if (f136b == 1) {
                throw null;
            }
        }
    }
}
