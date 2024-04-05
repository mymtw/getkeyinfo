package com.etsy.android.lib.models.conversation.context;

import com.squareup.moshi.C17403o;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.adapters.C17389b;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = false)
public class ConversationContextAdapterFactory {
    public static final int $stable = 0;
    private static final String CUSTOM_ORDER = "CUSTOM_REQUEST";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JsonAdapter.C17360e adapterFactory() {
            PolymorphicJsonAdapterFactory<ConversationContextAdapterFactory> b = PolymorphicJsonAdapterFactory.m29127a(ConversationContextAdapterFactory.class, "context_type").mo68486b(CustomOrderContext.class, ConversationContextAdapterFactory.CUSTOM_ORDER);
            return new PolymorphicJsonAdapterFactory(b.f37945a, b.f37946b, b.f37947c, b.f37948d, new C17389b(b, new ConversationContextAdapterFactory()));
        }
    }

    public boolean equals(Object obj) {
        return obj instanceof ConversationContextAdapterFactory;
    }

    public int hashCode() {
        return 0;
    }
}
