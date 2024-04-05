package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C2325q;
import androidx.core.view.C2330s0;
import androidx.core.view.C2348w0;
import androidx.core.view.C2364y;
import java.util.WeakHashMap;

/* renamed from: com.google.android.material.internal.j */
public final class C15370j {

    /* renamed from: com.google.android.material.internal.j$a */
    public static class C15371a implements C2325q {

        /* renamed from: b */
        public final /* synthetic */ C15372b f34520b;

        /* renamed from: c */
        public final /* synthetic */ C15373c f34521c;

        public C15371a(C15372b bVar, C15373c cVar) {
            this.f34520b = bVar;
            this.f34521c = cVar;
        }

        /* renamed from: b */
        public final C2348w0 mo1389b(View view, C2348w0 w0Var) {
            return this.f34520b.mo53146a(view, w0Var, new C15373c(this.f34521c));
        }
    }

    /* renamed from: com.google.android.material.internal.j$b */
    public interface C15372b {
        /* renamed from: a */
        C2348w0 mo53146a(View view, C2348w0 w0Var, C15373c cVar);
    }

    /* renamed from: a */
    public static void m24960a(View view, C15372b bVar) {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2373i.m5274u(view, new C15371a(bVar, new C15373c(C2364y.C2369e.m5235f(view), view.getPaddingTop(), C2364y.C2369e.m5234e(view), view.getPaddingBottom())));
        if (C2364y.C2371g.m5245b(view)) {
            C2364y.C2372h.m5253c(view);
        } else {
            view.addOnAttachStateChangeListener(new C15374k());
        }
    }

    /* renamed from: b */
    public static float m24961b(Context context, int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: c */
    public static ViewGroup m24962c(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    /* renamed from: d */
    public static boolean m24963d(View view) {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        return C2364y.C2369e.m5233d(view) == 1;
    }

    /* renamed from: e */
    public static PorterDuff.Mode m24964e(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: com.google.android.material.internal.j$c */
    public static class C15373c {

        /* renamed from: a */
        public int f34522a;

        /* renamed from: b */
        public int f34523b;

        /* renamed from: c */
        public int f34524c;

        /* renamed from: d */
        public int f34525d;

        public C15373c(int i, int i2, int i3, int i4) {
            this.f34522a = i;
            this.f34523b = i2;
            this.f34524c = i3;
            this.f34525d = i4;
        }

        public C15373c(C15373c cVar) {
            this.f34522a = cVar.f34522a;
            this.f34523b = cVar.f34523b;
            this.f34524c = cVar.f34524c;
            this.f34525d = cVar.f34525d;
        }
    }
}
