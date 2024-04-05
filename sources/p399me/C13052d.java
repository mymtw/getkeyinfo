package p399me;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import com.etsy.android.stylekit.views.CollageColorSwatch;
import com.etsy.android.stylekit.views.CollageTextView;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: me.d */
public final class C13052d extends RecyclerView.C3084b0 {

    /* renamed from: b */
    public final C19857l<C10813l, C19394m> f28703b;

    /* renamed from: c */
    public final CollageColorSwatch f28704c;

    /* renamed from: d */
    public final CollageTextView f28705d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13052d(View view, C19857l<? super C10813l, C19394m> lVar) {
        super(view);
        C19383o.m32797g(lVar, "onChange");
        this.f28703b = lVar;
        View findViewById = view.findViewById(R.id.colorSwatch);
        C19383o.m32796f(findViewById, "colorView.findViewById(R.id.colorSwatch)");
        this.f28704c = (CollageColorSwatch) findViewById;
        View findViewById2 = view.findViewById(R.id.colorName);
        C19383o.m32796f(findViewById2, "colorView.findViewById(R.id.colorName)");
        this.f28705d = (CollageTextView) findViewById2;
    }
}
