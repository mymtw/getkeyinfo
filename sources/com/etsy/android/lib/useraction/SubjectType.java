package com.etsy.android.lib.useraction;

import com.etsy.android.lib.models.ResponseConstants;

public enum SubjectType {
    LISTING(ResponseConstants.LISTING),
    SHOP(ResponseConstants.SHOP),
    QUERY("query");
    
    private final String subjectName;

    private SubjectType(String str) {
        this.subjectName = str;
    }

    public final String getSubjectName() {
        return this.subjectName;
    }
}
