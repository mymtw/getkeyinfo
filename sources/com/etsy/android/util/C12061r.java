package com.etsy.android.util;

import androidx.lifecycle.C2843a0;
import kotlin.C19394m;
import p753kq.C19857l;

/* renamed from: com.etsy.android.util.r */
public final class C12061r<T> implements C2843a0<C12059p<T>> {

    /* renamed from: b */
    public final C19857l<T, C19394m> f26889b;

    public C12061r(C19857l<? super T, C19394m> lVar) {
        this.f26889b = lVar;
    }

    public final void onChanged(Object obj) {
        Object a;
        C12059p pVar = (C12059p) obj;
        if (pVar != null && (a = pVar.mo38935a()) != null) {
            this.f26889b.invoke(a);
        }
    }
}
