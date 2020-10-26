package com.example.demo.user.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT )
public class RData<T> {


    private String code;

    private String description;

    private T data;

    private RData(RData.Builer<T> builer) {
        this.code = builer.code;
        this.description = builer.description;
        this.data = builer.data;
    }

    @Component
    @Accessors(chain = true)
    public static class Builer<T> {

        private String code;

        private String description;

        private T data;

        public RData bulid() {
            return new RData(this);
        }

        public Builer<T> setCode(String code) {

            this.code = code;
            if (code != null) {
                this.description = RCode.getDescription(code);
            }
            return this;
        }

        public Builer<T> setData(T data) {
            this.data = data;
            return this;
        }


    }
}
