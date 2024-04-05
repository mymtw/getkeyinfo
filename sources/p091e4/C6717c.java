package p091e4;

import androidx.recyclerview.widget.C3185q;
import androidx.recyclerview.widget.RecyclerView;
import com.braze.p044ui.contentcards.adapters.ContentCardAdapter;
import kotlin.jvm.internal.C19383o;

/* renamed from: e4.c */
public final class C6717c extends C3185q.C3189d {

    /* renamed from: c */
    public final C6716b f14809c;

    public C6717c(ContentCardAdapter contentCardAdapter) {
        this.f14809c = contentCardAdapter;
    }

    /* renamed from: b */
    public final int mo11930b(RecyclerView recyclerView, RecyclerView.C3084b0 b0Var) {
        C19383o.m32797g(recyclerView, "recyclerView");
        C19383o.m32797g(b0Var, "viewHolder");
        int i = this.f14809c.mo16239a(b0Var.getBindingAdapterPosition()) ? 16 : 0;
        return (i << 8) | ((i | 0) << 0) | 0;
    }

    /* renamed from: e */
    public final void mo11933e(RecyclerView recyclerView, RecyclerView.C3084b0 b0Var, RecyclerView.C3084b0 b0Var2) {
        C19383o.m32797g(recyclerView, "recyclerView");
        C19383o.m32797g(b0Var, "viewHolder");
    }

    /* renamed from: f */
    public final void mo11934f(RecyclerView.C3084b0 b0Var) {
        C19383o.m32797g(b0Var, "viewHolder");
        this.f14809c.mo16240d(b0Var.getBindingAdapterPosition());
    }
}
