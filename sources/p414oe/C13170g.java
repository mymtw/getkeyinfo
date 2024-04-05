package p414oe;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.stylekit.views.CollageCheckbox;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19861p;

/* renamed from: oe.g */
public final class C13170g extends RecyclerView.C3084b0 {

    /* renamed from: b */
    public final C19861p<C13166d, Boolean, C19394m> f28978b;

    /* renamed from: c */
    public final CollageCheckbox f28979c;

    static {
        CollageCheckbox.C9026b bVar = CollageCheckbox.Companion;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13170g(View view, C19861p<? super C13166d, ? super Boolean, C19394m> pVar) {
        super(view);
        C19383o.m32797g(pVar, "updatePriceOptions");
        this.f28978b = pVar;
        View findViewById = this.itemView.findViewById(R.id.checkbox);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.checkbox)");
        this.f28979c = (CollageCheckbox) findViewById;
    }
}
