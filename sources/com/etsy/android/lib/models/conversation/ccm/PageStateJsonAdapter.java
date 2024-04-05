package com.etsy.android.lib.models.conversation.ccm;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class PageStateJsonAdapter extends JsonAdapter<PageState> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("total_pages", "current_page", ResponseConstants.IS_SELLER);

    public PageStateJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.intAdapter = yVar.mo68558c(cls, emptySet, "pageCount");
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, "isSeller");
    }

    public String toString() {
        return "GeneratedJsonAdapter(PageState)";
    }

    public PageState fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Integer num = null;
        Integer num2 = null;
        Boolean bool = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw C18215a.m30734m("pageCount", "total_pages", jsonReader);
                }
            } else if (Q == 1) {
                num2 = this.intAdapter.fromJson(jsonReader);
                if (num2 == null) {
                    throw C18215a.m30734m("currentPage", "current_page", jsonReader);
                }
            } else if (Q == 2 && (bool = this.booleanAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("isSeller", ResponseConstants.IS_SELLER, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (num != null) {
            int intValue = num.intValue();
            if (num2 != null) {
                int intValue2 = num2.intValue();
                if (bool != null) {
                    return new PageState(intValue, intValue2, bool.booleanValue());
                }
                throw C18215a.m30728g("isSeller", ResponseConstants.IS_SELLER, jsonReader);
            }
            throw C18215a.m30728g("currentPage", "current_page", jsonReader);
        }
        throw C18215a.m30728g("pageCount", "total_pages", jsonReader);
    }

    public void toJson(C17412w wVar, PageState pageState) {
        C19383o.m32797g(wVar, "writer");
        if (pageState != null) {
            wVar.mo68522b();
            wVar.mo68529h("total_pages");
            this.intAdapter.toJson(wVar, Integer.valueOf(pageState.getPageCount()));
            wVar.mo68529h("current_page");
            this.intAdapter.toJson(wVar, Integer.valueOf(pageState.getCurrentPage()));
            wVar.mo68529h(ResponseConstants.IS_SELLER);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(pageState.isSeller()));
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
