package com.etsy.android.lib.models.apiv3.vespa;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.BaseModel;
import kotlin.jvm.internal.C19383o;

public final class ViewTypeMapping {
    public static final int $stable = 8;
    private final Class<? extends BaseModel> modelClass;
    private final int viewId;

    public ViewTypeMapping(int i, Class<? extends BaseModel> cls) {
        this.viewId = i;
        this.modelClass = cls;
    }

    public static /* synthetic */ ViewTypeMapping copy$default(ViewTypeMapping viewTypeMapping, int i, Class<? extends BaseModel> cls, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = viewTypeMapping.viewId;
        }
        if ((i2 & 2) != 0) {
            cls = viewTypeMapping.modelClass;
        }
        return viewTypeMapping.copy(i, cls);
    }

    public final int component1() {
        return this.viewId;
    }

    public final Class<? extends BaseModel> component2() {
        return this.modelClass;
    }

    public final ViewTypeMapping copy(int i, Class<? extends BaseModel> cls) {
        return new ViewTypeMapping(i, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewTypeMapping)) {
            return false;
        }
        ViewTypeMapping viewTypeMapping = (ViewTypeMapping) obj;
        return this.viewId == viewTypeMapping.viewId && C19383o.m32792b(this.modelClass, viewTypeMapping.modelClass);
    }

    public final Class<? extends BaseModel> getModelClass() {
        return this.modelClass;
    }

    public final int getViewId() {
        return this.viewId;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.viewId) * 31;
        Class<? extends BaseModel> cls = this.modelClass;
        return hashCode + (cls == null ? 0 : cls.hashCode());
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ViewTypeMapping(viewId=");
        h.append(this.viewId);
        h.append(", modelClass=");
        h.append(this.modelClass);
        h.append(')');
        return h.toString();
    }
}
