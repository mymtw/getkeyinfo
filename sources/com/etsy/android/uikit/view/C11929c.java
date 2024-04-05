package com.etsy.android.uikit.view;

import android.graphics.drawable.Drawable;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.bumptech.glide.load.resource.bitmap.C6085i;
import com.bumptech.glide.load.resource.bitmap.C6105w;
import com.bumptech.glide.request.C6121a;
import com.bumptech.glide.request.C6128g;
import kotlin.jvm.internal.C19383o;
import p455u9.C13448b;

/* renamed from: com.etsy.android.uikit.view.c */
public interface C11929c {

    /* renamed from: com.etsy.android.uikit.view.c$a */
    public static final class C11930a implements C11929c {

        /* renamed from: a */
        public final int f26503a;

        public C11930a(int i) {
            this.f26503a = i;
        }

        /* renamed from: a */
        public final void mo38657a(C13448b<Drawable> bVar) {
            C6121a F = new C6128g().mo17143F(new C6085i(), new C6105w(this.f26503a));
            C19383o.m32796f(F, "requestOptions.transform…dCorners(roundingRadius))");
            bVar.mo16829a((C6128g) F);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11930a) && this.f26503a == ((C11930a) obj).f26503a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f26503a);
        }

        public final String toString() {
            return C0073e.m208h(C0072d.m201h("RoundRect(roundingRadius="), this.f26503a, ')');
        }
    }

    /* renamed from: a */
    void mo38657a(C13448b<Drawable> bVar);
}
