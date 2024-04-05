package com.paypal.pyplcheckout.common.cache;

import android.content.Context;
import androidx.datastore.core.C2478e;
import androidx.datastore.preferences.C2489a;
import androidx.datastore.preferences.core.C2493b;
import androidx.datastore.preferences.core.PreferencesKt;
import com.appboy.Constants;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.common.cache.PreferenceConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.reflect.C19410j;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C19597d;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import p759nq.C19920b;

public class PreferenceStoreImpl implements PreferenceStore {
    public static final /* synthetic */ C19410j<Object>[] $$delegatedProperties;
    /* access modifiers changed from: private */
    public final Context context;
    private final C19920b dataStore$delegate = C2489a.m5467a();
    private HashMap<String, C2493b.C2494a<?>> hashData = new HashMap<>();

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PreferenceConstants.PreferenceType.values().length];
            iArr[PreferenceConstants.PreferenceType.IntValue.ordinal()] = 1;
            iArr[PreferenceConstants.PreferenceType.BooleanValue.ordinal()] = 2;
            iArr[PreferenceConstants.PreferenceType.StringValue.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        PropertyReference2Impl propertyReference2Impl = new PropertyReference2Impl(PreferenceStoreImpl.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        C19386q.f43269a.getClass();
        $$delegatedProperties = new C19410j[]{propertyReference2Impl};
    }

    public PreferenceStoreImpl(Context context2) {
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this.context = context2;
    }

    private final C19597d<C2493b> flow() {
        return new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(getDataStore(this.context).getData(), new PreferenceStoreImpl$flow$1((C19340c<? super PreferenceStoreImpl$flow$1>) null));
    }

    /* access modifiers changed from: private */
    public final C2478e<C2493b> getDataStore(Context context2) {
        return (C2478e) this.dataStore$delegate.getValue(context2, $$delegatedProperties[0]);
    }

    public static /* synthetic */ Object getPreferenceBoolean$suspendImpl(PreferenceStoreImpl preferenceStoreImpl, String str, C19340c cVar) {
        C2493b.C2494a<?> aVar = preferenceStoreImpl.getHashData().get(str);
        if (aVar != null) {
            return new C17204xfda53363(preferenceStoreImpl.flow(), aVar);
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences.Key<kotlin.Boolean>");
    }

    public static /* synthetic */ Object getPreferenceInt$suspendImpl(PreferenceStoreImpl preferenceStoreImpl, String str, C19340c cVar) {
        C2493b.C2494a<?> aVar = preferenceStoreImpl.getHashData().get(str);
        if (aVar != null) {
            return new PreferenceStoreImpl$getPreferenceInt$suspendImpl$$inlined$map$1(preferenceStoreImpl.flow(), aVar);
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences.Key<kotlin.Int>");
    }

    public static /* synthetic */ Object getPreferenceString$suspendImpl(PreferenceStoreImpl preferenceStoreImpl, String str, C19340c cVar) {
        C2493b.C2494a<?> aVar = preferenceStoreImpl.getHashData().get(str);
        if (aVar != null) {
            return new C17209x54944394(preferenceStoreImpl.flow(), aVar);
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences.Key<kotlin.String>");
    }

    private final Boolean getValueBoolean(String str) {
        return (Boolean) C19697g.m33469g(EmptyCoroutineContext.INSTANCE, new PreferenceStoreImpl$getValueBoolean$1(this, str, (C19340c<? super PreferenceStoreImpl$getValueBoolean$1>) null));
    }

    private final Integer getValueInt(String str) {
        return (Integer) C19697g.m33469g(EmptyCoroutineContext.INSTANCE, new PreferenceStoreImpl$getValueInt$1(this, str, (C19340c<? super PreferenceStoreImpl$getValueInt$1>) null));
    }

    private final String getValueString(String str) {
        return (String) C19697g.m33469g(EmptyCoroutineContext.INSTANCE, new PreferenceStoreImpl$getValueString$1(this, str, (C19340c<? super PreferenceStoreImpl$getValueString$1>) null));
    }

    public static Object setBoolean$suspendImpl(PreferenceStoreImpl preferenceStoreImpl, C2493b.C2494a aVar, boolean z, C19340c cVar) {
        Object a = PreferencesKt.m5473a(preferenceStoreImpl.getDataStore(preferenceStoreImpl.context), new PreferenceStoreImpl$setBoolean$2(aVar, z, (C19340c<? super PreferenceStoreImpl$setBoolean$2>) null), cVar);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : C19394m.f43287a;
    }

    public static Object setInt$suspendImpl(PreferenceStoreImpl preferenceStoreImpl, C2493b.C2494a aVar, int i, C19340c cVar) {
        Object a = PreferencesKt.m5473a(preferenceStoreImpl.getDataStore(preferenceStoreImpl.context), new PreferenceStoreImpl$setInt$2(aVar, i, (C19340c<? super PreferenceStoreImpl$setInt$2>) null), cVar);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : C19394m.f43287a;
    }

    public static Object setString$suspendImpl(PreferenceStoreImpl preferenceStoreImpl, C2493b.C2494a aVar, String str, C19340c cVar) {
        Object a = PreferencesKt.m5473a(preferenceStoreImpl.getDataStore(preferenceStoreImpl.context), new PreferenceStoreImpl$setString$2(aVar, str, (C19340c<? super PreferenceStoreImpl$setString$2>) null), cVar);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : C19394m.f43287a;
    }

    public void clear(String str) {
        C19383o.m32797g(str, Constants.APPBOY_PUSH_TITLE_KEY);
        C19697g.m33468f(C19697g.m33463a(C19760n0.f43720b), (CoroutineContext) null, (CoroutineStart) null, new PreferenceStoreImpl$clear$1(this, str, (C19340c<? super PreferenceStoreImpl$clear$1>) null), 3);
    }

    public final void convertToPreferenceKey(HashMap<String, PreferenceConstants.PreferenceType> hashMap) {
        C19383o.m32797g(hashMap, "hashMap");
        Set<Map.Entry<String, PreferenceConstants.PreferenceType>> entrySet = hashMap.entrySet();
        C19383o.m32796f(entrySet, "hashMap.entries");
        for (Map.Entry entry : entrySet) {
            C19383o.m32796f(entry, "(key, value)");
            String str = (String) entry.getKey();
            int i = WhenMappings.$EnumSwitchMapping$0[((PreferenceConstants.PreferenceType) entry.getValue()).ordinal()];
            if (i == 1) {
                HashMap<String, C2493b.C2494a<?>> hashData2 = getHashData();
                C19383o.m32796f(str, "key");
                hashData2.put(str, new C2493b.C2494a(str));
            } else if (i == 2) {
                HashMap<String, C2493b.C2494a<?>> hashData3 = getHashData();
                C19383o.m32796f(str, "key");
                hashData3.put(str, new C2493b.C2494a(str));
            } else if (i == 3) {
                HashMap<String, C2493b.C2494a<?>> hashData4 = getHashData();
                C19383o.m32796f(str, "key");
                hashData4.put(str, new C2493b.C2494a(str));
            }
        }
    }

    public final boolean getBooleanDataStorePref(String str) {
        C19383o.m32797g(str, Constants.APPBOY_PUSH_TITLE_KEY);
        Boolean valueBoolean = getValueBoolean(str);
        if (valueBoolean == null) {
            return false;
        }
        return valueBoolean.booleanValue();
    }

    public final HashMap<String, C2493b.C2494a<?>> getHashData() {
        return this.hashData;
    }

    public final int getIntDataStorePref(String str) {
        C19383o.m32797g(str, Constants.APPBOY_PUSH_TITLE_KEY);
        Integer valueInt = getValueInt(str);
        if (valueInt == null) {
            return 0;
        }
        return valueInt.intValue();
    }

    public Object getPreferenceBoolean(String str, C19340c<? super C19597d<Boolean>> cVar) {
        return getPreferenceBoolean$suspendImpl(this, str, cVar);
    }

    public Object getPreferenceInt(String str, C19340c<? super C19597d<Integer>> cVar) {
        return getPreferenceInt$suspendImpl(this, str, cVar);
    }

    public Object getPreferenceString(String str, C19340c<? super C19597d<String>> cVar) {
        return getPreferenceString$suspendImpl(this, str, cVar);
    }

    public final String getStringDataStorePref(String str) {
        C19383o.m32797g(str, Constants.APPBOY_PUSH_TITLE_KEY);
        return getValueString(str);
    }

    public Object setBoolean(C2493b.C2494a<Boolean> aVar, boolean z, C19340c<? super C19394m> cVar) {
        return setBoolean$suspendImpl(this, aVar, z, cVar);
    }

    public final void setHashData(HashMap<String, C2493b.C2494a<?>> hashMap) {
        C19383o.m32797g(hashMap, "<set-?>");
        this.hashData = hashMap;
    }

    public Object setInt(C2493b.C2494a<Integer> aVar, int i, C19340c<? super C19394m> cVar) {
        return setInt$suspendImpl(this, aVar, i, cVar);
    }

    public Object setString(C2493b.C2494a<String> aVar, String str, C19340c<? super C19394m> cVar) {
        return setString$suspendImpl(this, aVar, str, cVar);
    }

    public final void setValueBoolean(C2493b.C2494a<Boolean> aVar, boolean z) {
        C19383o.m32797g(aVar, Constants.APPBOY_PUSH_TITLE_KEY);
        C19697g.m33468f(C19697g.m33463a(C19760n0.f43720b), (CoroutineContext) null, (CoroutineStart) null, new PreferenceStoreImpl$setValueBoolean$1(this, aVar, z, (C19340c<? super PreferenceStoreImpl$setValueBoolean$1>) null), 3);
    }

    public final void setValueInt(C2493b.C2494a<Integer> aVar, int i) {
        C19383o.m32797g(aVar, Constants.APPBOY_PUSH_TITLE_KEY);
        C19697g.m33468f(C19697g.m33463a(C19760n0.f43720b), (CoroutineContext) null, (CoroutineStart) null, new PreferenceStoreImpl$setValueInt$1(this, aVar, i, (C19340c<? super PreferenceStoreImpl$setValueInt$1>) null), 3);
    }

    public final void setValueString(C2493b.C2494a<String> aVar, String str) {
        C19383o.m32797g(aVar, Constants.APPBOY_PUSH_TITLE_KEY);
        C19383o.m32797g(str, "stringVal");
        C19697g.m33468f(C19697g.m33463a(C19760n0.f43720b), (CoroutineContext) null, (CoroutineStart) null, new PreferenceStoreImpl$setValueString$1(this, aVar, str, (C19340c<? super PreferenceStoreImpl$setValueString$1>) null), 3);
    }
}
