package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ShopsFrequentlyAskedQuestionJsonAdapter extends JsonAdapter<ShopsFrequentlyAskedQuestion> {
    public static final int $stable = 8;
    private volatile Constructor<ShopsFrequentlyAskedQuestion> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.ANSWER, ResponseConstants.CREATE_DATE, "create_date_formatted", ResponseConstants.FAQ_ID, "language", ResponseConstants.QUESTION, ResponseConstants.UPDATE_DATE, "update_date_formatted");

    public ShopsFrequentlyAskedQuestionJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, ResponseConstants.ANSWER);
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "createDate");
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "faqId");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ShopsFrequentlyAskedQuestion)";
    }

    public ShopsFrequentlyAskedQuestion fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<Integer> cls = Integer.class;
        Class<String> cls2 = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        Integer num = null;
        String str2 = null;
        Long l = null;
        String str3 = null;
        String str4 = null;
        Integer num2 = null;
        String str5 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -2;
                    break;
                case 1:
                    num = this.nullableIntAdapter.fromJson(jsonReader2);
                    i &= -3;
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -5;
                    break;
                case 3:
                    l = this.nullableLongAdapter.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
                case 6:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i &= -65;
                    break;
                case 7:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -129;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i == -256) {
            return new ShopsFrequentlyAskedQuestion(str, num, str2, l, str3, str4, num2, str5);
        }
        Constructor<ShopsFrequentlyAskedQuestion> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ShopsFrequentlyAskedQuestion.class.getDeclaredConstructor(new Class[]{cls2, cls, cls2, Long.class, cls2, cls2, cls, cls2, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ShopsFrequentlyAskedQues…his.constructorRef = it }");
        }
        ShopsFrequentlyAskedQuestion newInstance = constructor.newInstance(new Object[]{str, num, str2, l, str3, str4, num2, str5, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, ShopsFrequentlyAskedQuestion shopsFrequentlyAskedQuestion) {
        C19383o.m32797g(wVar, "writer");
        if (shopsFrequentlyAskedQuestion != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.ANSWER);
            this.nullableStringAdapter.toJson(wVar, shopsFrequentlyAskedQuestion.getAnswer());
            wVar.mo68529h(ResponseConstants.CREATE_DATE);
            this.nullableIntAdapter.toJson(wVar, shopsFrequentlyAskedQuestion.getCreateDate());
            wVar.mo68529h("create_date_formatted");
            this.nullableStringAdapter.toJson(wVar, shopsFrequentlyAskedQuestion.getCreateDateFormatted());
            wVar.mo68529h(ResponseConstants.FAQ_ID);
            this.nullableLongAdapter.toJson(wVar, shopsFrequentlyAskedQuestion.getFaqId());
            wVar.mo68529h("language");
            this.nullableStringAdapter.toJson(wVar, shopsFrequentlyAskedQuestion.getLanguage());
            wVar.mo68529h(ResponseConstants.QUESTION);
            this.nullableStringAdapter.toJson(wVar, shopsFrequentlyAskedQuestion.getQuestion());
            wVar.mo68529h(ResponseConstants.UPDATE_DATE);
            this.nullableIntAdapter.toJson(wVar, shopsFrequentlyAskedQuestion.getUpdateDate());
            wVar.mo68529h("update_date_formatted");
            this.nullableStringAdapter.toJson(wVar, shopsFrequentlyAskedQuestion.getUpdateDateFormatted());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
