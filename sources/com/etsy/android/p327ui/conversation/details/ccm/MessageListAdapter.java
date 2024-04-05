package com.etsy.android.p327ui.conversation.details.ccm;

import android.text.format.DateUtils;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C3200w;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.p327ui.conversation.details.C9475a;
import com.etsy.android.p327ui.conversation.details.C9556m;
import com.etsy.android.p327ui.conversation.details.C9558n;
import com.etsy.android.p327ui.conversation.details.C9564q;
import com.etsy.android.p327ui.conversation.details.C9568s;
import com.etsy.android.p327ui.conversation.details.OrderHelpRequestViewHolder;
import com.etsy.android.p327ui.conversation.details.OtherUserMessageViewHolder;
import com.etsy.android.p327ui.conversation.details.ccm.ConversationDetailsFragment;
import com.etsy.android.stylekit.views.CollageHeadingTextView;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import p354gc.C12778k;
import p504ai.C13983i;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.MessageListAdapter */
public final class MessageListAdapter extends C3200w<C12778k, RecyclerView.C3084b0> {

    /* renamed from: c */
    public final C8923u f21045c;

    /* renamed from: d */
    public final C9558n f21046d;

    /* renamed from: e */
    public final C9564q f21047e;

    /* renamed from: f */
    public final C9568s f21048f;

    /* renamed from: g */
    public final C9475a f21049g;

    /* renamed from: h */
    public final C19857l<String, C19394m> f21050h;

    /* renamed from: i */
    public final C19846a<C19394m> f21051i;

    /* renamed from: com.etsy.android.ui.conversation.details.ccm.MessageListAdapter$ViewType */
    public enum ViewType {
        CURRENT_USER_MESSAGE,
        OTHER_USER_MESSAGE,
        TIMESTAMP,
        ORDER_HELP_REQUEST
    }

    /* renamed from: com.etsy.android.ui.conversation.details.ccm.MessageListAdapter$a */
    public final class C9490a extends RecyclerView.C3084b0 {
        public C9490a(ViewGroup viewGroup) {
            super(C13983i.m21489h(viewGroup, "parentView", R.layout.list_item_conversation_date, viewGroup, false));
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.ccm.MessageListAdapter$b */
    public /* synthetic */ class C9491b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21052a;

        static {
            int[] iArr = new int[ViewType.values().length];
            iArr[ViewType.CURRENT_USER_MESSAGE.ordinal()] = 1;
            iArr[ViewType.OTHER_USER_MESSAGE.ordinal()] = 2;
            iArr[ViewType.TIMESTAMP.ordinal()] = 3;
            iArr[ViewType.ORDER_HELP_REQUEST.ordinal()] = 4;
            f21052a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageListAdapter(C8923u uVar, ConversationDetailsFragment.C9479b bVar, ConversationDetailsFragment.C9480c cVar, ConversationDetailsFragment.C9481d dVar, ConversationDetailsFragment.C9482e eVar, C19857l lVar, C19846a aVar) {
        super(new C9512p());
        C19383o.m32797g(uVar, "translationHelper");
        this.f21045c = uVar;
        this.f21046d = bVar;
        this.f21047e = cVar;
        this.f21048f = dVar;
        this.f21049g = eVar;
        this.f21050h = lVar;
        this.f21051i = aVar;
    }

    public final int getItemViewType(int i) {
        C12778k kVar = (C12778k) getItem(i);
        if (kVar instanceof C12778k.C12779a) {
            return ViewType.CURRENT_USER_MESSAGE.ordinal();
        }
        if (kVar instanceof C12778k.C12781c) {
            return ViewType.OTHER_USER_MESSAGE.ordinal();
        }
        if (kVar instanceof C12778k.C12782d) {
            return ViewType.TIMESTAMP.ordinal();
        }
        if (kVar instanceof C12778k.C12780b) {
            return ViewType.ORDER_HELP_REQUEST.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C19846a<C19394m> aVar;
        C19383o.m32797g(b0Var, "viewHolder");
        C12778k kVar = (C12778k) getItem(i);
        if (kVar instanceof C12778k.C12779a) {
            C12778k.C12779a aVar2 = (C12778k.C12779a) kVar;
            C19383o.m32797g(aVar2, "item");
            ((C9556m) b0Var).mo31958e(aVar2.f28235b, aVar2.f28236c);
        } else if (kVar instanceof C12778k.C12781c) {
            ((OtherUserMessageViewHolder) b0Var).mo31964h((C12778k.C12781c) kVar);
        } else if (kVar instanceof C12778k.C12782d) {
            C9490a aVar3 = (C9490a) b0Var;
            C12778k.C12782d dVar = (C12778k.C12782d) kVar;
            C19383o.m32797g(dVar, "item");
            ((CollageHeadingTextView) aVar3.itemView.findViewById(R.id.date)).setText(DateUtils.formatDateTime(aVar3.itemView.getContext(), dVar.f28243b, 17));
        } else if (kVar instanceof C12778k.C12780b) {
            ((OrderHelpRequestViewHolder) b0Var).mo31962e((C12778k.C12780b) kVar);
        }
        if (i == getItemCount() - 1 && (aVar = this.f21051i) != null) {
            aVar.invoke();
        }
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        int i2 = C9491b.f21052a[ViewType.values()[i].ordinal()];
        if (i2 == 1) {
            return new C9556m(viewGroup, this.f21046d, this.f21047e);
        }
        if (i2 == 2) {
            return new OtherUserMessageViewHolder(viewGroup, this.f21046d, this.f21047e, this.f21048f, this.f21045c, this.f21049g);
        } else if (i2 == 3) {
            return new C9490a(viewGroup);
        } else {
            if (i2 == 4) {
                return new OrderHelpRequestViewHolder(viewGroup, this.f21050h);
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
