package androidx.appcompat.app;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0353t0;
import androidx.core.view.C2325q;
import androidx.core.view.C2330s0;
import androidx.core.view.C2348w0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p260v0.C8184a;

/* renamed from: androidx.appcompat.app.g */
public final class C0157g implements C2325q {

    /* renamed from: b */
    public final /* synthetic */ AppCompatDelegateImpl f389b;

    public C0157g(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f389b = appCompatDelegateImpl;
    }

    /* renamed from: b */
    public final C2348w0 mo1389b(View view, C2348w0 w0Var) {
        boolean z;
        View view2;
        C2348w0 w0Var2;
        boolean z2;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        int g = w0Var.mo8948g();
        AppCompatDelegateImpl appCompatDelegateImpl = this.f389b;
        appCompatDelegateImpl.getClass();
        int g2 = w0Var.mo8948g();
        ActionBarContextView actionBarContextView = appCompatDelegateImpl.f333q;
        int i3 = 8;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) appCompatDelegateImpl.f333q.getLayoutParams();
            boolean z3 = true;
            if (appCompatDelegateImpl.f333q.isShown()) {
                if (appCompatDelegateImpl.f318Z == null) {
                    appCompatDelegateImpl.f318Z = new Rect();
                    appCompatDelegateImpl.f327k0 = new Rect();
                }
                Rect rect = appCompatDelegateImpl.f318Z;
                Rect rect2 = appCompatDelegateImpl.f327k0;
                rect.set(w0Var.mo8945e(), w0Var.mo8948g(), w0Var.mo8947f(), w0Var.mo8944d());
                ViewGroup viewGroup = appCompatDelegateImpl.f339w;
                Method method = C0353t0.f934a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, new Object[]{rect, rect2});
                    } catch (Exception e) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                    }
                }
                int i4 = rect.top;
                int i5 = rect.left;
                int i6 = rect.right;
                ViewGroup viewGroup2 = appCompatDelegateImpl.f339w;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                C2348w0 a = C2364y.C2375j.m5280a(viewGroup2);
                int e2 = a == null ? 0 : a.mo8945e();
                int f = a == null ? 0 : a.mo8947f();
                if (marginLayoutParams2.topMargin == i4 && marginLayoutParams2.leftMargin == i5 && marginLayoutParams2.rightMargin == i6) {
                    z2 = false;
                } else {
                    marginLayoutParams2.topMargin = i4;
                    marginLayoutParams2.leftMargin = i5;
                    marginLayoutParams2.rightMargin = i6;
                    z2 = true;
                }
                if (i4 <= 0 || appCompatDelegateImpl.f341y != null) {
                    View view3 = appCompatDelegateImpl.f341y;
                    if (!(view3 == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams()).height == (i2 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == e2 && marginLayoutParams.rightMargin == f))) {
                        marginLayoutParams.height = i2;
                        marginLayoutParams.leftMargin = e2;
                        marginLayoutParams.rightMargin = f;
                        appCompatDelegateImpl.f341y.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view4 = new View(appCompatDelegateImpl.f320f);
                    appCompatDelegateImpl.f341y = view4;
                    view4.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = e2;
                    layoutParams.rightMargin = f;
                    appCompatDelegateImpl.f339w.addView(appCompatDelegateImpl.f341y, -1, layoutParams);
                }
                View view5 = appCompatDelegateImpl.f341y;
                z = view5 != null;
                if (z && view5.getVisibility() != 0) {
                    View view6 = appCompatDelegateImpl.f341y;
                    if ((C2364y.C2368d.m5217g(view6) & 8192) == 0) {
                        z3 = false;
                    }
                    if (z3) {
                        Context context = appCompatDelegateImpl.f320f;
                        Object obj = C8184a.f17966a;
                        i = C8184a.C8188d.m16468a(context, R.color.abc_decor_view_status_guard_light);
                    } else {
                        Context context2 = appCompatDelegateImpl.f320f;
                        Object obj2 = C8184a.f17966a;
                        i = C8184a.C8188d.m16468a(context2, R.color.abc_decor_view_status_guard);
                    }
                    view6.setBackgroundColor(i);
                }
                if (!appCompatDelegateImpl.f297D && z) {
                    g2 = 0;
                }
                z3 = z2;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z = false;
            } else {
                z3 = false;
                z = false;
            }
            if (z3) {
                appCompatDelegateImpl.f333q.setLayoutParams(marginLayoutParams2);
            }
        }
        View view7 = appCompatDelegateImpl.f341y;
        if (view7 != null) {
            if (z) {
                i3 = 0;
            }
            view7.setVisibility(i3);
        }
        if (g != g2) {
            w0Var2 = w0Var.mo8950i(w0Var.mo8945e(), g2, w0Var.mo8947f(), w0Var.mo8944d());
            view2 = view;
        } else {
            view2 = view;
            w0Var2 = w0Var;
        }
        return C2364y.m5196k(view2, w0Var2);
    }
}
