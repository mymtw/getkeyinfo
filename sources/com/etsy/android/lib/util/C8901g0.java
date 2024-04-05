package com.etsy.android.lib.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import com.etsy.android.R;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import p392lf.C13021b;

/* renamed from: com.etsy.android.lib.util.g0 */
public final class C8901g0 {
    /* renamed from: a */
    public static AlertDialog m17335a(Context context, String str) {
        if (context != null) {
            return new C13021b(context, str).create();
        }
        return null;
    }

    /* renamed from: b */
    public static void m17336b(View view, String str) {
        if (view != null) {
            Snackbar h = Snackbar.m25028h(view, str, -1);
            BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = h.f34654c;
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.colorAccent});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            snackbarBaseLayout.setBackgroundColor(color);
            h.mo54762i();
        }
    }

    /* renamed from: c */
    public static void m17337c(Context context, int i) {
        if (context != null && i != 0) {
            boolean z = true;
            if (context instanceof C2887s) {
                z = ((C2887s) context).getLifecycle().mo10734b().isAtLeast(Lifecycle.State.RESUMED);
            }
            if (z) {
                Toast.makeText(context.getApplicationContext(), context.getString(i), 0).show();
            }
        }
    }

    /* renamed from: d */
    public static void m17338d(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            boolean z = true;
            if (context instanceof C2887s) {
                z = ((C2887s) context).getLifecycle().mo10734b().isAtLeast(Lifecycle.State.RESUMED);
            }
            if (z) {
                Toast.makeText(context.getApplicationContext(), str, 0).show();
            }
        }
    }
}
