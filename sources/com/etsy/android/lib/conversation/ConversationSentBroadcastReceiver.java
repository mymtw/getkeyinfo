package com.etsy.android.lib.conversation;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.R;

public class ConversationSentBroadcastReceiver extends BroadcastReceiver {
    public void messageError(Context context, String str, String str2) {
        C0761x.m1676K0(context, context.getString(R.string.convo_failed_notifiction_msg), context.getString(R.string.convo_failed_notifiction_msg), context.getString(R.string.convo_failed_notification_msg_text, new Object[]{str2}), false);
    }

    public void messageSending(Context context, String str, long j) {
        C0761x.m1676K0(context, context.getString(R.string.convo_sending_notification_msg), context.getString(R.string.convo_sending_notification_msg), context.getString(R.string.convo_sending_notification_msg_text, new Object[]{str}), true);
    }

    public void messageSent(Context context, String str, long j) {
        ((NotificationManager) context.getSystemService("notification")).cancel(-22);
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                return;
            }
            if ("com.etsy.android.convos.MESSAGE_SENT".equals(action)) {
                messageSent(context, intent.getStringExtra("message_addressee"), intent.getLongExtra("convo_id", 0));
            } else if ("com.etsy.android.convos.MESSAGE_SENDING".equals(action)) {
                messageSending(context, intent.getStringExtra("message_addressee"), intent.getLongExtra("convo_id", 0));
            } else if ("com.etsy.android.convos.MESSAGE_FAILED_TO_SEND".equals(action)) {
                messageError(context, intent.getStringExtra("error"), intent.getStringExtra("message_addressee"));
            }
        }
    }
}
