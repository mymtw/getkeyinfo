package com.etsy.android.p327ui.conversation.details;

import android.view.View;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p354gc.C12774h;

/* renamed from: com.etsy.android.ui.conversation.details.MessageViewHolder$bind$2$1 */
public final class MessageViewHolder$bind$2$1 extends TrackingOnClickListener {
    public final /* synthetic */ List<C12774h> $images;
    public final /* synthetic */ int $index;
    public final /* synthetic */ MessageViewHolder this$0;

    public MessageViewHolder$bind$2$1(MessageViewHolder messageViewHolder, int i, List<C12774h> list) {
        this.this$0 = messageViewHolder;
        this.$index = i;
        this.$images = list;
    }

    public void onViewClick(View view) {
        C19383o.m32797g(view, "view");
        this.this$0.f20976b.mo31994a(this.$index, this.$images);
    }
}
