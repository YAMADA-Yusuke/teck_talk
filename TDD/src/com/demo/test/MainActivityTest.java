
package com.demo.test;

import junit.framework.TestCase;

import com.demo.exception.IllegalVariableException;
import com.demo.tdd.MainActivity;

public class MainActivityTest extends TestCase {

    MainActivity testClass = new MainActivity();

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * 正常系（朝）
     */
    public void testGetGreets_5時から11時() {
        String expect = "おはようございます";
        for (int i = 5; i <= 11; i++) {
            String result = "default";
            try {
                result = testClass.getGreets(String.valueOf(i));
            } catch (Exception e) {
                ;
            }
            assertEquals(expect, result);
        }
    }

    /**
     * 正常系（昼）
     */
    public void testGetGreets_12時から18時() {
        String expect = "こんにちは";
        for (int i = 12; i <= 18; i++) {
            String result = "default";
            try {
                result = testClass.getGreets(String.valueOf(i));
            } catch (Exception e) {
                ;
            }
            assertEquals(expect, result);
        }
    }

    /**
     * 正常系（夜）
     */
    public void testGetGreets_19時から24時() {
        String expect = "こんばんは";
        for (int i = 19; i <= 24; i++) {
            String result = "default";
            try {
                result = testClass.getGreets(String.valueOf(i));
            } catch (Exception e) {
                ;
            }
            assertEquals(expect, result);
        }
    }

    /**
     * 正常系（夜）
     */
    public void testGetGreets_0時から4時() {
        String expect = "こんばんは";
        for (int i = 0; i <= 4; i++) {
            String result = "default";
            try {
                result = testClass.getGreets(String.valueOf(i));
            } catch (Exception e) {
                ;
            }
            assertEquals(expect, result);
        }
    }

    /**
     * 準正常系（hour < 0）
     */
    public void testGetGreets_マイナス1時() {
        String expect = "";
        String result = "default";
        try {
            result = testClass.getGreets(String.valueOf(-1));
        } catch (Exception e) {
            ;
        }
        assertEquals(expect, result);
    }

    /**
     * 準正常系（hour > 24）
     */
    public void testGetGreets_25時() {
        String expect = "";
        String result = "default";
        try {
            result = testClass.getGreets(String.valueOf(25));
        } catch (Exception e) {
            ;
        }
        assertEquals(expect, result);
    }

    /**
     * 異常系?
     */
    public void testGetGreets_null() {
        Exception ex = null;
        try {
            testClass.getGreets(null);
        } catch (Exception e) {
            ex = e;
        }
        assertTrue(ex instanceof IllegalVariableException);
    }

    /**
     * 異常系?
     */
    public void testGetGreets_空文字() {
        Exception ex = null;
        try {
            testClass.getGreets("");
        } catch (Exception e) {
            ex = e;
        }
        assertTrue(ex instanceof IllegalVariableException);
    }
}
