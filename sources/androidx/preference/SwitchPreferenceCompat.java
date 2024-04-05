package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.activity.C0114h;
import androidx.appcompat.widget.SwitchCompat;
import com.etsy.android.R;
import p280x0.C8299j;

public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: V */
    public final C3036a f6906V = new C3036a();

    /* renamed from: W */
    public CharSequence f6907W;

    /* renamed from: X */
    public CharSequence f6908X;

    /* renamed from: androidx.preference.SwitchPreferenceCompat$a */
    public class C3036a implements CompoundButton.OnCheckedChangeListener {
        public C3036a() {
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!SwitchPreferenceCompat.this.mo11051a(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                SwitchPreferenceCompat.this.mo11173L(z);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0114h.f178o, R.attr.switchPreferenceCompatStyle, 0);
        this.f6911Q = C8299j.m16594g(obtainStyledAttributes, 7, 0);
        if (this.f6910P) {
            mo11005j();
        }
        this.f6912R = C8299j.m16594g(obtainStyledAttributes, 6, 1);
        if (!this.f6910P) {
            mo11005j();
        }
        this.f6907W = C8299j.m16594g(obtainStyledAttributes, 9, 3);
        mo11005j();
        this.f6908X = C8299j.m16594g(obtainStyledAttributes, 8, 4);
        mo11005j();
        this.f6914T = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: N */
    public final void mo11171N(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f6910P);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f6907W);
            switchCompat.setTextOff(this.f6908X);
            switchCompat.setOnCheckedChangeListener(this.f6906V);
        }
    }

    /* renamed from: n */
    public final void mo11000n(C3051h hVar) {
        super.mo11000n(hVar);
        mo11171N(hVar.mo11208e(R.id.switchWidget));
        mo11174M(hVar.mo11208e(16908304));
    }

    /* renamed from: v */
    public final void mo11001v(View view) {
        super.mo11001v(view);
        if (((AccessibilityManager) this.f6821b.getSystemService("accessibility")).isEnabled()) {
            mo11171N(view.findViewById(R.id.switchWidget));
            mo11174M(view.findViewById(16908304));
        }
    }
}
