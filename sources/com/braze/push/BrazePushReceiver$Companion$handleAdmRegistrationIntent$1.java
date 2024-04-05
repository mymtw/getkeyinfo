package com.braze.push;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class BrazePushReceiver$Companion$handleAdmRegistrationIntent$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $error;
    public final /* synthetic */ String $errorDescription;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazePushReceiver$Companion$handleAdmRegistrationIntent$1(String str, String str2) {
        super(0);
        this.$error = str;
        this.$errorDescription = str2;
    }

    public final String invoke() {
        StringBuilder h = C0072d.m201h("Error during ADM registration: ");
        h.append(this.$error);
        h.append(" description: ");
        h.append(this.$errorDescription);
        return h.toString();
    }
}
