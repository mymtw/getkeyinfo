package androidx.core.view;

import android.text.TextUtils;
import android.view.View;
import androidx.core.view.C2364y;
import com.etsy.android.R;

/* renamed from: androidx.core.view.v */
public final class C2335v extends C2364y.C2366b<CharSequence> {
    public C2335v(Class cls) {
        super(R.id.tag_accessibility_pane_title, cls, 8, 28);
    }

    /* renamed from: b */
    public final Object mo8924b(View view) {
        return C2364y.C2378m.m5306b(view);
    }

    /* renamed from: c */
    public final void mo8925c(View view, Object obj) {
        C2364y.C2378m.m5312h(view, (CharSequence) obj);
    }

    /* renamed from: f */
    public final boolean mo8926f(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
