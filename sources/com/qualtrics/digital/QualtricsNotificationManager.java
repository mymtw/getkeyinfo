package com.qualtrics.digital;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.NotificationManagerCompat;
import com.etsy.android.R;
import java.util.UUID;
import p250u0.C8100m;

public final class QualtricsNotificationManager extends BroadcastReceiver {
    private static final String CHANNEL_ID = "qualtrics_notification_channel";

    public static void createChannel(Context context) {
        String string = context.getResources().getString(R.string.qualtrics_channel_name);
        String string2 = context.getResources().getString(R.string.qualtrics_channel_description);
        NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, string, 3);
        notificationChannel.setDescription(string2);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
    }

    private static void display(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        String uuid = UUID.randomUUID().toString();
        if (C17314t.f37839b == null) {
            C17314t.f37839b = new C17314t(context);
        }
        SharedPreferences a = C17314t.f37839b.mo68223a();
        int i = a == null ? 0 : a.getInt("notificationIcon", 0);
        if (i == 0) {
            i = R.drawable.default_notification_icon;
        }
        PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent(context, QualtricsSurveyActivity.class).putExtra("targetURL", str3).putExtra("interceptID", str4).putExtra("creativeID", str5).putExtra("actionSetID", str6).setData(Uri.parse(uuid)).setFlags(874512384), 0);
        C8100m mVar = new C8100m(context, CHANNEL_ID);
        mVar.f17655C.icon = i;
        mVar.mo20691e(str);
        mVar.mo20690d(str2);
        mVar.f17666j = 0;
        mVar.f17673q = uuid;
        mVar.mo20693g(16, true);
        if (str3 != null) {
            mVar.f17663g = activity;
        }
        NotificationManagerCompat.from(context).notify(uuid, 0, mVar.mo20689b());
    }

    public static void schedule(Context context, C17311q qVar, String str, String str2, String str3, String str4) {
        throw null;
    }

    public void onReceive(Context context, Intent intent) {
        try {
            Bundle extras = intent.getExtras();
            display(context, extras.getString("title"), extras.getString("description"), extras.getString("targetURL"), extras.getString("interceptID"), extras.getString("creativeID"), extras.getString("actionSetID"));
        } catch (Throwable th) {
            C17318x.m29067a().mo68224c(th);
        }
    }
}
