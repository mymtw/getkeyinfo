package com.etsy.android.lib.models.apiv3.inappnotifications;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class InAppNotificationFirst extends InAppNotification {
    public static final int $stable = 8;
    private boolean isRead;
    private String subtext;
    private String text;

    public InAppNotificationFirst(@C17402n(name = "notification_text") String str, @C17402n(name = "notification_subtext") String str2, @C17402n(name = "read") boolean z) {
        super(InAppNotificationType.FIRST);
        this.text = str;
        this.subtext = str2;
        this.isRead = z;
    }

    public static /* synthetic */ InAppNotificationFirst copy$default(InAppNotificationFirst inAppNotificationFirst, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inAppNotificationFirst.text;
        }
        if ((i & 2) != 0) {
            str2 = inAppNotificationFirst.subtext;
        }
        if ((i & 4) != 0) {
            z = inAppNotificationFirst.isRead;
        }
        return inAppNotificationFirst.copy(str, str2, z);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.subtext;
    }

    public final boolean component3() {
        return this.isRead;
    }

    public final InAppNotificationFirst copy(@C17402n(name = "notification_text") String str, @C17402n(name = "notification_subtext") String str2, @C17402n(name = "read") boolean z) {
        return new InAppNotificationFirst(str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppNotificationFirst)) {
            return false;
        }
        InAppNotificationFirst inAppNotificationFirst = (InAppNotificationFirst) obj;
        return C19383o.m32792b(this.text, inAppNotificationFirst.text) && C19383o.m32792b(this.subtext, inAppNotificationFirst.subtext) && this.isRead == inAppNotificationFirst.isRead;
    }

    public final String getSubtext() {
        return this.subtext;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtext;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.isRead;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final boolean isRead() {
        return this.isRead;
    }

    public final void setRead(boolean z) {
        this.isRead = z;
    }

    public final void setSubtext(String str) {
        this.subtext = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("InAppNotificationFirst(text=");
        h.append(this.text);
        h.append(", subtext=");
        h.append(this.subtext);
        h.append(", isRead=");
        return C0391c.m1058d(h, this.isRead, ')');
    }
}
