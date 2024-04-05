package com.etsy.android.lib.models.conversation.context;

import com.etsy.android.lib.models.BaseFieldModel;

public abstract class ConversationContext extends BaseFieldModel {
    private static final int CONTEXT_TYPE_MANUFACTURER_PROJECT = 111;

    public static Class<? extends ConversationContext> getClassForContextTypeId(int i) {
        if (isSupportedContextTypeId(i) && i == 111) {
            return ManufacturerProject.class;
        }
        return null;
    }

    public static boolean isSupportedContextTypeId(int i) {
        return i == 111;
    }
}
