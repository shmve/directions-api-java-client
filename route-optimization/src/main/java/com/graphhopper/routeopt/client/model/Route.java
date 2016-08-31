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
import com.graphhopper.routeopt.client.model.Activity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Route
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-31T10:35:10.244+02:00")
public class Route   {
  @SerializedName("vehicle_id")
  private String vehicleId = null;

  @SerializedName("activities")
  private List<Activity> activities = new ArrayList<Activity>();

  public Route vehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

   /**
   * id of vehicle that operates route
   * @return vehicleId
  **/
  @ApiModelProperty(example = "null", value = "id of vehicle that operates route")
  public String getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
  }

  public Route activities(List<Activity> activities) {
    this.activities = activities;
    return this;
  }

  public Route addActivitiesItem(Activity activitiesItem) {
    this.activities.add(activitiesItem);
    return this;
  }

   /**
   * array of activities
   * @return activities
  **/
  @ApiModelProperty(example = "null", value = "array of activities")
  public List<Activity> getActivities() {
    return activities;
  }

  public void setActivities(List<Activity> activities) {
    this.activities = activities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Route route = (Route) o;
    return Objects.equals(this.vehicleId, route.vehicleId) &&
        Objects.equals(this.activities, route.activities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleId, activities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Route {\n");
    
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
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

