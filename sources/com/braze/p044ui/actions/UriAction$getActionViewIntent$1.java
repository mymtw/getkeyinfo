package com.braze.p044ui.actions;

import android.content.pm.ResolveInfo;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.lang3.ClassUtils;
import p753kq.C19846a;

/* renamed from: com.braze.ui.actions.UriAction$getActionViewIntent$1 */
public final class UriAction$getActionViewIntent$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ ResolveInfo $resolveInfo;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UriAction$getActionViewIntent$1(ResolveInfo resolveInfo) {
        super(0);
        this.$resolveInfo = resolveInfo;
    }

    public final String invoke() {
        StringBuilder h = C0072d.m201h("Setting deep link intent package to ");
        h.append(this.$resolveInfo.activityInfo.packageName);
        h.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
        return h.toString();
    }
}
