/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.resolve.calls;

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
@TestMetadata("compiler/testData/resolveConstructorDelegationCalls")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ResolvedConstructorDelegationCallsTestsGenerated extends AbstractResolvedConstructorDelegationCallsTests {
    public void testAllFilesPresentInResolveConstructorDelegationCalls() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/resolveConstructorDelegationCalls"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("classWithGenerics.kt")
    public void testClassWithGenerics() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "compiler/testData/resolveConstructorDelegationCalls/classWithGenerics.kt");
    }

    @TestMetadata("generics2.kt")
    public void testGenerics2() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "compiler/testData/resolveConstructorDelegationCalls/generics2.kt");
    }

    @TestMetadata("generics3.kt")
    public void testGenerics3() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "compiler/testData/resolveConstructorDelegationCalls/generics3.kt");
    }

    @TestMetadata("generics4.kt")
    public void testGenerics4() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "compiler/testData/resolveConstructorDelegationCalls/generics4.kt");
    }

    @TestMetadata("generics5.kt")
    public void testGenerics5() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "compiler/testData/resolveConstructorDelegationCalls/generics5.kt");
    }

    @TestMetadata("inheritanceWithGeneric.kt")
    public void testInheritanceWithGeneric() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "compiler/testData/resolveConstructorDelegationCalls/inheritanceWithGeneric.kt");
    }

    @TestMetadata("innerClassDelegatingPrimary.kt")
    public void testInnerClassDelegatingPrimary() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "compiler/testData/resolveConstructorDelegationCalls/innerClassDelegatingPrimary.kt");
    }

    @TestMetadata("innerClassDelegatingSecondary.kt")
    public void testInnerClassDelegatingSecondary() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "compiler/testData/resolveConstructorDelegationCalls/innerClassDelegatingSecondary.kt");
    }

    @TestMetadata("superAnyEmpty.kt")
    public void testSuperAnyEmpty() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "compiler/testData/resolveConstructorDelegationCalls/superAnyEmpty.kt");
    }

    @TestMetadata("superAnyImplicit.kt")
    public void testSuperAnyImplicit() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "compiler/testData/resolveConstructorDelegationCalls/superAnyImplicit.kt");
    }

    @TestMetadata("superPrimary.kt")
    public void testSuperPrimary() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "compiler/testData/resolveConstructorDelegationCalls/superPrimary.kt");
    }

    @TestMetadata("superPrimaryEmpty.kt")
    public void testSuperPrimaryEmpty() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "compiler/testData/resolveConstructorDelegationCalls/superPrimaryEmpty.kt");
    }

    @TestMetadata("superPrimaryImplicit.kt")
    public void testSuperPrimaryImplicit() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "compiler/testData/resolveConstructorDelegationCalls/superPrimaryImplicit.kt");
    }

    @TestMetadata("superSecondary.kt")
    public void testSuperSecondary() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "compiler/testData/resolveConstructorDelegationCalls/superSecondary.kt");
    }

    @TestMetadata("superSecondaryImplicit.kt")
    public void testSuperSecondaryImplicit() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "compiler/testData/resolveConstructorDelegationCalls/superSecondaryImplicit.kt");
    }

    @TestMetadata("superSecondaryOverload.kt")
    public void testSuperSecondaryOverload() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "compiler/testData/resolveConstructorDelegationCalls/superSecondaryOverload.kt");
    }

    @TestMetadata("thisPrimary.kt")
    public void testThisPrimary() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "compiler/testData/resolveConstructorDelegationCalls/thisPrimary.kt");
    }

    @TestMetadata("thisPrimaryEmpty.kt")
    public void testThisPrimaryEmpty() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "compiler/testData/resolveConstructorDelegationCalls/thisPrimaryEmpty.kt");
    }

    @TestMetadata("thisSecondary.kt")
    public void testThisSecondary() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "compiler/testData/resolveConstructorDelegationCalls/thisSecondary.kt");
    }

    @TestMetadata("thisSecondaryOverload.kt")
    public void testThisSecondaryOverload() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "compiler/testData/resolveConstructorDelegationCalls/thisSecondaryOverload.kt");
    }

    @TestMetadata("varargs.kt")
    public void testVarargs() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "compiler/testData/resolveConstructorDelegationCalls/varargs.kt");
    }
}
