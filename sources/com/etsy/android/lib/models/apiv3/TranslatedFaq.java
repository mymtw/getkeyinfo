package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class TranslatedFaq {
    public static final int $stable = 0;
    private final String answer;

    /* renamed from: id */
    private final String f19140id;
    private final String question;

    public TranslatedFaq(@C17402n(name = "faq_id") String str, @C17402n(name = "question") String str2, @C17402n(name = "answer") String str3) {
        this.f19140id = str;
        this.question = str2;
        this.answer = str3;
    }

    public static /* synthetic */ TranslatedFaq copy$default(TranslatedFaq translatedFaq, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = translatedFaq.f19140id;
        }
        if ((i & 2) != 0) {
            str2 = translatedFaq.question;
        }
        if ((i & 4) != 0) {
            str3 = translatedFaq.answer;
        }
        return translatedFaq.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f19140id;
    }

    public final String component2() {
        return this.question;
    }

    public final String component3() {
        return this.answer;
    }

    public final TranslatedFaq copy(@C17402n(name = "faq_id") String str, @C17402n(name = "question") String str2, @C17402n(name = "answer") String str3) {
        return new TranslatedFaq(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslatedFaq)) {
            return false;
        }
        TranslatedFaq translatedFaq = (TranslatedFaq) obj;
        return C19383o.m32792b(this.f19140id, translatedFaq.f19140id) && C19383o.m32792b(this.question, translatedFaq.question) && C19383o.m32792b(this.answer, translatedFaq.answer);
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final String getId() {
        return this.f19140id;
    }

    public final String getQuestion() {
        return this.question;
    }

    public int hashCode() {
        String str = this.f19140id;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.question;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.answer;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("TranslatedFaq(id=");
        h.append(this.f19140id);
        h.append(", question=");
        h.append(this.question);
        h.append(", answer=");
        return C0391c.m1057c(h, this.answer, ')');
    }
}
