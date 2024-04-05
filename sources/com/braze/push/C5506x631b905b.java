package com.braze.push;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.push.BrazeNotificationStyleFactory$Companion$getBigPictureNotificationStyle$1 */
final class C5506x631b905b extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $imageUrl;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5506x631b905b(String str) {
        super(0);
        this.$imageUrl = str;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$imageUrl, "Failed to download image bitmap for big picture notification style. Url: ");
    }
}
