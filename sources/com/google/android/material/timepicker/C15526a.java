package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.view.C2273a;
import p088e1.C6689b;

/* renamed from: com.google.android.material.timepicker.a */
public final class C15526a extends C2273a {

    /* renamed from: a */
    public final C6689b.C6690a f34886a;

    public C15526a(Context context, int i) {
        this.f34886a = new C6689b.C6690a(16, (CharSequence) context.getString(i));
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
        super.onInitializeAccessibilityNodeInfo(view, bVar);
        bVar.mo18851b(this.f34886a);
    }
}
