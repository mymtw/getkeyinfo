package com.braze.p044ui.inappmessage.utils;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithZippedAssetHtml$1 */
final class C5686xc279f322 extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $localAssets;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5686xc279f322(String str) {
        super(0);
        this.$localAssets = str;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$localAssets, "Local assets for html in-app message are already populated. Not downloading assets. Location = ");
    }
}
