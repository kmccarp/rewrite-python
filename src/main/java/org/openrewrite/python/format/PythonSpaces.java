/*
 * Copyright 2023 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openrewrite.python.format;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.openrewrite.ExecutionContext;
import org.openrewrite.Incubating;
import org.openrewrite.Recipe;
import org.openrewrite.TreeVisitor;

@Incubating(since = "0.3.1")
@Value
@EqualsAndHashCode(callSuper = false)
public class PythonSpaces extends Recipe {
    @Override
    public String getDisplayName() {
        return "Formats spaces in Python code";
    }

    @Override
    public String getDescription() {
        return "Standardizes spaces in Python code. Currently limited to formatting method arguments.";
    }

    @Override
    public TreeVisitor<?, ExecutionContext> getVisitor() {
        return new PythonSpacesVisitor<>();
    }
}
