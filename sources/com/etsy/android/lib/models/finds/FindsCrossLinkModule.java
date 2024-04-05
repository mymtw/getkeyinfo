package com.etsy.android.lib.models.finds;

import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.FindsCard;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p415of.C13186o;

public final class FindsCrossLinkModule extends FindsModule {
    public static final int $stable = 0;

    public static final class Page extends FindsCard {
        public static final int $stable = 0;

        public Page() {
            setViewType(0);
        }
    }

    public List<C13186o> getCardViewElements() {
        List<Page> list = this.mPages;
        C19383o.m32796f(list, "mPages");
        return list;
    }

    public void setFromGeneric(FindsModule findsModule) {
        C19383o.m32797g(findsModule, "generic");
        super.setFromGeneric(findsModule);
        this.mPages = findsModule.mPages;
        int i = C19383o.m32792b(FindsModule.SMALL_CROSSLINK_TYPE, findsModule.mType) ? R.id.view_type_finds_card_small : R.id.view_type_finds_card;
        for (Page viewType : this.mPages) {
            viewType.setViewType(i);
        }
    }
}
