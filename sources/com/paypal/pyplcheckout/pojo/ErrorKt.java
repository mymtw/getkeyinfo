package com.paypal.pyplcheckout.pojo;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;

public final class ErrorKt {
    public static final boolean containsContingencies(List<Error> list) {
        C19383o.m32797g(list, "<this>");
        if (list.isEmpty()) {
            return false;
        }
        for (Error contingency : list) {
            if (C19383o.m32792b(contingency.getContingency(), Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    public static final List<String> toListOfContingencyMessages(List<Error> list) {
        C19383o.m32797g(list, "<this>");
        ArrayList<Error> arrayList = new ArrayList<>();
        for (T next : list) {
            if (C19383o.m32792b(((Error) next).getContingency(), Boolean.TRUE)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Error message : arrayList) {
            String message2 = message.getMessage();
            if (message2 != null) {
                arrayList2.add(message2);
            }
        }
        return arrayList2;
    }
}
