package p399me;

import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import com.etsy.android.p327ui.search.filters.refactor.SortBySelectItem;
import com.etsy.android.stylekit.views.CollageRadioButton;
import com.etsy.android.stylekit.views.CollageRadioGroup;
import kotlin.jvm.internal.C19383o;

/* renamed from: me.p */
public final class C13066p implements CollageRadioGroup.C9044a {

    /* renamed from: a */
    public final /* synthetic */ C13067q f28735a;

    public C13066p(C13067q qVar) {
        this.f28735a = qVar;
    }

    /* renamed from: a */
    public final void mo30994a(boolean z, CollageRadioButton collageRadioButton) {
        C19383o.m32797g(collageRadioButton, "selectedButton");
        SortBySelectItem sortBySelectItem = (SortBySelectItem) this.f28735a.f28737f.get(collageRadioButton);
        if (sortBySelectItem != null) {
            this.f28735a.f28736e.invoke(new C10813l.C10831r(sortBySelectItem));
        }
    }
}
