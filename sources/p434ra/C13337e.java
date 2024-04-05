package p434ra;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.util.NotificationType;
import java.util.Collections;
import java.util.HashMap;
import p250u0.C8099l;
import p250u0.C8100m;
import p250u0.C8105q;
import p350fe.C12724a;
import p350fe.C12726c;
import p350fe.C12739m;
import p350fe.C12740n;

/* renamed from: ra.e */
public class C13337e {

    /* renamed from: c */
    public static C13337e f29263c;

    /* renamed from: a */
    public NotificationType f29264a;

    /* renamed from: b */
    public String f29265b;

    public C13337e() {
        this.f29264a = NotificationType.UNKNOWN;
    }

    /* renamed from: d */
    public static synchronized C13337e m20971d() {
        C13337e eVar;
        synchronized (C13337e.class) {
            if (f29263c == null) {
                f29263c = new C13337e();
            }
            eVar = f29263c;
        }
        return eVar;
    }

    /* renamed from: a */
    public void mo46029a(C8100m mVar, Context context, Bundle bundle, String str, C12739m mVar2) {
    }

    /* renamed from: b */
    public CharSequence mo46030b(Context context, String str) {
        return str;
    }

    /* renamed from: c */
    public CharSequence mo46031c(Context context, Bundle bundle) {
        if (bundle.containsKey("title")) {
            return bundle.getString("title");
        }
        return null;
    }

    /* renamed from: e */
    public Uri mo46028e(C12739m mVar, DeepLinkEntity deepLinkEntity, String str, Bundle bundle, C12726c cVar, C12724a aVar) {
        return C12739m.m20402a(Collections.singletonList(deepLinkEntity != null ? new C12740n(deepLinkEntity, str) : new C12740n(DeepLinkEntity.HOME, (String) null)));
    }

    /* renamed from: f */
    public int mo46032f(Bundle bundle) {
        return 0;
    }

    /* renamed from: g */
    public C8105q mo46033g(C13346l lVar, Context context, Bundle bundle, String str) {
        C8099l lVar2 = new C8099l();
        lVar2.mo20687h(mo46030b(context, str));
        return lVar2;
    }

    /* renamed from: h */
    public void mo46034h() {
    }

    /* renamed from: i */
    public final void mo46035i(C8672b bVar, Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put(PredefinedAnalyticsProperty.NOTIFICATION_ID, bundle.getString("n", ""));
        hashMap.put(PredefinedAnalyticsProperty.NOTIFICATION_TYPE, this.f29264a.getType());
        hashMap.put(PredefinedAnalyticsProperty.UTM_SOURCE, bundle.getString("utm_source", ""));
        hashMap.put(PredefinedAnalyticsProperty.UTM_CAMPAIGN, bundle.getString("utm_campaign", ""));
        hashMap.put(PredefinedAnalyticsProperty.UTM_MEDIUM, bundle.getString("utm_medium", ""));
        bVar.mo21333d("notification_opened", hashMap);
    }

    public C13337e(NotificationType notificationType) {
        NotificationType.C8877a aVar = NotificationType.Companion;
        this.f29264a = notificationType;
    }
}
