/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.renderer;

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
@TestMetadata("compiler/testData/renderFunctionDescriptorInExpression")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class FunctionDescriptorInExpressionRendererTestGenerated extends AbstractFunctionDescriptorInExpressionRendererTest {
    public void testAllFilesPresentInRenderFunctionDescriptorInExpression() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/renderFunctionDescriptorInExpression"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("basicFunExpr.kt")
    public void testBasicFunExpr() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "compiler/testData/renderFunctionDescriptorInExpression/basicFunExpr.kt");
    }

    @TestMetadata("basicFunExprArgs.kt")
    public void testBasicFunExprArgs() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "compiler/testData/renderFunctionDescriptorInExpression/basicFunExprArgs.kt");
    }

    @TestMetadata("basicLambda.kt")
    public void testBasicLambda() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "compiler/testData/renderFunctionDescriptorInExpression/basicLambda.kt");
    }

    @TestMetadata("labeledLambda.kt")
    public void testLabeledLambda() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "compiler/testData/renderFunctionDescriptorInExpression/labeledLambda.kt");
    }

    @TestMetadata("parenthesizedFunExpr.kt")
    public void testParenthesizedFunExpr() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "compiler/testData/renderFunctionDescriptorInExpression/parenthesizedFunExpr.kt");
    }

    @TestMetadata("parenthesizedLambda.kt")
    public void testParenthesizedLambda() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "compiler/testData/renderFunctionDescriptorInExpression/parenthesizedLambda.kt");
    }
}
