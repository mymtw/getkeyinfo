package com.etsy.android.lib.config.bucketing;

import com.etsy.android.lib.config.bucketing.NativeConfig;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.C19294b0;

/* renamed from: com.etsy.android.lib.config.bucketing.e */
public final class C8617e {

    /* renamed from: b */
    public static NativeConfig.C8608a f18933b;

    /* renamed from: c */
    public static NativeConfig.C8608a f18934c;

    /* renamed from: d */
    public static NativeConfig.C8608a f18935d;

    /* renamed from: e */
    public static NativeConfig.C8608a f18936e;

    /* renamed from: f */
    public static NativeConfig.C8608a f18937f;

    /* renamed from: g */
    public static NativeConfig.C8608a f18938g;

    /* renamed from: h */
    public static NativeConfig.C8608a f18939h;

    /* renamed from: a */
    public final LinkedHashMap f18940a;

    static {
        NativeConfig.BucketType bucketType = NativeConfig.BucketType.Device;
        f18933b = new NativeConfig.C8608a("BOEShowLanguageSettingsDeviceBucketed", bucketType, 100);
        f18934c = new NativeConfig.C8608a("BOEPushOptInOnboarding2", bucketType, 0);
        f18935d = new NativeConfig.C8608a("BOEPostPurchaseAppLandings3", bucketType, 50);
        f18936e = new NativeConfig.C8608a("MergeUpdatesNFavsV2", bucketType, 0);
        f18937f = new NativeConfig.C8608a("BOESearchFabTry2", bucketType, 50);
        f18938g = new NativeConfig.C8608a("EtsyLens_wip", bucketType, 0);
        f18939h = new NativeConfig.C8608a("EtsyLensOnboarding_wip", bucketType, 0);
    }

    public C8617e() {
        NativeConfig.C8608a aVar = f18933b;
        Boolean bool = Boolean.TRUE;
        NativeConfig.C8608a aVar2 = f18934c;
        Boolean bool2 = Boolean.FALSE;
        this.f18940a = C19294b0.m32563t0(new Pair(aVar, bool), new Pair(aVar2, bool2), new Pair(f18935d, bool), new Pair(f18936e, bool2), new Pair(f18937f, bool), new Pair(f18938g, bool), new Pair(f18939h, bool2));
    }
}
