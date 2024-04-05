package com.braze.p044ui.contentcards.adapters;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C3167n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.models.cards.Card;
import com.braze.p044ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.braze.p044ui.contentcards.managers.BrazeContentCardsManager;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p091e4.C6716b;
import p102f4.C6784b;

/* renamed from: com.braze.ui.contentcards.adapters.ContentCardAdapter */
public final class ContentCardAdapter extends RecyclerView.Adapter<C6784b> implements C6716b {

    /* renamed from: b */
    public final Context f12037b;

    /* renamed from: c */
    public final LinearLayoutManager f12038c;

    /* renamed from: d */
    public final List<Card> f12039d;

    /* renamed from: e */
    public final IContentCardsViewBindingHandler f12040e;

    /* renamed from: f */
    public final Handler f12041f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    public Set<String> f12042g = new LinkedHashSet();

    /* renamed from: com.braze.ui.contentcards.adapters.ContentCardAdapter$a */
    public static final class C5634a extends C3167n.C3169b {

        /* renamed from: a */
        public final List<Card> f12043a;

        /* renamed from: b */
        public final List<Card> f12044b;

        public C5634a(List<? extends Card> list, List<? extends Card> list2) {
            C19383o.m32797g(list, "oldCards");
            this.f12043a = list;
            this.f12044b = list2;
        }

        /* renamed from: a */
        public final boolean mo11830a(int i, int i2) {
            return mo16245f(i, i2);
        }

        /* renamed from: b */
        public final boolean mo11831b(int i, int i2) {
            return mo16245f(i, i2);
        }

        /* renamed from: d */
        public final int mo11833d() {
            return this.f12044b.size();
        }

        /* renamed from: e */
        public final int mo11834e() {
            return this.f12043a.size();
        }

        /* renamed from: f */
        public final boolean mo16245f(int i, int i2) {
            return C19383o.m32792b(this.f12043a.get(i).getId(), this.f12044b.get(i2).getId());
        }
    }

    public ContentCardAdapter(Context context, LinearLayoutManager linearLayoutManager, ArrayList arrayList, IContentCardsViewBindingHandler iContentCardsViewBindingHandler) {
        C19383o.m32797g(iContentCardsViewBindingHandler, "contentCardsViewBindingHandler");
        this.f12037b = context;
        this.f12038c = linearLayoutManager;
        this.f12039d = arrayList;
        this.f12040e = iContentCardsViewBindingHandler;
        setHasStableIds(true);
    }

    /* renamed from: a */
    public final boolean mo16239a(int i) {
        if (this.f12039d.isEmpty()) {
            return false;
        }
        return this.f12039d.get(i).isDismissibleByUser();
    }

    /* renamed from: d */
    public final void mo16240d(int i) {
        this.f12039d.remove(i).setDismissed(true);
        notifyItemRemoved(i);
        if (BrazeContentCardsManager.f12051b.getValue().f12052a != null) {
            C19383o.m32797g(this.f12037b, ResponseConstants.CONTEXT);
        }
    }

    public final int getItemCount() {
        return this.f12039d.size();
    }

    public final long getItemId(int i) {
        String id;
        Card j = mo16241j(i);
        if (j == null || (id = j.getId()) == null) {
            return 0;
        }
        return (long) id.hashCode();
    }

    public final int getItemViewType(int i) {
        return this.f12040e.getItemViewType(this.f12037b, this.f12039d, i);
    }

    /* renamed from: j */
    public final Card mo16241j(int i) {
        if (i >= 0 && i < this.f12039d.size()) {
            return this.f12039d.get(i);
        }
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new ContentCardAdapter$getCardAtIndex$1(i, this), 7);
        return null;
    }

    /* renamed from: k */
    public final boolean mo16242k(int i) {
        return Math.min(this.f12038c.mo11282S0(), this.f12038c.mo11279P0()) <= i && i <= Math.max(this.f12038c.mo11284U0(), this.f12038c.mo11283T0());
    }

    /* renamed from: l */
    public final void mo16243l() {
        if (this.f12039d.isEmpty()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, ContentCardAdapter$markOnScreenCardsAsRead$1.INSTANCE, 7);
            return;
        }
        int S0 = this.f12038c.mo11282S0();
        int U0 = this.f12038c.mo11284U0();
        if (S0 < 0 || U0 < 0) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new ContentCardAdapter$markOnScreenCardsAsRead$2(S0, U0), 7);
            return;
        }
        if (S0 <= U0) {
            int i = S0;
            while (true) {
                int i2 = i + 1;
                Card j = mo16241j(i);
                if (j != null) {
                    j.setIndicatorHighlighted(true);
                }
                if (i == U0) {
                    break;
                }
                i = i2;
            }
        }
        this.f12041f.post(new C5636b(U0, S0, this));
    }

    /* renamed from: m */
    public final void mo16244m(ArrayList arrayList) {
        this.f12042g = C19327t.m32663s1(arrayList);
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C6784b bVar = (C6784b) b0Var;
        C19383o.m32797g(bVar, "viewHolder");
        this.f12040e.onBindViewHolder(this.f12037b, this.f12039d, bVar, i);
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, "viewGroup");
        return this.f12040e.onCreateViewHolder(this.f12037b, this.f12039d, viewGroup, i);
    }

    public final void onViewAttachedToWindow(RecyclerView.C3084b0 b0Var) {
        C6784b bVar = (C6784b) b0Var;
        C19383o.m32797g(bVar, "holder");
        super.onViewAttachedToWindow(bVar);
        if (!this.f12039d.isEmpty()) {
            int bindingAdapterPosition = bVar.getBindingAdapterPosition();
            if (bindingAdapterPosition == -1 || !mo16242k(bindingAdapterPosition)) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new ContentCardAdapter$onViewAttachedToWindow$1(bindingAdapterPosition), 6);
                return;
            }
            Card j = mo16241j(bindingAdapterPosition);
            if (j != null) {
                if (!this.f12042g.contains(j.getId())) {
                    j.logImpression();
                    this.f12042g.add(j.getId());
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new ContentCardAdapter$logImpression$1(j), 6);
                } else {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new ContentCardAdapter$logImpression$2(j), 6);
                }
                if (!j.getViewed()) {
                    j.setViewed(true);
                }
            }
        }
    }

    public final void onViewDetachedFromWindow(RecyclerView.C3084b0 b0Var) {
        C6784b bVar = (C6784b) b0Var;
        C19383o.m32797g(bVar, "holder");
        super.onViewDetachedFromWindow(bVar);
        if (!this.f12039d.isEmpty()) {
            int bindingAdapterPosition = bVar.getBindingAdapterPosition();
            if (bindingAdapterPosition == -1 || !mo16242k(bindingAdapterPosition)) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new ContentCardAdapter$onViewDetachedFromWindow$1(bindingAdapterPosition), 6);
                return;
            }
            Card j = mo16241j(bindingAdapterPosition);
            if (j != null && !j.isIndicatorHighlighted()) {
                j.setIndicatorHighlighted(true);
                this.f12041f.post(new C5635a(bindingAdapterPosition, this));
            }
        }
    }
}
