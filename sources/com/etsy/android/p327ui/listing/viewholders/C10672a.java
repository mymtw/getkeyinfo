package com.etsy.android.p327ui.listing.viewholders;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.listing.C10156h;
import kotlin.jvm.internal.C19383o;
import p487ya.C13895a;

/* renamed from: com.etsy.android.ui.listing.viewholders.a */
public final class C10672a {

    /* renamed from: a */
    public final BOEActivity f23505a;

    /* renamed from: b */
    public final C13895a f23506b;

    /* renamed from: c */
    public final C8618c f23507c;

    /* renamed from: d */
    public final C10156h f23508d;

    public C10672a(BOEActivity bOEActivity, C13895a aVar, C8618c cVar, C10156h hVar) {
        this.f23505a = bOEActivity;
        this.f23506b = aVar;
        this.f23507c = cVar;
        this.f23508d = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10672a)) {
            return false;
        }
        C10672a aVar = (C10672a) obj;
        return C19383o.m32792b(this.f23505a, aVar.f23505a) && C19383o.m32792b(this.f23506b, aVar.f23506b) && C19383o.m32792b(this.f23507c, aVar.f23507c) && C19383o.m32792b(this.f23508d, aVar.f23508d);
    }

    public final int hashCode() {
        int hashCode = this.f23506b.hashCode();
        int hashCode2 = this.f23507c.hashCode();
        return this.f23508d.hashCode() + ((hashCode2 + ((hashCode + (this.f23505a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ListingImagesDependencies(boeActivity=");
        h.append(this.f23505a);
        h.append(", fileSupport=");
        h.append(this.f23506b);
        h.append(", configMap=");
        h.append(this.f23507c);
        h.append(", eligibility=");
        h.append(this.f23508d);
        h.append(')');
        return h.toString();
    }
}
