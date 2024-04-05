package com.braze.p044ui.inappmessage.utils;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithBitmapDownload$4 */
final class C5683x2a03dedf extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $remoteImageUrl;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5683x2a03dedf(String str) {
        super(0);
        this.$remoteImageUrl = str;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$remoteImageUrl, "In-app message has remote image url. Downloading image at url: ");
    }
}
