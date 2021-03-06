/**
 * Copyright 2010 Voxeo Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License.
 *
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

package com.voxeo.moho.conference;

import java.util.Map;
import java.util.Set;

import javax.media.mscontrol.Parameters;

import com.voxeo.moho.MixerEndpoint;
import com.voxeo.moho.services.Service;

/**
 * 
 *
 */
public interface ConferenceManager extends Service {

  Conference createConference(String id, int seats, Parameters parameters);

  Conference createConference(String id, int seats, ConferenceController controller, Parameters parameters);

  Conference createConference(MixerEndpoint mxier, Map<Object, Object> mixerParams, String id, int seats,
      ConferenceController controller, Parameters parameters);

  Conference getConference(String id);

  Set<String> getConferences();

  void removeConference(String id);

  void removeAllConferences();
}
