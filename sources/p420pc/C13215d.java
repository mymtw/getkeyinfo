package p420pc;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$BooleanRef;
import p504ai.C13983i;
import p753kq.C19857l;

/* renamed from: pc.d */
public final class C13215d extends RecyclerView.Adapter<C13216a> {

    /* renamed from: b */
    public final List<C13213b> f29057b;

    /* renamed from: c */
    public final C19857l<C13213b, C19394m> f29058c;

    /* renamed from: pc.d$a */
    public final class C13216a extends RecyclerView.C3084b0 {

        /* renamed from: b */
        public final TextView f29059b;

        /* renamed from: c */
        public final ImageView f29060c;

        public C13216a(View view) {
            super(view);
            View findViewById = this.itemView.findViewById(R.id.variation_item_label);
            C19383o.m32796f(findViewById, "itemView.findViewById(R.id.variation_item_label)");
            this.f29059b = (TextView) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.check);
            C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.check)");
            this.f29060c = (ImageView) findViewById2;
        }
    }

    public C13215d(C19857l lVar, List list) {
        this.f29057b = list;
        this.f29058c = lVar;
    }

    public final int getItemCount() {
        return this.f29057b.size();
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C13216a aVar = (C13216a) b0Var;
        C19383o.m32797g(aVar, "holder");
        C13213b bVar = this.f29057b.get(i);
        C19383o.m32797g(bVar, "filterData");
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = bVar.f29052b;
        TextView textView = aVar.f29059b;
        textView.setText(textView.getResources().getString(bVar.f29051a.getNameId()));
        if (ref$BooleanRef.element) {
            ViewExtensions.m12869m(aVar.f29060c);
        } else {
            ViewExtensions.m12863g(aVar.f29060c);
        }
        aVar.itemView.setOnClickListener(new C13214c(ref$BooleanRef, aVar, C13215d.this, bVar));
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View h = C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.layout_variation_sheet_item, viewGroup, false);
        C19383o.m32796f(h, "view");
        return new C13216a(h);
    }
}
