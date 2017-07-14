/*
 * GraphHopper Directions API
 * You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.graphhopper.directions.api.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * VehicleType
 */

public class VehicleType {
  @SerializedName("type_id")
  private String typeId = null;

  /**
   * Profile of vehicle type
   */
  public enum ProfileEnum {
    @SerializedName("car")
    CAR("car"),
    
    @SerializedName("bike")
    BIKE("bike"),
    
    @SerializedName("foot")
    FOOT("foot"),
    
    @SerializedName("mtb")
    MTB("mtb"),
    
    @SerializedName("motorcycle")
    MOTORCYCLE("motorcycle"),
    
    @SerializedName("racingbike")
    RACINGBIKE("racingbike"),
    
    @SerializedName("truck")
    TRUCK("truck"),
    
    @SerializedName("small_truck")
    SMALL_TRUCK("small_truck");

    private String value;

    ProfileEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("profile")
  private ProfileEnum profile = null;

  @SerializedName("capacity")
  private List<Integer> capacity = new ArrayList<Integer>();

  @SerializedName("speed_factor")
  private Double speedFactor = null;

  @SerializedName("service_time_factor")
  private Double serviceTimeFactor = null;

  @SerializedName("cost_per_meter")
  private Double costPerMeter = null;

  @SerializedName("cost_per_second")
  private Double costPerSecond = null;

  @SerializedName("cost_per_activation")
  private Double costPerActivation = null;

  public VehicleType typeId(String typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * Unique identifier for the vehicle type
   * @return typeId
  **/
  @ApiModelProperty(example = "null", value = "Unique identifier for the vehicle type")
  public String getTypeId() {
    return typeId;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }

  public VehicleType profile(ProfileEnum profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Profile of vehicle type
   * @return profile
  **/
  @ApiModelProperty(example = "car", value = "Profile of vehicle type")
  public ProfileEnum getProfile() {
    return profile;
  }

  public void setProfile(ProfileEnum profile) {
    this.profile = profile;
  }

  public VehicleType capacity(List<Integer> capacity) {
    this.capacity = capacity;
    return this;
  }

  public VehicleType addCapacityItem(Integer capacityItem) {
    this.capacity.add(capacityItem);
    return this;
  }

   /**
   * array of capacity dimensions
   * @return capacity
  **/
  @ApiModelProperty(example = "null", value = "array of capacity dimensions")
  public List<Integer> getCapacity() {
    return capacity;
  }

  public void setCapacity(List<Integer> capacity) {
    this.capacity = capacity;
  }

  public VehicleType speedFactor(Double speedFactor) {
    this.speedFactor = speedFactor;
    return this;
  }

   /**
   * speed_factor of vehicle type
   * @return speedFactor
  **/
  @ApiModelProperty(example = "null", value = "speed_factor of vehicle type")
  public Double getSpeedFactor() {
    return speedFactor;
  }

  public void setSpeedFactor(Double speedFactor) {
    this.speedFactor = speedFactor;
  }

  public VehicleType serviceTimeFactor(Double serviceTimeFactor) {
    this.serviceTimeFactor = serviceTimeFactor;
    return this;
  }

   /**
   * service time factor of vehicle type
   * @return serviceTimeFactor
  **/
  @ApiModelProperty(example = "null", value = "service time factor of vehicle type")
  public Double getServiceTimeFactor() {
    return serviceTimeFactor;
  }

  public void setServiceTimeFactor(Double serviceTimeFactor) {
    this.serviceTimeFactor = serviceTimeFactor;
  }

  public VehicleType costPerMeter(Double costPerMeter) {
    this.costPerMeter = costPerMeter;
    return this;
  }

   /**
   * cost parameter per distance unit, here meter is used
   * @return costPerMeter
  **/
  @ApiModelProperty(example = "null", value = "cost parameter per distance unit, here meter is used")
  public Double getCostPerMeter() {
    return costPerMeter;
  }

  public void setCostPerMeter(Double costPerMeter) {
    this.costPerMeter = costPerMeter;
  }

  public VehicleType costPerSecond(Double costPerSecond) {
    this.costPerSecond = costPerSecond;
    return this;
  }

   /**
   * cost parameter per time unit, here second is used
   * @return costPerSecond
  **/
  @ApiModelProperty(example = "null", value = "cost parameter per time unit, here second is used")
  public Double getCostPerSecond() {
    return costPerSecond;
  }

  public void setCostPerSecond(Double costPerSecond) {
    this.costPerSecond = costPerSecond;
  }

  public VehicleType costPerActivation(Double costPerActivation) {
    this.costPerActivation = costPerActivation;
    return this;
  }

   /**
   * cost parameter vehicle activation, i.e. fixed costs per vehicle
   * @return costPerActivation
  **/
  @ApiModelProperty(example = "null", value = "cost parameter vehicle activation, i.e. fixed costs per vehicle")
  public Double getCostPerActivation() {
    return costPerActivation;
  }

  public void setCostPerActivation(Double costPerActivation) {
    this.costPerActivation = costPerActivation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleType vehicleType = (VehicleType) o;
    return Objects.equals(this.typeId, vehicleType.typeId) &&
        Objects.equals(this.profile, vehicleType.profile) &&
        Objects.equals(this.capacity, vehicleType.capacity) &&
        Objects.equals(this.speedFactor, vehicleType.speedFactor) &&
        Objects.equals(this.serviceTimeFactor, vehicleType.serviceTimeFactor) &&
        Objects.equals(this.costPerMeter, vehicleType.costPerMeter) &&
        Objects.equals(this.costPerSecond, vehicleType.costPerSecond) &&
        Objects.equals(this.costPerActivation, vehicleType.costPerActivation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeId, profile, capacity, speedFactor, serviceTimeFactor, costPerMeter, costPerSecond, costPerActivation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleType {\n");
    
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    speedFactor: ").append(toIndentedString(speedFactor)).append("\n");
    sb.append("    serviceTimeFactor: ").append(toIndentedString(serviceTimeFactor)).append("\n");
    sb.append("    costPerMeter: ").append(toIndentedString(costPerMeter)).append("\n");
    sb.append("    costPerSecond: ").append(toIndentedString(costPerSecond)).append("\n");
    sb.append("    costPerActivation: ").append(toIndentedString(costPerActivation)).append("\n");
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

