package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
import p193o.C7506i;

/* renamed from: androidx.core.view.c1 */
public final class C2290c1 {

    /* renamed from: a */
    public final C2295e f5551a;

    /* renamed from: androidx.core.view.c1$a */
    public static class C2291a extends C2295e {

        /* renamed from: a */
        public final Window f5552a;

        /* renamed from: b */
        public final View f5553b;

        public C2291a(Window window, View view) {
            this.f5552a = window;
            this.f5553b = view;
        }

        /* renamed from: a */
        public final void mo8886a() {
            for (int i = 1; i <= 256; i <<= 1) {
                if ((7 & i) != 0) {
                    if (i == 1) {
                        View decorView = this.f5552a.getDecorView();
                        decorView.setSystemUiVisibility(4 | decorView.getSystemUiVisibility());
                    } else if (i == 2) {
                        View decorView2 = this.f5552a.getDecorView();
                        decorView2.setSystemUiVisibility(2 | decorView2.getSystemUiVisibility());
                    } else if (i == 8) {
                        ((InputMethodManager) this.f5552a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f5552a.getDecorView().getWindowToken(), 0);
                    }
                }
            }
        }

        /* renamed from: c */
        public final void mo8887c() {
            for (int i = 1; i <= 256; i <<= 1) {
                if ((7 & i) != 0) {
                    if (i == 1) {
                        View decorView = this.f5552a.getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & -5);
                        this.f5552a.clearFlags(RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE);
                    } else if (i == 2) {
                        View decorView2 = this.f5552a.getDecorView();
                        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -3);
                    } else if (i == 8) {
                        View view = this.f5553b;
                        if (view == null || (!view.isInEditMode() && !view.onCheckIsTextEditor())) {
                            view = this.f5552a.getCurrentFocus();
                        } else {
                            view.requestFocus();
                        }
                        if (view == null) {
                            view = this.f5552a.findViewById(16908290);
                        }
                        if (view != null && view.hasWindowFocus()) {
                            view.post(new C2281b1(view));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: androidx.core.view.c1$b */
    public static class C2292b extends C2291a {
        public C2292b(Window window, View view) {
            super(window, view);
        }
    }

    /* renamed from: androidx.core.view.c1$c */
    public static class C2293c extends C2292b {
        public C2293c(Window window, View view) {
            super(window, view);
        }

        /* renamed from: b */
        public final void mo8888b() {
            this.f5552a.clearFlags(134217728);
            this.f5552a.addFlags(Integer.MIN_VALUE);
            View decorView = this.f5552a.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
        }
    }

    /* renamed from: androidx.core.view.c1$d */
    public static class C2294d extends C2295e {

        /* renamed from: a */
        public final WindowInsetsController f5554a;

        public C2294d(WindowInsetsController windowInsetsController) {
            new C7506i();
            this.f5554a = windowInsetsController;
        }

        /* renamed from: a */
        public final void mo8886a() {
            this.f5554a.hide(7);
        }

        /* renamed from: b */
        public final void mo8888b() {
            this.f5554a.setSystemBarsAppearance(16, 16);
        }

        /* renamed from: c */
        public final void mo8887c() {
            this.f5554a.show(7);
        }
    }

    /* renamed from: androidx.core.view.c1$e */
    public static class C2295e {
        /* renamed from: a */
        public void mo8886a() {
        }

        /* renamed from: b */
        public void mo8888b() {
        }

        /* renamed from: c */
        public void mo8887c() {
        }
    }

    public C2290c1(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f5551a = new C2294d(windowInsetsController);
        } else {
            this.f5551a = new C2295e();
        }
    }

    public C2290c1(Window window, View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f5551a = new C2294d(window.getInsetsController());
        } else {
            this.f5551a = new C2293c(window, view);
        }
    }
}
