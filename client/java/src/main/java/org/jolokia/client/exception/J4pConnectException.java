/*
 * Copyright 2009-2010 Roland Huss
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

package org.jolokia.client.exception;

import java.net.ConnectException;

/**
 * Exception thrown when the connection to the server fails.
 *
 * @author roland
 * @since 13.12.10
 */
public class J4pConnectException extends J4pException {

    /**
     * Constructor
     *
     * @param pMessage error message
     * @param pNestedException connect exception occured
     */
    public J4pConnectException(String pMessage, ConnectException pNestedException) {
        super(pMessage,pNestedException);
    }
}
