package com.mycompany.cap01test;

import com.mycompany.cap01a.Version;

@Version(major = 10, minor = 0)
public class VersionTest {

    private @Version(major = 1, minor = 1)
    int xyz = 110;

    @Version(minor = 0, major = 3)
    public VersionTest() {
    }

    @Version(major = 1, minor = 1)
    public VersionTest(int xyz) {
        this.xyz = xyz;
    }

    @Version(major = 1, minor = 0)
    public void printData() {
    }

    @Version(major = 1, minor = 1)
    public void setXyz(int xyz) {
        @Version(major = 1, minor = 2)
        int newValue = xyz;
        this.xyz = xyz;
    }
    
    @Version(major=20)
    public void scanData(){
    }

}
