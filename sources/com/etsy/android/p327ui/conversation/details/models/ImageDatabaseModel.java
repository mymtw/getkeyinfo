package com.etsy.android.p327ui.conversation.details.models;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.conversation.details.models.ImageDatabaseModel */
public final class ImageDatabaseModel {

    /* renamed from: a */
    public final List<ImageSourceDatabaseModel> f21182a;

    public ImageDatabaseModel(@C17402n(name = "sources") List<ImageSourceDatabaseModel> list) {
        C19383o.m32797g(list, ResponseConstants.SOURCES);
        this.f21182a = list;
    }
}
