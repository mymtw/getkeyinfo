package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import androidx.compose.p015ui.text.input.C1993m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p689ul.C18614l;

/* renamed from: com.google.android.play.core.assetpacks.p */
public final class C15638p extends C15626m {

    /* renamed from: c */
    public final /* synthetic */ C15662v f35271c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15638p(C15662v vVar, C18614l lVar) {
        super(vVar, lVar);
        this.f35271c = vVar;
    }

    public final void zzg(List list) {
        super.zzg(list);
        C15662v vVar = this.f35271c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AssetPackState assetPackState = (AssetPackState) C15590d.m25369c((Bundle) it.next(), vVar.f35362b, vVar.f35363c, new ArrayList(), C1993m.f4508w).f35168b.values().iterator().next();
            boolean z = false;
            if (assetPackState == null) {
                C15662v.f35359g.mo52243c("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            int d = assetPackState.mo55360d();
            if (d == 1 || d == 7 || d == 2 || d == 3) {
                z = true;
            }
            if (z) {
                arrayList.add(assetPackState.mo55359c());
            }
        }
        this.f35237a.mo70126b(arrayList);
    }
}
