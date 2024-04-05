package com.etsy.android.lib.util;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.lib.util.j */
public abstract class C8906j {

    /* renamed from: a */
    public final String f19663a;

    /* renamed from: b */
    public final Map<String, String> f19664b;

    /* renamed from: com.etsy.android.lib.util.j$a */
    public static final class C8907a extends C8906j {
        public C8907a(String str, Map<String, String> map) {
            super(str, map);
        }
    }

    /* renamed from: com.etsy.android.lib.util.j$b */
    public static final class C8908b extends C8906j {
        public C8908b(String str, Map<String, String> map) {
            super(str, map);
        }
    }

    /* renamed from: com.etsy.android.lib.util.j$c */
    public static final class C8909c extends C8906j {
        public C8909c(String str, Map<String, String> map) {
            super(str, map);
        }
    }

    /* renamed from: com.etsy.android.lib.util.j$d */
    public static final class C8910d extends C8906j {
        public C8910d(HashMap hashMap) {
            super("config_fetched", hashMap);
        }
    }

    /* renamed from: com.etsy.android.lib.util.j$e */
    public static final class C8911e extends C8906j {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8911e(String str, Map<String, String> map) {
            super(str, map);
            C19383o.m32797g(str, "crumb");
        }
    }

    public C8906j(String str, Map map) {
        this.f19663a = str;
        this.f19664b = map;
    }
}
