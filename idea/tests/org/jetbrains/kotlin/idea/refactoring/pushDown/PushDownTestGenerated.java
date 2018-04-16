/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.refactoring.pushDown;

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
public class PushDownTestGenerated extends AbstractPushDownTest {
    @TestMetadata("idea/testData/refactoring/pushDown/k2k")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class K2K extends AbstractPushDownTest {
        @TestMetadata("accidentalOverrides.kt")
        public void testAccidentalOverrides() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pushDown/k2k/accidentalOverrides.kt");
        }

        public void testAllFilesPresentInK2K() throws Exception {
            KotlinTestUtils.assertAllTestsPresentInSingleGeneratedClass(this.getClass(), new File("idea/testData/refactoring/pushDown/k2k"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY);
        }

        @TestMetadata("clashingMembers.kt")
        public void testClashingMembers() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pushDown/k2k/clashingMembers.kt");
        }

        @TestMetadata("classToInterface.kt")
        public void testClassToInterface() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pushDown/k2k/classToInterface.kt");
        }

        @TestMetadata("conflictingSuperCall.kt")
        public void testConflictingSuperCall() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pushDown/k2k/conflictingSuperCall.kt");
        }

        @TestMetadata("dropVisibilityOnGeneratedOverride.kt")
        public void testDropVisibilityOnGeneratedOverride() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pushDown/k2k/dropVisibilityOnGeneratedOverride.kt");
        }

        @TestMetadata("finalClass.kt")
        public void testFinalClass() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pushDown/k2k/finalClass.kt");
        }

        @TestMetadata("implicitCompanionUsages.kt")
        public void testImplicitCompanionUsages() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pushDown/k2k/implicitCompanionUsages.kt");
        }

        @TestMetadata("liftPrivate.kt")
        public void testLiftPrivate() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pushDown/k2k/liftPrivate.kt");
        }

        @TestMetadata("noCaret.kt")
        public void testNoCaret() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pushDown/k2k/noCaret.kt");
        }

        @TestMetadata("objectDeclaration.kt")
        public void testObjectDeclaration() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pushDown/k2k/objectDeclaration.kt");
        }

        @TestMetadata("outsideOfClass.kt")
        public void testOutsideOfClass() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pushDown/k2k/outsideOfClass.kt");
        }

        @TestMetadata("pushClassMembers.kt")
        public void testPushClassMembers() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pushDown/k2k/pushClassMembers.kt");
        }

        @TestMetadata("pushClassMembersAndMakeAbstract.kt")
        public void testPushClassMembersAndMakeAbstract() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pushDown/k2k/pushClassMembersAndMakeAbstract.kt");
        }

        @TestMetadata("pushClassMembersWithGenerics.kt")
        public void testPushClassMembersWithGenerics() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pushDown/k2k/pushClassMembersWithGenerics.kt");
        }

        @TestMetadata("pushInterfaceMembers.kt")
        public void testPushInterfaceMembers() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pushDown/k2k/pushInterfaceMembers.kt");
        }

        @TestMetadata("pushInterfaceMembersAndMakeAbstract.kt")
        public void testPushInterfaceMembersAndMakeAbstract() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pushDown/k2k/pushInterfaceMembersAndMakeAbstract.kt");
        }

        @TestMetadata("pushMembersUsingPrivates.kt")
        public void testPushMembersUsingPrivates() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pushDown/k2k/pushMembersUsingPrivates.kt");
        }

        @TestMetadata("pushMembersWithExternalUsages.kt")
        public void testPushMembersWithExternalUsages() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pushDown/k2k/pushMembersWithExternalUsages.kt");
        }

        @TestMetadata("pushSuperInterfaces.kt")
        public void testPushSuperInterfaces() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pushDown/k2k/pushSuperInterfaces.kt");
        }

        @TestMetadata("pushSuperInterfacesWithGenerics.kt")
        public void testPushSuperInterfacesWithGenerics() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pushDown/k2k/pushSuperInterfacesWithGenerics.kt");
        }
    }

    @TestMetadata("idea/testData/refactoring/pushDown/k2j")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class K2J extends AbstractPushDownTest {
        public void testAllFilesPresentInK2J() throws Exception {
            KotlinTestUtils.assertAllTestsPresentInSingleGeneratedClass(this.getClass(), new File("idea/testData/refactoring/pushDown/k2j"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY);
        }

        @TestMetadata("kotlinToJava.kt")
        public void testKotlinToJava() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pushDown/k2j/kotlinToJava.kt");
        }
    }

    @TestMetadata("idea/testData/refactoring/pushDown/j2k")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class J2K extends AbstractPushDownTest {
        public void testAllFilesPresentInJ2K() throws Exception {
            KotlinTestUtils.assertAllTestsPresentInSingleGeneratedClass(this.getClass(), new File("idea/testData/refactoring/pushDown/j2k"), Pattern.compile("^(.+)\\.java$"), TargetBackend.ANY);
        }

        @TestMetadata("fromClass.java")
        public void testFromClass() throws Exception {
            KotlinTestUtils.runTest(this::doJavaTest,TargetBackend.ANY, "idea/testData/refactoring/pushDown/j2k/fromClass.java");
        }

        @TestMetadata("fromClassAndMakeAbstract.java")
        public void testFromClassAndMakeAbstract() throws Exception {
            KotlinTestUtils.runTest(this::doJavaTest,TargetBackend.ANY, "idea/testData/refactoring/pushDown/j2k/fromClassAndMakeAbstract.java");
        }

        @TestMetadata("fromClassUsageConflicts.java")
        public void testFromClassUsageConflicts() throws Exception {
            KotlinTestUtils.runTest(this::doJavaTest,TargetBackend.ANY, "idea/testData/refactoring/pushDown/j2k/fromClassUsageConflicts.java");
        }

        @TestMetadata("fromInterface.java")
        public void testFromInterface() throws Exception {
            KotlinTestUtils.runTest(this::doJavaTest,TargetBackend.ANY, "idea/testData/refactoring/pushDown/j2k/fromInterface.java");
        }
    }
}
