/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dolphinscheduler.api.dto.workflow;

import org.apache.dolphinscheduler.common.enums.ProcessExecutionTypeEnum;
import org.apache.dolphinscheduler.common.enums.ReleaseState;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UpdateWorkflowBasicInfoRequest {

    @ApiModelProperty(name = "name", value = "WORKFLOW_DEFINITION_NAME", required = true)
    private String name;

    @ApiModelProperty(name = "description", value = "WORKFLOW_DEFINITION_DESC", required = false)
    private String description;

    @ApiModelProperty(name = "globalParams", value = "[]", required = false)
    private String globalParams;

    @ApiModelProperty(name = "timeout", value = "0", required = false)
    private int timeout;

    @ApiModelProperty(name = "tenantCode", required = true)
    private String tenantCode;

    @ApiModelProperty(name = "scheduleJson", required = false)
    private String scheduleJson;

    @ApiModelProperty(name = "otherParamsJson", required = false)
    private String otherParamsJson;

    @ApiModelProperty(name = "executionType", example = "PARALLEL", value = "PARALLEL", required = true)
    private ProcessExecutionTypeEnum executionType;

    @ApiModelProperty(name = "releaseState", example = "OFFLINE", value = "OFFLINE", required = false)
    private ReleaseState releaseState;

}
