package com.etsy.android.lib.session;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class SessionSettings {

    /* renamed from: a */
    public final List<PrivacySetting> f19542a;

    /* renamed from: b */
    public final List<Feature> f19543b;

    public SessionSettings(@C17402n(name = "privacy") List<PrivacySetting> list, @C17402n(name = "features") List<Feature> list2) {
        C19383o.m32797g(list, "privacySettings");
        this.f19542a = list;
        this.f19543b = list2;
    }

    /* renamed from: a */
    public final boolean mo30401a() {
        boolean z;
        List<Feature> list = this.f19543b;
        T t = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                Feature feature = (Feature) next;
                if (!C19383o.m32792b(feature.f19530a, "customer_centric_messaging") || !feature.f19531b) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    t = next;
                    break;
                }
            }
            t = (Feature) t;
        }
        return t != null;
    }

    public final SessionSettings copy(@C17402n(name = "privacy") List<PrivacySetting> list, @C17402n(name = "features") List<Feature> list2) {
        C19383o.m32797g(list, "privacySettings");
        return new SessionSettings(list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionSettings)) {
            return false;
        }
        SessionSettings sessionSettings = (SessionSettings) obj;
        return C19383o.m32792b(this.f19542a, sessionSettings.f19542a) && C19383o.m32792b(this.f19543b, sessionSettings.f19543b);
    }

    public final int hashCode() {
        int hashCode = this.f19542a.hashCode() * 31;
        List<Feature> list = this.f19543b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SessionSettings(privacySettings=");
        h.append(this.f19542a);
        h.append(", features=");
        return C0070b.m186i(h, this.f19543b, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SessionSettings(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : list2);
    }
}
