/*
 * Copyright 2014 JBoss Inc
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
package org.example.microprofile.api.beans.summary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Models the entire API registry for a single client version.  This is typically
 * used to get a list of all APIs that can be consumed by a single version of a single
 * client.  Most importantly it includes the live endpoint information and API
 * keys for all of the client's contracts/APIs.
 *
 * @author eric.wittmann@redhat.com
 */
public class ApiRegistryBean implements Serializable {

    private static final long serialVersionUID = 7369169626368271089L;

    private String apiKey;
    private List<ApiEntryBean> apis = new ArrayList<>();

    /**
     * Constructor.
     */
    public ApiRegistryBean() {
    }

    /**
     * @return the apis
     */
    public List<ApiEntryBean> getApis() {
        return apis;
    }

    /**
     * @param apis the apis to set
     */
    public void setApis(List<ApiEntryBean> apis) {
        this.apis = apis;
    }

    /**
     * @return the apiKey
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * @param apiKey the apiKey to set
     */
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

}
