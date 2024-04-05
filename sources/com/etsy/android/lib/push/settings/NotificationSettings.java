package com.etsy.android.lib.push.settings;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.PushNotificationSetting;
import com.google.android.play.core.appupdate.C15562d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20004s;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.SingleSubscribeOn;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8071s;
import p248tp.C8072t;
import p340ea.C12673n;
import p346fa.C12703a;
import p409o9.C13138q;
import p456ua.C13461f;
import p765pr.C20064d;
import retrofit2.C20145v;

public final class NotificationSettings {

    /* renamed from: l */
    public static final HashMap<String, String> f19453l = new HashMap<>();

    /* renamed from: a */
    public final C8694h f19454a;

    /* renamed from: b */
    public final C12673n f19455b;

    /* renamed from: c */
    public final NotificationManager f19456c;

    /* renamed from: d */
    public final C13461f f19457d;

    /* renamed from: e */
    public final C13138q f19458e;

    /* renamed from: f */
    public final C8844a f19459f;

    /* renamed from: g */
    public final C12703a f19460g;

    /* renamed from: h */
    public final C8618c f19461h;

    /* renamed from: i */
    public final String f19462i = "com.google.android.gms.availability";

    /* renamed from: j */
    public List<PushNotificationSetting> f19463j;

    /* renamed from: k */
    public final LinkedHashMap<String, NotificationChannel> f19464k = new LinkedHashMap<>();

    public enum NotificationGroup {
        CONVERSATION("convos"),
        ETSY_NEWS("etsy_news"),
        MY_ACTIVITY("my_activity"),
        ORDERS("orders"),
        RECOMMENDATIONS("recommendations"),
        UNSEEN("updates_unseen");
        
        private final String groupName;

        private NotificationGroup(String str) {
            this.groupName = str;
        }

        public final String getGroupName() {
            return this.groupName;
        }

        public String toString() {
            return this.groupName;
        }
    }

    public NotificationSettings(C8694h hVar, C12673n nVar, NotificationManager notificationManager, C13461f fVar, C13138q qVar, C8844a aVar, C12703a aVar2, C8618c cVar) {
        C19383o.m32797g(hVar, AnalyticsLogDatabaseHelper.LOG);
        C19383o.m32797g(nVar, "elkLogger");
        C19383o.m32797g(notificationManager, "notificationManager");
        C19383o.m32797g(fVar, "schedulers");
        C19383o.m32797g(qVar, "installInfo");
        C19383o.m32797g(aVar, "boePushNotificationSettingsEndpoint");
        C19383o.m32797g(aVar2, "grafana");
        C19383o.m32797g(cVar, "configMap");
        this.f19454a = hVar;
        this.f19455b = nVar;
        this.f19456c = notificationManager;
        this.f19457d = fVar;
        this.f19458e = qVar;
        this.f19459f = aVar;
        this.f19460g = aVar2;
        this.f19461h = cVar;
    }

    /* renamed from: a */
    public static void m17238a(NotificationSettings notificationSettings, C8072t tVar) {
        C19383o.m32797g(notificationSettings, "this$0");
        SingleSubscribeOn e = C0326j.m860e(notificationSettings.f19457d, notificationSettings.mo30231c());
        notificationSettings.f19457d.getClass();
        SubscribersKt.m32500e(e.mo20657f(C13461f.m21235b()), new NotificationSettings$createNotificationChannels$1$1(tVar), new NotificationSettings$createNotificationChannels$1$2(notificationSettings, tVar));
    }

    /* renamed from: b */
    public final ArrayList mo30230b() {
        List<NotificationChannel> notificationChannels = this.f19456c.getNotificationChannels();
        if (notificationChannels == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T next : notificationChannels) {
            NotificationChannel notificationChannel = (NotificationChannel) next;
            if (!C19383o.m32792b(notificationChannel.getId(), "miscellaneous") && !C19383o.m32792b(notificationChannel.getId(), this.f19462i)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final C19208j mo30231c() {
        C8844a aVar = this.f19459f;
        String str = this.f19458e.f28895a;
        C19383o.m32796f(str, "installInfo.uuid");
        C8071s<C20064d<List<PushNotificationSetting>>> a = aVar.mo30240a(str, C0326j.m869n(BuildTarget.Companion) && this.f19461h.mo21132b(C8592b.f18726C1));
        C8848c cVar = new C8848c(this, 0);
        a.getClass();
        return new C19208j(a, cVar);
    }

    /* renamed from: d */
    public final C8071s<C20145v<Void>> mo30232d(String str, boolean z) {
        C19383o.m32797g(str, "notificationKey");
        C20004s.C20005a aVar = new C20004s.C20005a(0);
        aVar.mo72990c(C20004s.f44265g);
        aVar.mo72988a("key", str);
        aVar.mo72988a(ResponseConstants.ENABLED, String.valueOf(z));
        C20004s b = aVar.mo72989b();
        C8844a aVar2 = this.f19459f;
        String str2 = this.f19458e.f28895a;
        C19383o.m32796f(str2, "installInfo.uuid");
        return aVar2.mo30241b(str2, b);
    }

    /* renamed from: e */
    public final void mo30233e() {
        boolean z;
        ArrayList<NotificationChannel> b = mo30230b();
        if (b != null) {
            for (NotificationChannel notificationChannel : b) {
                List<PushNotificationSetting> list = this.f19463j;
                T t = null;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        PushNotificationSetting pushNotificationSetting = (PushNotificationSetting) next;
                        if (!C19383o.m32792b(pushNotificationSetting.getKey(), notificationChannel.getId()) || pushNotificationSetting.getEnabled() == C15562d.m25169G(notificationChannel)) {
                            z = false;
                            continue;
                        } else {
                            z = true;
                            continue;
                        }
                        if (z) {
                            t = next;
                            break;
                        }
                    }
                    t = (PushNotificationSetting) t;
                }
                if (t != null) {
                    SingleSubscribeOn f = C0072d.m199f(this.f19457d, mo30232d(t.getKey(), C15562d.m25169G(notificationChannel)));
                    this.f19457d.getClass();
                    SubscribersKt.m32500e(f.mo20657f(C13461f.m21235b()), new C8842x2a11f8a5(this, t), new C8843x2a11f8a6(t, notificationChannel, this));
                }
            }
        }
    }
}
