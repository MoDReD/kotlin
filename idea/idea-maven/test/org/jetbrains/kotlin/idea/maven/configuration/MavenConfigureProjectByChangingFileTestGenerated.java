/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.maven.configuration;

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
@RunWith(JUnit3RunnerWithInners.class)
public class MavenConfigureProjectByChangingFileTestGenerated extends AbstractMavenConfigureProjectByChangingFileTest {
    @TestMetadata("idea/idea-maven/testData/configurator/jvm")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Jvm extends AbstractMavenConfigureProjectByChangingFileTest {
        public void testAllFilesPresentInJvm() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/idea-maven/testData/configurator/jvm"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
        }

        @TestMetadata("fixExisting")
        public void testFixExisting() throws Exception {
            KotlinTestUtils.runTest(this::doTestWithMaven,TargetBackend.ANY, "idea/idea-maven/testData/configurator/jvm/fixExisting/");
        }

        @TestMetadata("jreLib")
        public void testJreLib() throws Exception {
            KotlinTestUtils.runTest(this::doTestWithMaven,TargetBackend.ANY, "idea/idea-maven/testData/configurator/jvm/jreLib/");
        }

        @TestMetadata("libraryMissed")
        public void testLibraryMissed() throws Exception {
            KotlinTestUtils.runTest(this::doTestWithMaven,TargetBackend.ANY, "idea/idea-maven/testData/configurator/jvm/libraryMissed/");
        }

        @TestMetadata("pluginMissed")
        public void testPluginMissed() throws Exception {
            KotlinTestUtils.runTest(this::doTestWithMaven,TargetBackend.ANY, "idea/idea-maven/testData/configurator/jvm/pluginMissed/");
        }

        @TestMetadata("simpleProject")
        public void testSimpleProject() throws Exception {
            KotlinTestUtils.runTest(this::doTestWithMaven,TargetBackend.ANY, "idea/idea-maven/testData/configurator/jvm/simpleProject/");
        }

        @TestMetadata("simpleProjectEAP")
        public void testSimpleProjectEAP() throws Exception {
            KotlinTestUtils.runTest(this::doTestWithMaven,TargetBackend.ANY, "idea/idea-maven/testData/configurator/jvm/simpleProjectEAP/");
        }

        @TestMetadata("simpleProjectRc")
        public void testSimpleProjectRc() throws Exception {
            KotlinTestUtils.runTest(this::doTestWithMaven,TargetBackend.ANY, "idea/idea-maven/testData/configurator/jvm/simpleProjectRc/");
        }

        @TestMetadata("simpleProjectSnapshot")
        public void testSimpleProjectSnapshot() throws Exception {
            KotlinTestUtils.runTest(this::doTestWithMaven,TargetBackend.ANY, "idea/idea-maven/testData/configurator/jvm/simpleProjectSnapshot/");
        }

        @TestMetadata("withJava9ModuleInfo")
        public void testWithJava9ModuleInfo() throws Exception {
            KotlinTestUtils.runTest(this::doTestWithMaven,TargetBackend.ANY, "idea/idea-maven/testData/configurator/jvm/withJava9ModuleInfo/");
        }
    }

    @TestMetadata("idea/idea-maven/testData/configurator/js")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Js extends AbstractMavenConfigureProjectByChangingFileTest {
        public void testAllFilesPresentInJs() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/idea-maven/testData/configurator/js"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
        }

        @TestMetadata("libraryMissed")
        public void testLibraryMissed() throws Exception {
            KotlinTestUtils.runTest(this::doTestWithJSMaven,TargetBackend.ANY, "idea/idea-maven/testData/configurator/js/libraryMissed/");
        }

        @TestMetadata("pluginMissed")
        public void testPluginMissed() throws Exception {
            KotlinTestUtils.runTest(this::doTestWithJSMaven,TargetBackend.ANY, "idea/idea-maven/testData/configurator/js/pluginMissed/");
        }

        @TestMetadata("simpleProject")
        public void testSimpleProject() throws Exception {
            KotlinTestUtils.runTest(this::doTestWithJSMaven,TargetBackend.ANY, "idea/idea-maven/testData/configurator/js/simpleProject/");
        }

        @TestMetadata("simpleProjectSnapshot")
        public void testSimpleProjectSnapshot() throws Exception {
            KotlinTestUtils.runTest(this::doTestWithJSMaven,TargetBackend.ANY, "idea/idea-maven/testData/configurator/js/simpleProjectSnapshot/");
        }
    }
}
