package com.airbnb.paris;

import android.content.Context;
import android.view.View;
import com.airbnb.paris.typed_array_wrappers.C4870c;
import com.appboy.Constants;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C19383o;
import p232s3.C7807a;
import p242t3.C7956f;

/* renamed from: com.airbnb.paris.a */
public abstract class C4864a<P, V extends View> {

    /* renamed from: a */
    public final P f11060a;

    /* renamed from: b */
    public final V f11061b;

    /* renamed from: com.airbnb.paris.a$a */
    public interface C4865a {
        /* renamed from: a */
        void mo14740a();
    }

    public C4864a(C7807a aVar) {
        V v = aVar.f17250a;
        this.f11060a = aVar;
        this.f11061b = v;
    }

    /* renamed from: a */
    public final void mo14737a(C7956f fVar) {
        C19383o.m32798h(fVar, "style");
        if (fVar.mo20483a()) {
            mo841b(fVar);
        }
        int[] c = mo842c();
        if (c != null) {
            Context context = this.f11061b.getContext();
            C19383o.m32793c(context, "view.context");
            C4870c b = fVar.mo20484b(context, c);
            mo844e(fVar, b);
            mo843d(fVar, b);
            b.mo14772p();
        }
    }

    /* renamed from: b */
    public void mo841b(C7956f fVar) {
        C19383o.m32798h(fVar, "style");
    }

    /* renamed from: c */
    public int[] mo842c() {
        return null;
    }

    /* renamed from: d */
    public void mo843d(C7956f fVar, C4870c cVar) {
        C19383o.m32798h(fVar, "style");
        C19383o.m32798h(cVar, Constants.APPBOY_PUSH_CONTENT_KEY);
    }

    /* renamed from: e */
    public void mo844e(C7956f fVar, C4870c cVar) {
        C19383o.m32798h(fVar, "style");
        C19383o.m32798h(cVar, Constants.APPBOY_PUSH_CONTENT_KEY);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C19383o.m32792b(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            C4864a aVar = (C4864a) obj;
            return !(C19383o.m32792b(this.f11060a, aVar.f11060a) ^ true) && !(C19383o.m32792b(this.f11061b, aVar.f11061b) ^ true);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.airbnb.paris.StyleApplier<*, *>");
    }

    public final int hashCode() {
        P p = this.f11060a;
        return this.f11061b.hashCode() + ((p != null ? p.hashCode() : 0) * 31);
    }
}
