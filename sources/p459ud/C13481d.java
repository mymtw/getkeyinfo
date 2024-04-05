package p459ud;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.sdl.ListSection;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import kotlin.jvm.internal.C19383o;
import p498zc.C13949d;

/* renamed from: ud.d */
public final class C13481d extends C10423j implements C13949d {

    /* renamed from: a */
    public final ListSection f29503a;

    public C13481d(ListSection listSection) {
        C19383o.m32797g(listSection, "section");
        this.f29503a = listSection;
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.RECOMMENDATIONS_SDL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13481d) && C19383o.m32792b(this.f29503a, ((C13481d) obj).f29503a);
    }

    public final int hashCode() {
        return this.f29503a.hashCode();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("RecommendationsSdl(section=");
        h.append(this.f29503a);
        h.append(')');
        return h.toString();
    }
}
