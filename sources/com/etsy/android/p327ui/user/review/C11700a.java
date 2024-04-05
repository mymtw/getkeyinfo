package com.etsy.android.p327ui.user.review;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.logger.ITrackedObject;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.review.a */
public final class C11700a {

    /* renamed from: a */
    public final BackType f26042a;

    /* renamed from: b */
    public final ITrackedObject f26043b;

    /* renamed from: c */
    public final NavigationAction f26044c;

    public C11700a(BackType backType, ITrackedObject iTrackedObject, NavigationAction navigationAction) {
        C19383o.m32797g(backType, "type");
        C19383o.m32797g(navigationAction, ResponseConstants.ACTION);
        this.f26042a = backType;
        this.f26043b = iTrackedObject;
        this.f26044c = navigationAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11700a)) {
            return false;
        }
        C11700a aVar = (C11700a) obj;
        return this.f26042a == aVar.f26042a && C19383o.m32792b(this.f26043b, aVar.f26043b) && this.f26044c == aVar.f26044c;
    }

    public final int hashCode() {
        int hashCode = this.f26042a.hashCode() * 31;
        ITrackedObject iTrackedObject = this.f26043b;
        return this.f26044c.hashCode() + ((hashCode + (iTrackedObject == null ? 0 : iTrackedObject.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("BackNavigationOption(type=");
        h.append(this.f26042a);
        h.append(", analyticsObject=");
        h.append(this.f26043b);
        h.append(", action=");
        h.append(this.f26044c);
        h.append(')');
        return h.toString();
    }
}
