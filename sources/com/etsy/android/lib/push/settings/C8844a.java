package com.etsy.android.lib.push.settings;

import com.etsy.android.lib.models.apiv3.PushNotificationSetting;
import java.util.List;
import okhttp3.C20016y;
import p248tp.C8071s;
import p765pr.C20064d;
import p771sr.C20178a;
import p771sr.C20183f;
import p771sr.C20192o;
import p771sr.C20196s;
import p771sr.C20197t;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.lib.push.settings.a */
public interface C8844a {
    @C20183f("/etsyapps/v3/member/push-notification-settings-groups/{deviceId}")
    /* renamed from: a */
    C8071s<C20064d<List<PushNotificationSetting>>> mo30240a(@C20196s("deviceId") String str, @C20197t("force_mock_android_silent_badge") boolean z);

    @C20192o("/etsyapps/v3/member/push-notification-settings-groups/{deviceId}/update")
    /* renamed from: b */
    C8071s<C20145v<Void>> mo30241b(@C20196s("deviceId") String str, @C20178a C20016y yVar);
}
