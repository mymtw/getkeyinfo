package com.etsy.android.p327ui.favorites;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.etsy.android.lib.deeplinks.EtsyAction;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.FavoritesTabFragment$broadcastReceiver$1 */
public final class FavoritesTabFragment$broadcastReceiver$1 extends BroadcastReceiver {
    public final /* synthetic */ FavoritesTabFragment this$0;

    public FavoritesTabFragment$broadcastReceiver$1(FavoritesTabFragment favoritesTabFragment) {
        this.this$0 = favoritesTabFragment;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (C19383o.m32792b(action, EtsyAction.COLLECTION_EDITED.getIntentAction()) || C19383o.m32792b(action, EtsyAction.COLLECTION_DELETED.getIntentAction())) {
            this.this$0.needsRefresh = true;
        }
    }
}
