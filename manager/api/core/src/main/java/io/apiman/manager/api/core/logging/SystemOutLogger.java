/*
 * Copyright 2016 JBoss Inc
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

package io.apiman.manager.api.core.logging;

/**
 * @author eric.wittmann@gmail.com
 */
public class SystemOutLogger implements IApimanLogger {

    /**
     * Constructor.
     */
    public SystemOutLogger() {
    }

    /**
     * @see io.apiman.manager.api.core.logging.IApimanLogger#info(java.lang.String)
     */
    @Override
    public void info(String message) {
        System.out.println("INFO: " + message); //$NON-NLS-1$
    }

    /**
     * @see io.apiman.manager.api.core.logging.IApimanLogger#warn(java.lang.String)
     */
    @Override
    public void warn(String message) {
        System.out.println("WARN: " + message); //$NON-NLS-1$
    }

    /**
     * @see io.apiman.manager.api.core.logging.IApimanLogger#debug(java.lang.String)
     */
    @Override
    public void debug(String message) {
        System.out.println("DEBUG: " + message); //$NON-NLS-1$
    }

    /**
     * @see io.apiman.manager.api.core.logging.IApimanLogger#trace(java.lang.String)
     */
    @Override
    public void trace(String message) {
        System.out.println("TRACE: " + message); //$NON-NLS-1$
    }

    /**
     * @see io.apiman.manager.api.core.logging.IApimanLogger#error(java.lang.Throwable)
     */
    @Override
    public void error(Throwable error) {
        System.out.println("** ERROR **"); //$NON-NLS-1$
        error.printStackTrace();
    }

    /**
     * @see io.apiman.manager.api.core.logging.IApimanLogger#error(java.lang.String, java.lang.Throwable)
     */
    @Override
    public void error(String message, Throwable error) {
        System.out.println("** ERROR: " + message + " **"); //$NON-NLS-1$ //$NON-NLS-2$
        error.printStackTrace();
    }

}
