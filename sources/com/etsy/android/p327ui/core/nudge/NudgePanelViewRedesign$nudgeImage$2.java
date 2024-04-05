package com.etsy.android.p327ui.core.nudge;

import android.widget.ImageView;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.core.nudge.NudgePanelViewRedesign$nudgeImage$2 */
public final class NudgePanelViewRedesign$nudgeImage$2 extends Lambda implements C19846a<ImageView> {
    public final /* synthetic */ NudgePanelViewRedesign this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NudgePanelViewRedesign$nudgeImage$2(NudgePanelViewRedesign nudgePanelViewRedesign) {
        super(0);
        this.this$0 = nudgePanelViewRedesign;
    }

    public final ImageView invoke() {
        return (ImageView) this.this$0.findViewById(R.id.nudge_image);
    }
}
