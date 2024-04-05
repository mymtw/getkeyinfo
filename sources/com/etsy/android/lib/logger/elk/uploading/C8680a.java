package com.etsy.android.lib.logger.elk.uploading;

import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.util.CrashUtil;
import kotlin.jvm.internal.C19383o;
import p340ea.C12658b;

/* renamed from: com.etsy.android.lib.logger.elk.uploading.a */
public final class C8680a {

    /* renamed from: a */
    public final C12658b f19069a;

    /* renamed from: b */
    public final CrashUtil f19070b;

    /* renamed from: c */
    public final C8618c f19071c;

    public C8680a(C12658b bVar, CrashUtil crashUtil, C8618c cVar) {
        C19383o.m32797g(bVar, "elkLogDao");
        C19383o.m32797g(crashUtil, "crashUtil");
        C19383o.m32797g(cVar, "configMap");
        this.f19069a = bVar;
        this.f19070b = crashUtil;
        this.f19071c = cVar;
    }
}
