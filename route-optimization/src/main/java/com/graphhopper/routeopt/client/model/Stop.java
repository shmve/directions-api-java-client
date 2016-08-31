/**
 * Route Optimization API
 * Our Route Optimization API solves the so called vehicle routing problem fast. It calculates an optimal tour for a set of vehicles, services and constraints
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
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


package com.graphhopper.routeopt.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.graphhopper.routeopt.client.model.Address;
import com.graphhopper.routeopt.client.model.TimeWindow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Stop
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-31T10:35:10.244+02:00")
public class Stop   {
  @SerializedName("address")
  private Address address = null;

  @SerializedName("duration")
  private Long duration = null;

  @SerializedName("time_windows")
  private List<TimeWindow> timeWindows = new ArrayList<TimeWindow>();

  public Stop address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(example = "null", value = "")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Stop duration(Long duration) {
    this.duration = duration;
    return this;
  }

   /**
   * duration of stop, i.e. time in ms the corresponding activity takes
   * @return duration
  **/
  @ApiModelProperty(example = "null", value = "duration of stop, i.e. time in ms the corresponding activity takes")
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public Stop timeWindows(List<TimeWindow> timeWindows) {
    this.timeWindows = timeWindows;
    return this;
  }

  public Stop addTimeWindowsItem(TimeWindow timeWindowsItem) {
    this.timeWindows.add(timeWindowsItem);
    return this;
  }

   /**
   * array of time windows. currently, only a single time window is allowed
   * @return timeWindows
  **/
  @ApiModelProperty(example = "null", value = "array of time windows. currently, only a single time window is allowed")
  public List<TimeWindow> getTimeWindows() {
    return timeWindows;
  }

  public void setTimeWindows(List<TimeWindow> timeWindows) {
    this.timeWindows = timeWindows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stop stop = (Stop) o;
    return Objects.equals(this.address, stop.address) &&
        Objects.equals(this.duration, stop.duration) &&
        Objects.equals(this.timeWindows, stop.timeWindows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, duration, timeWindows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stop {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    timeWindows: ").append(toIndentedString(timeWindows)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

