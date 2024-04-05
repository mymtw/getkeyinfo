package p399me;

import android.widget.CompoundButton;
import com.etsy.android.p327ui.search.filters.refactor.C10798d;
import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import kotlin.jvm.internal.C19383o;

/* renamed from: me.s */
public final /* synthetic */ class C13071s implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: b */
    public final /* synthetic */ C13072t f28741b;

    /* renamed from: c */
    public final /* synthetic */ C10798d f28742c;

    public /* synthetic */ C13071s(C13072t tVar, C10798d dVar) {
        this.f28741b = tVar;
        this.f28742c = dVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C13072t tVar = this.f28741b;
        C10798d dVar = this.f28742c;
        C19383o.m32797g(tVar, "this$0");
        C19383o.m32797g(dVar, "$filtersSelectItem");
        tVar.f28744c.invoke(new C10813l.C10830q(dVar, z));
    }
}
