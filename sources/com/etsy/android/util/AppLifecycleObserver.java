package com.etsy.android.util;

import android.app.NotificationChannel;
import android.content.SharedPreferences;
import androidx.appcompat.widget.C0326j;
import androidx.core.app.NotificationManagerCompat;
import androidx.lifecycle.C2857f;
import androidx.lifecycle.C2887s;
import com.etsy.android.C6487g;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8674c;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.logger.elk.uploading.C8689j;
import com.etsy.android.lib.network.C8725c;
import com.etsy.android.lib.network.Connectivity;
import com.etsy.android.lib.push.settings.NotificationSettings;
import com.etsy.android.lib.util.C8905i;
import com.etsy.android.push.C8940c;
import com.etsy.android.push.C8941d;
import com.etsy.android.search.AutoSuggestVariant;
import com.etsy.android.search.C8971c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.SingleFlatMap;
import p248tp.C8071s;
import p334da.C12633d;
import p402n9.C13094n;
import p425q9.C13260k;
import p425q9.C13267q;
import p463v9.C13544g;
import p628nj.C18263b;

public final class AppLifecycleObserver implements C2857f {

    /* renamed from: h */
    public static boolean f26829h;

    /* renamed from: b */
    public final C8694h f26830b;

    /* renamed from: c */
    public final NotificationSettings f26831c;

    /* renamed from: d */
    public final Connectivity f26832d;

    /* renamed from: e */
    public final C8971c f26833e;

    /* renamed from: f */
    public final C12062s f26834f;

    /* renamed from: g */
    public final AtomicBoolean f26835g = new AtomicBoolean(false);

    public AppLifecycleObserver(C8694h hVar, NotificationSettings notificationSettings, Connectivity connectivity, C8971c cVar, C12062s sVar) {
        C19383o.m32797g(hVar, "logCat");
        C19383o.m32797g(notificationSettings, "notificationSettings");
        C19383o.m32797g(connectivity, "connectivity");
        C19383o.m32797g(cVar, "autoSuggestVariantRepository");
        C19383o.m32797g(sVar, "foregroundBackgroundEventListener");
        this.f26830b = hVar;
        this.f26831c = notificationSettings;
        this.f26832d = connectivity;
        this.f26833e = cVar;
        this.f26834f = sVar;
    }

    public final void onStart(C2887s sVar) {
        C8725c.f19171b.set(false);
        if (this.f26835g.compareAndSet(false, true)) {
            C12062s sVar2 = this.f26834f;
            C8940c cVar = sVar2.f26892c;
            C8674c cVar2 = sVar2.f26890a;
            cVar.getClass();
            C19383o.m32797g(cVar2, "analyticsTracker");
            if (cVar2.mo21332b().mo21132b(C8592b.f18810m0)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(PredefinedAnalyticsProperty.NOTIFICATIONS_ENABLED, Boolean.valueOf(NotificationManagerCompat.from(cVar.f19728a.f19730a).areNotificationsEnabled()));
                for (PredefinedAnalyticsProperty next : cVar.f19729b) {
                    try {
                        C8941d dVar = cVar.f19728a;
                        String predefinedAnalyticsProperty = next.toString();
                        dVar.getClass();
                        C19383o.m32797g(predefinedAnalyticsProperty, "channelId");
                        NotificationChannel notificationChannel = NotificationManagerCompat.from(dVar.f19730a).getNotificationChannel(predefinedAnalyticsProperty);
                        C19383o.m32794d(notificationChannel);
                        linkedHashMap.put(next, Boolean.valueOf(notificationChannel.getImportance() != 0));
                    } catch (Exception unused) {
                        linkedHashMap.put(next, "invalid");
                    }
                }
                cVar2.mo21333d("notification_settings", linkedHashMap);
            }
        }
        this.f26830b.mo21310e("App is foregrounded");
        Connectivity connectivity = this.f26832d;
        synchronized (C13544g.f29622b) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C13544g.f29621a;
            if (scheduledThreadPoolExecutor == null || scheduledThreadPoolExecutor.isShutdown()) {
                C13544g.f29621a = null;
                C13544g.f29621a = new ScheduledThreadPoolExecutor(1);
            }
            if (!C13544g.f29621a.isShutdown()) {
                List<String> list = C8591a.f18700r;
                long e = C18263b.f40056T.f18706f.mo21135e(C8592b.f18842x);
                if (e > 0) {
                    C13544g.f29621a.scheduleWithFixedDelay(new C13544g.C13545a(connectivity), e, e, TimeUnit.MILLISECONDS);
                }
            }
        }
        this.f26831c.mo30233e();
        C12062s sVar3 = this.f26834f;
        sVar3.f26899j = true;
        sVar3.f26890a.mo21333d("became_active", (Map<? extends AnalyticsProperty, Object>) null);
        C13267q qVar = sVar3.f26891b;
        boolean z = sVar3.f26900k;
        if (qVar.f29156b.mo45684a()) {
            qVar.f29155a.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            qVar.f29159e = currentTimeMillis;
            if (!z) {
                qVar.f29158d = currentTimeMillis;
            }
        }
        sVar3.f26900k = true;
        C12633d dVar2 = sVar3.f26893d;
        if (dVar2.f27861b.mo45684a()) {
            dVar2.f27860a.mo45423a();
        }
        C12633d dVar3 = sVar3.f26893d;
        Timer timer = dVar3.f27863d;
        if (timer != null) {
            timer.cancel();
        }
        dVar3.f27863d = null;
        if (dVar3.f27861b.mo45684a()) {
            dVar3.f27863d = new Timer();
            long e2 = dVar3.f27862c.mo21135e(C8592b.f18739J) * 1000;
            Timer timer2 = dVar3.f27863d;
            if (timer2 != null) {
                timer2.scheduleAtFixedRate(new C12633d.C12634a(dVar3.f27860a), e2, e2);
            }
        }
        C8689j jVar = sVar3.f26897h;
        if (jVar.f19088b.mo45684a() && jVar.f19088b.f28485a.f18706f.mo21132b(C8592b.f18767X)) {
            jVar.f19087a.mo21344a();
        }
        C8689j jVar2 = sVar3.f26897h;
        if (jVar2.f19088b.mo45684a() && jVar2.f19088b.f28485a.f18706f.mo21132b(C8592b.f18767X)) {
            Timer timer3 = jVar2.f19090d;
            if (timer3 != null) {
                timer3.cancel();
            }
            jVar2.f19090d = null;
            if (jVar2.f19088b.mo45684a()) {
                jVar2.f19090d = new Timer();
                long e3 = jVar2.f19089c.mo21135e(C8592b.f18739J) * 1000;
                Timer timer4 = jVar2.f19090d;
                if (timer4 != null) {
                    timer4.scheduleAtFixedRate(new C8689j.C8690a(jVar2.f19087a), e3, e3);
                }
            }
        }
        if (!f26829h) {
            f26829h = true;
            C8971c cVar3 = this.f26833e;
            C8071s<AutoSuggestVariant> a = cVar3.f19789a.mo30607a();
            C13260k kVar = new C13260k(4);
            a.getClass();
            new SingleFlatMap(C0326j.m860e(cVar3.f19790b, new C19208j(a, kVar)), new C13094n(cVar3, 2)).mo20658g(new C6487g(cVar3, 3), new C8905i(cVar3.f19791c, 1));
        }
    }

    public final void onStop(C2887s sVar) {
        C12062s sVar2 = this.f26834f;
        sVar2.f26899j = false;
        sVar2.f26890a.mo21333d("entered_background", (Map<? extends AnalyticsProperty, Object>) null);
        C13267q qVar = sVar2.f26891b;
        if (qVar.f29156b.mo45684a()) {
            SharedPreferences.Editor edit = qVar.f29160f.edit();
            C19383o.m32796f(edit, "editor");
            edit.putLong("app_start_time", qVar.f29158d);
            edit.putLong("app_foreground_time", qVar.f29159e);
            edit.apply();
        }
        C19697g.m33468f(sVar2.f26901l, (CoroutineContext) null, (CoroutineStart) null, new ForegroundBackgroundEventListener$onBackground$1(sVar2, (C19340c<? super ForegroundBackgroundEventListener$onBackground$1>) null), 3);
        this.f26830b.mo21310e("App is backgrounded");
        synchronized (C13544g.f29622b) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C13544g.f29621a;
            if (scheduledThreadPoolExecutor != null && !scheduledThreadPoolExecutor.isShutdown()) {
                C13544g.f29621a.shutdownNow();
            }
        }
        C8725c.f19171b.set(true);
    }
}
