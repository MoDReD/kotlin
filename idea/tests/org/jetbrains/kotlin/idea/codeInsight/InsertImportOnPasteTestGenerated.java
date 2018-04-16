/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.codeInsight;

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
public class InsertImportOnPasteTestGenerated extends AbstractInsertImportOnPasteTest {
    @TestMetadata("idea/testData/copyPaste/imports")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Copy extends AbstractInsertImportOnPasteTest {
        public void testAllFilesPresentInCopy() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/copyPaste/imports"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, false);
        }

        @TestMetadata("AlreadyImportedExtensions.kt")
        public void testAlreadyImportedExtensions() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/AlreadyImportedExtensions.kt");
        }

        @TestMetadata("AlreadyImportedViaStar.kt")
        public void testAlreadyImportedViaStar() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/AlreadyImportedViaStar.kt");
        }

        @TestMetadata("ClassAlreadyImported.kt")
        public void testClassAlreadyImported() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/ClassAlreadyImported.kt");
        }

        @TestMetadata("ClassMember.kt")
        public void testClassMember() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/ClassMember.kt");
        }

        @TestMetadata("ClassObject.kt")
        public void testClassObject() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/ClassObject.kt");
        }

        @TestMetadata("ClassObjectFunInsideClass.kt")
        public void testClassObjectFunInsideClass() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/ClassObjectFunInsideClass.kt");
        }

        @TestMetadata("ClassObjectInner.kt")
        public void testClassObjectInner() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/ClassObjectInner.kt");
        }

        @TestMetadata("ClassResolvedToPackage.kt")
        public void testClassResolvedToPackage() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/ClassResolvedToPackage.kt");
        }

        @TestMetadata("ClassType.kt")
        public void testClassType() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/ClassType.kt");
        }

        @TestMetadata("ConflictForTypeWithTypeParameter.kt")
        public void testConflictForTypeWithTypeParameter() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/ConflictForTypeWithTypeParameter.kt");
        }

        @TestMetadata("ConflictWithClass.kt")
        public void testConflictWithClass() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/ConflictWithClass.kt");
        }

        @TestMetadata("Constructor.kt")
        public void testConstructor() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/Constructor.kt");
        }

        @TestMetadata("DeepInnerClasses.kt")
        public void testDeepInnerClasses() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/DeepInnerClasses.kt");
        }

        @TestMetadata("DefaultPackage.kt")
        public void testDefaultPackage() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/DefaultPackage.kt");
        }

        @TestMetadata("DelegatedProperty.kt")
        public void testDelegatedProperty() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/DelegatedProperty.kt");
        }

        @TestMetadata("DependenciesNotAccessibleOnPaste.kt")
        public void testDependenciesNotAccessibleOnPaste() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/DependenciesNotAccessibleOnPaste.kt");
        }

        @TestMetadata("DependencyOnJava.kt")
        public void testDependencyOnJava() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/DependencyOnJava.kt");
        }

        @TestMetadata("DependencyOnKotlinLibrary.kt")
        public void testDependencyOnKotlinLibrary() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/DependencyOnKotlinLibrary.kt");
        }

        @TestMetadata("DependencyOnStdLib.kt")
        public void testDependencyOnStdLib() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/DependencyOnStdLib.kt");
        }

        @TestMetadata("EnumEntries.kt")
        public void testEnumEntries() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/EnumEntries.kt");
        }

        @TestMetadata("Extension.kt")
        public void testExtension() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/Extension.kt");
        }

        @TestMetadata("ExtensionAsInfixOrOperator.kt")
        public void testExtensionAsInfixOrOperator() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/ExtensionAsInfixOrOperator.kt");
        }

        @TestMetadata("ExtensionCannotBeImportedOrLengthened.kt")
        public void testExtensionCannotBeImportedOrLengthened() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/ExtensionCannotBeImportedOrLengthened.kt");
        }

        @TestMetadata("ExtensionConflict.kt")
        public void testExtensionConflict() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/ExtensionConflict.kt");
        }

        @TestMetadata("ForLoop.kt")
        public void testForLoop() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/ForLoop.kt");
        }

        @TestMetadata("FullyQualified.kt")
        public void testFullyQualified() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/FullyQualified.kt");
        }

        @TestMetadata("Function.kt")
        public void testFunction() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/Function.kt");
        }

        @TestMetadata("FunctionAlreadyImported.kt")
        public void testFunctionAlreadyImported() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/FunctionAlreadyImported.kt");
        }

        @TestMetadata("FunctionParameter.kt")
        public void testFunctionParameter() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/FunctionParameter.kt");
        }

        @TestMetadata("GetExpression.kt")
        public void testGetExpression() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/GetExpression.kt");
        }

        @TestMetadata("ImportDependency.kt")
        public void testImportDependency() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/ImportDependency.kt");
        }

        @TestMetadata("ImportDirective.kt")
        public void testImportDirective() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/ImportDirective.kt");
        }

        @TestMetadata("ImportableEntityInExtensionLiteral.kt")
        public void testImportableEntityInExtensionLiteral() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/ImportableEntityInExtensionLiteral.kt");
        }

        @TestMetadata("ImportedElementCopied.kt")
        public void testImportedElementCopied() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/ImportedElementCopied.kt");
        }

        @TestMetadata("Inner.kt")
        public void testInner() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/Inner.kt");
        }

        @TestMetadata("Invoke.kt")
        public void testInvoke() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/Invoke.kt");
        }

        @TestMetadata("JavaStaticViaClass.kt")
        public void testJavaStaticViaClass() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/JavaStaticViaClass.kt");
        }

        @TestMetadata("KT10433.kt")
        public void testKT10433() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/KT10433.kt");
        }

        @TestMetadata("KeywordClassName.kt")
        public void testKeywordClassName() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/KeywordClassName.kt");
        }

        @TestMetadata("Local.kt")
        public void testLocal() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/Local.kt");
        }

        @TestMetadata("MultiDeclaration.kt")
        public void testMultiDeclaration() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/MultiDeclaration.kt");
        }

        @TestMetadata("MultiReferencePartiallyCopied.kt")
        public void testMultiReferencePartiallyCopied() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/MultiReferencePartiallyCopied.kt");
        }

        @TestMetadata("NoImportForBuiltIns.kt")
        public void testNoImportForBuiltIns() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/NoImportForBuiltIns.kt");
        }

        @TestMetadata("NoImportForSamePackage.kt")
        public void testNoImportForSamePackage() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/NoImportForSamePackage.kt");
        }

        @TestMetadata("NotReferencePosition.kt")
        public void testNotReferencePosition() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/NotReferencePosition.kt");
        }

        @TestMetadata("NotReferencePosition2.kt")
        public void testNotReferencePosition2() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/NotReferencePosition2.kt");
        }

        @TestMetadata("Object.kt")
        public void testObject() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/Object.kt");
        }

        @TestMetadata("OnlyKDocReferenced.kt")
        public void testOnlyKDocReferenced() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/OnlyKDocReferenced.kt");
        }

        @TestMetadata("OverloadedExtensionFunction.kt")
        public void testOverloadedExtensionFunction() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/OverloadedExtensionFunction.kt");
        }

        @TestMetadata("PackageView.kt")
        public void testPackageView() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/PackageView.kt");
        }

        @TestMetadata("PartiallyQualified.kt")
        public void testPartiallyQualified() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/PartiallyQualified.kt");
        }

        @TestMetadata("QualifiedTypeConflict.kt")
        public void testQualifiedTypeConflict() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/QualifiedTypeConflict.kt");
        }

        @TestMetadata("ReferencedElementAlsoCopied.kt")
        public void testReferencedElementAlsoCopied() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/ReferencedElementAlsoCopied.kt");
        }

        @TestMetadata("Super.kt")
        public void testSuper() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/Super.kt");
        }

        @TestMetadata("ThisReference.kt")
        public void testThisReference() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/ThisReference.kt");
        }

        @TestMetadata("TopLevelProperty.kt")
        public void testTopLevelProperty() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/TopLevelProperty.kt");
        }

        @TestMetadata("Trait.kt")
        public void testTrait() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/Trait.kt");
        }

        @TestMetadata("TypeArgForUnresolvedCall.kt")
        public void testTypeArgForUnresolvedCall() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/TypeArgForUnresolvedCall.kt");
        }

        @TestMetadata("TypeParameter.kt")
        public void testTypeParameter() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/TypeParameter.kt");
        }

        @TestMetadata("UnresolvedOverload.kt")
        public void testUnresolvedOverload() throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy,TargetBackend.ANY, "idea/testData/copyPaste/imports/UnresolvedOverload.kt");
        }
    }

    @TestMetadata("idea/testData/copyPaste/imports")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Cut extends AbstractInsertImportOnPasteTest {
        public void testAllFilesPresentInCut() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/copyPaste/imports"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, false);
        }

        @TestMetadata("AlreadyImportedExtensions.kt")
        public void testAlreadyImportedExtensions() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/AlreadyImportedExtensions.kt");
        }

        @TestMetadata("AlreadyImportedViaStar.kt")
        public void testAlreadyImportedViaStar() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/AlreadyImportedViaStar.kt");
        }

        @TestMetadata("ClassAlreadyImported.kt")
        public void testClassAlreadyImported() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/ClassAlreadyImported.kt");
        }

        @TestMetadata("ClassMember.kt")
        public void testClassMember() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/ClassMember.kt");
        }

        @TestMetadata("ClassObject.kt")
        public void testClassObject() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/ClassObject.kt");
        }

        @TestMetadata("ClassObjectFunInsideClass.kt")
        public void testClassObjectFunInsideClass() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/ClassObjectFunInsideClass.kt");
        }

        @TestMetadata("ClassObjectInner.kt")
        public void testClassObjectInner() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/ClassObjectInner.kt");
        }

        @TestMetadata("ClassResolvedToPackage.kt")
        public void testClassResolvedToPackage() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/ClassResolvedToPackage.kt");
        }

        @TestMetadata("ClassType.kt")
        public void testClassType() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/ClassType.kt");
        }

        @TestMetadata("ConflictForTypeWithTypeParameter.kt")
        public void testConflictForTypeWithTypeParameter() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/ConflictForTypeWithTypeParameter.kt");
        }

        @TestMetadata("ConflictWithClass.kt")
        public void testConflictWithClass() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/ConflictWithClass.kt");
        }

        @TestMetadata("Constructor.kt")
        public void testConstructor() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/Constructor.kt");
        }

        @TestMetadata("DeepInnerClasses.kt")
        public void testDeepInnerClasses() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/DeepInnerClasses.kt");
        }

        @TestMetadata("DefaultPackage.kt")
        public void testDefaultPackage() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/DefaultPackage.kt");
        }

        @TestMetadata("DelegatedProperty.kt")
        public void testDelegatedProperty() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/DelegatedProperty.kt");
        }

        @TestMetadata("DependenciesNotAccessibleOnPaste.kt")
        public void testDependenciesNotAccessibleOnPaste() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/DependenciesNotAccessibleOnPaste.kt");
        }

        @TestMetadata("DependencyOnJava.kt")
        public void testDependencyOnJava() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/DependencyOnJava.kt");
        }

        @TestMetadata("DependencyOnKotlinLibrary.kt")
        public void testDependencyOnKotlinLibrary() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/DependencyOnKotlinLibrary.kt");
        }

        @TestMetadata("DependencyOnStdLib.kt")
        public void testDependencyOnStdLib() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/DependencyOnStdLib.kt");
        }

        @TestMetadata("EnumEntries.kt")
        public void testEnumEntries() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/EnumEntries.kt");
        }

        @TestMetadata("Extension.kt")
        public void testExtension() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/Extension.kt");
        }

        @TestMetadata("ExtensionAsInfixOrOperator.kt")
        public void testExtensionAsInfixOrOperator() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/ExtensionAsInfixOrOperator.kt");
        }

        @TestMetadata("ExtensionCannotBeImportedOrLengthened.kt")
        public void testExtensionCannotBeImportedOrLengthened() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/ExtensionCannotBeImportedOrLengthened.kt");
        }

        @TestMetadata("ExtensionConflict.kt")
        public void testExtensionConflict() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/ExtensionConflict.kt");
        }

        @TestMetadata("ForLoop.kt")
        public void testForLoop() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/ForLoop.kt");
        }

        @TestMetadata("FullyQualified.kt")
        public void testFullyQualified() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/FullyQualified.kt");
        }

        @TestMetadata("Function.kt")
        public void testFunction() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/Function.kt");
        }

        @TestMetadata("FunctionAlreadyImported.kt")
        public void testFunctionAlreadyImported() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/FunctionAlreadyImported.kt");
        }

        @TestMetadata("FunctionParameter.kt")
        public void testFunctionParameter() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/FunctionParameter.kt");
        }

        @TestMetadata("GetExpression.kt")
        public void testGetExpression() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/GetExpression.kt");
        }

        @TestMetadata("ImportDependency.kt")
        public void testImportDependency() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/ImportDependency.kt");
        }

        @TestMetadata("ImportDirective.kt")
        public void testImportDirective() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/ImportDirective.kt");
        }

        @TestMetadata("ImportableEntityInExtensionLiteral.kt")
        public void testImportableEntityInExtensionLiteral() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/ImportableEntityInExtensionLiteral.kt");
        }

        @TestMetadata("ImportedElementCopied.kt")
        public void testImportedElementCopied() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/ImportedElementCopied.kt");
        }

        @TestMetadata("Inner.kt")
        public void testInner() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/Inner.kt");
        }

        @TestMetadata("Invoke.kt")
        public void testInvoke() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/Invoke.kt");
        }

        @TestMetadata("JavaStaticViaClass.kt")
        public void testJavaStaticViaClass() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/JavaStaticViaClass.kt");
        }

        @TestMetadata("KT10433.kt")
        public void testKT10433() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/KT10433.kt");
        }

        @TestMetadata("KeywordClassName.kt")
        public void testKeywordClassName() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/KeywordClassName.kt");
        }

        @TestMetadata("Local.kt")
        public void testLocal() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/Local.kt");
        }

        @TestMetadata("MultiDeclaration.kt")
        public void testMultiDeclaration() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/MultiDeclaration.kt");
        }

        @TestMetadata("MultiReferencePartiallyCopied.kt")
        public void testMultiReferencePartiallyCopied() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/MultiReferencePartiallyCopied.kt");
        }

        @TestMetadata("NoImportForBuiltIns.kt")
        public void testNoImportForBuiltIns() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/NoImportForBuiltIns.kt");
        }

        @TestMetadata("NoImportForSamePackage.kt")
        public void testNoImportForSamePackage() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/NoImportForSamePackage.kt");
        }

        @TestMetadata("NotReferencePosition.kt")
        public void testNotReferencePosition() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/NotReferencePosition.kt");
        }

        @TestMetadata("NotReferencePosition2.kt")
        public void testNotReferencePosition2() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/NotReferencePosition2.kt");
        }

        @TestMetadata("Object.kt")
        public void testObject() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/Object.kt");
        }

        @TestMetadata("OnlyKDocReferenced.kt")
        public void testOnlyKDocReferenced() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/OnlyKDocReferenced.kt");
        }

        @TestMetadata("OverloadedExtensionFunction.kt")
        public void testOverloadedExtensionFunction() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/OverloadedExtensionFunction.kt");
        }

        @TestMetadata("PackageView.kt")
        public void testPackageView() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/PackageView.kt");
        }

        @TestMetadata("PartiallyQualified.kt")
        public void testPartiallyQualified() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/PartiallyQualified.kt");
        }

        @TestMetadata("QualifiedTypeConflict.kt")
        public void testQualifiedTypeConflict() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/QualifiedTypeConflict.kt");
        }

        @TestMetadata("ReferencedElementAlsoCopied.kt")
        public void testReferencedElementAlsoCopied() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/ReferencedElementAlsoCopied.kt");
        }

        @TestMetadata("Super.kt")
        public void testSuper() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/Super.kt");
        }

        @TestMetadata("ThisReference.kt")
        public void testThisReference() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/ThisReference.kt");
        }

        @TestMetadata("TopLevelProperty.kt")
        public void testTopLevelProperty() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/TopLevelProperty.kt");
        }

        @TestMetadata("Trait.kt")
        public void testTrait() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/Trait.kt");
        }

        @TestMetadata("TypeArgForUnresolvedCall.kt")
        public void testTypeArgForUnresolvedCall() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/TypeArgForUnresolvedCall.kt");
        }

        @TestMetadata("TypeParameter.kt")
        public void testTypeParameter() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/TypeParameter.kt");
        }

        @TestMetadata("UnresolvedOverload.kt")
        public void testUnresolvedOverload() throws Exception {
            KotlinTestUtils.runTest(this::doTestCut,TargetBackend.ANY, "idea/testData/copyPaste/imports/UnresolvedOverload.kt");
        }
    }
}
