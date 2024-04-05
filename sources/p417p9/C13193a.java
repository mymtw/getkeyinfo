package p417p9;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.etsy.android.R;
import com.etsy.android.lib.conversation.ConversationSentBroadcastReceiver;
import com.etsy.android.lib.util.C8901g0;

/* renamed from: p9.a */
public final class C13193a extends ConversationSentBroadcastReceiver {
    public final void messageError(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = context.getString(R.string.convo_send_error, new Object[]{str2});
        }
        C8901g0.m17338d(context, str);
    }

    public final void messageSending(Context context, String str, long j) {
    }

    public final void messageSent(Context context, String str, long j) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            str2 = context.getString(R.string.convo_message_sent_to, new Object[]{str});
        } else {
            str2 = context.getString(R.string.convo_message_send_success);
        }
        C8901g0.m17338d(context, str2);
    }

    public final void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        abortBroadcast();
        ((NotificationManager) context.getSystemService("notification")).cancel(-22);
    }
}
