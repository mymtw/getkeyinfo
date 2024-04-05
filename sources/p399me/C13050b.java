package p399me;

import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import com.etsy.android.stylekit.views.CollageCheckbox;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: me.b */
public final class C13050b extends RecyclerView.C3084b0 {

    /* renamed from: b */
    public final CollageCheckbox f28699b;

    /* renamed from: c */
    public final C19857l<C10813l, C19394m> f28700c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13050b(CollageCheckbox collageCheckbox, C19857l<? super C10813l, C19394m> lVar) {
        super(collageCheckbox);
        C19383o.m32797g(lVar, "onChange");
        this.f28699b = collageCheckbox;
        this.f28700c = lVar;
    }
}
