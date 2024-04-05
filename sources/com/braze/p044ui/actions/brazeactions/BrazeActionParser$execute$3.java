package com.braze.p044ui.actions.brazeactions;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.Lambda;
import p003a2.C0023f;
import p753kq.C19846a;

/* renamed from: com.braze.ui.actions.brazeactions.BrazeActionParser$execute$3 */
public final class BrazeActionParser$execute$3 extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $version;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeActionParser$execute$3(String str) {
        super(0);
        this.$version = str;
    }

    public final String invoke() {
        return C0023f.m110k(C0072d.m201h("Braze Actions version "), this.$version, " is unsupported. Version must be v1");
    }
}
