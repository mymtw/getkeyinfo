package com.braze.p044ui.support;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.support.UriUtils$isActivityRegisteredInManifest$1 */
public final class UriUtils$isActivityRegisteredInManifest$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $className;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UriUtils$isActivityRegisteredInManifest$1(String str) {
        super(0);
        this.$className = str;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$className, "Could not find activity info for class with name: ");
    }
}
