package com.etsy.android.p327ui.favorites.search;

import android.widget.TextView;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.favorites.search.NoResultsViewHolder$errorMessage$2 */
final class NoResultsViewHolder$errorMessage$2 extends Lambda implements C19846a<TextView> {
    public final /* synthetic */ C9887c this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoResultsViewHolder$errorMessage$2(C9887c cVar) {
        super(0);
        this.this$0 = cVar;
    }

    public final TextView invoke() {
        return (TextView) this.this$0.itemView.findViewById(R.id.list_item_search_in_favorites_error_message_text_view);
    }
}
