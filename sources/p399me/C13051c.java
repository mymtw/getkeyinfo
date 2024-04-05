package p399me;

import android.widget.CompoundButton;
import com.etsy.android.p327ui.search.filters.refactor.C10792c;
import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import kotlin.jvm.internal.C19383o;

/* renamed from: me.c */
public final /* synthetic */ class C13051c implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: b */
    public final /* synthetic */ C13052d f28701b;

    /* renamed from: c */
    public final /* synthetic */ C10792c f28702c;

    public /* synthetic */ C13051c(C13052d dVar, C10792c cVar) {
        this.f28701b = dVar;
        this.f28702c = cVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C13052d dVar = this.f28701b;
        C10792c cVar = this.f28702c;
        C19383o.m32797g(dVar, "this$0");
        C19383o.m32797g(cVar, "$filterColorSelectItem");
        dVar.f28703b.invoke(new C10813l.C10815b(cVar, z));
    }
}
