package com.tmb.config.converters;

import com.tmb.enums.BrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToBrowserTypeConverter implements Converter<BrowserType> {
    @Override
    public BrowserType convert(Method method, String browserName) {
        return BrowserType.valueOf(browserName.toUpperCase());
    }
}
