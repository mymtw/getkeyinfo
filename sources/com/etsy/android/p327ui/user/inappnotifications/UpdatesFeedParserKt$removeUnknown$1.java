package com.etsy.android.p327ui.user.inappnotifications;

import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotification;
import com.etsy.android.lib.models.apiv3.inappnotifications.UnknownInAppNotification;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.UpdatesFeedParserKt$removeUnknown$1 */
final class UpdatesFeedParserKt$removeUnknown$1 extends Lambda implements C19857l<InAppNotification, Boolean> {
    public static final UpdatesFeedParserKt$removeUnknown$1 INSTANCE = new UpdatesFeedParserKt$removeUnknown$1();

    public UpdatesFeedParserKt$removeUnknown$1() {
        super(1);
    }

    public final Boolean invoke(InAppNotification inAppNotification) {
        C19383o.m32797g(inAppNotification, "it");
        return Boolean.valueOf(inAppNotification instanceof UnknownInAppNotification);
    }
}
