package p399me;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C3167n;
import androidx.recyclerview.widget.C3200w;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.search.filters.refactor.C10792c;
import com.etsy.android.p327ui.search.filters.refactor.C10804h;
import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;
import p753kq.C19857l;

/* renamed from: me.f */
public final class C13055f extends C3200w<C10792c, C13052d> {

    /* renamed from: c */
    public final C19857l<C10813l, C19394m> f28708c;

    /* renamed from: me.f$a */
    public static final class C13056a extends C3167n.C3172e<C10792c> {

        /* renamed from: a */
        public static final C13056a f28709a = new C13056a();

        /* renamed from: a */
        public final boolean mo11900a(Object obj, Object obj2) {
            return C19383o.m32792b((C10792c) obj, (C10792c) obj2);
        }

        /* renamed from: b */
        public final boolean mo11901b(Object obj, Object obj2) {
            return C19383o.m32792b(((C10792c) obj).f23901a, ((C10792c) obj2).f23901a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13055f(C19857l<? super C10813l, C19394m> lVar) {
        super(C13056a.f28709a);
        C19383o.m32797g(lVar, "onItemChange");
        this.f28708c = lVar;
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C13052d dVar = (C13052d) b0Var;
        C19383o.m32797g(dVar, "holder");
        Object item = getItem(i);
        C19383o.m32796f(item, "getItem(position)");
        C10792c cVar = (C10792c) item;
        dVar.f28705d.setText(cVar.f23903c);
        C10804h hVar = cVar.f23905e;
        if (hVar instanceof C10804h.C10806b) {
            dVar.f28704c.setDrawableRes(((C10804h.C10806b) hVar).f23944a);
        } else if (hVar instanceof C10804h.C10805a) {
            dVar.f28704c.setColor(Color.parseColor(((C10804h.C10805a) hVar).f23943a));
        } else if (hVar instanceof C10804h.C10807c) {
            dVar.f28704c.setImageUrl(((C10804h.C10807c) hVar).f23945a);
        }
        dVar.f28704c.setChecked(cVar.f23904d);
        dVar.f28704c.setEnabled(cVar.f23906f);
        dVar.f28704c.setOnCheckedChangeListener(new C13051c(dVar, cVar));
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View h = C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_filters_color, viewGroup, false);
        C19383o.m32796f(h, "colorView");
        return new C13052d(h, this.f28708c);
    }
}
