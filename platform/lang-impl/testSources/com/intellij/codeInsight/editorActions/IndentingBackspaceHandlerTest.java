/*
 * Copyright 2000-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.codeInsight.editorActions;

import com.intellij.testFramework.FileBasedTestCaseHelper;
import com.intellij.testFramework.LightPlatformCodeInsightTestCase;
import com.intellij.testFramework.TestDataPath;
import org.jetbrains.annotations.Nullable;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.intellij.testFramework.EdtTestUtil.runInEdtAndWait;

@SuppressWarnings("JUnit4AnnotatedMethodInJUnit3TestCase")
@RunWith(com.intellij.testFramework.Parameterized.class)
@TestDataPath("/testData/../../../platform/lang-impl/testData/editor/indentingBackspace/")
public class IndentingBackspaceHandlerTest extends LightPlatformCodeInsightTestCase implements FileBasedTestCaseHelper {
  @Test
  public void testAction() {
    runInEdtAndWait(() -> {
      configureByFile(myFileSuffix);
      backspace();
      checkResultByFile(myFileSuffix.replace(".", "-after."));
    });
  }

  @Nullable
  @Override
  public String getFileSuffix(String fileName) {
    return fileName.contains("-after.") ? null : fileName;
  }
}