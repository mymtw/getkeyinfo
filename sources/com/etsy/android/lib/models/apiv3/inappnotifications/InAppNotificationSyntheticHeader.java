package com.etsy.android.lib.models.apiv3.inappnotifications;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class InAppNotificationSyntheticHeader extends InAppNotification {
    public static final int $stable = 0;
    private final boolean isFirstItem;
    private final String text;

    public InAppNotificationSyntheticHeader() {
        this((String) null, false, 3, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InAppNotificationSyntheticHeader(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z);
    }

    public static /* synthetic */ InAppNotificationSyntheticHeader copy$default(InAppNotificationSyntheticHeader inAppNotificationSyntheticHeader, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inAppNotificationSyntheticHeader.text;
        }
        if ((i & 2) != 0) {
            z = inAppNotificationSyntheticHeader.isFirstItem;
        }
        return inAppNotificationSyntheticHeader.copy(str, z);
    }

    public final String component1() {
        return this.text;
    }

    public final boolean component2() {
        return this.isFirstItem;
    }

    public final InAppNotificationSyntheticHeader copy(String str, boolean z) {
        return new InAppNotificationSyntheticHeader(str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppNotificationSyntheticHeader)) {
            return false;
        }
        InAppNotificationSyntheticHeader inAppNotificationSyntheticHeader = (InAppNotificationSyntheticHeader) obj;
        return C19383o.m32792b(this.text, inAppNotificationSyntheticHeader.text) && this.isFirstItem == inAppNotificationSyntheticHeader.isFirstItem;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.isFirstItem;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final boolean isFirstItem() {
        return this.isFirstItem;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("InAppNotificationSyntheticHeader(text=");
        h.append(this.text);
        h.append(", isFirstItem=");
        return C0391c.m1058d(h, this.isFirstItem, ')');
    }

    public InAppNotificationSyntheticHeader(String str, boolean z) {
        super(InAppNotificationType.SYNTHETIC_HEADER);
        this.text = str;
        this.isFirstItem = z;
    }
}
