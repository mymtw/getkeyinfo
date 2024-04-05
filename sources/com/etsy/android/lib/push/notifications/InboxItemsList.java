package com.etsy.android.lib.push.notifications;

import com.etsy.android.lib.models.ResponseConstants;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p434ra.C13339g;

public final class InboxItemsList extends LinkedHashMap<String, C13339g.C13340a> {
    public static final int $stable = 0;

    public InboxItemsList() {
        super(200);
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return containsKey((String) obj);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C13339g.C13340a)) {
            return false;
        }
        return containsValue((C13339g.C13340a) obj);
    }

    public final List<Map.Entry<String, C13339g.C13340a>> entriesReversed() {
        Set<Map.Entry<String, C13339g.C13340a>> entrySet = entrySet();
        C19383o.m32796f(entrySet, "entries");
        return C19327t.m32653i1(entrySet);
    }

    public final /* bridge */ Set<Map.Entry<String, C13339g.C13340a>> entrySet() {
        return getEntries();
    }

    public /* bridge */ Set<Map.Entry<String, C13339g.C13340a>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<String> getKeys() {
        return super.keySet();
    }

    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof String) ? obj2 : getOrDefault((String) obj, (C13339g.C13340a) obj2);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<C13339g.C13340a> getValues() {
        return super.values();
    }

    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* bridge */ Collection<C13339g.C13340a> values() {
        return getValues();
    }

    public final List<C13339g.C13340a> valuesReversed() {
        Collection<C13339g.C13340a> values = values();
        C19383o.m32796f(values, ResponseConstants.VALUES);
        return C19327t.m32653i1(values);
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey(str);
    }

    public /* bridge */ boolean containsValue(C13339g.C13340a aVar) {
        return super.containsValue(aVar);
    }

    public final /* bridge */ C13339g.C13340a get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    public final /* bridge */ C13339g.C13340a getOrDefault(Object obj, C13339g.C13340a aVar) {
        return !(obj instanceof String) ? aVar : getOrDefault((String) obj, aVar);
    }

    public final /* bridge */ C13339g.C13340a remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    public /* bridge */ C13339g.C13340a get(String str) {
        return (C13339g.C13340a) super.get(str);
    }

    public /* bridge */ C13339g.C13340a getOrDefault(String str, C13339g.C13340a aVar) {
        return (C13339g.C13340a) super.getOrDefault(str, aVar);
    }

    public /* bridge */ C13339g.C13340a remove(String str) {
        return (C13339g.C13340a) super.remove(str);
    }

    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof C13339g.C13340a)) {
            return remove((String) obj, (C13339g.C13340a) obj2);
        }
        return false;
    }

    public /* bridge */ boolean remove(String str, C13339g.C13340a aVar) {
        return super.remove(str, aVar);
    }
}
