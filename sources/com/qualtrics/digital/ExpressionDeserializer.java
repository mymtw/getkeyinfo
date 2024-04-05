package com.qualtrics.digital;

import com.etsy.android.lib.models.ResponseConstants;
import com.google.gson.C16799m;
import com.google.gson.C16800n;
import com.google.gson.C16802p;
import com.google.gson.JsonParseException;

class ExpressionDeserializer implements C16799m<C17300g> {
    /* renamed from: b */
    public static String m29044b(C16802p pVar, String str) {
        if (pVar.f37123b.containsKey(str)) {
            return pVar.f37123b.get(str).mo59630e();
        }
        return null;
    }

    /* renamed from: a */
    public final Object mo59634a(C16800n nVar) throws JsonParseException {
        Object obj;
        C16802p a = nVar.mo59635a();
        m29044b(a, "Operator");
        m29044b(a, "Type");
        m29044b(a, "Conjuction");
        String lowerCase = a.f37123b.get("LogicType").mo59630e().toLowerCase();
        lowerCase.getClass();
        char c = 65535;
        switch (lowerCase.hashCode()) {
            case -1479812907:
                if (lowerCase.equals("mobiletimeonsite")) {
                    c = 0;
                    break;
                }
                break;
            case -666487448:
                if (lowerCase.equals("mobilecustomproperty")) {
                    c = 1;
                    break;
                }
                break;
            case 99228:
                if (lowerCase.equals(ResponseConstants.DAY)) {
                    c = 2;
                    break;
                }
                break;
            case 3076014:
                if (lowerCase.equals("date")) {
                    c = 3;
                    break;
                }
                break;
            case 3560141:
                if (lowerCase.equals("time")) {
                    c = 4;
                    break;
                }
                break;
            case 234239358:
                if (lowerCase.equals("mobilepagecount")) {
                    c = 5;
                    break;
                }
                break;
            case 1301925318:
                if (lowerCase.equals("qualtricssurvey")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                m29044b(a, "RightOperand");
                m29044b(a, "TimeType");
                return new C17299f();
            case 1:
                m29044b(a, "Key");
                m29044b(a, "RightOperand");
                m29044b(a, "PropertyType");
                return new C17322z();
            case 2:
                m29044b(a, "LeftOperand");
                m29044b(a, "TimeZone");
                obj = new C17298e();
                break;
            case 3:
                m29044b(a, "LeftOperand");
                m29044b(a, "TimeZone");
                obj = new C17297d();
                break;
            case 4:
                m29044b(a, "LeftOperand");
                m29044b(a, "TimeZone");
                obj = new C17321y();
                break;
            case 5:
                m29044b(a, "RightOperand");
                m29044b(a, "CountType");
                return new C17293a0();
            case 6:
                m29044b(a, "SurveyID");
                return new C17316v();
            default:
                return null;
        }
        return obj;
    }
}
