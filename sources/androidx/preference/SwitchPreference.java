package androidx.preference;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;

public class SwitchPreference extends TwoStatePreference {

    /* renamed from: V */
    public final C3035a f6902V = new C3035a();

    /* renamed from: W */
    public CharSequence f6903W;

    /* renamed from: X */
    public CharSequence f6904X;

    /* renamed from: androidx.preference.SwitchPreference$a */
    public class C3035a implements CompoundButton.OnCheckedChangeListener {
        public C3035a() {
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!SwitchPreference.this.mo11051a(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                SwitchPreference.this.mo11173L(z);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130969960(0x7f040568, float:1.7548617E38)
            r1 = 16843629(0x101036d, float:2.3696016E-38)
            int r0 = p280x0.C8299j.m16588a(r0, r4, r1)
            r3.<init>(r4, r5, r0)
            androidx.preference.SwitchPreference$a r1 = new androidx.preference.SwitchPreference$a
            r1.<init>()
            r3.f6902V = r1
            int[] r1 = androidx.activity.C0114h.f177n
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            r5 = 7
            java.lang.String r5 = p280x0.C8299j.m16594g(r4, r5, r2)
            r3.f6911Q = r5
            boolean r5 = r3.f6910P
            if (r5 == 0) goto L_0x0029
            r3.mo11005j()
        L_0x0029:
            r5 = 6
            r0 = 1
            java.lang.String r5 = p280x0.C8299j.m16594g(r4, r5, r0)
            r3.f6912R = r5
            boolean r5 = r3.f6910P
            if (r5 != 0) goto L_0x0038
            r3.mo11005j()
        L_0x0038:
            r5 = 9
            r0 = 3
            java.lang.String r5 = p280x0.C8299j.m16594g(r4, r5, r0)
            r3.f6903W = r5
            r3.mo11005j()
            r5 = 8
            r0 = 4
            java.lang.String r5 = p280x0.C8299j.m16594g(r4, r5, r0)
            r3.f6904X = r5
            r3.mo11005j()
            r5 = 5
            r0 = 2
            boolean r0 = r4.getBoolean(r0, r2)
            boolean r5 = r4.getBoolean(r5, r0)
            r3.f6914T = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.SwitchPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: N */
    public final void mo11169N(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f6910P);
        }
        if (z) {
            Switch switchR = (Switch) view;
            switchR.setTextOn(this.f6903W);
            switchR.setTextOff(this.f6904X);
            switchR.setOnCheckedChangeListener(this.f6902V);
        }
    }

    /* renamed from: n */
    public final void mo11000n(C3051h hVar) {
        super.mo11000n(hVar);
        mo11169N(hVar.mo11208e(16908352));
        mo11174M(hVar.mo11208e(16908304));
    }

    /* renamed from: v */
    public final void mo11001v(View view) {
        super.mo11001v(view);
        if (((AccessibilityManager) this.f6821b.getSystemService("accessibility")).isEnabled()) {
            mo11169N(view.findViewById(16908352));
            mo11174M(view.findViewById(16908304));
        }
    }
}
