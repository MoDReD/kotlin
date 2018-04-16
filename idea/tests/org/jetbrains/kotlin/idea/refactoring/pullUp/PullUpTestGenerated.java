/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.refactoring.pullUp;

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
public class PullUpTestGenerated extends AbstractPullUpTest {
    @TestMetadata("idea/testData/refactoring/pullUp/k2k")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class K2K extends AbstractPullUpTest {
        @TestMetadata("abstractFromInterfaceToInterface.kt")
        public void testAbstractFromInterfaceToInterface() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/abstractFromInterfaceToInterface.kt");
        }

        @TestMetadata("accidentalOverrides.kt")
        public void testAccidentalOverrides() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/accidentalOverrides.kt");
        }

        public void testAllFilesPresentInK2K() throws Exception {
            KotlinTestUtils.assertAllTestsPresentInSingleGeneratedClass(this.getClass(), new File("idea/testData/refactoring/pullUp/k2k"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY);
        }

        @TestMetadata("clashWithSuper.kt")
        public void testClashWithSuper() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/clashWithSuper.kt");
        }

        @TestMetadata("constructorParametersToInterface.kt")
        public void testConstructorParametersToInterface() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/constructorParametersToInterface.kt");
        }

        @TestMetadata("constructorParametersToSuperClass.kt")
        public void testConstructorParametersToSuperClass() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/constructorParametersToSuperClass.kt");
        }

        @TestMetadata("constructorParametersToSuperClassAndMakeAbstract.kt")
        public void testConstructorParametersToSuperClassAndMakeAbstract() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/constructorParametersToSuperClassAndMakeAbstract.kt");
        }

        @TestMetadata("constructorParametersWithDefaultValue1.kt")
        public void testConstructorParametersWithDefaultValue1() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/constructorParametersWithDefaultValue1.kt");
        }

        @TestMetadata("constructorParametersWithDefaultValue2.kt")
        public void testConstructorParametersWithDefaultValue2() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/constructorParametersWithDefaultValue2.kt");
        }

        @TestMetadata("constructorParametersWithNamedArgs.kt")
        public void testConstructorParametersWithNamedArgs() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/constructorParametersWithNamedArgs.kt");
        }

        @TestMetadata("constructorParametersWithNamedArgsAndDefault.kt")
        public void testConstructorParametersWithNamedArgsAndDefault() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/constructorParametersWithNamedArgsAndDefault.kt");
        }

        @TestMetadata("constructorParametersWithVararg.kt")
        public void testConstructorParametersWithVararg() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/constructorParametersWithVararg.kt");
        }

        @TestMetadata("defaultValuesInOverride.kt")
        public void testDefaultValuesInOverride() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/defaultValuesInOverride.kt");
        }

        @TestMetadata("dropFinal.kt")
        public void testDropFinal() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/dropFinal.kt");
        }

        @TestMetadata("dropModifierWhenMovingSideOverride.kt")
        public void testDropModifierWhenMovingSideOverride() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/dropModifierWhenMovingSideOverride.kt");
        }

        @TestMetadata("dropModifierWhenMovingSideOverrideWithAbstract.kt")
        public void testDropModifierWhenMovingSideOverrideWithAbstract() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/dropModifierWhenMovingSideOverrideWithAbstract.kt");
        }

        @TestMetadata("dropModifierWhenMovingSideOverrideWithSuperEntry.kt")
        public void testDropModifierWhenMovingSideOverrideWithSuperEntry() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/dropModifierWhenMovingSideOverrideWithSuperEntry.kt");
        }

        @TestMetadata("dropModifierWhenMovingSideOverrideWithSuperEntryAndAbstract.kt")
        public void testDropModifierWhenMovingSideOverrideWithSuperEntryAndAbstract() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/dropModifierWhenMovingSideOverrideWithSuperEntryAndAbstract.kt");
        }

        @TestMetadata("fromClassToClass.kt")
        public void testFromClassToClass() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/fromClassToClass.kt");
        }

        @TestMetadata("fromClassToClassMakeAbstract.kt")
        public void testFromClassToClassMakeAbstract() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/fromClassToClassMakeAbstract.kt");
        }

        @TestMetadata("fromClassToClassWithGenerics.kt")
        public void testFromClassToClassWithGenerics() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/fromClassToClassWithGenerics.kt");
        }

        @TestMetadata("fromClassToInterface.kt")
        public void testFromClassToInterface() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/fromClassToInterface.kt");
        }

        @TestMetadata("fromClassToInterfaceMakeAbstract.kt")
        public void testFromClassToInterfaceMakeAbstract() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/fromClassToInterfaceMakeAbstract.kt");
        }

        @TestMetadata("implicitCompanionUsages.kt")
        public void testImplicitCompanionUsages() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/implicitCompanionUsages.kt");
        }

        @TestMetadata("inaccessibleMemberUsed.kt")
        public void testInaccessibleMemberUsed() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/inaccessibleMemberUsed.kt");
        }

        @TestMetadata("initializerInConstructor.kt")
        public void testInitializerInConstructor() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/initializerInConstructor.kt");
        }

        @TestMetadata("initializerInMultipleConstructorsEq.kt")
        public void testInitializerInMultipleConstructorsEq() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/initializerInMultipleConstructorsEq.kt");
        }

        @TestMetadata("initializerInMultipleConstructorsNonEq.kt")
        public void testInitializerInMultipleConstructorsNonEq() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/initializerInMultipleConstructorsNonEq.kt");
        }

        @TestMetadata("innerClassToInterface.kt")
        public void testInnerClassToInterface() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/innerClassToInterface.kt");
        }

        @TestMetadata("moveAllSuperInterfaces.kt")
        public void testMoveAllSuperInterfaces() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/moveAllSuperInterfaces.kt");
        }

        @TestMetadata("moveAllSuperInterfacesWithGenerics.kt")
        public void testMoveAllSuperInterfacesWithGenerics() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/moveAllSuperInterfacesWithGenerics.kt");
        }

        @TestMetadata("moveSuperInterfaces.kt")
        public void testMoveSuperInterfaces() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/moveSuperInterfaces.kt");
        }

        @TestMetadata("moveSuperInterfacesToEmptySpecifierList.kt")
        public void testMoveSuperInterfacesToEmptySpecifierList() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/moveSuperInterfacesToEmptySpecifierList.kt");
        }

        @TestMetadata("moveSuperInterfaceToItSelf.kt")
        public void testMoveSuperInterfaceToItSelf() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/moveSuperInterfaceToItSelf.kt");
        }

        @TestMetadata("multipleInitializersInConstructorsEq.kt")
        public void testMultipleInitializersInConstructorsEq() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/multipleInitializersInConstructorsEq.kt");
        }

        @TestMetadata("noCaret.kt")
        public void testNoCaret() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/noCaret.kt");
        }

        @TestMetadata("noClashWithAbstractSuper.kt")
        public void testNoClashWithAbstractSuper() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/noClashWithAbstractSuper.kt");
        }

        @TestMetadata("noInitializationInInterface.kt")
        public void testNoInitializationInInterface() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/noInitializationInInterface.kt");
        }

        @TestMetadata("noSuperClass.kt")
        public void testNoSuperClass() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/noSuperClass.kt");
        }

        @TestMetadata("noVisibilityCheckBetweenMovedMembers.kt")
        public void testNoVisibilityCheckBetweenMovedMembers() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/noVisibilityCheckBetweenMovedMembers.kt");
        }

        @TestMetadata("outsideOfClass.kt")
        public void testOutsideOfClass() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/outsideOfClass.kt");
        }

        @TestMetadata("parameterNameConflict.kt")
        public void testParameterNameConflict() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/parameterNameConflict.kt");
        }

        @TestMetadata("parametersInPrimaryInitializer.kt")
        public void testParametersInPrimaryInitializer() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/parametersInPrimaryInitializer.kt");
        }

        @TestMetadata("privateMemberWithUsagesToClass.kt")
        public void testPrivateMemberWithUsagesToClass() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/privateMemberWithUsagesToClass.kt");
        }

        @TestMetadata("privateMemberWithUsagesToInterface.kt")
        public void testPrivateMemberWithUsagesToInterface() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/privateMemberWithUsagesToInterface.kt");
        }

        @TestMetadata("propertyDependenceSatisfied.kt")
        public void testPropertyDependenceSatisfied() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/propertyDependenceSatisfied.kt");
        }

        @TestMetadata("propertyDependenceUnsatisfied.kt")
        public void testPropertyDependenceUnsatisfied() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/propertyDependenceUnsatisfied.kt");
        }

        @TestMetadata("propertyWithoutLightMethod.kt")
        public void testPropertyWithoutLightMethod() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/propertyWithoutLightMethod.kt");
        }

        @TestMetadata("publicToInterface.kt")
        public void testPublicToInterface() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/publicToInterface.kt");
        }

        @TestMetadata("reformatModifierList.kt")
        public void testReformatModifierList() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/reformatModifierList.kt");
        }

        @TestMetadata("removeVisibilityOnOverride.kt")
        public void testRemoveVisibilityOnOverride() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/removeVisibilityOnOverride.kt");
        }

        @TestMetadata("skipFakeOverrides.kt")
        public void testSkipFakeOverrides() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/skipFakeOverrides.kt");
        }

        @TestMetadata("spaceAfterModifier.kt")
        public void testSpaceAfterModifier() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/spaceAfterModifier.kt");
        }

        @TestMetadata("superToThis.kt")
        public void testSuperToThis() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/superToThis.kt");
        }

        @TestMetadata("toIndirectSuperClass.kt")
        public void testToIndirectSuperClass() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/toIndirectSuperClass.kt");
        }

        @TestMetadata("usedPrivateToClass.kt")
        public void testUsedPrivateToClass() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2k/usedPrivateToClass.kt");
        }
    }

    @TestMetadata("idea/testData/refactoring/pullUp/k2j")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class K2J extends AbstractPullUpTest {
        public void testAllFilesPresentInK2J() throws Exception {
            KotlinTestUtils.assertAllTestsPresentInSingleGeneratedClass(this.getClass(), new File("idea/testData/refactoring/pullUp/k2j"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY);
        }

        @TestMetadata("constructorParameterToClass.kt")
        public void testConstructorParameterToClass() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2j/constructorParameterToClass.kt");
        }

        @TestMetadata("defaultValuesInOverride.kt")
        public void testDefaultValuesInOverride() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2j/defaultValuesInOverride.kt");
        }

        @TestMetadata("fromClassToClass.kt")
        public void testFromClassToClass() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2j/fromClassToClass.kt");
        }

        @TestMetadata("fromClassToClassAndMakeAbstract.kt")
        public void testFromClassToClassAndMakeAbstract() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2j/fromClassToClassAndMakeAbstract.kt");
        }

        @TestMetadata("fromClassToClassWithGenerics.kt")
        public void testFromClassToClassWithGenerics() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2j/fromClassToClassWithGenerics.kt");
        }

        @TestMetadata("fromClassToInterface.kt")
        public void testFromClassToInterface() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2j/fromClassToInterface.kt");
        }

        @TestMetadata("fromClassToNestedClass.kt")
        public void testFromClassToNestedClass() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2j/fromClassToNestedClass.kt");
        }

        @TestMetadata("moveSuperInterfacesToClass.kt")
        public void testMoveSuperInterfacesToClass() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2j/moveSuperInterfacesToClass.kt");
        }

        @TestMetadata("moveSuperInterfacesToInterface.kt")
        public void testMoveSuperInterfacesToInterface() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2j/moveSuperInterfacesToInterface.kt");
        }

        @TestMetadata("moveSuperInterfacesWithGenerics.kt")
        public void testMoveSuperInterfacesWithGenerics() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2j/moveSuperInterfacesWithGenerics.kt");
        }

        @TestMetadata("publicToInterface.kt")
        public void testPublicToInterface() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2j/publicToInterface.kt");
        }

        @TestMetadata("usedPrivateToClass.kt")
        public void testUsedPrivateToClass() throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/k2j/usedPrivateToClass.kt");
        }
    }

    @TestMetadata("idea/testData/refactoring/pullUp/j2k")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class J2K extends AbstractPullUpTest {
        public void testAllFilesPresentInJ2K() throws Exception {
            KotlinTestUtils.assertAllTestsPresentInSingleGeneratedClass(this.getClass(), new File("idea/testData/refactoring/pullUp/j2k"), Pattern.compile("^(.+)\\.java$"), TargetBackend.ANY);
        }

        @TestMetadata("fromClassToClass.java")
        public void testFromClassToClass() throws Exception {
            KotlinTestUtils.runTest(this::doJavaTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/j2k/fromClassToClass.java");
        }

        @TestMetadata("fromClassToClassAndMakeAbstract.java")
        public void testFromClassToClassAndMakeAbstract() throws Exception {
            KotlinTestUtils.runTest(this::doJavaTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/j2k/fromClassToClassAndMakeAbstract.java");
        }

        @TestMetadata("fromClassToClassWithGenerics.java")
        public void testFromClassToClassWithGenerics() throws Exception {
            KotlinTestUtils.runTest(this::doJavaTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/j2k/fromClassToClassWithGenerics.java");
        }

        @TestMetadata("fromClassToInterface.java")
        public void testFromClassToInterface() throws Exception {
            KotlinTestUtils.runTest(this::doJavaTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/j2k/fromClassToInterface.java");
        }

        @TestMetadata("fromClassToInterfaceWithConflicts.java")
        public void testFromClassToInterfaceWithConflicts() throws Exception {
            KotlinTestUtils.runTest(this::doJavaTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/j2k/fromClassToInterfaceWithConflicts.java");
        }

        @TestMetadata("fromClassToNestedClass.java")
        public void testFromClassToNestedClass() throws Exception {
            KotlinTestUtils.runTest(this::doJavaTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/j2k/fromClassToNestedClass.java");
        }

        @TestMetadata("moveSuperInterfacesToClass.java")
        public void testMoveSuperInterfacesToClass() throws Exception {
            KotlinTestUtils.runTest(this::doJavaTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/j2k/moveSuperInterfacesToClass.java");
        }

        @TestMetadata("moveSuperInterfacesToInterface.java")
        public void testMoveSuperInterfacesToInterface() throws Exception {
            KotlinTestUtils.runTest(this::doJavaTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/j2k/moveSuperInterfacesToInterface.java");
        }

        @TestMetadata("moveSuperInterfacesWithGenerics.java")
        public void testMoveSuperInterfacesWithGenerics() throws Exception {
            KotlinTestUtils.runTest(this::doJavaTest,TargetBackend.ANY, "idea/testData/refactoring/pullUp/j2k/moveSuperInterfacesWithGenerics.java");
        }
    }
}
