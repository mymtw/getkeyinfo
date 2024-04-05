package com.braze.p044ui.inappmessage.utils;

import android.support.p013v4.media.C0072d;
import com.braze.models.inappmessage.C5488f;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageWithZippedAssetHtml$5 */
final class C5690xc279f326 extends Lambda implements C19846a<String> {
    public final /* synthetic */ C5488f $inAppMessageHtml;
    public final /* synthetic */ String $localWebContentUrl;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5690xc279f326(C5488f fVar, String str) {
        super(0);
        this.$inAppMessageHtml = fVar;
        this.$localWebContentUrl = str;
    }

    public final String invoke() {
        StringBuilder h = C0072d.m201h("Download of html content to local directory failed for remote url: ");
        h.append(this.$inAppMessageHtml.mo16037V());
        h.append(" . Returned local url is: ");
        h.append(this.$localWebContentUrl);
        return h.toString();
    }
}
