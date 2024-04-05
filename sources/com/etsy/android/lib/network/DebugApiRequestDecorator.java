package com.etsy.android.lib.network;

import com.etsy.android.lib.conversation.MessageDraft;
import java.util.LinkedHashMap;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.text.Regex;

public final class DebugApiRequestDecorator {

    /* renamed from: a */
    public static final LinkedHashMap f19167a = new LinkedHashMap();

    /* renamed from: b */
    public static long f19168b;

    public static final class Companion {
        /* renamed from: a */
        public static String m17149a() {
            return C19327t.m32644Z0(DebugApiRequestDecorator.f19167a.keySet(), ",", (String) null, (String) null, DebugApiRequestDecorator$Companion$getFeatureFlags$1.INSTANCE, 30);
        }

        /* renamed from: b */
        public static void m17150b(String str) {
            C19383o.m32797g(str, "features");
            DebugApiRequestDecorator.f19167a.clear();
            Object[] array = new Regex(",").split(str, 0).toArray(new String[0]);
            C19383o.m32795e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            for (String split : (String[]) array) {
                Object[] array2 = new Regex(MessageDraft.IMAGE_DELIMITER).split(split, 0).toArray(new String[0]);
                C19383o.m32795e(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                String[] strArr = (String[]) array2;
                if (strArr[0].length() > 0) {
                    DebugApiRequestDecorator.f19167a.put(strArr[0], strArr.length > 1 ? strArr[1] : "on");
                }
            }
        }
    }
}
