package p399me;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.C3167n;
import androidx.recyclerview.widget.C3200w;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.search.filters.refactor.C10798d;
import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import com.etsy.android.stylekit.views.CollageCheckbox;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p753kq.C19857l;

/* renamed from: me.e */
public final class C13053e extends C3200w<C10798d, C13050b> {

    /* renamed from: c */
    public final C19857l<C10813l, C19394m> f28706c;

    /* renamed from: me.e$a */
    public static final class C13054a extends C3167n.C3172e<C10798d> {

        /* renamed from: a */
        public static final C13054a f28707a = new C13054a();

        /* renamed from: a */
        public final boolean mo11900a(Object obj, Object obj2) {
            return C19383o.m32792b((C10798d) obj, (C10798d) obj2);
        }

        /* renamed from: b */
        public final boolean mo11901b(Object obj, Object obj2) {
            return C19383o.m32792b(((C10798d) obj).f23919a, ((C10798d) obj2).f23919a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13053e(C19857l<? super C10813l, C19394m> lVar) {
        super(C13054a.f28707a);
        C19383o.m32797g(lVar, "onItemChange");
        this.f28706c = lVar;
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C13050b bVar = (C13050b) b0Var;
        C19383o.m32797g(bVar, "holder");
        Object item = getItem(i);
        C19383o.m32796f(item, "getItem(position)");
        C10798d dVar = (C10798d) item;
        bVar.f28699b.setText(dVar.f23921c);
        bVar.f28699b.setChecked(dVar.f23922d);
        bVar.f28699b.setEnabled(dVar.f23923e);
        bVar.f28699b.setOnCheckedChangeListener(new C13049a(bVar, dVar));
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        Context context = viewGroup.getContext();
        C19383o.m32796f(context, "parent.context");
        CollageCheckbox collageCheckbox = new CollageCheckbox(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        collageCheckbox.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        collageCheckbox.setDirection(1);
        return new C13050b(collageCheckbox, this.f28706c);
    }
}
