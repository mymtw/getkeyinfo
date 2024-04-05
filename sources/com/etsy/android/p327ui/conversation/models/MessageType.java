package com.etsy.android.p327ui.conversation.models;

/* renamed from: com.etsy.android.ui.conversation.models.MessageType */
public enum MessageType {
    USER(1),
    SYSTEM(2),
    AUTO_REPLY(3);
    
    public static final C9603a Companion = null;
    private final int rawType;

    /* renamed from: com.etsy.android.ui.conversation.models.MessageType$a */
    public static final class C9603a {
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C9603a();
    }

    private MessageType(int i) {
        this.rawType = i;
    }

    public final int getRawType() {
        return this.rawType;
    }
}
