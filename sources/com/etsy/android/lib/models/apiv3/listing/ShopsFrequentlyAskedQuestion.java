package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ShopsFrequentlyAskedQuestion {
    public static final int $stable = 8;
    private String answer;
    private Integer createDate;
    private String createDateFormatted;
    private Long faqId;
    private String language;
    private String question;
    private Integer updateDate;
    private String updateDateFormatted;

    public ShopsFrequentlyAskedQuestion() {
        this((String) null, (Integer) null, (String) null, (Long) null, (String) null, (String) null, (Integer) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    public ShopsFrequentlyAskedQuestion(@C17402n(name = "answer") String str, @C17402n(name = "create_date") Integer num, @C17402n(name = "create_date_formatted") String str2, @C17402n(name = "faq_id") Long l, @C17402n(name = "language") String str3, @C17402n(name = "question") String str4, @C17402n(name = "update_date") Integer num2, @C17402n(name = "update_date_formatted") String str5) {
        this.answer = str;
        this.createDate = num;
        this.createDateFormatted = str2;
        this.faqId = l;
        this.language = str3;
        this.question = str4;
        this.updateDate = num2;
        this.updateDateFormatted = str5;
    }

    public static /* synthetic */ ShopsFrequentlyAskedQuestion copy$default(ShopsFrequentlyAskedQuestion shopsFrequentlyAskedQuestion, String str, Integer num, String str2, Long l, String str3, String str4, Integer num2, String str5, int i, Object obj) {
        ShopsFrequentlyAskedQuestion shopsFrequentlyAskedQuestion2 = shopsFrequentlyAskedQuestion;
        int i2 = i;
        return shopsFrequentlyAskedQuestion.copy((i2 & 1) != 0 ? shopsFrequentlyAskedQuestion2.answer : str, (i2 & 2) != 0 ? shopsFrequentlyAskedQuestion2.createDate : num, (i2 & 4) != 0 ? shopsFrequentlyAskedQuestion2.createDateFormatted : str2, (i2 & 8) != 0 ? shopsFrequentlyAskedQuestion2.faqId : l, (i2 & 16) != 0 ? shopsFrequentlyAskedQuestion2.language : str3, (i2 & 32) != 0 ? shopsFrequentlyAskedQuestion2.question : str4, (i2 & 64) != 0 ? shopsFrequentlyAskedQuestion2.updateDate : num2, (i2 & 128) != 0 ? shopsFrequentlyAskedQuestion2.updateDateFormatted : str5);
    }

    public final String component1() {
        return this.answer;
    }

    public final Integer component2() {
        return this.createDate;
    }

    public final String component3() {
        return this.createDateFormatted;
    }

    public final Long component4() {
        return this.faqId;
    }

    public final String component5() {
        return this.language;
    }

    public final String component6() {
        return this.question;
    }

    public final Integer component7() {
        return this.updateDate;
    }

    public final String component8() {
        return this.updateDateFormatted;
    }

    public final ShopsFrequentlyAskedQuestion copy(@C17402n(name = "answer") String str, @C17402n(name = "create_date") Integer num, @C17402n(name = "create_date_formatted") String str2, @C17402n(name = "faq_id") Long l, @C17402n(name = "language") String str3, @C17402n(name = "question") String str4, @C17402n(name = "update_date") Integer num2, @C17402n(name = "update_date_formatted") String str5) {
        return new ShopsFrequentlyAskedQuestion(str, num, str2, l, str3, str4, num2, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopsFrequentlyAskedQuestion)) {
            return false;
        }
        ShopsFrequentlyAskedQuestion shopsFrequentlyAskedQuestion = (ShopsFrequentlyAskedQuestion) obj;
        return C19383o.m32792b(this.answer, shopsFrequentlyAskedQuestion.answer) && C19383o.m32792b(this.createDate, shopsFrequentlyAskedQuestion.createDate) && C19383o.m32792b(this.createDateFormatted, shopsFrequentlyAskedQuestion.createDateFormatted) && C19383o.m32792b(this.faqId, shopsFrequentlyAskedQuestion.faqId) && C19383o.m32792b(this.language, shopsFrequentlyAskedQuestion.language) && C19383o.m32792b(this.question, shopsFrequentlyAskedQuestion.question) && C19383o.m32792b(this.updateDate, shopsFrequentlyAskedQuestion.updateDate) && C19383o.m32792b(this.updateDateFormatted, shopsFrequentlyAskedQuestion.updateDateFormatted);
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final Integer getCreateDate() {
        return this.createDate;
    }

    public final String getCreateDateFormatted() {
        return this.createDateFormatted;
    }

    public final Long getFaqId() {
        return this.faqId;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getQuestion() {
        return this.question;
    }

    public final Integer getUpdateDate() {
        return this.updateDate;
    }

    public final String getUpdateDateFormatted() {
        return this.updateDateFormatted;
    }

    public int hashCode() {
        String str = this.answer;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.createDate;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.createDateFormatted;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.faqId;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.language;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.question;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.updateDate;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.updateDateFormatted;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode7 + i;
    }

    public final void setAnswer(String str) {
        this.answer = str;
    }

    public final void setCreateDate(Integer num) {
        this.createDate = num;
    }

    public final void setCreateDateFormatted(String str) {
        this.createDateFormatted = str;
    }

    public final void setFaqId(Long l) {
        this.faqId = l;
    }

    public final void setLanguage(String str) {
        this.language = str;
    }

    public final void setQuestion(String str) {
        this.question = str;
    }

    public final void setUpdateDate(Integer num) {
        this.updateDate = num;
    }

    public final void setUpdateDateFormatted(String str) {
        this.updateDateFormatted = str;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShopsFrequentlyAskedQuestion(answer=");
        h.append(this.answer);
        h.append(", createDate=");
        h.append(this.createDate);
        h.append(", createDateFormatted=");
        h.append(this.createDateFormatted);
        h.append(", faqId=");
        h.append(this.faqId);
        h.append(", language=");
        h.append(this.language);
        h.append(", question=");
        h.append(this.question);
        h.append(", updateDate=");
        h.append(this.updateDate);
        h.append(", updateDateFormatted=");
        return C0391c.m1057c(h, this.updateDateFormatted, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ShopsFrequentlyAskedQuestion(java.lang.String r10, java.lang.Integer r11, java.lang.String r12, java.lang.Long r13, java.lang.String r14, java.lang.String r15, java.lang.Integer r16, java.lang.String r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0033
            r8 = r2
            goto L_0x0035
        L_0x0033:
            r8 = r16
        L_0x0035:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r2 = r17
        L_0x003c:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.ShopsFrequentlyAskedQuestion.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
