/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.android.parcel;

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
@TestMetadata("plugins/android-extensions/android-extensions-compiler/testData/parcel/codegen")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ParcelBytecodeListingTestGenerated extends AbstractParcelBytecodeListingTest {
    public void testAllFilesPresentInCodegen() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/android-extensions/android-extensions-compiler/testData/parcel/codegen"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("customDescribeContents.kt")
    public void testCustomDescribeContents() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "plugins/android-extensions/android-extensions-compiler/testData/parcel/codegen/customDescribeContents.kt");
    }

    @TestMetadata("customParcelablesDifferentModule.kt")
    public void testCustomParcelablesDifferentModule() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "plugins/android-extensions/android-extensions-compiler/testData/parcel/codegen/customParcelablesDifferentModule.kt");
    }

    @TestMetadata("customParcelablesSameModule.kt")
    public void testCustomParcelablesSameModule() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "plugins/android-extensions/android-extensions-compiler/testData/parcel/codegen/customParcelablesSameModule.kt");
    }

    @TestMetadata("customSimple.kt")
    public void testCustomSimple() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "plugins/android-extensions/android-extensions-compiler/testData/parcel/codegen/customSimple.kt");
    }

    @TestMetadata("customSimpleWithNewArray.kt")
    public void testCustomSimpleWithNewArray() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "plugins/android-extensions/android-extensions-compiler/testData/parcel/codegen/customSimpleWithNewArray.kt");
    }

    @TestMetadata("describeContentsFromSuperType.kt")
    public void testDescribeContentsFromSuperType() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "plugins/android-extensions/android-extensions-compiler/testData/parcel/codegen/describeContentsFromSuperType.kt");
    }

    @TestMetadata("duplicatingClinit.kt")
    public void testDuplicatingClinit() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "plugins/android-extensions/android-extensions-compiler/testData/parcel/codegen/duplicatingClinit.kt");
    }

    @TestMetadata("IBinderIInterface.kt")
    public void testIBinderIInterface() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "plugins/android-extensions/android-extensions-compiler/testData/parcel/codegen/IBinderIInterface.kt");
    }

    @TestMetadata("listInsideList.kt")
    public void testListInsideList() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "plugins/android-extensions/android-extensions-compiler/testData/parcel/codegen/listInsideList.kt");
    }

    @TestMetadata("nullableNotNullSize.kt")
    public void testNullableNotNullSize() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "plugins/android-extensions/android-extensions-compiler/testData/parcel/codegen/nullableNotNullSize.kt");
    }

    @TestMetadata("parcelable.kt")
    public void testParcelable() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "plugins/android-extensions/android-extensions-compiler/testData/parcel/codegen/parcelable.kt");
    }

    @TestMetadata("serializable.kt")
    public void testSerializable() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "plugins/android-extensions/android-extensions-compiler/testData/parcel/codegen/serializable.kt");
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "plugins/android-extensions/android-extensions-compiler/testData/parcel/codegen/simple.kt");
    }

    @TestMetadata("simpleList.kt")
    public void testSimpleList() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "plugins/android-extensions/android-extensions-compiler/testData/parcel/codegen/simpleList.kt");
    }

    @TestMetadata("size.kt")
    public void testSize() throws Exception {
        KotlinTestUtils.runTest(this::doTest,TargetBackend.ANY, "plugins/android-extensions/android-extensions-compiler/testData/parcel/codegen/size.kt");
    }
}
