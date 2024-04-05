package com.etsy.android.p327ui.home.tabs;

import com.squareup.moshi.C17414y;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.tabs.j */
public final class C10060j {

    /* renamed from: a */
    public final C10054d f22176a;

    /* renamed from: b */
    public final C17414y f22177b;

    /* renamed from: com.etsy.android.ui.home.tabs.j$a */
    public /* synthetic */ class C10061a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22178a;

        static {
            int[] iArr = new int[RequestType.values().length];
            iArr[RequestType.ADMIN_TABS.ordinal()] = 1;
            iArr[RequestType.SIGNED_IN.ordinal()] = 2;
            iArr[RequestType.SIGNED_OUT.ordinal()] = 3;
            f22178a = iArr;
        }
    }

    public C10060j(C10054d dVar, C17414y yVar) {
        C19383o.m32797g(dVar, "homePagerEndpoint");
        C19383o.m32797g(yVar, "moshi");
        this.f22176a = dVar;
        this.f22177b = yVar;
    }
}
