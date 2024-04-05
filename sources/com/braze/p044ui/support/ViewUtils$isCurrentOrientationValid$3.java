package com.braze.p044ui.support;

import android.support.p013v4.media.C0072d;
import com.braze.enums.inappmessage.Orientation;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.support.ViewUtils$isCurrentOrientationValid$3 */
public final class ViewUtils$isCurrentOrientationValid$3 extends Lambda implements C19846a<String> {
    public final /* synthetic */ int $currentScreenOrientation;
    public final /* synthetic */ Orientation $preferredOrientation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewUtils$isCurrentOrientationValid$3(int i, Orientation orientation) {
        super(0);
        this.$currentScreenOrientation = i;
        this.$preferredOrientation = orientation;
    }

    public final String invoke() {
        StringBuilder h = C0072d.m201h("Current orientation ");
        h.append(this.$currentScreenOrientation);
        h.append(" and preferred orientation ");
        h.append(this.$preferredOrientation);
        h.append(" don't match");
        return h.toString();
    }
}
