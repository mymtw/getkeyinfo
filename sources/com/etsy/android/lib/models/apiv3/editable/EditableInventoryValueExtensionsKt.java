package com.etsy.android.lib.models.apiv3.editable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;

public final class EditableInventoryValueExtensionsKt {
    public static final int getIndexFromInventoryValue(EditableInventoryValue editableInventoryValue, String str) {
        Object obj;
        C19383o.m32797g(editableInventoryValue, "<this>");
        if (str == null) {
            return -1;
        }
        List<EditableInventoryProperty> inventoryProperties = editableInventoryValue.getInventoryProperties();
        C19383o.m32796f(inventoryProperties, "this.inventoryProperties");
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(inventoryProperties));
        for (EditableInventoryProperty inventoryValues : inventoryProperties) {
            arrayList.add(inventoryValues.getInventoryValues());
        }
        ArrayList G0 = C19322o.m32625G0(arrayList);
        Iterator it = G0.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C19383o.m32792b(((EditableInventoryValue) obj).getValue(), str)) {
                break;
            }
        }
        return G0.indexOf((EditableInventoryValue) obj);
    }

    public static final int getIndexFromValueId(EditableInventoryValue editableInventoryValue, long j) {
        Object obj;
        boolean z;
        C19383o.m32797g(editableInventoryValue, "<this>");
        List<EditableInventoryProperty> inventoryProperties = editableInventoryValue.getInventoryProperties();
        C19383o.m32796f(inventoryProperties, "this.inventoryProperties");
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(inventoryProperties));
        for (EditableInventoryProperty inventoryValues : inventoryProperties) {
            arrayList.add(inventoryValues.getInventoryValues());
        }
        ArrayList G0 = C19322o.m32625G0(arrayList);
        Iterator it = G0.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((EditableInventoryValue) obj).getValueId().getIdAsLongDeprecated() == j) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return G0.indexOf((EditableInventoryValue) obj);
    }

    public static final EditableInventoryValue getInventoryValueFromOrder(EditableInventoryValue editableInventoryValue, int i) {
        C19383o.m32797g(editableInventoryValue, "<this>");
        List<EditableInventoryProperty> inventoryProperties = editableInventoryValue.getInventoryProperties();
        C19383o.m32796f(inventoryProperties, "this.inventoryProperties");
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(inventoryProperties));
        for (EditableInventoryProperty inventoryValues : inventoryProperties) {
            arrayList.add(inventoryValues.getInventoryValues());
        }
        Object obj = C19322o.m32625G0(arrayList).get(i - 1);
        C19383o.m32796f(obj, "this.inventoryProperties…   }.flatten()[order - 1]");
        return (EditableInventoryValue) obj;
    }
}
