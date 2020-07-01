package org.redhat;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class WorkloadModel {

    public String workloadType = "Internal";
    public String workloadBusinessUnit = "CustomerAssurance";
    public Integer computeDensity = 0;
    public String getWorkloadType() {
        this.workloadType = "Internal";
        return this.workloadType;
    }
    public String getWorkloadBusinessUnit() {
        this.workloadBusinessUnit = "CustomerAssurance";
        return this.workloadBusinessUnit;
    }
    
    public Integer getComputeDensity() {
        this.computeDensity = 74;
        return this.computeDensity;
    }
}