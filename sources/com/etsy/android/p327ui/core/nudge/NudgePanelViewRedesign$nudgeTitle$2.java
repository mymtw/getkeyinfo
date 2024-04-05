package com.etsy.android.p327ui.core.nudge;

import android.widget.TextView;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.core.nudge.NudgePanelViewRedesign$nudgeTitle$2 */
public final class NudgePanelViewRedesign$nudgeTitle$2 extends Lambda implements C19846a<TextView> {
    public final /* synthetic */ NudgePanelViewRedesign this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NudgePanelViewRedesign$nudgeTitle$2(NudgePanelViewRedesign nudgePanelViewRedesign) {
        super(0);
        this.this$0 = nudgePanelViewRedesign;
    }

    public final TextView invoke() {
        return (TextView) this.this$0.findViewById(R.id.nudge_title);
    }
}
