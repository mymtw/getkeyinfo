package com.etsy.android.lib.models;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class TranslatedConversationMessage {
    public static final int $stable = 0;
    private final String text;

    public TranslatedConversationMessage(@C17402n(name = "message") String str) {
        C19383o.m32797g(str, "text");
        this.text = str;
    }

    public static /* synthetic */ TranslatedConversationMessage copy$default(TranslatedConversationMessage translatedConversationMessage, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = translatedConversationMessage.text;
        }
        return translatedConversationMessage.copy(str);
    }

    public final String component1() {
        return this.text;
    }

    public final TranslatedConversationMessage copy(@C17402n(name = "message") String str) {
        C19383o.m32797g(str, "text");
        return new TranslatedConversationMessage(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TranslatedConversationMessage) && C19383o.m32792b(this.text, ((TranslatedConversationMessage) obj).text);
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode();
    }

    public String toString() {
        return C0391c.m1057c(C0072d.m201h("TranslatedConversationMessage(text="), this.text, ')');
    }
}
