package com.braze.configuration;

import android.content.Context;
import android.content.res.Resources;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.appboy.support.PackageUtils;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19457k;
import kotlin.text.C19459m;
import p568fn.C17782b;
import p753kq.C19846a;

public class CachedConfigurationProvider {
    public static final C5400a Companion = new C5400a();
    private static final int MISSING_RESOURCE_IDENTIFIER = 0;
    private final Map<String, Object> configurationCache;
    private Context context;
    private final String resourcePackageName;
    private RuntimeAppConfigurationProvider runtimeAppConfigurationProvider;
    private boolean shouldUseConfigurationCache;

    /* renamed from: com.braze.configuration.CachedConfigurationProvider$a */
    public static final class C5400a {
    }

    /* renamed from: com.braze.configuration.CachedConfigurationProvider$b */
    public enum C5401b {
        INTEGER("integer"),
        COLOR("color"),
        BOOLEAN("bool"),
        STRING("string"),
        DRAWABLE_IDENTIFIER("drawable"),
        STRING_ARRAY("array");
        

        /* renamed from: b */
        private final String f11601b;

        private C5401b(String str) {
            this.f11601b = str;
        }

        /* renamed from: b */
        public final String mo15888b() {
            return this.f11601b;
        }
    }

    /* renamed from: com.braze.configuration.CachedConfigurationProvider$c */
    public /* synthetic */ class C5402c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11602a;

        static {
            int[] iArr = new int[C5401b.values().length];
            iArr[C5401b.BOOLEAN.ordinal()] = 1;
            iArr[C5401b.STRING.ordinal()] = 2;
            iArr[C5401b.STRING_ARRAY.ordinal()] = 3;
            iArr[C5401b.INTEGER.ordinal()] = 4;
            iArr[C5401b.COLOR.ordinal()] = 5;
            iArr[C5401b.DRAWABLE_IDENTIFIER.ordinal()] = 6;
            f11602a = iArr;
        }
    }

    /* renamed from: com.braze.configuration.CachedConfigurationProvider$d */
    public static final class C5403d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11603b;

        /* renamed from: c */
        public final /* synthetic */ Object f11604c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5403d(String str, Object obj) {
            super(0);
            this.f11603b = str;
            this.f11604c = obj;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Using resources value for key: '");
            h.append(this.f11603b);
            h.append("' and value: '");
            return C0073e.m209i(h, this.f11604c, '\'');
        }
    }

    /* renamed from: com.braze.configuration.CachedConfigurationProvider$e */
    public static final class C5404e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11605b;

        /* renamed from: c */
        public final /* synthetic */ Object f11606c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5404e(String str, Object obj) {
            super(0);
            this.f11605b = str;
            this.f11606c = obj;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Using runtime override value for key: '");
            h.append(this.f11605b);
            h.append("' and value: '");
            return C0073e.m209i(h, this.f11606c, '\'');
        }
    }

    /* renamed from: com.braze.configuration.CachedConfigurationProvider$f */
    public static final class C5405f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11607b;

        /* renamed from: c */
        public final /* synthetic */ Object f11608c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5405f(String str, Object obj) {
            super(0);
            this.f11607b = str;
            this.f11608c = obj;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Primary key '");
            h.append(this.f11607b);
            h.append("' had no identifier. No secondary key to read resource value. Returning default value: '");
            return C0073e.m209i(h, this.f11608c, '\'');
        }
    }

    /* renamed from: com.braze.configuration.CachedConfigurationProvider$g */
    public static final class C5406g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5406g f11609b = new C5406g();

        public C5406g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught exception retrieving resource value";
        }
    }

    /* renamed from: com.braze.configuration.CachedConfigurationProvider$h */
    public static final class C5407h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C5401b f11610b;

        /* renamed from: c */
        public final /* synthetic */ String f11611c;

        /* renamed from: d */
        public final /* synthetic */ Object f11612d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5407h(C5401b bVar, String str, Object obj) {
            super(0);
            this.f11610b = bVar;
            this.f11611c = str;
            this.f11612d = obj;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Unable to find the xml ");
            h.append(this.f11610b);
            h.append(" configuration value with primary key '");
            h.append(this.f11611c);
            h.append("'.Using default value '");
            return C0071c.m192d(h, this.f11612d, "'.");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CachedConfigurationProvider(Context context2) {
        this(context2, false, (RuntimeAppConfigurationProvider) null, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CachedConfigurationProvider(Context context2, boolean z) {
        this(context2, z, (RuntimeAppConfigurationProvider) null, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
    }

    public CachedConfigurationProvider(Context context2, boolean z, RuntimeAppConfigurationProvider runtimeAppConfigurationProvider2) {
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        C19383o.m32797g(runtimeAppConfigurationProvider2, "runtimeAppConfigurationProvider");
        this.context = context2;
        this.shouldUseConfigurationCache = z;
        this.runtimeAppConfigurationProvider = runtimeAppConfigurationProvider2;
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new HashMap());
        C19383o.m32796f(synchronizedMap, "synchronizedMap(HashMap())");
        this.configurationCache = synchronizedMap;
        String resourcePackageName2 = PackageUtils.getResourcePackageName(this.context);
        C19383o.m32796f(resourcePackageName2, "getResourcePackageName(context)");
        this.resourcePackageName = resourcePackageName2;
    }

    private final String getFallbackConfigKey(String str) {
        if (C19459m.m33036e1(str, "braze", false)) {
            return C19457k.m33023a1(str, "braze", "appboy", false);
        }
        return null;
    }

    private final int getResourceIdentifier(String str, C5401b bVar) {
        if (str == null) {
            return 0;
        }
        return this.context.getResources().getIdentifier(str, bVar.mo15888b(), this.resourcePackageName);
    }

    public final boolean getBooleanValue(String str, boolean z) {
        C19383o.m32797g(str, "primaryKey");
        Object configurationValue = getConfigurationValue(C5401b.BOOLEAN, str, Boolean.valueOf(z));
        if (configurationValue != null) {
            return ((Boolean) configurationValue).booleanValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
    }

    public final Integer getColorValue(String str) {
        C19383o.m32797g(str, "primaryKey");
        return (Integer) getConfigurationValue(C5401b.COLOR, str, (Object) null);
    }

    public final Map<String, Object> getConfigurationCache() {
        return this.configurationCache;
    }

    public final Object getConfigurationValue(C5401b bVar, String str, Object obj) {
        C19383o.m32797g(bVar, "type");
        C19383o.m32797g(str, "key");
        if (this.shouldUseConfigurationCache && this.configurationCache.containsKey(str)) {
            return this.configurationCache.get(str);
        }
        RuntimeAppConfigurationProvider runtimeAppConfigurationProvider2 = this.runtimeAppConfigurationProvider;
        runtimeAppConfigurationProvider2.getClass();
        return runtimeAppConfigurationProvider2.f11613a.contains(str) ? getRuntimeConfigurationValue(bVar, str, obj) : getResourceConfigurationValue(bVar, str, obj);
    }

    public final int getDrawableValue(String str, int i) {
        C19383o.m32797g(str, "primaryKey");
        Object configurationValue = getConfigurationValue(C5401b.DRAWABLE_IDENTIFIER, str, Integer.valueOf(i));
        if (configurationValue != null) {
            return ((Integer) configurationValue).intValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    public final int getIntValue(String str, int i) {
        C19383o.m32797g(str, "primaryKey");
        Object configurationValue = getConfigurationValue(C5401b.INTEGER, str, Integer.valueOf(i));
        if (configurationValue != null) {
            return ((Integer) configurationValue).intValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    public final Object getResourceConfigurationValue(C5401b bVar, String str, Object obj) {
        C19383o.m32797g(bVar, "type");
        C19383o.m32797g(str, "key");
        Object readResourceValue = readResourceValue(bVar, str, obj);
        this.configurationCache.put(str, readResourceValue);
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C5403d(str, readResourceValue), 7);
        return readResourceValue;
    }

    public final RuntimeAppConfigurationProvider getRuntimeAppConfigurationProvider() {
        return this.runtimeAppConfigurationProvider;
    }

    public final Object getRuntimeConfigurationValue(C5401b bVar, String str, Object obj) {
        Object obj2;
        int i;
        C19383o.m32797g(bVar, "type");
        C19383o.m32797g(str, "key");
        switch (C5402c.f11602a[bVar.ordinal()]) {
            case 1:
                RuntimeAppConfigurationProvider runtimeAppConfigurationProvider2 = this.runtimeAppConfigurationProvider;
                if (obj != null) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    runtimeAppConfigurationProvider2.getClass();
                    obj2 = Boolean.valueOf(runtimeAppConfigurationProvider2.f11613a.getBoolean(str, booleanValue));
                    break;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
            case 2:
                RuntimeAppConfigurationProvider runtimeAppConfigurationProvider3 = this.runtimeAppConfigurationProvider;
                runtimeAppConfigurationProvider3.getClass();
                obj2 = runtimeAppConfigurationProvider3.f11613a.getString(str, (String) obj);
                break;
            case 3:
                RuntimeAppConfigurationProvider runtimeAppConfigurationProvider4 = this.runtimeAppConfigurationProvider;
                if (obj != null) {
                    runtimeAppConfigurationProvider4.getClass();
                    obj2 = runtimeAppConfigurationProvider4.f11613a.getStringSet(str, (Set) obj);
                    break;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String?>");
                }
            case 4:
            case 5:
                if (obj == null) {
                    RuntimeAppConfigurationProvider runtimeAppConfigurationProvider5 = this.runtimeAppConfigurationProvider;
                    runtimeAppConfigurationProvider5.getClass();
                    i = runtimeAppConfigurationProvider5.f11613a.getInt(str, 0);
                } else {
                    RuntimeAppConfigurationProvider runtimeAppConfigurationProvider6 = this.runtimeAppConfigurationProvider;
                    int intValue = ((Integer) obj).intValue();
                    runtimeAppConfigurationProvider6.getClass();
                    i = runtimeAppConfigurationProvider6.f11613a.getInt(str, intValue);
                }
                obj2 = Integer.valueOf(i);
                break;
            case 6:
                RuntimeAppConfigurationProvider runtimeAppConfigurationProvider7 = this.runtimeAppConfigurationProvider;
                runtimeAppConfigurationProvider7.getClass();
                obj2 = Integer.valueOf(getResourceIdentifier(runtimeAppConfigurationProvider7.f11613a.getString(str, ""), C5401b.DRAWABLE_IDENTIFIER));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.configurationCache.put(str, obj2);
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C5404e(str, obj2), 7);
        return obj2;
    }

    public final Set<String> getStringSetValue(String str, Set<String> set) {
        C19383o.m32797g(str, "primaryKey");
        Object configurationValue = getConfigurationValue(C5401b.STRING_ARRAY, str, set);
        return configurationValue == null ? set : (Set) configurationValue;
    }

    public final String getStringValue(String str, String str2) {
        C19383o.m32797g(str, "primaryKey");
        return (String) getConfigurationValue(C5401b.STRING, str, str2);
    }

    public final Object getValueFromResources(C5401b bVar, int i) {
        C19383o.m32797g(bVar, "type");
        Resources resources = this.context.getResources();
        switch (C5402c.f11602a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(resources.getBoolean(i));
            case 2:
                String string = resources.getString(i);
                C19383o.m32796f(string, "resources.getString(resourceId)");
                return string;
            case 3:
                String[] stringArray = resources.getStringArray(i);
                C19383o.m32796f(stringArray, "resources.getStringArray(resourceId)");
                return new HashSet(C17782b.m29865e0(Arrays.copyOf(stringArray, stringArray.length)));
            case 4:
                return Integer.valueOf(resources.getInteger(i));
            case 5:
                return Integer.valueOf(resources.getColor(i));
            case 6:
                return Integer.valueOf(i);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Object readResourceValue(C5401b bVar, String str, Object obj) {
        C19383o.m32797g(bVar, "type");
        C19383o.m32797g(str, "key");
        try {
            int resourceIdentifier = getResourceIdentifier(str, bVar);
            if (resourceIdentifier != 0) {
                return getValueFromResources(bVar, resourceIdentifier);
            }
            String fallbackConfigKey = getFallbackConfigKey(str);
            if (fallbackConfigKey == null) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C5405f(str, obj), 7);
                return obj;
            }
            int resourceIdentifier2 = getResourceIdentifier(fallbackConfigKey, bVar);
            if (resourceIdentifier2 != 0) {
                return getValueFromResources(bVar, resourceIdentifier2);
            }
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C5407h(bVar, str, obj), 7);
            return obj;
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C5406g.f11609b, 4);
        }
    }

    public final void setRuntimeAppConfigurationProvider(RuntimeAppConfigurationProvider runtimeAppConfigurationProvider2) {
        C19383o.m32797g(runtimeAppConfigurationProvider2, "<set-?>");
        this.runtimeAppConfigurationProvider = runtimeAppConfigurationProvider2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CachedConfigurationProvider(Context context2, boolean z, RuntimeAppConfigurationProvider runtimeAppConfigurationProvider2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context2, (i & 2) != 0 ? true : z, (i & 4) != 0 ? new RuntimeAppConfigurationProvider(context2) : runtimeAppConfigurationProvider2);
    }
}
