package com.braze.p044ui.inappmessage.utils;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithZippedAssetHtml$4 */
final class C5689xc279f325 extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $localWebContentUrl;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5689xc279f325(String str) {
        super(0);
        this.$localWebContentUrl = str;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$localWebContentUrl, "Local url for html in-app message assets is ");
    }
}
