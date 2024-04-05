package com.braze.push;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.push.BrazeFirebaseMessagingService$Companion$handleBrazeRemoteMessage$3 */
public final class C5504xe25b0a04 extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $key;
    public final /* synthetic */ String $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5504xe25b0a04(String str, String str2) {
        super(0);
        this.$key = str;
        this.$value = str2;
    }

    public final String invoke() {
        StringBuilder h = C0072d.m201h("Adding bundle item from FCM remote data with key: ");
        h.append(this.$key);
        h.append(" and value: ");
        h.append(this.$value);
        return h.toString();
    }
}
