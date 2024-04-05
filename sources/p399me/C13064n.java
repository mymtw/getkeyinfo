package p399me;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.search.filters.refactor.C10862y;
import com.etsy.android.stylekit.views.CollageContentToggle;
import com.etsy.android.stylekit.views.CollageRadioButton;
import com.etsy.android.stylekit.views.CollageRadioGroup;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p568fn.C17782b;

/* renamed from: me.n */
public abstract class C13064n extends C10862y {

    /* renamed from: b */
    public final CollageContentToggle f28728b;

    /* renamed from: c */
    public final CollageRadioGroup f28729c;

    /* renamed from: d */
    public final ArrayList f28730d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13064n(ViewGroup viewGroup) {
        super(C0114h.m305j0(viewGroup, R.layout.search_filters_item_radio_buttons, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        View view = this.itemView;
        C19383o.m32795e(view, "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageContentToggle");
        this.f28728b = (CollageContentToggle) view;
        View findViewById = this.itemView.findViewById(R.id.filter_options);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.filter_options)");
        this.f28729c = (CollageRadioGroup) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.radio_type_0);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.radio_type_0)");
        View findViewById3 = this.itemView.findViewById(R.id.radio_type_1);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.radio_type_1)");
        View findViewById4 = this.itemView.findViewById(R.id.radio_type_2);
        C19383o.m32796f(findViewById4, "itemView.findViewById(R.id.radio_type_2)");
        this.f28730d = C17782b.m29866f0((CollageRadioButton) findViewById2, (CollageRadioButton) findViewById3, (CollageRadioButton) findViewById4);
    }

    /* renamed from: f */
    public final void mo45822f(int i) {
        if (i == 0) {
            ViewExtensions.m12860d(this.f28729c);
            return;
        }
        ViewExtensions.m12869m(this.f28729c);
        if (this.f28730d.size() > i) {
            int size = this.f28730d.size();
            while (i < size) {
                ViewExtensions.m12860d((View) this.f28730d.get(i));
                i++;
            }
        } else if (this.f28730d.size() < i) {
            int size2 = i - this.f28730d.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Context context = this.f28728b.getContext();
                C19383o.m32796f(context, "contentToggle.context");
                CollageRadioButton collageRadioButton = new CollageRadioButton(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                collageRadioButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                collageRadioButton.setDirection(1);
                this.f28730d.add(collageRadioButton);
                this.f28729c.addView(collageRadioButton);
            }
        }
    }
}
