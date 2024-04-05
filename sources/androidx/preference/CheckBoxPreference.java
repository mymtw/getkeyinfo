package androidx.preference;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;

public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: V */
    public final C2993a f6775V = new C2993a();

    /* renamed from: androidx.preference.CheckBoxPreference$a */
    public class C2993a implements CompoundButton.OnCheckedChangeListener {
        public C2993a() {
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!CheckBoxPreference.this.mo11051a(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                CheckBoxPreference.this.mo11173L(z);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CheckBoxPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130968759(0x7f0400b7, float:1.754618E38)
            r1 = 16842895(0x101008f, float:2.369396E-38)
            int r0 = p280x0.C8299j.m16588a(r0, r4, r1)
            r3.<init>(r4, r5, r0)
            androidx.preference.CheckBoxPreference$a r1 = new androidx.preference.CheckBoxPreference$a
            r1.<init>()
            r3.f6775V = r1
            int[] r1 = androidx.activity.C0114h.f166c
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            r5 = 5
            java.lang.String r5 = p280x0.C8299j.m16594g(r4, r5, r2)
            r3.f6911Q = r5
            boolean r5 = r3.f6910P
            if (r5 == 0) goto L_0x0029
            r3.mo11005j()
        L_0x0029:
            r5 = 4
            r0 = 1
            java.lang.String r5 = p280x0.C8299j.m16594g(r4, r5, r0)
            r3.f6912R = r5
            boolean r5 = r3.f6910P
            if (r5 != 0) goto L_0x0038
            r3.mo11005j()
        L_0x0038:
            r5 = 2
            boolean r5 = r4.getBoolean(r5, r2)
            r0 = 3
            boolean r5 = r4.getBoolean(r0, r5)
            r3.f6914T = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.CheckBoxPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: N */
    public final void mo10999N(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f6910P);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f6775V);
        }
    }

    /* renamed from: n */
    public void mo11000n(C3051h hVar) {
        super.mo11000n(hVar);
        mo10999N(hVar.mo11208e(16908289));
        mo11174M(hVar.mo11208e(16908304));
    }

    /* renamed from: v */
    public final void mo11001v(View view) {
        super.mo11001v(view);
        if (((AccessibilityManager) this.f6821b.getSystemService("accessibility")).isEnabled()) {
            mo10999N(view.findViewById(16908289));
            mo11174M(view.findViewById(16908304));
        }
    }
}
