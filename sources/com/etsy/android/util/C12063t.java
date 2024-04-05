package com.etsy.android.util;

import com.etsy.android.lib.logger.C8674c;
import com.etsy.android.lib.logger.elk.uploading.C8680a;
import com.etsy.android.lib.logger.elk.uploading.C8687h;
import com.etsy.android.lib.logger.elk.uploading.C8689j;
import com.etsy.android.push.C8940c;
import dagger.internal.C17555d;
import p334da.C12630a;
import p334da.C12633d;
import p334da.C12639h;
import p425q9.C13267q;
import p740eq.C19011a;

/* renamed from: com.etsy.android.util.t */
public final class C12063t implements C17555d<C12062s> {

    /* renamed from: a */
    public final C19011a<C8674c> f26902a;

    /* renamed from: b */
    public final C19011a<C13267q> f26903b;

    /* renamed from: c */
    public final C19011a<C8940c> f26904c;

    /* renamed from: d */
    public final C19011a<C12633d> f26905d;

    /* renamed from: e */
    public final C19011a<C12630a> f26906e;

    /* renamed from: f */
    public final C19011a<C12639h> f26907f;

    /* renamed from: g */
    public final C19011a<C8680a> f26908g;

    /* renamed from: h */
    public final C19011a<C8689j> f26909h;

    /* renamed from: i */
    public final C19011a<C8687h> f26910i;

    public C12063t(C19011a<C8674c> aVar, C19011a<C13267q> aVar2, C19011a<C8940c> aVar3, C19011a<C12633d> aVar4, C19011a<C12630a> aVar5, C19011a<C12639h> aVar6, C19011a<C8680a> aVar7, C19011a<C8689j> aVar8, C19011a<C8687h> aVar9) {
        this.f26902a = aVar;
        this.f26903b = aVar2;
        this.f26904c = aVar3;
        this.f26905d = aVar4;
        this.f26906e = aVar5;
        this.f26907f = aVar6;
        this.f26908g = aVar7;
        this.f26909h = aVar8;
        this.f26910i = aVar9;
    }

    public final Object get() {
        return new C12062s(this.f26902a.get(), this.f26903b.get(), this.f26904c.get(), this.f26905d.get(), this.f26906e.get(), this.f26907f.get(), this.f26908g.get(), this.f26909h.get(), this.f26910i.get());
    }
}
