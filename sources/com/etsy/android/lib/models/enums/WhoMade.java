package com.etsy.android.lib.models.enums;

import com.etsy.android.lib.util.C8885d0;

public enum WhoMade {
    Owner("i_did"),
    Employee("collective"),
    SomeoneElse("someone_else");
    
    private String mJsonParam;

    private WhoMade(String str) {
        this.mJsonParam = str;
    }

    public static WhoMade getEnumForJson(String str) {
        if (!C8885d0.m17324h(str)) {
            return null;
        }
        String trim = str.trim();
        WhoMade whoMade = Owner;
        if (whoMade.mJsonParam.equalsIgnoreCase(trim)) {
            return whoMade;
        }
        WhoMade whoMade2 = Employee;
        if (whoMade2.mJsonParam.equalsIgnoreCase(trim)) {
            return whoMade2;
        }
        WhoMade whoMade3 = SomeoneElse;
        if (whoMade3.mJsonParam.equalsIgnoreCase(trim)) {
            return whoMade3;
        }
        return null;
    }

    public String toString() {
        return this.mJsonParam;
    }
}
