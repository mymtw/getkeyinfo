package com.braze.p044ui.actions.brazeactions;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.actions.brazeactions.BrazeActionParser$execute$2 */
public final class BrazeActionParser$execute$2 extends Lambda implements C19846a<String> {
    public static final BrazeActionParser$execute$2 INSTANCE = new BrazeActionParser$execute$2();

    public BrazeActionParser$execute$2() {
        super(0);
    }

    public final String invoke() {
        return "Failed to decode Braze Action into both version and json components. Doing nothing.";
    }
}
