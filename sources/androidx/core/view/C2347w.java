package androidx.core.view;

import android.text.TextUtils;
import android.view.View;
import androidx.core.view.C2364y;
import com.etsy.android.R;

/* renamed from: androidx.core.view.w */
public final class C2347w extends C2364y.C2366b<CharSequence> {
    public C2347w(Class cls) {
        super(R.id.tag_state_description, cls, 64, 30);
    }

    /* renamed from: b */
    public final Object mo8924b(View view) {
        return C2364y.C2380o.m5318a(view);
    }

    /* renamed from: c */
    public final void mo8925c(View view, Object obj) {
        C2364y.C2380o.m5320c(view, (CharSequence) obj);
    }

    /* renamed from: f */
    public final boolean mo8926f(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
