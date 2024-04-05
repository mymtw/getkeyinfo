package com.etsy.android.lib.models.pastpurchase.adapters;

import com.squareup.moshi.C17401m;
import com.squareup.moshi.C17418z;
import com.squareup.moshi.JsonReader;
import kotlin.jvm.internal.C19383o;

public final class ForceToLongJsonAdapter {
    public static final int $stable = 0;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            iArr[JsonReader.Token.NUMBER.ordinal()] = 1;
            iArr[JsonReader.Token.BOOLEAN.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @C17401m
    @ForceToLong
    public final long fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        JsonReader.Token u = jsonReader.mo68426u();
        int i = u == null ? -1 : WhenMappings.$EnumSwitchMapping$0[u.ordinal()];
        if (i == 1) {
            return jsonReader.mo68420j();
        }
        if (i != 2) {
            jsonReader.mo68411c0();
            return 0;
        }
        jsonReader.mo68416g();
        return 0;
    }

    @C17418z
    public final long toJson(@ForceToLong long j) {
        return j;
    }
}
