package com.etsy.android.p327ui.core.listinggallery;

import com.etsy.android.p327ui.core.listinggallery.C9643b;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.core.listinggallery.VideoViewHolder$bind$2$2 */
public final class VideoViewHolder$bind$2$2 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ VideoViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoViewHolder$bind$2$2(VideoViewHolder videoViewHolder) {
        super(0);
        this.this$0 = videoViewHolder;
    }

    public final void invoke() {
        C9643b.C9644a aVar = this.this$0.f21347c;
        if (aVar != null) {
            aVar.onDragStarted();
        }
    }
}
