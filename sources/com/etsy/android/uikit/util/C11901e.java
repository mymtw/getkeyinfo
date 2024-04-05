package com.etsy.android.uikit.util;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8592b;
import java.util.List;
import p628nj.C18263b;

/* renamed from: com.etsy.android.uikit.util.e */
public final class C11901e {
    /* renamed from: a */
    public static void m19622a(View view) {
        List<String> list = C8591a.f18700r;
        if (C18263b.f40056T.f18706f.mo21132b(C8592b.f18724C) && view != null) {
            try {
                if (view.getBackground() != null) {
                    view.getBackground().setCallback((Drawable.Callback) null);
                }
                if (view instanceof AdapterView) {
                    if (!(view instanceof Spinner)) {
                        ((AdapterView) view).setOnItemClickListener((AdapterView.OnItemClickListener) null);
                    }
                    ((AdapterView) view).setOnItemLongClickListener((AdapterView.OnItemLongClickListener) null);
                    ((AdapterView) view).setOnItemSelectedListener((AdapterView.OnItemSelectedListener) null);
                } else {
                    view.setOnTouchListener((View.OnTouchListener) null);
                    view.setOnClickListener((View.OnClickListener) null);
                }
                if ((view instanceof ViewGroup) && !(view instanceof AdapterView)) {
                    for (int i = 0; i < ((ViewGroup) view).getChildCount(); i++) {
                        m19622a(((ViewGroup) view).getChildAt(i));
                    }
                    ((ViewGroup) view).removeAllViews();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
