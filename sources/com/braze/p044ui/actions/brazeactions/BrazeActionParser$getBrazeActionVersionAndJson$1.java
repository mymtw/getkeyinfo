package com.braze.p044ui.actions.brazeactions;

import android.net.Uri;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.actions.brazeactions.BrazeActionParser$getBrazeActionVersionAndJson$1 */
public final class BrazeActionParser$getBrazeActionVersionAndJson$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ Uri $this_getBrazeActionVersionAndJson;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeActionParser$getBrazeActionVersionAndJson$1(Uri uri) {
        super(0);
        this.$this_getBrazeActionVersionAndJson = uri;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$this_getBrazeActionVersionAndJson, "Failed to parse version and encoded action from uri: ");
    }
}
