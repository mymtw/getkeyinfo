package com.etsy.android.p327ui.user.inappnotifications;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotification;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.user.inappnotifications.UpdatesGroup */
public final class UpdatesGroup {

    /* renamed from: a */
    public final String f25527a;

    /* renamed from: b */
    public final List<InAppNotification> f25528b;

    public UpdatesGroup(@C17402n(name = "heading") String str, @C17402n(name = "notifications") List<? extends InAppNotification> list) {
        C19383o.m32797g(list, "notifications");
        this.f25527a = str;
        this.f25528b = list;
    }

    public final UpdatesGroup copy(@C17402n(name = "heading") String str, @C17402n(name = "notifications") List<? extends InAppNotification> list) {
        C19383o.m32797g(list, "notifications");
        return new UpdatesGroup(str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdatesGroup)) {
            return false;
        }
        UpdatesGroup updatesGroup = (UpdatesGroup) obj;
        return C19383o.m32792b(this.f25527a, updatesGroup.f25527a) && C19383o.m32792b(this.f25528b, updatesGroup.f25528b);
    }

    public final int hashCode() {
        String str = this.f25527a;
        return this.f25528b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("UpdatesGroup(heading=");
        h.append(this.f25527a);
        h.append(", notifications=");
        return C0070b.m186i(h, this.f25528b, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UpdatesGroup(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, list);
    }
}
