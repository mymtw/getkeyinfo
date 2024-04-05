package com.appboy.enums;

import android.support.p013v4.media.session.C0087d;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p005a4.C0035b;

public enum NotificationSubscriptionType implements C0035b<String> {
    OPTED_IN("opted_in"),
    SUBSCRIBED("subscribed"),
    UNSUBSCRIBED("unsubscribed");
    
    public static final Companion Companion = null;
    /* access modifiers changed from: private */
    public static final Map<String, NotificationSubscriptionType> map = null;
    private final String key;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NotificationSubscriptionType fromValue(String str) {
            String str2;
            Map access$getMap$cp = NotificationSubscriptionType.map;
            NotificationSubscriptionType notificationSubscriptionType = null;
            if (str == null) {
                str2 = null;
            } else {
                Locale locale = Locale.US;
                str2 = C0087d.m237g(locale, UserStateKt.US_COUNTRY, str, locale, "this as java.lang.String).toLowerCase(locale)");
            }
            if (str2 == null) {
                str2 = "";
            }
            Object obj = access$getMap$cp.get(str2);
            if (obj != null) {
                notificationSubscriptionType = obj;
            }
            return notificationSubscriptionType;
        }
    }

    /* access modifiers changed from: public */
    static {
        int i;
        Companion = new Companion((DefaultConstructorMarker) null);
        NotificationSubscriptionType[] values = values();
        int T = C19421p.m32930T(values.length);
        if (T < 16) {
            T = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(T);
        int length = values.length;
        while (i < length) {
            NotificationSubscriptionType notificationSubscriptionType = values[i];
            i++;
            linkedHashMap.put(notificationSubscriptionType.getKey(), notificationSubscriptionType);
        }
        map = linkedHashMap;
    }

    private NotificationSubscriptionType(String str) {
        this.key = str;
    }

    public static final NotificationSubscriptionType fromValue(String str) {
        return Companion.fromValue(str);
    }

    public final String getKey() {
        return this.key;
    }

    public String forJsonPut() {
        return this.key;
    }
}
