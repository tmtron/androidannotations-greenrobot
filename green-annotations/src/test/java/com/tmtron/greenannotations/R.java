/*
 * Copyright © 2016 Martin Trummer (martin.trummer@tmtron.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tmtron.greenannotations;

/**
 * This dummy R class is needed for the JUnit tests.
 * <p>
 * If it does not exist, the tests will fail with this error:
 * </p>
 * <pre>
 * java.lang.AssertionError: Expected no errors, found error: The generated com.tmtron.greenannotations.R class cannot be found
 * </pre>
 */
// the class is required for the build process
@SuppressWarnings("unused")
public class R {

}
