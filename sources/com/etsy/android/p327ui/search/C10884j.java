package com.etsy.android.p327ui.search;

import androidx.appcompat.widget.SearchView;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.j */
public final class C10884j implements SearchView.C0283l {

    /* renamed from: b */
    public final /* synthetic */ C10866i f24149b;

    public C10884j(C10866i iVar) {
        this.f24149b = iVar;
    }

    public final boolean onQueryTextChange(String str) {
        C19383o.m32797g(str, "newText");
        C10866i iVar = this.f24149b;
        SearchView.C0283l lVar = iVar.f24099c;
        if (lVar == null) {
            return false;
        }
        if (iVar.f24112p) {
            iVar.f24112p = false;
            return true;
        } else if (lVar == null) {
            return true;
        } else {
            lVar.onQueryTextChange(str);
            return true;
        }
    }

    public final boolean onQueryTextSubmit(String str) {
        C19383o.m32797g(str, "query");
        SearchView.C0283l lVar = this.f24149b.f24099c;
        if (lVar != null) {
            return lVar.onQueryTextSubmit(str);
        }
        return false;
    }
}
