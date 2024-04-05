package com.etsy.android.lib.push.settings;

import com.etsy.android.lib.models.apiv3.PushNotificationSetting;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.lib.push.settings.b */
public abstract class C8845b {

    /* renamed from: com.etsy.android.lib.push.settings.b$a */
    public static final class C8846a extends C8845b {
    }

    /* renamed from: com.etsy.android.lib.push.settings.b$b */
    public static final class C8847b extends C8845b {

        /* renamed from: a */
        public final List<PushNotificationSetting> f19465a;

        public C8847b(List<PushNotificationSetting> list) {
            C19383o.m32797g(list, "notificationSettingList");
            this.f19465a = list;
        }
    }
}
