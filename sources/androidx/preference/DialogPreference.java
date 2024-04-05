package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.activity.C0114h;
import androidx.preference.C3045f;
import com.etsy.android.R;
import p280x0.C8299j;

public abstract class DialogPreference extends Preference {

    /* renamed from: P */
    public CharSequence f6777P;

    /* renamed from: Q */
    public CharSequence f6778Q;

    /* renamed from: R */
    public Drawable f6779R;

    /* renamed from: S */
    public String f6780S;

    /* renamed from: T */
    public String f6781T;

    /* renamed from: V */
    public int f6782V;

    /* renamed from: androidx.preference.DialogPreference$a */
    public interface C2994a {
        <T extends Preference> T findPreference(CharSequence charSequence);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0114h.f167d, i, 0);
        String g = C8299j.m16594g(obtainStyledAttributes, 9, 0);
        this.f6777P = g;
        if (g == null) {
            this.f6777P = this.f6828i;
        }
        this.f6778Q = C8299j.m16594g(obtainStyledAttributes, 8, 1);
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.f6779R = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        this.f6780S = C8299j.m16594g(obtainStyledAttributes, 11, 3);
        this.f6781T = C8299j.m16594g(obtainStyledAttributes, 10, 4);
        this.f6782V = obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: o */
    public void mo11003o() {
        C3045f.C3046a aVar = this.f6822c.f6945j;
        if (aVar != null) {
            aVar.onDisplayPreferenceDialog(this);
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8299j.m16588a(R.attr.dialogPreferenceStyle, context, 16842897));
    }
}
