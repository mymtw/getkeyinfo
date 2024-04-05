package com.etsy.android.lib.models.finds;

import java.util.List;
import p415of.C13186o;

public class FindsCategoryModule extends FindsModule {
    public List<? extends C13186o> getCardViewElements() {
        return getCategories();
    }

    public List<FindsSearchCategory> getCategories() {
        return this.mCategories;
    }

    public void setFromGeneric(FindsModule findsModule) {
        super.setFromGeneric(findsModule);
        this.mCategories = findsModule.mCategories;
    }
}
