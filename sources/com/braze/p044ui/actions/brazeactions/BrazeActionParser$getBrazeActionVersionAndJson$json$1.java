package com.braze.p044ui.actions.brazeactions;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.actions.brazeactions.BrazeActionParser$getBrazeActionVersionAndJson$json$1 */
public final class BrazeActionParser$getBrazeActionVersionAndJson$json$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $encodedAction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeActionParser$getBrazeActionVersionAndJson$json$1(String str) {
        super(0);
        this.$encodedAction = str;
    }

    public final String invoke() {
        StringBuilder h = C0072d.m201h("Failed to decode action into json. Action:\n'");
        h.append(this.$encodedAction);
        h.append('\'');
        return h.toString();
    }
}
