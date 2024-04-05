package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class ShopsAboutMemberJsonAdapter extends JsonAdapter<ShopsAboutMember> {
    public static final int $stable = 8;
    private final JsonAdapter<Image> nullableImageAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.BIO, ResponseConstants.IMAGE, "is_owner", "name", ResponseConstants.ROLE, ResponseConstants.SHOP_ABOUT_MEMBER_ID);

    public ShopsAboutMemberJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, ResponseConstants.BIO);
        this.nullableImageAdapter = yVar.mo68558c(Image.class, emptySet, ResponseConstants.IMAGE);
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "isOwner");
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "shopAboutMemberId");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ShopsAboutMember)";
    }

    public ShopsAboutMember fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        Image image = null;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        Long l = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    image = this.nullableImageAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    l = this.nullableLongAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new ShopsAboutMember(str, image, num, str2, str3, l);
    }

    public void toJson(C17412w wVar, ShopsAboutMember shopsAboutMember) {
        C19383o.m32797g(wVar, "writer");
        if (shopsAboutMember != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.BIO);
            this.nullableStringAdapter.toJson(wVar, shopsAboutMember.getBio());
            wVar.mo68529h(ResponseConstants.IMAGE);
            this.nullableImageAdapter.toJson(wVar, shopsAboutMember.getImage());
            wVar.mo68529h("is_owner");
            this.nullableIntAdapter.toJson(wVar, shopsAboutMember.isOwner());
            wVar.mo68529h("name");
            this.nullableStringAdapter.toJson(wVar, shopsAboutMember.getName());
            wVar.mo68529h(ResponseConstants.ROLE);
            this.nullableStringAdapter.toJson(wVar, shopsAboutMember.getRole());
            wVar.mo68529h(ResponseConstants.SHOP_ABOUT_MEMBER_ID);
            this.nullableLongAdapter.toJson(wVar, shopsAboutMember.getShopAboutMemberId());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
