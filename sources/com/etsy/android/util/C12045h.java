package com.etsy.android.util;

import com.appsflyer.AFInAppEventType;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.util.h */
public abstract class C12045h {

    /* renamed from: a */
    public final String f26865a;

    /* renamed from: b */
    public final String f26866b;

    /* renamed from: com.etsy.android.util.h$a */
    public static final class C12046a extends C12045h {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12046a(String str) {
            super(str, "AFInAppEventType.ADD_TO_CART");
            C19383o.m32797g(str, "etsyUserId");
        }
    }

    /* renamed from: com.etsy.android.util.h$b */
    public static final class C12047b extends C12045h {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12047b(String str) {
            super(str, AFInAppEventType.LOGIN);
            C19383o.m32797g(str, "etsyUserId");
        }
    }

    /* renamed from: com.etsy.android.util.h$c */
    public static final class C12048c extends C12045h {
    }

    public C12045h(String str, String str2) {
        this.f26865a = str;
        this.f26866b = str2;
    }
}
