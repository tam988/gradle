/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gradle.api.internal.tasks.execution;

import org.gradle.api.NonNullApi;
import org.gradle.api.internal.TaskInternal;

import java.util.Collection;

/**
 * Left in place for backwards compatibility. Remove it in Gradle 6.0.
 *
 * @deprecated This interface is left in place since it is exposed by AbstractTask prior to Gradle 5.0.
 */
@Deprecated
@NonNullApi
public interface TaskValidator {
    /**
     * Validates this task, adding violations to the given collections.
     */
    void validate(TaskInternal task, Collection<String> messages);
}
