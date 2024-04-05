package com.etsy.android.lib.models.apiv3;

import com.etsy.android.uikit.util.MachineTranslationViewState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class FAQs extends ArrayList<FAQ> {
    private static final long serialVersionUID = 4072472450694829549L;
    public MachineTranslationViewState mTranslationState = new MachineTranslationViewState();

    public MachineTranslationViewState getTranslationState() {
        return this.mTranslationState;
    }

    public void updateTranslatedFAQs(List<FAQ> list) {
        HashMap hashMap = new HashMap(list.size());
        for (FAQ next : list) {
            hashMap.put(next.getFaqId().getId(), next);
        }
        Iterator it = iterator();
        while (it.hasNext()) {
            FAQ faq = (FAQ) it.next();
            FAQ faq2 = (FAQ) hashMap.get(faq.getFaqId().getId());
            if (faq2 != null) {
                faq.setTranslatedQuestion(faq2.getQuestion());
                faq.setTranslatedAnswer(faq2.getAnswer());
                faq.setShowTranslatedFAQ(true);
            }
        }
    }
}
