package com.etsy.android.p327ui.user.review;

import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

/* renamed from: com.etsy.android.ui.user.review.ReviewFlowTextFieldControlJsonAdapter */
public final class ReviewFlowTextFieldControlJsonAdapter extends JsonAdapter<ReviewFlowTextFieldControl> {
    public static final int $stable = 8;
    private volatile Constructor<ReviewFlowTextFieldControl> constructorRef;
    private final JsonAdapter<List<ReviewFlowWordCountDisplayOption>> listOfReviewFlowWordCountDisplayOptionAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("placeholder_display_text", "text_required", "current_text", "minimum_word_count", "maximum_char_count", "minimum_word_count_display_text_options", "textIsValid");

    public ReviewFlowTextFieldControlJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "placeholderDisplayText");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "textRequired");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "minWordCount");
        this.listOfReviewFlowWordCountDisplayOptionAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, ReviewFlowWordCountDisplayOption.class), emptySet, "wordCountDisplayOptions");
    }

    public final Object fromJson(JsonReader jsonReader) {
        String str;
        JsonReader jsonReader2 = jsonReader;
        Class<Integer> cls = Integer.class;
        Class<Boolean> cls2 = Boolean.class;
        Class<String> cls3 = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str2 = null;
        Boolean bool = null;
        String str3 = null;
        Integer num = null;
        Integer num2 = null;
        List list = null;
        Boolean bool2 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 1:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 3:
                    num = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 4:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 5:
                    list = this.listOfReviewFlowWordCountDisplayOptionAdapter.fromJson(jsonReader2);
                    if (list != null) {
                        break;
                    } else {
                        throw C18215a.m30734m("wordCountDisplayOptions", "minimum_word_count_display_text_options", jsonReader2);
                    }
                case 6:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -65;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i != -65) {
            Constructor<ReviewFlowTextFieldControl> constructor = this.constructorRef;
            if (constructor == null) {
                str = "wordCountDisplayOptions";
                constructor = ReviewFlowTextFieldControl.class.getDeclaredConstructor(new Class[]{cls3, cls2, cls3, cls, cls, List.class, cls2, Integer.TYPE, C18215a.f39928c});
                this.constructorRef = constructor;
                C19383o.m32796f(constructor, "ReviewFlowTextFieldContr…his.constructorRef = it }");
            } else {
                str = "wordCountDisplayOptions";
            }
            Object[] objArr = new Object[9];
            objArr[0] = str2;
            objArr[1] = bool;
            objArr[2] = str3;
            objArr[3] = num;
            objArr[4] = num2;
            if (list != null) {
                objArr[5] = list;
                objArr[6] = bool2;
                objArr[7] = Integer.valueOf(i);
                objArr[8] = null;
                ReviewFlowTextFieldControl newInstance = constructor.newInstance(objArr);
                C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            throw C18215a.m30728g(str, "minimum_word_count_display_text_options", jsonReader);
        } else if (list != null) {
            return new ReviewFlowTextFieldControl(str2, bool, str3, num, num2, list, bool2);
        } else {
            throw C18215a.m30728g("wordCountDisplayOptions", "minimum_word_count_display_text_options", jsonReader2);
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        ReviewFlowTextFieldControl reviewFlowTextFieldControl = (ReviewFlowTextFieldControl) obj;
        C19383o.m32797g(wVar, "writer");
        if (reviewFlowTextFieldControl != null) {
            wVar.mo68522b();
            wVar.mo68529h("placeholder_display_text");
            this.nullableStringAdapter.toJson(wVar, reviewFlowTextFieldControl.f26023a);
            wVar.mo68529h("text_required");
            this.nullableBooleanAdapter.toJson(wVar, reviewFlowTextFieldControl.f26024b);
            wVar.mo68529h("current_text");
            this.nullableStringAdapter.toJson(wVar, reviewFlowTextFieldControl.f26025c);
            wVar.mo68529h("minimum_word_count");
            this.nullableIntAdapter.toJson(wVar, reviewFlowTextFieldControl.f26026d);
            wVar.mo68529h("maximum_char_count");
            this.nullableIntAdapter.toJson(wVar, reviewFlowTextFieldControl.f26027e);
            wVar.mo68529h("minimum_word_count_display_text_options");
            this.listOfReviewFlowWordCountDisplayOptionAdapter.toJson(wVar, reviewFlowTextFieldControl.f26028f);
            wVar.mo68529h("textIsValid");
            this.nullableBooleanAdapter.toJson(wVar, reviewFlowTextFieldControl.f26029g);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ReviewFlowTextFieldControl)";
    }
}
