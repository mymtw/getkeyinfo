package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;
import p504ai.C13983i;

@C17403o(generateAdapter = true)
public final class PushNotificationSetting {
    public static final int $stable = 8;
    private String description;
    private boolean enabled;
    private NotificationImportance importance;
    private String key;
    private List<String> notificationTypes;
    private String title;

    public PushNotificationSetting(@C17402n(name = "key") String str, @C17402n(name = "title") String str2, @C17402n(name = "description") String str3, @C17402n(name = "enabled") boolean z, @C17402n(name = "notification_types") List<String> list, @C17402n(name = "importance_level") NotificationImportance notificationImportance) {
        C19383o.m32797g(str, "key");
        C19383o.m32797g(str2, "title");
        C19383o.m32797g(str3, "description");
        C19383o.m32797g(list, "notificationTypes");
        C19383o.m32797g(notificationImportance, "importance");
        this.key = str;
        this.title = str2;
        this.description = str3;
        this.enabled = z;
        this.notificationTypes = list;
        this.importance = notificationImportance;
    }

    public static /* synthetic */ PushNotificationSetting copy$default(PushNotificationSetting pushNotificationSetting, String str, String str2, String str3, boolean z, List<String> list, NotificationImportance notificationImportance, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pushNotificationSetting.key;
        }
        if ((i & 2) != 0) {
            str2 = pushNotificationSetting.title;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = pushNotificationSetting.description;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            z = pushNotificationSetting.enabled;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            list = pushNotificationSetting.notificationTypes;
        }
        List<String> list2 = list;
        if ((i & 32) != 0) {
            notificationImportance = pushNotificationSetting.importance;
        }
        return pushNotificationSetting.copy(str, str4, str5, z2, list2, notificationImportance);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final boolean component4() {
        return this.enabled;
    }

    public final List<String> component5() {
        return this.notificationTypes;
    }

    public final NotificationImportance component6() {
        return this.importance;
    }

    public final PushNotificationSetting copy(@C17402n(name = "key") String str, @C17402n(name = "title") String str2, @C17402n(name = "description") String str3, @C17402n(name = "enabled") boolean z, @C17402n(name = "notification_types") List<String> list, @C17402n(name = "importance_level") NotificationImportance notificationImportance) {
        C19383o.m32797g(str, "key");
        C19383o.m32797g(str2, "title");
        C19383o.m32797g(str3, "description");
        C19383o.m32797g(list, "notificationTypes");
        C19383o.m32797g(notificationImportance, "importance");
        return new PushNotificationSetting(str, str2, str3, z, list, notificationImportance);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushNotificationSetting)) {
            return false;
        }
        PushNotificationSetting pushNotificationSetting = (PushNotificationSetting) obj;
        return C19383o.m32792b(this.key, pushNotificationSetting.key) && C19383o.m32792b(this.title, pushNotificationSetting.title) && C19383o.m32792b(this.description, pushNotificationSetting.description) && this.enabled == pushNotificationSetting.enabled && C19383o.m32792b(this.notificationTypes, pushNotificationSetting.notificationTypes) && this.importance == pushNotificationSetting.importance;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final NotificationImportance getImportance() {
        return this.importance;
    }

    public final String getKey() {
        return this.key;
    }

    public final List<String> getNotificationTypes() {
        return this.notificationTypes;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int e = C0023f.m105e(this.description, C0023f.m105e(this.title, this.key.hashCode() * 31, 31), 31);
        boolean z = this.enabled;
        if (z) {
            z = true;
        }
        return this.importance.hashCode() + C13983i.m21488g(this.notificationTypes, (e + (z ? 1 : 0)) * 31, 31);
    }

    public final void setDescription(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.description = str;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setImportance(NotificationImportance notificationImportance) {
        C19383o.m32797g(notificationImportance, "<set-?>");
        this.importance = notificationImportance;
    }

    public final void setKey(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.key = str;
    }

    public final void setNotificationTypes(List<String> list) {
        C19383o.m32797g(list, "<set-?>");
        this.notificationTypes = list;
    }

    public final void setTitle(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.title = str;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("PushNotificationSetting(key=");
        h.append(this.key);
        h.append(", title=");
        h.append(this.title);
        h.append(", description=");
        h.append(this.description);
        h.append(", enabled=");
        h.append(this.enabled);
        h.append(", notificationTypes=");
        h.append(this.notificationTypes);
        h.append(", importance=");
        h.append(this.importance);
        h.append(')');
        return h.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PushNotificationSetting(String str, String str2, String str3, boolean z, List list, NotificationImportance notificationImportance, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, list, (i & 32) != 0 ? NotificationImportance.DEFAULT : notificationImportance);
    }
}
