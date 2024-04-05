package com.braze.enums;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import org.json.JSONArray;
import p005a4.C0035b;

public enum BrazeSdkMetadata implements C0035b<String> {
    ADJUST("adj"),
    AIRBRIDGE("air"),
    APPSFLYER("apf"),
    BLUEDOT("blt"),
    BRANCH("brc"),
    CORDOVA("cdva"),
    EXPO("expo"),
    FACTUAL("fct"),
    FOURSQUARE("fsq"),
    FLUTTER("ft"),
    GRADLE("gd"),
    GOOGLE("gg"),
    GIMBAL("gmb"),
    IONIC("ionc"),
    KOCHAVA("kch"),
    MANUAL("manu"),
    MPARTICLE("mp"),
    NPM("npm"),
    NATIVESCRIPT("ns"),
    NUGET("nugt"),
    PUB("pub"),
    RADAR("rdr"),
    REACTNATIVE("rn"),
    SEGMENT("sg"),
    SINGULAR("sng"),
    SPM("spm"),
    TEALIUM("tl"),
    UNREAL("un"),
    UNITY_PACKAGE_MANAGER("unpm"),
    UNITY("ut"),
    VIZBEE("vzb"),
    WEBCDN("wcd"),
    XAMARIN("xam");
    
    public static final C5418a Companion = null;
    /* access modifiers changed from: private */
    public final String jsonKey;

    /* renamed from: com.braze.enums.BrazeSdkMetadata$a */
    public static final class C5418a {
        /* renamed from: a */
        public static JSONArray m11018a(EnumSet enumSet) {
            C19383o.m32797g(enumSet, "set");
            ArrayList arrayList = new ArrayList(C19322o.m32624F0(enumSet));
            Iterator it = enumSet.iterator();
            while (it.hasNext()) {
                BrazeSdkMetadata brazeSdkMetadata = (BrazeSdkMetadata) it.next();
                C19383o.m32796f(brazeSdkMetadata, "it");
                arrayList.add(brazeSdkMetadata.jsonKey);
            }
            return new JSONArray(C19327t.m32655k1(arrayList));
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C5418a();
    }

    private BrazeSdkMetadata(String str) {
        this.jsonKey = str;
    }

    public static final JSONArray toJsonArray(EnumSet<BrazeSdkMetadata> enumSet) {
        Companion.getClass();
        return C5418a.m11018a(enumSet);
    }

    public String forJsonPut() {
        return this.jsonKey;
    }
}
