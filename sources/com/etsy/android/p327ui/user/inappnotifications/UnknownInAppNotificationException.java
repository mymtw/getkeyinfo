package com.etsy.android.p327ui.user.inappnotifications;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.appboy.Constants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.etsy.android.ui.user.inappnotifications.UnknownInAppNotificationException */
public final class UnknownInAppNotificationException extends RuntimeException {
    public static final int $stable = 0;
    private final String extra;

    public UnknownInAppNotificationException() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UnknownInAppNotificationException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    public static /* synthetic */ UnknownInAppNotificationException copy$default(UnknownInAppNotificationException unknownInAppNotificationException, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unknownInAppNotificationException.extra;
        }
        return unknownInAppNotificationException.copy(str);
    }

    public final String component1() {
        return this.extra;
    }

    public final UnknownInAppNotificationException copy(String str) {
        C19383o.m32797g(str, Constants.APPBOY_PUSH_EXTRAS_KEY);
        return new UnknownInAppNotificationException(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UnknownInAppNotificationException) && C19383o.m32792b(this.extra, ((UnknownInAppNotificationException) obj).extra);
    }

    public final String getExtra() {
        return this.extra;
    }

    public int hashCode() {
        return this.extra.hashCode();
    }

    public String toString() {
        return C0391c.m1057c(C0072d.m201h("UnknownInAppNotificationException(extra="), this.extra, ')');
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UnknownInAppNotificationException(String str) {
        super("Unexpected In App Notification " + str);
        C19383o.m32797g(str, Constants.APPBOY_PUSH_EXTRAS_KEY);
        this.extra = str;
    }
}
