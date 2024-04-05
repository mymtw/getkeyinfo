package com.etsy.android.p327ui.user.review;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.logger.ITrackedObject;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.user.review.ReviewFlowNavigationOption;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.review.s */
public final class C11744s {

    /* renamed from: a */
    public final String f26175a;

    /* renamed from: b */
    public final ITrackedObject f26176b;

    /* renamed from: c */
    public final NavigationAction f26177c;

    public C11744s(String str, ReviewFlowNavigationOption.C11699a aVar, NavigationAction navigationAction) {
        C19383o.m32797g(navigationAction, ResponseConstants.ACTION);
        this.f26175a = str;
        this.f26176b = aVar;
        this.f26177c = navigationAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11744s)) {
            return false;
        }
        C11744s sVar = (C11744s) obj;
        return C19383o.m32792b(this.f26175a, sVar.f26175a) && C19383o.m32792b(this.f26176b, sVar.f26176b) && this.f26177c == sVar.f26177c;
    }

    public final int hashCode() {
        String str = this.f26175a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ITrackedObject iTrackedObject = this.f26176b;
        if (iTrackedObject != null) {
            i = iTrackedObject.hashCode();
        }
        return this.f26177c.hashCode() + ((hashCode + i) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ForwardNavigationOption(displayText=");
        h.append(this.f26175a);
        h.append(", analyticsObject=");
        h.append(this.f26176b);
        h.append(", action=");
        h.append(this.f26177c);
        h.append(')');
        return h.toString();
    }
}
