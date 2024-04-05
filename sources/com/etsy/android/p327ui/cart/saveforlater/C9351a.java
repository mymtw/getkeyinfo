package com.etsy.android.p327ui.cart.saveforlater;

import android.view.ViewGroup;
import androidx.compose.foundation.layout.C0761x;
import androidx.recyclerview.widget.C3167n;
import androidx.recyclerview.widget.C3200w;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.cart.saveforlater.models.p328ui.SaveForLaterViewType;
import com.etsy.android.p327ui.cart.saveforlater.models.p328ui.card.SflCardViewHolder;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.jvm.internal.C19383o;
import p308ac.C8497a;
import p315bc.C8548a;

/* renamed from: com.etsy.android.ui.cart.saveforlater.a */
public final class C9351a extends C3200w<C8497a, C9361f> {

    /* renamed from: com.etsy.android.ui.cart.saveforlater.a$a */
    public static final class C9352a extends C3167n.C3172e<C8497a> {

        /* renamed from: a */
        public static final C9352a f20639a = new C9352a();

        /* renamed from: a */
        public final boolean mo11900a(Object obj, Object obj2) {
            return C19383o.m32792b((C8497a) obj, (C8497a) obj2);
        }

        /* renamed from: b */
        public final boolean mo11901b(Object obj, Object obj2) {
            return C19383o.m32792b(((C8497a) obj).getId(), ((C8497a) obj2).getId());
        }
    }

    /* renamed from: com.etsy.android.ui.cart.saveforlater.a$b */
    public /* synthetic */ class C9353b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20640a;

        static {
            int[] iArr = new int[SaveForLaterViewType.values().length];
            iArr[SaveForLaterViewType.NONE.ordinal()] = 1;
            iArr[SaveForLaterViewType.CARD.ordinal()] = 2;
            f20640a = iArr;
        }
    }

    public C9351a() {
        super(C9352a.f20639a);
    }

    public final int getItemViewType(int i) {
        return ((C8497a) getItem(i)).getViewType().ordinal();
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C9361f fVar = (C9361f) b0Var;
        C19383o.m32797g(fVar, "holder");
        Object item = getItem(i);
        C19383o.m32796f(item, "getItem(position)");
        fVar.mo21074e((C8497a) item);
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object obj;
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        try {
            obj = Result.m35480constructorimpl(SaveForLaterViewType.values()[i]);
        } catch (Throwable th) {
            obj = Result.m35480constructorimpl(C0761x.m1673J(th));
        }
        if (Result.m35483exceptionOrNullimpl(obj) != null) {
            obj = SaveForLaterViewType.NONE;
        }
        int i2 = C9353b.f20640a[((SaveForLaterViewType) obj).ordinal()];
        if (i2 == 1) {
            return new C8548a(viewGroup);
        }
        if (i2 == 2) {
            return new SflCardViewHolder(viewGroup);
        }
        throw new NoWhenBranchMatchedException();
    }
}
