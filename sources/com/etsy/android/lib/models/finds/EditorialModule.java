package com.etsy.android.lib.models.finds;

import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.EditorialCard;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p415of.C13186o;

public final class EditorialModule extends FindsModule {
    public static final int $stable = 0;

    public List<C13186o> getCardViewElements() {
        List<EditorialCard> list = this.editorials;
        C19383o.m32796f(list, "editorials");
        return list;
    }

    public final List<EditorialCard> getEditorials() {
        List<EditorialCard> list = this.editorials;
        C19383o.m32796f(list, "editorials");
        return list;
    }

    public int getViewType() {
        return R.id.view_type_finds_editorial;
    }

    public final void setEditorials(List<EditorialCard> list) {
        C19383o.m32797g(list, "editorials");
        this.editorials = list;
    }

    public void setFromGeneric(FindsModule findsModule) {
        C19383o.m32797g(findsModule, "generic");
        super.setFromGeneric(findsModule);
        this.editorials = findsModule.editorials;
    }
}
