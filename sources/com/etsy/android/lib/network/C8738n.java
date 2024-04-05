package com.etsy.android.lib.network;

import com.etsy.android.lib.config.C8618c;
import com.etsy.android.p327ui.listing.fetch.C10141e;
import com.etsy.android.p327ui.user.C11761t;
import dagger.internal.C17555d;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.C19388s;
import p409o9.C13124e;
import p409o9.C13125f;
import p428qc.C13294e;
import p466vc.C13573c;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.network.n */
public final class C8738n implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19183a;

    /* renamed from: b */
    public final Object f19184b;

    public /* synthetic */ C8738n(Object obj, int i) {
        this.f19183a = i;
        this.f19184b = obj;
    }

    public final Object get() {
        switch (this.f19183a) {
            case 0:
                return new C8737m((C8618c) ((C19011a) this.f19184b).get());
            case 1:
                return new C10141e((C13573c) ((C19011a) this.f19184b).get());
            case 2:
                return new C11761t((C13294e) ((C19011a) this.f19184b).get());
            default:
                ((C19388s) this.f19184b).getClass();
                LinkedHashMap linkedHashMap = C13125f.f28856a;
                return new C13124e(C13125f.C13126a.m20790a());
        }
    }
}
