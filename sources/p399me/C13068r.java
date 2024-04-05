package p399me;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C3167n;
import androidx.recyclerview.widget.C3200w;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.search.filters.refactor.C10798d;
import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import com.etsy.android.stylekit.views.CollageActionGroupItem;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: me.r */
public final class C13068r extends C3200w<C10798d, C13072t> {

    /* renamed from: c */
    public final C19857l<C10813l, C19394m> f28738c;

    /* renamed from: me.r$a */
    public static final class C13069a extends C3167n.C3172e<C10798d> {

        /* renamed from: a */
        public static final C13069a f28739a = new C13069a();

        /* renamed from: a */
        public final boolean mo11900a(Object obj, Object obj2) {
            return C19383o.m32792b((C10798d) obj, (C10798d) obj2);
        }

        /* renamed from: b */
        public final boolean mo11901b(Object obj, Object obj2) {
            return C19383o.m32792b(((C10798d) obj).f23919a, ((C10798d) obj2).f23919a);
        }
    }

    /* renamed from: me.r$b */
    public final class C13070b extends GridLayoutManager.C3075b {
        public C13070b() {
        }

        /* renamed from: d */
        public final int mo11265d(int i) {
            if (i < C13068r.this.getItemCount()) {
                return ((C10798d) C13068r.this.getItem(i)).f23921c.length() > 8 ? 2 : 1;
            }
            return 3;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13068r(C19857l<? super C10813l, C19394m> lVar) {
        super(C13069a.f28739a);
        C19383o.m32797g(lVar, "onItemChange");
        this.f28738c = lVar;
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C13072t tVar = (C13072t) b0Var;
        C19383o.m32797g(tVar, "holder");
        Object item = getItem(i);
        C19383o.m32796f(item, "getItem(position)");
        C10798d dVar = (C10798d) item;
        tVar.f28743b.setText(dVar.f23921c);
        tVar.f28743b.setChecked(dVar.f23922d);
        tVar.f28743b.setEnabled(dVar.f23923e);
        tVar.f28743b.setOnCheckedChangeListener(new C13071s(tVar, dVar));
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_filters_size, viewGroup, false);
        C19383o.m32795e(inflate, "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageActionGroupItem");
        return new C13072t((CollageActionGroupItem) inflate, this.f28738c);
    }
}
