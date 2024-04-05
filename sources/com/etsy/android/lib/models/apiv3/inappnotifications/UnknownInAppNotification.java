package com.etsy.android.lib.models.apiv3.inappnotifications;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class UnknownInAppNotification extends InAppNotification {
    public static final int $stable = 0;
    private final InAppNotificationType type;

    public UnknownInAppNotification() {
        this((InAppNotificationType) null, 1, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UnknownInAppNotification(InAppNotificationType inAppNotificationType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InAppNotificationType.UNKNOWN : inAppNotificationType);
    }

    public static /* synthetic */ UnknownInAppNotification copy$default(UnknownInAppNotification unknownInAppNotification, InAppNotificationType inAppNotificationType, int i, Object obj) {
        if ((i & 1) != 0) {
            inAppNotificationType = unknownInAppNotification.type;
        }
        return unknownInAppNotification.copy(inAppNotificationType);
    }

    public final InAppNotificationType component1() {
        return this.type;
    }

    public final UnknownInAppNotification copy(InAppNotificationType inAppNotificationType) {
        C19383o.m32797g(inAppNotificationType, "type");
        return new UnknownInAppNotification(inAppNotificationType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UnknownInAppNotification) && this.type == ((UnknownInAppNotification) obj).type;
    }

    public final InAppNotificationType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("UnknownInAppNotification(type=");
        h.append(this.type);
        h.append(')');
        return h.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UnknownInAppNotification(InAppNotificationType inAppNotificationType) {
        super(InAppNotificationType.UNKNOWN);
        C19383o.m32797g(inAppNotificationType, "type");
        this.type = inAppNotificationType;
    }
}
