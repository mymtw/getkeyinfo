package com.etsy.android.lib.config.bucketing;

import kotlin.jvm.internal.C19383o;

public abstract class NativeConfig {

    /* renamed from: a */
    public final String f18917a;

    /* renamed from: b */
    public final BucketType f18918b;

    public enum BucketType {
        Device,
        User
    }

    /* renamed from: com.etsy.android.lib.config.bucketing.NativeConfig$a */
    public static final class C8608a extends NativeConfig {

        /* renamed from: c */
        public final int f18919c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8608a(String str, BucketType bucketType, int i) {
            super(str, bucketType);
            C19383o.m32797g(bucketType, "bucketType");
            this.f18919c = i;
        }
    }

    /* renamed from: com.etsy.android.lib.config.bucketing.NativeConfig$b */
    public static final class C8609b extends NativeConfig {

        /* renamed from: com.etsy.android.lib.config.bucketing.NativeConfig$b$a */
        public static final class C8610a {
        }
    }

    public NativeConfig(String str, BucketType bucketType) {
        this.f18917a = str;
        this.f18918b = bucketType;
    }
}
