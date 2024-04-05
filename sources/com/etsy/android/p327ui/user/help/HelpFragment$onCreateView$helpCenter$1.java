package com.etsy.android.p327ui.user.help;

import android.view.View;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.HelpCenterKey;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p356ge.C12788a;

/* renamed from: com.etsy.android.ui.user.help.HelpFragment$onCreateView$helpCenter$1 */
public final class HelpFragment$onCreateView$helpCenter$1 extends TrackingOnClickListener {
    public final /* synthetic */ HelpFragment this$0;

    public HelpFragment$onCreateView$helpCenter$1(HelpFragment helpFragment) {
        this.this$0 = helpFragment;
    }

    public void onViewClick(View view) {
        C19383o.m32797g(view, "v");
        this.this$0.getAnalyticsContext().mo21333d("help_in_app_help_center_tapped", (Map<? extends AnalyticsProperty, Object>) null);
        C12788a.m20424c(this.this$0.getActivity(), new HelpCenterKey(C19421p.m32935c0(this.this$0.getActivity())));
    }
}
