package com.braze.push;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.push.BrazeNotificationUtils$handleContentCardsSerializedCardIfPresent$1 */
final class C5515x1d5bbd6b extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $contentCardData;
    public final /* synthetic */ String $contentCardDataUserId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5515x1d5bbd6b(String str, String str2) {
        super(0);
        this.$contentCardDataUserId = str;
        this.$contentCardData = str2;
    }

    public final String invoke() {
        StringBuilder h = C0072d.m201h("Push contains associated Content Cards card. User id: ");
        h.append(this.$contentCardDataUserId);
        h.append(" Card data: ");
        h.append(this.$contentCardData);
        return h.toString();
    }
}
