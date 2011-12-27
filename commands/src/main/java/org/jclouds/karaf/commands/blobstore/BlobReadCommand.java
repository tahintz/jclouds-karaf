/*
 * Copyright (C) 2011, the original authors
 *
 * ====================================================================
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
 * ====================================================================
 */

package org.jclouds.karaf.commands.blobstore;


import org.apache.felix.gogo.commands.Argument;
import org.apache.felix.gogo.commands.Command;

/**
 * @author: iocanel
 */
@Command(scope = "jclouds", name = "blobstore-read", description = "Reads data from the blobstore")
public class BlobReadCommand extends BlobStoreCommandSupport {

    @Argument(index = 0, name = "containerName", description = "The name of the container", required = true, multiValued = false)
    String containerName;

    @Argument(index = 1, name = "blobName", description = "The name of the blob", required = true, multiValued = false)
    String blobName;

    @Override
    protected Object doExecute() throws Exception {
        Object payload = read(containerName, blobName);
        System.out.printf("%s\n", payload);
        return null;
    }
}