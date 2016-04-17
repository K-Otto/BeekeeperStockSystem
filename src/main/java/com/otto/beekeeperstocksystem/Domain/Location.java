package com.otto.beekeeperstocksystem.Domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by student on 2016/04/17.
 */
@Entity
public class Location implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long LocID;

    private String locationName‭;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "beeID")
    private Beekeeper beekeepers;


    private Location() {
    }




    public Location (Builder‭ builder)
    {
        locationName‭=builder.locationName‭;
        LocID=builder.LocID;
        beekeepers=builder.beekeepers;
    }

    public static class Builder‭{
        private long LocID;
        private String locationName‭;
        private Beekeeper beekeepers;


        public Builder‭(String locationName‭) {
            this.locationName‭= locationName‭;
        }

        public Builder‭ ID(Long value‭){
            this.LocID = value‭;
            return this;
        }

        public Builder‭ beekeepers(Beekeeper value){
            this.beekeepers=value;
            return this;
        }

        public Builder‭ copy(Location value){
            this.LocID=value.LocID;
            this.locationName‭=value.locationName‭;
            this.beekeepers=value.beekeepers;
            return this;
        }
        public Location build(){
            return new Location (this);
        }
    }
    public long getLocID() {
        return LocID;
    }
    public String getLocationName‭‭() {
        return locationName‭;
    }

    public Beekeeper getBeekeepers(){
        return beekeepers;
    }
}


