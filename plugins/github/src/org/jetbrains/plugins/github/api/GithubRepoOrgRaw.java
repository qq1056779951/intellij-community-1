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
package org.jetbrains.plugins.github.api;

import com.intellij.tasks.impl.gson.Mandatory;
import com.intellij.tasks.impl.gson.RestModel;

@RestModel
@SuppressWarnings("UnusedDeclaration")
class GithubRepoOrgRaw extends GithubRepoRaw {
  @Mandatory private Permissions permissions;

  public static class Permissions {
    @Mandatory private Boolean admin;
    @Mandatory private Boolean pull;
    @Mandatory private Boolean push;
  }
}
