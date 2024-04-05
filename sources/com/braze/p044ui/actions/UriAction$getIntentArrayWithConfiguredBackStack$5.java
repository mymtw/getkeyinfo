package com.braze.p044ui.actions;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.actions.UriAction$getIntentArrayWithConfiguredBackStack$5 */
public final class UriAction$getIntentArrayWithConfiguredBackStack$5 extends Lambda implements C19846a<String> {
    public static final UriAction$getIntentArrayWithConfiguredBackStack$5 INSTANCE = new UriAction$getIntentArrayWithConfiguredBackStack$5();

    public UriAction$getIntentArrayWithConfiguredBackStack$5() {
        super(0);
    }

    public final String invoke() {
        return "Not adding back stack activity while opening uri from push due to disabled configuration setting.";
    }
}
