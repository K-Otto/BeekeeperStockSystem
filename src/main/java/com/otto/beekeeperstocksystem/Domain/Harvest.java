package com.otto.beekeeperstocksystem.Domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by student on 2016/04/17.
 */
@Entity
public class Harvest implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long harvestID;

    private String harvestDate ;
    private Double totalWeight;
    private Double totalWeightRemaining;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="subLocID")
    private SubLocation  subLocations;




    private  Harvest  () {
    }

    public Harvest(Builder builder) {
        harvestID=builder.harvestID;
        harvestDate=builder.harvestDate  ;
        totalWeight=builder.totalWeight;
        totalWeightRemaining=builder.totalWeightRemaining;
        subLocations=builder.subLocations;

    }
    public static class Builder{
        private Long harvestID;
        private String harvestDate  ;
        private Double totalWeight;
        private Double totalWeightRemaining;
        private SubLocation  subLocations;


        public Builder(String harvestDate  ) {
            this.harvestDate  = harvestDate  ;
        }

        public Builder id(Long value){
            this.harvestID = value;
            return this;
        }
        public Builder totalWeight(Double value){
            this.totalWeight = value;
            return this;
        }
        public Builder totalWeightRemaining(Double value){
            this.totalWeightRemaining = value;
            return this;
        }


        public Builder subLocations(SubLocation value){
            this.subLocations=value;
            return this;
        }


        public Builder copy(Harvest  value){
            this.harvestID = value.harvestID;
            this.harvestDate  =value.harvestDate  ;
            this.totalWeight  =value.totalWeight  ;
            this.totalWeightRemaining  =value.totalWeightRemaining  ;
            this.subLocations=value.subLocations;

            return this;
        }
        public Harvest  build(){
            return new Harvest  (this);
        }
    }
    public Long getId() {
        return harvestID;
    }

    public String getHarvestDate () {
        return harvestDate;
    }

    public Double getWeight() {
        return totalWeight;
    }
    public Double gettotalWeightRemaining() {
        return totalWeightRemaining;
    }

    public SubLocation getSubLocation() {
        return subLocations;
    }

}

