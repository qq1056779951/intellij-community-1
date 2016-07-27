/*
 * Copyright 2000-2013 JetBrains s.r.o.
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

import java.util.Date;

@RestModel
@SuppressWarnings("UnusedDeclaration")
class GithubPullRequestRaw {
  @Mandatory private Long number;
  @Mandatory private String state;
  @Mandatory private String title;
  private String body;
  @Mandatory private String bodyHtml;

  private String url;
  @Mandatory private String htmlUrl;
  @Mandatory private String diffUrl;
  @Mandatory private String patchUrl;
  @Mandatory private String issueUrl;

  private Boolean merged;
  private Boolean mergeable;

  private Integer comments;
  private Integer commits;
  private Integer additions;
  private Integer deletions;
  private Integer changedFiles;

  @Mandatory private Date createdAt;
  @Mandatory private Date updatedAt;
  private Date closedAt;
  private Date mergedAt;

  @Mandatory private GithubUserRaw user;

  @Mandatory private LinkRaw head;
  @Mandatory private LinkRaw base;

  public static class LinkRaw {
    @Mandatory private String label;
    @Mandatory private String ref;
    @Mandatory private String sha;

    @Mandatory private GithubRepoRaw repo;
    @Mandatory private GithubUserRaw user;
  }
}
