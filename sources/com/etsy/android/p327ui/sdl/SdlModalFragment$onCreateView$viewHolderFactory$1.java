package com.etsy.android.p327ui.sdl;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.cart.viewholders.C9387i0;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p472wb.C13799a;
import p472wb.C13801b;

/* renamed from: com.etsy.android.ui.sdl.SdlModalFragment$onCreateView$viewHolderFactory$1 */
public final class SdlModalFragment$onCreateView$viewHolderFactory$1 extends C13801b {

    /* renamed from: I */
    public final /* synthetic */ SdlModalFragment f23626I;

    /* renamed from: J */
    public final /* synthetic */ int f23627J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SdlModalFragment$onCreateView$viewHolderFactory$1(SdlModalFragment sdlModalFragment, int i, C13799a aVar) {
        super(aVar);
        this.f23626I = sdlModalFragment;
        this.f23627J = i;
    }

    /* renamed from: b */
    public final C12086e<? extends Object> mo31854b(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        if (i != R.id.view_type_html_text) {
            return super.mo31854b(viewGroup, i);
        }
        C9387i0 i0Var = new C9387i0(viewGroup, new C10713x18b54f66(this.f23626I));
        View view = i0Var.itemView;
        int i2 = this.f23627J;
        C19383o.m32796f(view, "");
        view.setPadding(i2, view.getPaddingTop(), i2, view.getPaddingBottom());
        view.setBackground((Drawable) null);
        return i0Var;
    }
}
