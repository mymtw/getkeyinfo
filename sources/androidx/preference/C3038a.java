package androidx.preference;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.etsy.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import p075d.C6614a;

/* renamed from: androidx.preference.a */
public final class C3038a extends Preference {

    /* renamed from: P */
    public long f6916P;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3038a(Context context, ArrayList arrayList, long j) {
        super(context, (AttributeSet) null);
        CharSequence charSequence = null;
        this.f6812G = R.layout.expand_button;
        Drawable a = C6614a.m12981a(this.f6821b, R.drawable.ic_arrow_down_24dp);
        if (this.f6831l != a) {
            this.f6831l = a;
            this.f6830k = 0;
            mo11005j();
        }
        this.f6830k = R.drawable.ic_arrow_down_24dp;
        mo11047G(R.string.expand_button_title);
        if (999 != this.f6827h) {
            this.f6827h = 999;
            Preference.C3008b bVar = this.f6814I;
            if (bVar != null) {
                C3040c cVar = (C3040c) bVar;
                cVar.f6922f.removeCallbacks(cVar.f6923g);
                cVar.f6922f.post(cVar.f6923g);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence charSequence2 = preference.f6828i;
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence2)) {
                arrayList2.add((PreferenceGroup) preference);
            }
            if (arrayList2.contains(preference.f6816K)) {
                if (z) {
                    arrayList2.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequence2)) {
                if (charSequence == null) {
                    charSequence = charSequence2;
                } else {
                    charSequence = this.f6821b.getString(R.string.summary_collapsed_preference_list, new Object[]{charSequence, charSequence2});
                }
            }
        }
        mo11026F(charSequence);
        this.f6916P = j + 1000000;
    }

    /* renamed from: f */
    public final long mo11055f() {
        return this.f6916P;
    }

    /* renamed from: n */
    public final void mo11000n(C3051h hVar) {
        super.mo11000n(hVar);
        hVar.f6952c = false;
    }
}
