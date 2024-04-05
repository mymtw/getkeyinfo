package com.usebutton.merchant;

import android.util.Log;
import com.usebutton.merchant.C17484f0;

/* renamed from: com.usebutton.merchant.p */
public final class C17501p implements C17484f0.C17485a<Void> {

    /* renamed from: a */
    public final /* synthetic */ Event f38268a;

    public C17501p(Event event) {
        this.f38268a = event;
    }

    /* renamed from: a */
    public final void mo68657a(Exception exc) {
        Log.e(C17502q.f38269h, String.format("Error reporting event [%s]", new Object[]{this.f38268a.f38221c}), exc);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo68658b(Object obj) {
        Void voidR = (Void) obj;
    }
}
