package com.mycompany.cap01;

import com.mycompany.cap01a.Version;
import java.lang.annotation.Annotation;

public class DoNotUseIt implements Version{

    @Override
    public int major() {
        return 0;
    }

    @Override
    public int minor() {
        return 0;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
    
}
