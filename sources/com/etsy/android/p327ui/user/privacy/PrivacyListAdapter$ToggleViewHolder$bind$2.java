package com.etsy.android.p327ui.user.privacy;

import android.view.View;
import com.etsy.android.p327ui.user.privacy.C11618a;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p418pa.C13207f;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.user.privacy.PrivacyListAdapter$ToggleViewHolder$bind$2 */
final class PrivacyListAdapter$ToggleViewHolder$bind$2 extends Lambda implements C19861p<View, Boolean, C19394m> {
    public final /* synthetic */ C19861p<String, Boolean, C19394m> $callback;
    public final /* synthetic */ C13207f $item;
    public final /* synthetic */ C11618a.C11621c this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PrivacyListAdapter$ToggleViewHolder$bind$2(C19861p<? super String, ? super Boolean, C19394m> pVar, C13207f fVar, C11618a.C11621c cVar) {
        super(2);
        this.$callback = pVar;
        this.$item = fVar;
        this.this$0 = cVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((View) obj, ((Boolean) obj2).booleanValue());
        return C19394m.f43287a;
    }

    public final void invoke(View view, boolean z) {
        C19383o.m32797g(view, "<anonymous parameter 0>");
        this.$callback.invoke(((C13207f.C13210c) this.$item).f29045a, Boolean.valueOf(z));
        this.this$0.f25723b.setEnabled(false);
    }
}
