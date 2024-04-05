package com.google.android.play.core.assetpacks;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import p689ul.C18605c;

/* renamed from: com.google.android.play.core.assetpacks.p2 */
public final /* synthetic */ class C15641p2 implements C18605c {

    /* renamed from: b */
    public final /* synthetic */ C15583b0 f35283b;

    public /* synthetic */ C15641p2(C15583b0 b0Var) {
        this.f35283b = b0Var;
    }

    public final void onSuccess(Object obj) {
        C15583b0 b0Var = this.f35283b;
        List list = (List) obj;
        int a = b0Var.f35068b.mo55388a();
        Iterator it = b0Var.mo55379e().iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (!list.contains(file.getName()) && C15583b0.m25254b(file, true) != ((long) a)) {
                C15583b0.m25256g(file);
            }
        }
    }
}
