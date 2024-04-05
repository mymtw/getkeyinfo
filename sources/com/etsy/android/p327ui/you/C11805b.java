package com.etsy.android.p327ui.you;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C3200w;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.you.C11800a;
import com.etsy.android.p327ui.you.C11806c;
import com.etsy.android.stylekit.views.CollageListItem;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.jvm.internal.C19383o;
import p075d.C6614a;
import p479xa.C13862a;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.you.b */
public final class C11805b extends C3200w<C11806c, C11818f> {

    /* renamed from: c */
    public final C11816d f26282c;

    /* renamed from: d */
    public final boolean f26283d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11805b(YouFragment youFragment, boolean z) {
        super(C11817e.f26296a);
        C19383o.m32797g(youFragment, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f26282c = youFragment;
        this.f26283d = z;
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C11818f fVar = (C11818f) b0Var;
        C19383o.m32797g(fVar, "viewHolder");
        C11806c cVar = (C11806c) getItem(i);
        C19383o.m32796f(cVar, "menuOption");
        C11816d dVar = this.f26282c;
        C19383o.m32797g(dVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (cVar instanceof C11806c.C11810d) {
            fVar.f26299c.setText(fVar.f26298b ? R.string.nav_switch_to_sell_on_etsy : R.string.nav_get_sell_on_etsy);
        } else {
            fVar.f26299c.setText(cVar.f26284a);
        }
        String str = cVar.f26285b;
        if (str != null) {
            fVar.f26299c.setMetaText(str);
        } else {
            fVar.f26299c.setMetaText((String) null);
        }
        Object obj = cVar instanceof C11806c.C11808b ? ((C11806c.C11808b) cVar).f26288d : cVar instanceof C11806c.C11809c ? ((C11806c.C11809c) cVar).f26289d : C11800a.C11804d.f26281a;
        if (obj instanceof C11800a.C11804d) {
            fVar.f26299c.setBadgeCount(0);
        } else if (obj instanceof C11800a.C11801a) {
            fVar.f26299c.setBadgeCount(((C11800a.C11801a) obj).f26278a);
        } else if (obj instanceof C11800a.C11802b) {
            fVar.f26299c.setBadgeCount(1);
        } else if (obj instanceof C11800a.C11803c) {
            fVar.f26299c.setBadgeCount(10);
        }
        Integer num = cVar.f26286c;
        if (num != null) {
            fVar.f26299c.setIconRes(num.intValue());
        }
        if (!(cVar instanceof C11806c.C11812f)) {
            CollageListItem collageListItem = fVar.f26299c;
            collageListItem.setBackground(C6614a.m12981a(collageListItem.getContext(), R.drawable.clg_touch_feedback));
            fVar.f26299c.setImportantForAccessibility(1);
        } else {
            fVar.f26299c.setBackground((Drawable) null);
            fVar.f26299c.setImportantForAccessibility(2);
        }
        fVar.itemView.setOnClickListener(new C13862a(4, dVar, cVar));
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View h = C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_you_menu_option, viewGroup, false);
        C19383o.m32796f(h, "view");
        return new C11818f(h, this.f26283d);
    }
}
