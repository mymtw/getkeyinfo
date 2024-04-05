package com.braze.p044ui.inappmessage.utils;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$handleLocalImage$1 */
final class BackgroundInAppMessagePreparer$handleLocalImage$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $localImageUrl;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackgroundInAppMessagePreparer$handleLocalImage$1(String str) {
        super(0);
        this.$localImageUrl = str;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$localImageUrl, "Passing in-app message local image url to image loader: ");
    }
}
