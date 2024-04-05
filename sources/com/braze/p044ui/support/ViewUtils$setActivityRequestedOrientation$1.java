package com.braze.p044ui.support;

import android.app.Activity;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.support.ViewUtils$setActivityRequestedOrientation$1 */
public final class ViewUtils$setActivityRequestedOrientation$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ int $requestedOrientation;
    public final /* synthetic */ Activity $this_setActivityRequestedOrientation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewUtils$setActivityRequestedOrientation$1(int i, Activity activity) {
        super(0);
        this.$requestedOrientation = i;
        this.$this_setActivityRequestedOrientation = activity;
    }

    public final String invoke() {
        StringBuilder h = C0072d.m201h("Failed to set requested orientation ");
        h.append(this.$requestedOrientation);
        h.append(" for activity class: ");
        h.append(this.$this_setActivityRequestedOrientation.getLocalClassName());
        return h.toString();
    }
}
