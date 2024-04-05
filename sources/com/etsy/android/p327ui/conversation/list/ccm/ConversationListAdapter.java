package com.etsy.android.p327ui.conversation.list.ccm;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C3200w;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.conversation.list.C9570b;
import com.etsy.android.p327ui.conversation.list.ConversationViewHolder;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import p354gc.C12760a;
import p354gc.C12763b;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.list.ccm.ConversationListAdapter */
public final class ConversationListAdapter extends C3200w<C12760a, RecyclerView.C3084b0> {

    /* renamed from: c */
    public final C19857l<EtsyId, C19394m> f21229c;

    /* renamed from: d */
    public final C19857l<C12763b, C19394m> f21230d;

    /* renamed from: e */
    public final C19846a<C19394m> f21231e;

    /* renamed from: com.etsy.android.ui.conversation.list.ccm.ConversationListAdapter$ViewType */
    public enum ViewType {
        CONVERSATION,
        DATE_HEADER
    }

    /* renamed from: com.etsy.android.ui.conversation.list.ccm.ConversationListAdapter$a */
    public /* synthetic */ class C9571a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21232a;

        static {
            int[] iArr = new int[ViewType.values().length];
            iArr[ViewType.CONVERSATION.ordinal()] = 1;
            iArr[ViewType.DATE_HEADER.ordinal()] = 2;
            f21232a = iArr;
        }
    }

    public ConversationListAdapter(C19846a aVar, C19857l lVar, C19857l lVar2) {
        super(new C9577a());
        this.f21229c = lVar;
        this.f21230d = lVar2;
        this.f21231e = aVar;
    }

    public final int getItemViewType(int i) {
        C12760a aVar = (C12760a) getItem(i);
        if (aVar instanceof C12760a.C12761a) {
            return ViewType.CONVERSATION.ordinal();
        }
        if (aVar instanceof C12760a.C12762b) {
            return ViewType.DATE_HEADER.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C19383o.m32797g(b0Var, "viewHolder");
        if (b0Var instanceof ConversationViewHolder) {
            Object item = getItem(i);
            C19383o.m32795e(item, "null cannot be cast to non-null type com.etsy.android.ui.conversation.models.ConversationListItem.Conversation");
            ((ConversationViewHolder) b0Var).mo32178e(((C12760a.C12761a) item).f28205b);
        } else if (b0Var instanceof C9570b) {
            Object item2 = getItem(i);
            C19383o.m32795e(item2, "null cannot be cast to non-null type com.etsy.android.ui.conversation.models.ConversationListItem.DateHeader");
            String str = ((C12760a.C12762b) item2).f28206b;
            C19383o.m32797g(str, "headerTitle");
            ((TextView) ((C9570b) b0Var).itemView.findViewById(R.id.header_text_view)).setText(str);
        }
        if (i == getItemCount() - 1) {
            this.f21231e.invoke();
        }
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        int i2 = C9571a.f21232a[ViewType.values()[i].ordinal()];
        if (i2 == 1) {
            return new ConversationViewHolder(viewGroup, this.f21229c, this.f21230d);
        }
        if (i2 == 2) {
            return new C9570b(viewGroup);
        }
        throw new NoWhenBranchMatchedException();
    }
}
