package com.etsy.android.lib.toolbar;

import android.app.Activity;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import androidx.compose.animation.C0388a;
import com.etsy.android.R;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.lib.util.NotificationType;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import kotlin.jvm.internal.C19383o;
import p250u0.C8099l;
import p250u0.C8100m;
import p409o9.C13138q;

/* renamed from: com.etsy.android.lib.toolbar.a */
public final class C8860a {

    /* renamed from: m */
    public static final int f19556m = NotificationType.ADMIN_TOOLBAR.getId();

    /* renamed from: n */
    public static WeakReference<Activity> f19557n;

    /* renamed from: o */
    public static C8860a f19558o;

    /* renamed from: p */
    public static Application.ActivityLifecycleCallbacks f19559p;

    /* renamed from: a */
    public final Context f19560a;

    /* renamed from: b */
    public final String f19561b;

    /* renamed from: c */
    public final boolean f19562c;

    /* renamed from: d */
    public final SharedPreferences f19563d;

    /* renamed from: e */
    public String f19564e = "";

    /* renamed from: f */
    public String f19565f = "";

    /* renamed from: g */
    public String f19566g = "";

    /* renamed from: h */
    public String f19567h = "";

    /* renamed from: i */
    public final ArrayDeque<String> f19568i;

    /* renamed from: j */
    public final HashSet<String> f19569j;

    /* renamed from: k */
    public final ArrayDeque<AdminToolbarNetworkResponse> f19570k;

    /* renamed from: l */
    public final ArrayDeque<String> f19571l;

    /* renamed from: com.etsy.android.lib.toolbar.a$a */
    public static final class C8861a {
        /* renamed from: a */
        public static boolean m17264a() {
            C8860a aVar = C8860a.f19558o;
            if (aVar == null || !aVar.f19562c) {
                return false;
            }
            C19383o.m32794d(aVar);
            return aVar.f19563d.getBoolean(aVar.f19560a.getString(R.string.config_prefs_admin_toolbar), false) && !EtsyApplication.get().isAppInBackground();
        }
    }

    public C8860a(Context context, boolean z) {
        this.f19560a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getString(R.string.config_preferences_file_name), 0);
        C19383o.m32796f(sharedPreferences, "context.getSharedPrefere…xt.MODE_PRIVATE\n        )");
        this.f19563d = sharedPreferences;
        this.f19568i = new ArrayDeque<>();
        this.f19569j = new HashSet<>();
        this.f19570k = new ArrayDeque<>();
        this.f19571l = new ArrayDeque<>();
        this.f19562c = z;
        StringBuilder sb = new StringBuilder();
        C13138q.m20808a();
        sb.append("EtsyInc");
        sb.append(context.getString(R.string.admin_toolbar));
        this.f19561b = sb.toString();
    }

    /* renamed from: a */
    public static final void m17262a(C8860a aVar) {
        Object systemService = aVar.f19560a.getSystemService("notification");
        C19383o.m32795e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        C8100m mVar = new C8100m(aVar.f19560a, (String) null);
        C13138q.m20808a();
        mVar.f17655C.icon = R.drawable.ic_stat_ic_notification;
        C8860a aVar2 = f19558o;
        mVar.mo20691e(aVar2 != null ? aVar2.f19561b : "");
        NotificationChannel notificationChannel = new NotificationChannel("AdminToolbar", "AdminToolbar", 3);
        notificationChannel.setSound((Uri) null, (AudioAttributes) null);
        notificationManager.createNotificationChannel(notificationChannel);
        mVar.f17682z = "AdminToolbar";
        C8099l lVar = new C8099l();
        StringBuilder sb = new StringBuilder(C0388a.m1049e(new Object[]{aVar.f19564e, aVar.f19565f}, 2, "<b>Fragment:</b> %s<br/><b>Activity:</b> %s", "format(format, *args)"));
        if (aVar.f19568i.size() > 0) {
            String format = String.format("<br/><b>%s</b>", Arrays.copyOf(new Object[]{aVar.f19568i.peekLast()}, 1));
            C19383o.m32796f(format, "format(format, *args)");
            sb.append(format);
        }
        if (C8885d0.m17324h(aVar.f19567h)) {
            String format2 = String.format("<br/><b>%s:</b> %s", Arrays.copyOf(new Object[]{"AB", aVar.f19567h}, 2));
            C19383o.m32796f(format2, "format(format, *args)");
            sb.append(format2);
        }
        if (aVar.f19571l.size() > 0) {
            String format3 = String.format("<br/><b>%s:</b> %s", Arrays.copyOf(new Object[]{"Request", aVar.f19571l.peekLast()}, 2));
            C19383o.m32796f(format3, "format(format, *args)");
            sb.append(format3);
        }
        Spanned fromHtml = Html.fromHtml(sb.toString());
        C19383o.m32796f(fromHtml, "fromHtml(builder.toString())");
        lVar.mo20687h(fromHtml);
        mVar.mo20696j(lVar);
        mVar.f17663g = PendingIntent.getActivity(aVar.f19560a, 0, new Intent(aVar.f19560a, AdminToolbarActivity.class), 67108864);
        if (f19557n != null) {
            mVar.mo20688a(R.drawable.clg_icon_core_send_v1, aVar.f19560a.getString(R.string.admin_toolbar_recreate_action), PendingIntent.getBroadcast(aVar.f19560a, 0, new Intent(aVar.f19560a, RecreateReceiver.class), 67108864));
        }
        Notification b = mVar.mo20689b();
        C19383o.m32796f(b, "builder.build()");
        notificationManager.notify(f19556m, b);
    }

    /* renamed from: b */
    public static final void m17263b(String str) {
        C19383o.m32797g(str, "event");
        if (C8861a.m17264a()) {
            C8860a aVar = f19558o;
            C19383o.m32794d(aVar);
            aVar.f19568i.add(str);
            while (aVar.f19568i.size() > 5) {
                aVar.f19568i.remove();
            }
            C8860a aVar2 = f19558o;
            C19383o.m32794d(aVar2);
            m17262a(aVar2);
        }
    }
}
