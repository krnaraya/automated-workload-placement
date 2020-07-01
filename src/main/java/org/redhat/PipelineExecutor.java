package org.redhat;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PipelineExecutor {

    public boolean pipelineTriggered = false;
    public boolean executePipeline(Object o) {
        this.pipelineTriggered = true;
        return this.pipelineTriggered;
    }
    
}