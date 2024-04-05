package p414oe;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C3167n;
import androidx.recyclerview.widget.C3200w;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19861p;

/* renamed from: oe.e */
public final class C13167e extends C3200w<C13166d, C13170g> {

    /* renamed from: c */
    public final C19861p<C13166d, Boolean, C19394m> f28974c;

    /* renamed from: oe.e$a */
    public static final class C13168a extends C3167n.C3172e<C13166d> {

        /* renamed from: a */
        public static final C13168a f28975a = new C13168a();

        /* renamed from: a */
        public final boolean mo11900a(Object obj, Object obj2) {
            return C19383o.m32792b((C13166d) obj, (C13166d) obj2);
        }

        /* renamed from: b */
        public final boolean mo11901b(Object obj, Object obj2) {
            C13166d dVar = (C13166d) obj;
            C13166d dVar2 = (C13166d) obj2;
            return false;
        }
    }

    public C13167e(C19861p<? super C13166d, ? super Boolean, C19394m> pVar) {
        super(C13168a.f28975a);
        this.f28974c = pVar;
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C13170g gVar = (C13170g) b0Var;
        C19383o.m32797g(gVar, "holder");
        Object item = getItem(i);
        C19383o.m32796f(item, "getItem(position)");
        C13166d dVar = (C13166d) item;
        gVar.f28979c.setText(dVar.f28970b);
        gVar.f28979c.setChecked(dVar.f28972d);
        gVar.f28979c.setOnCheckedChangeListener(new C13169f(gVar, dVar));
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_filter_multi_select, viewGroup, false);
        C19383o.m32796f(inflate, "inflater.inflate(\n      …     false,\n            )");
        return new C13170g(inflate, this.f28974c);
    }
}
