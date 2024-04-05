package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.C3045f;
import com.etsy.android.R;
import p280x0.C8299j;

public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: Y */
    public boolean f6884Y = true;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C8299j.m16588a(R.attr.preferenceScreenStyle, context, 16842891));
    }

    /* renamed from: o */
    public final void mo11003o() {
        C3045f.C3047b bVar;
        if (this.f6833n == null && this.f6834o == null && mo11151O() != 0 && (bVar = this.f6822c.f6946k) != null) {
            bVar.onNavigateToScreen(this);
        }
    }
}
