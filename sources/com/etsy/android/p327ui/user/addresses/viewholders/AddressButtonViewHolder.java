package com.etsy.android.p327ui.user.addresses.viewholders;

import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.p327ui.user.addresses.C11396e;
import com.etsy.android.p327ui.user.addresses.C11430n;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.addresses.viewholders.AddressButtonViewHolder */
public final class AddressButtonViewHolder extends RecyclerView.C3084b0 {

    /* renamed from: b */
    public final List<C11396e> f25274b;

    /* renamed from: c */
    public final C19857l<C11430n, C19394m> f25275c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressButtonViewHolder(Button button, List list, C19857l lVar) {
        super(button);
        C19383o.m32797g(lVar, "eventHandler");
        this.f25274b = list;
        this.f25275c = lVar;
    }

    /* renamed from: e */
    public final void mo37301e(C11396e eVar) {
        if (C19383o.m32792b(eVar, C11396e.C11400d.f25127a)) {
            View view = this.itemView;
            C19383o.m32795e(view, "null cannot be cast to non-null type android.widget.Button");
            Button button = (Button) view;
            button.setText(R.string.delete);
            button.setContentDescription(button.getContext().getString(R.string.delete));
            ViewExtensions.m12866j(button, new AddressButtonViewHolder$bind$1(this));
        } else if (C19383o.m32792b(eVar, C11396e.C11406j.f25133a)) {
            View view2 = this.itemView;
            C19383o.m32795e(view2, "null cannot be cast to non-null type android.widget.Button");
            Button button2 = (Button) view2;
            button2.setText(R.string.save);
            button2.setContentDescription(button2.getContext().getString(R.string.save));
            ViewExtensions.m12866j(button2, new AddressButtonViewHolder$bind$2(this));
        } else {
            boolean z = true;
            if (!(eVar instanceof C11396e.C11398b ? true : eVar instanceof C11396e.C11402f ? true : eVar instanceof C11396e.C11401e ? true : eVar instanceof C11396e.C11407k ? true : eVar instanceof C11396e.C11403g ? true : eVar instanceof C11396e.C11405i ? true : eVar instanceof C11396e.C11404h)) {
                z = eVar instanceof C11396e.C11399c;
            }
            if (!z) {
                boolean z2 = eVar instanceof C11396e.C11397a;
            }
        }
    }
}
