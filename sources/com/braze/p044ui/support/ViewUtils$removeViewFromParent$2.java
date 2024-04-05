package com.braze.p044ui.support;

import android.support.p013v4.media.C0072d;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.support.ViewUtils$removeViewFromParent$2 */
public final class ViewUtils$removeViewFromParent$2 extends Lambda implements C19846a<String> {
    public final /* synthetic */ ViewGroup $parent;
    public final /* synthetic */ View $this_removeViewFromParent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewUtils$removeViewFromParent$2(View view, ViewGroup viewGroup) {
        super(0);
        this.$this_removeViewFromParent = view;
        this.$parent = viewGroup;
    }

    public final String invoke() {
        StringBuilder h = C0072d.m201h("Removed view: ");
        h.append(this.$this_removeViewFromParent);
        h.append("\nfrom parent: ");
        h.append(this.$parent);
        return h.toString();
    }
}
