/**
 * Copyright 2010-2016. All work is copyrighted to their respective
 * author(s), unless otherwise stated.
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
package net.revelc.code.formatter;

import java.io.File;
import java.util.Map;

/**
 * @author marvin.froeder
 */
public interface Formatter {

    /**
     * Initialize the {@link CodeFormatter} instance to be used by this component.
     */
    public abstract void init(Map<String, String> options, ConfigurationSource cfg);

    /**
     * Format individual file.
     */
    public abstract Result formatFile(File file, LineEnding ending, boolean dryRun);

    /**
     * return true if this formatter have been initialized
     */
    boolean isInitialized();

}
