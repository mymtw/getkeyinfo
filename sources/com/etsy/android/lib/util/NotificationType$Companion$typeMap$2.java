package com.etsy.android.lib.util;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p753kq.C19846a;

public final class NotificationType$Companion$typeMap$2 extends Lambda implements C19846a<Map<String, ? extends NotificationType>> {
    public static final NotificationType$Companion$typeMap$2 INSTANCE = new NotificationType$Companion$typeMap$2();

    public NotificationType$Companion$typeMap$2() {
        super(0);
    }

    public final Map<String, NotificationType> invoke() {
        NotificationType[] values = NotificationType.values();
        int T = C19421p.m32930T(values.length);
        if (T < 16) {
            T = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(T);
        for (NotificationType notificationType : values) {
            linkedHashMap.put(notificationType.getType(), notificationType);
        }
        return linkedHashMap;
    }
}
