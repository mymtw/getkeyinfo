package p399me;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.search.filters.refactor.C10798d;
import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import com.etsy.android.p327ui.search.filters.refactor.C10862y;
import com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem;
import com.etsy.android.stylekit.views.CollageCheckbox;
import com.etsy.android.stylekit.views.CollageContentToggle;
import java.util.ArrayList;
import kotlin.C19394m;
import kotlin.collections.C19318k;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p568fn.C17782b;
import p753kq.C19857l;

/* renamed from: me.m */
public final class C13063m extends C10862y {

    /* renamed from: b */
    public final C19857l<C10813l, C19394m> f28725b;

    /* renamed from: c */
    public final CollageContentToggle f28726c;

    /* renamed from: d */
    public final ArrayList f28727d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13063m(ViewGroup viewGroup, C19857l<? super C10813l, C19394m> lVar) {
        super(C0114h.m305j0(viewGroup, R.layout.search_filters_item_other_options, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(lVar, "onEvent");
        this.f28725b = lVar;
        View findViewById = this.itemView.findViewById(R.id.content_toggle_filter_other_options);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.…gle_filter_other_options)");
        this.f28726c = (CollageContentToggle) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.checkbox_other_option_0);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.….checkbox_other_option_0)");
        View findViewById3 = this.itemView.findViewById(R.id.checkbox_other_option_1);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.….checkbox_other_option_1)");
        View findViewById4 = this.itemView.findViewById(R.id.checkbox_other_option_2);
        C19383o.m32796f(findViewById4, "itemView.findViewById(R.….checkbox_other_option_2)");
        View findViewById5 = this.itemView.findViewById(R.id.checkbox_other_option_3);
        C19383o.m32796f(findViewById5, "itemView.findViewById(R.….checkbox_other_option_3)");
        this.f28727d = C17782b.m29866f0((CollageCheckbox) findViewById2, (CollageCheckbox) findViewById3, (CollageCheckbox) findViewById4, (CollageCheckbox) findViewById5);
    }

    /* renamed from: e */
    public final void mo35868e(SearchFiltersUiGroupItem searchFiltersUiGroupItem) {
        if (searchFiltersUiGroupItem instanceof SearchFiltersUiGroupItem.OtherOptions) {
            this.f28726c.setListener(new C13058h(searchFiltersUiGroupItem.mo35793b(), this.f28725b));
            this.f28726c.setTitle(searchFiltersUiGroupItem.mo35795d());
            this.f28726c.setDescription(searchFiltersUiGroupItem.mo35794c());
            SearchFiltersUiGroupItem.OtherOptions otherOptions = (SearchFiltersUiGroupItem.OtherOptions) searchFiltersUiGroupItem;
            ArrayList c1 = C19318k.m32611c1(new C10798d[]{otherOptions.f23818d, otherOptions.f23819e, otherOptions.f23820f, otherOptions.f23821g});
            int max = Math.max(this.f28727d.size(), c1.size());
            for (int i = 0; i < max; i++) {
                if (C19327t.m32641W0(i, c1) == null) {
                    ViewExtensions.m12860d((CollageCheckbox) this.f28727d.get(i));
                } else {
                    if (C19327t.m32641W0(i, this.f28727d) == null) {
                        Context context = this.itemView.getContext();
                        C19383o.m32796f(context, "itemView.context");
                        CollageCheckbox collageCheckbox = new CollageCheckbox(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                        this.f28727d.add(collageCheckbox);
                        this.f28726c.addView(collageCheckbox);
                    }
                    CollageCheckbox collageCheckbox2 = (CollageCheckbox) this.f28727d.get(i);
                    C10798d dVar = (C10798d) c1.get(i);
                    ViewExtensions.m12869m(collageCheckbox2);
                    collageCheckbox2.setText(dVar.f23921c);
                    collageCheckbox2.setChecked(dVar.f23922d);
                    collageCheckbox2.setOnCheckedChangeListener(new C13062l(this, dVar));
                }
            }
        }
    }
}
