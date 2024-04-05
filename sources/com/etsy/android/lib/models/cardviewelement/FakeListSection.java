package com.etsy.android.lib.models.cardviewelement;

import com.etsy.android.lib.models.apiv3.ListReminder;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p415of.C13186o;
import p568fn.C17782b;

public final class FakeListSection extends ListSection {
    public static final int $stable = 0;

    public FakeListSection() {
        BasicSectionHeader basicSectionHeader = new BasicSectionHeader();
        basicSectionHeader.title = "meow";
        this.mHeader = basicSectionHeader;
    }

    public List<C13186o> getItems() {
        C19383o.m32794d((Object) null);
        return C17782b.m29866f0(ListReminder.Companion.fake());
    }
}
