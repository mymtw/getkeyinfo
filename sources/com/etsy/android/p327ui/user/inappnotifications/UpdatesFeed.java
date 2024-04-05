package com.etsy.android.p327ui.user.inappnotifications;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.user.inappnotifications.UpdatesFeed */
public final class UpdatesFeed {

    /* renamed from: a */
    public final String f25525a;

    /* renamed from: b */
    public final List<UpdatesGroup> f25526b;

    public UpdatesFeed(@C17402n(name = "notification_feed_id") String str, @C17402n(name = "groups") List<UpdatesGroup> list) {
        C19383o.m32797g(str, "feedId");
        C19383o.m32797g(list, "groups");
        this.f25525a = str;
        this.f25526b = list;
    }

    public final UpdatesFeed copy(@C17402n(name = "notification_feed_id") String str, @C17402n(name = "groups") List<UpdatesGroup> list) {
        C19383o.m32797g(str, "feedId");
        C19383o.m32797g(list, "groups");
        return new UpdatesFeed(str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdatesFeed)) {
            return false;
        }
        UpdatesFeed updatesFeed = (UpdatesFeed) obj;
        return C19383o.m32792b(this.f25525a, updatesFeed.f25525a) && C19383o.m32792b(this.f25526b, updatesFeed.f25526b);
    }

    public final int hashCode() {
        return this.f25526b.hashCode() + (this.f25525a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("UpdatesFeed(feedId=");
        h.append(this.f25525a);
        h.append(", groups=");
        return C0070b.m186i(h, this.f25526b, ')');
    }
}
