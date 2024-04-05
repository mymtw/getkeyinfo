package com.etsy.android.p327ui.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.models.apiv3.Collection;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.core.CollectionFragment$broadcastReceiver$1 */
public final class CollectionFragment$broadcastReceiver$1 extends BroadcastReceiver {
    public final /* synthetic */ CollectionFragment this$0;

    public CollectionFragment$broadcastReceiver$1(CollectionFragment collectionFragment) {
        this.this$0 = collectionFragment;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        EtsyAction etsyAction = EtsyAction.COLLECTION_EDITED;
        if (C19383o.m32792b(action, etsyAction.getIntentAction()) || C19383o.m32792b(action, EtsyAction.COLLECTION_DELETED.getIntentAction())) {
            Collection access$findCollection = this.this$0.findCollection(Integer.valueOf(intent.getIntExtra("transaction-data", -1)));
            if (!C19383o.m32792b(this.this$0.collection, access$findCollection)) {
                return;
            }
            if (C19383o.m32792b(action, EtsyAction.COLLECTION_DELETED.getIntentAction())) {
                this.this$0.handleCollectionDeleted();
            } else if (C19383o.m32792b(action, etsyAction.getIntentAction())) {
                this.this$0.handleCollectionEdited(access$findCollection);
            }
        }
    }
}
