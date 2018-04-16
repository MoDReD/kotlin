/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.android;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/android-extensions/android-extensions-idea/testData/android/rename")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class AndroidRenameTestGenerated extends AbstractAndroidRenameTest {
    public void testAllFilesPresentInRename() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/android-extensions/android-extensions-idea/testData/android/rename"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
    }

    @TestMetadata("commonElementId")
    public void testCommonElementId() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "plugins/android-extensions/android-extensions-idea/testData/android/rename/commonElementId/");
    }

    @TestMetadata("fqNameInAttr")
    public void testFqNameInAttr() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "plugins/android-extensions/android-extensions-idea/testData/android/rename/fqNameInAttr/");
    }

    @TestMetadata("fqNameInAttrFragment")
    public void testFqNameInAttrFragment() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "plugins/android-extensions/android-extensions-idea/testData/android/rename/fqNameInAttrFragment/");
    }

    @TestMetadata("fqNameInTag")
    public void testFqNameInTag() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "plugins/android-extensions/android-extensions-idea/testData/android/rename/fqNameInTag/");
    }

    @TestMetadata("fqNameInTagFragment")
    public void testFqNameInTagFragment() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "plugins/android-extensions/android-extensions-idea/testData/android/rename/fqNameInTagFragment/");
    }

    @TestMetadata("multiFile")
    public void testMultiFile() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "plugins/android-extensions/android-extensions-idea/testData/android/rename/multiFile/");
    }

    @TestMetadata("multiFileFragment")
    public void testMultiFileFragment() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "plugins/android-extensions/android-extensions-idea/testData/android/rename/multiFileFragment/");
    }

    @TestMetadata("simple")
    public void testSimple() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "plugins/android-extensions/android-extensions-idea/testData/android/rename/simple/");
    }

    @TestMetadata("simpleFragment")
    public void testSimpleFragment() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "plugins/android-extensions/android-extensions-idea/testData/android/rename/simpleFragment/");
    }

    @TestMetadata("simpleView")
    public void testSimpleView() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "plugins/android-extensions/android-extensions-idea/testData/android/rename/simpleView/");
    }
}
