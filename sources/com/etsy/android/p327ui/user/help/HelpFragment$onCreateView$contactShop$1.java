package com.etsy.android.p327ui.user.help;

import android.os.Bundle;
import android.view.View;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.PurchasesKey;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p356ge.C12790b;

/* renamed from: com.etsy.android.ui.user.help.HelpFragment$onCreateView$contactShop$1 */
public final class HelpFragment$onCreateView$contactShop$1 extends TrackingOnClickListener {
    public final /* synthetic */ String $eventName;
    public final /* synthetic */ HelpFragment this$0;

    public HelpFragment$onCreateView$contactShop$1(HelpFragment helpFragment, String str) {
        this.this$0 = helpFragment;
        this.$eventName = str;
    }

    public void onViewClick(View view) {
        C19383o.m32797g(view, "v");
        this.this$0.getAnalyticsContext().mo21333d(this.$eventName, (Map<? extends AnalyticsProperty, Object>) null);
        C12790b.m20430b(this.this$0, new PurchasesKey(C12790b.m20432d(this.this$0), (Bundle) null, false, 6, (DefaultConstructorMarker) null));
    }
}
