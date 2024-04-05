package p399me;

import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import com.etsy.android.stylekit.views.CollageActionGroupItem;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: me.t */
public final class C13072t extends RecyclerView.C3084b0 {

    /* renamed from: b */
    public final CollageActionGroupItem f28743b;

    /* renamed from: c */
    public final C19857l<C10813l, C19394m> f28744c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13072t(CollageActionGroupItem collageActionGroupItem, C19857l<? super C10813l, C19394m> lVar) {
        super(collageActionGroupItem);
        C19383o.m32797g(lVar, "onChange");
        this.f28743b = collageActionGroupItem;
        this.f28744c = lVar;
    }
}
