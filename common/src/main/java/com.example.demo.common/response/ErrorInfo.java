package com.example.demo.common.response;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

@Data
@Accessors(chain = true)
public class ErrorInfo {


    private String method;

    private String path;

    private String applicationName;

    private String instanceId;

    private ErrorInfo(ErrorInfo.Builer builer) {
        this.method = builer.method;
        this.path = builer.path;
        this.applicationName = builer.applicationName;
        this.instanceId = builer.instanceId;
    }

    @Component
    @Accessors(chain = true)
    public static class Builer {

        private String method;

        private String path;

        private String applicationName;

        private String instanceId;

        public ErrorInfo build() {
            return new ErrorInfo(this);
        }


        public Builer setMethod(String method) {
            this.method = method;
            return this;
        }


        public Builer setPath(String path) {
            this.path = path;
            return this;
        }

        public Builer setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        public Builer setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
    }


}
