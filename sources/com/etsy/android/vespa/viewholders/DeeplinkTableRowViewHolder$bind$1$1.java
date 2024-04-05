package com.etsy.android.vespa.viewholders;

import android.view.View;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.models.apiv3.vespa.DeeplinkTableRow;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class DeeplinkTableRowViewHolder$bind$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ DeeplinkTableRow $data;
    public final /* synthetic */ C12095j this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeeplinkTableRowViewHolder$bind$1$1(C12095j jVar, DeeplinkTableRow deeplinkTableRow) {
        super(1);
        this.this$0 = jVar;
        this.$data = deeplinkTableRow;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f26980d.mo31328c(this.$data.getLink());
        C8672b bVar = this.this$0.f26979c;
        DeeplinkTableRow deeplinkTableRow = this.$data;
        C19383o.m32797g(deeplinkTableRow, "<this>");
        bVar.mo21333d("list_section_tapped_deep_link_row", C19388s.m32882r0(deeplinkTableRow));
    }
}
