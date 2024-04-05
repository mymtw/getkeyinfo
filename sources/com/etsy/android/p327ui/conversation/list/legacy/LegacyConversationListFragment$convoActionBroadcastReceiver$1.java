package com.etsy.android.p327ui.conversation.list.legacy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.etsy.android.ui.conversation.list.legacy.LegacyConversationListFragment$convoActionBroadcastReceiver$1 */
public final class LegacyConversationListFragment$convoActionBroadcastReceiver$1 extends BroadcastReceiver {
    public final /* synthetic */ LegacyConversationListFragment this$0;

    public LegacyConversationListFragment$convoActionBroadcastReceiver$1(LegacyConversationListFragment legacyConversationListFragment) {
        this.this$0 = legacyConversationListFragment;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -1377868613) {
                if (hashCode != 877554830 || !action.equals("com.etsy.android.convos.NEEDS_REFRESH")) {
                    return;
                }
            } else if (!action.equals("com.etsy.android.convos.MESSAGE_SENT")) {
                return;
            }
            this.this$0.needsRefresh = true;
        }
    }
}
