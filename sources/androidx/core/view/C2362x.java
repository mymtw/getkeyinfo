package androidx.core.view;

import android.view.View;
import androidx.core.view.C2364y;
import com.etsy.android.R;

/* renamed from: androidx.core.view.x */
public final class C2362x extends C2364y.C2366b<Boolean> {
    public C2362x() {
        super(R.id.tag_accessibility_heading, Boolean.class, 0, 28);
    }

    /* renamed from: b */
    public final Object mo8924b(View view) {
        return Boolean.valueOf(C2364y.C2378m.m5307c(view));
    }

    /* renamed from: c */
    public final void mo8925c(View view, Object obj) {
        C2364y.C2378m.m5311g(view, ((Boolean) obj).booleanValue());
    }

    /* renamed from: f */
    public final boolean mo8926f(Object obj, Object obj2) {
        return !C2364y.C2366b.m5204a((Boolean) obj, (Boolean) obj2);
    }
}
