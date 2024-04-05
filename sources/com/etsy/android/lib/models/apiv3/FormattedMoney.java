package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.CrashUtil;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.FormatFlagsConversionMismatchException;
import java.util.IllegalFormatConversionException;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.UnknownFormatConversionException;
import org.apache.commons.lang3.ObjectUtils;

public class FormattedMoney extends BaseFieldModel {
    private static final long serialVersionUID = -618920105921433188L;
    public List<Money> mArguments = new ArrayList();
    public String mFormatString;

    public boolean equals(Object obj) {
        if (obj instanceof FormattedMoney) {
            FormattedMoney formattedMoney = (FormattedMoney) obj;
            return ObjectUtils.equals(this.mFormatString, formattedMoney.mFormatString) && ObjectUtils.equals(this.mArguments, formattedMoney.mArguments);
        }
    }

    public List<Money> getArguments() {
        return this.mArguments;
    }

    public String getFormatString() {
        return this.mFormatString;
    }

    public int hashCode() {
        return ObjectUtils.hashCode(this.mArguments) + ((ObjectUtils.hashCode(this.mFormatString) + 527) * 31);
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        str.getClass();
        if (str.equals(ResponseConstants.ARGUMENTS)) {
            this.mArguments = BaseModel.parseArray(jsonParser, Money.class);
            return true;
        } else if (!str.equals(ResponseConstants.FORMAT)) {
            return false;
        } else {
            this.mFormatString = BaseModel.parseString(jsonParser);
            return true;
        }
    }

    public void setArguments(List<Money> list) {
        this.mArguments = list;
    }

    public void setFormatString(String str) {
        this.mFormatString = str;
    }

    public String toString() {
        try {
            return String.format(this.mFormatString.replace("%m", "%s"), this.mArguments.toArray());
        } catch (IllegalFormatConversionException e) {
            CrashUtil.m17307a().mo30457b(e);
            return this.mFormatString;
        } catch (UnknownFormatConversionException e2) {
            CrashUtil.m17307a().mo30457b(e2);
            return this.mFormatString;
        } catch (MissingFormatArgumentException e3) {
            CrashUtil.m17307a().mo30457b(e3);
            return this.mFormatString;
        } catch (FormatFlagsConversionMismatchException e4) {
            CrashUtil.m17307a().mo30457b(e4);
            return this.mFormatString;
        }
    }
}
