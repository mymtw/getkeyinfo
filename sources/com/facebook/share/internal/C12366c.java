package com.facebook.share.internal;

import android.content.Intent;
import com.facebook.FacebookException;
import com.facebook.share.internal.C12348b;
import kotlin.jvm.internal.C19383o;
import p365hg.C12828a;
import p365hg.C12849d0;
import p365hg.C12869i0;
import p365hg.C12889o;
import p401mg.C13080a;
import p453tf.C13418j;

/* renamed from: com.facebook.share.internal.c */
public final class C12366c implements C12348b.C12354e {

    /* renamed from: a */
    public final /* synthetic */ int f27564a;

    /* renamed from: b */
    public final /* synthetic */ Intent f27565b;

    public C12366c(int i, int i2, Intent intent) {
        this.f27564a = i;
        this.f27565b = intent;
    }

    /* renamed from: a */
    public final void mo39764a(C12348b bVar, FacebookException facebookException) {
        if (facebookException == null) {
            int i = this.f27564a;
            Intent intent = this.f27565b;
            bVar.getClass();
            Class<C12378m> cls = C12378m.class;
            if (!C13080a.m20762b(cls)) {
                try {
                    C12828a a = C12378m.m20213a(i, intent);
                    if (a != null) {
                        C13080a.m20762b(a);
                        int i2 = C12849d0.f28340a;
                        C19383o.m32797g((Object) null, "callId");
                        throw null;
                    }
                } catch (Throwable th) {
                    C13080a.m20761a(cls, th);
                }
            }
            bVar.f27524m = null;
            C12348b.f27509t = null;
            C13418j.m21106b().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putString("PENDING_CONTROLLER_KEY", C12348b.f27509t).apply();
            return;
        }
        C12889o oVar = C12348b.f27504o;
        C12869i0.m20550F("b", facebookException);
    }
}
