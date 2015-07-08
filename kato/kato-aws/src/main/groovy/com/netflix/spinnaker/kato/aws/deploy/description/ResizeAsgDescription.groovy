/*
 * Copyright 2014 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.netflix.spinnaker.kato.aws.deploy.description

import groovy.transform.ToString

class ResizeAsgDescription extends AbstractAmazonCredentialsDescription {
  List<AsgDescription> asgs = []

  @Deprecated
  String asgName

  @Deprecated
  List<String> regions = []
  Capacity capacity = new Capacity()

  @ToString
  static class Capacity {
    int min
    int max
    int desired
  }

  @ToString
  static class AsgDescription {
    String region
    String asgName
  }
}
